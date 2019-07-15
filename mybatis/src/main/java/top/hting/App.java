package top.hting;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import top.hting.bean.User;

import java.io.IOException;
import java.io.InputStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {

        User user = new User(2,"Hello2");

        String xml = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(xml);

        // 获取会话工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 获取会话
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 从会话中取出ID 为save的语句进行执行
        sqlSession.insert("save", user);

        // 需要手动提交 默认为false的
        sqlSession.commit();

        sqlSession.close();


        System.out.println( "Hello World!" );
    }
}
