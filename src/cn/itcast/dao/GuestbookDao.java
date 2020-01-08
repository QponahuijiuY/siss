package cn.itcast.dao;

import cn.itcast.bean.Guestbook;
import cn.itcast.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020/1/7 20:15
 */
public class GuestbookDao {

    //查找所有的留言
    public ArrayList<Guestbook> findalltext(){
        ResultSet rs = null;
        Statement stmt = null;
        Connection conn = null;
        ArrayList<Guestbook> list = new ArrayList<>();
        try {
            conn = JDBCUtils.getConnection();
            stmt = conn.createStatement();
            String sql = "select * from guestbook ";
            rs = stmt.executeQuery(sql);
            while(rs.next()) {
                Guestbook guestbook = new Guestbook();
                guestbook.setName(rs.getString("name"));
                guestbook.setTel(rs.getString("tel"));
                guestbook.setText(rs.getString("text"));
                list.add(guestbook);
            }return list;
        }catch(Exception e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.release(rs, stmt, conn);
        }
        return null;
    }

    //添加留言到数据库显示
    public boolean insert(Guestbook guestbook){

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = JDBCUtils.getConnection();
            statement = connection.createStatement();
            String sql = "insert into guestbook values('"+guestbook.getName()+"','"
                    +guestbook.getTel()+"','"
                    +guestbook.getText()+"')";
            int num = statement.executeUpdate(sql);
//            System.out.println("出错了");
            if (num>0){
                return true;
            }return false;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.release(resultSet,statement,connection);
        }
        return false;
    }
}
