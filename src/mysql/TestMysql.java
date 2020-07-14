/**
 * Copyright (C), 2019-2020, XXX有限公司
 * FileName: TestMysql
 * Author:   李佳佳同学
 * Date:     2020/7/14 10:15
 * Description: idea 连接没啥用起来
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package mysql;

import java.sql.*;

/**
 * 〈一句话功能简述〉<br> 
 * 〈idea 连接MySQL〉
 *
 * @author 李佳佳同学
 * @create 2020/7/14
 * @since 1.0.0
 */
public class TestMysql {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String url="jdbc:mysql://localhost:3306/test_sql?serverTimezone=UTC";
        String name="root";
        String pwd="mysql";
        String sql="select * from employee";
        try {
            Connection con= DriverManager.getConnection(url,name,pwd);
            Statement st=null;
            ResultSet rs=null;
            st=con.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                int id=rs.getInt("id");
                String username=rs.getString("name");
                int age=rs.getInt("age");
                String sex=rs.getString("sex");
                String addr=rs.getString("homeaddr");

                System.out.println("id: "+id+"name "+username+"age "+age+"sex"+sex+"addr "+addr);

            }

        } catch (SQLException e) {
            System.out.println("连接失败");
        }
       // System.out.println("连接成功！");
        //查询操作：



    }
}
