package top.hting.sqlsession;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.*;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.junit.Test;
import top.hting.bean.User;
import top.hting.mapper.UserMapper;

import java.io.IOException;
import java.io.InputStream;

/**
 * SqlSessionFactory测试类
 */
public class SqlSessionFactoryTest {

    /**
     * 使用 SqlSessionManager 构建工厂
     * @throws IOException
     */
    @Test
    public void testSql() throws IOException {
        {

            User user = new User(6,"Hello6");

            String xml = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(xml);

            // 获取会话工厂
            SqlSessionFactory sqlSessionFactory = SqlSessionManager.newInstance(inputStream);

            // 获取会话
            SqlSession sqlSession = sqlSessionFactory.openSession(true);


            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

            // 从会话中取出ID 为save的语句进行执行
//        sqlSession.insert("save", user);

            userMapper.save(user);

            // 需要手动提交 默认为false的
//        sqlSession.commit();

            sqlSession.close();


            System.out.println( getClass().getName() );
        }
    }


    /**
     * TODO 测试 未通过
     */
    @Test
    public void testCodeForSqlSessionFactory(){

        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();

        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        boolean b = sqlSessionFactory.getConfiguration().hasMapper(UserMapper.class);
        System.out.println(b);


        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.save(new User(8, "Hello8"));

        sqlSession.close();

    }


    /**
     * 使用代码方式创建工厂
     *
     */
    private SqlSessionFactory getSqlSessionFactory(){

        PooledDataSource dataSource = new PooledDataSource("com.mysql.jdbc.Driver", "jdbc:mysql://127.0.0.1:13306/mybatis?useSSL=false",
                "root", "123456");

        TransactionFactory transactionFactory = new JdbcTransactionFactory();

        Environment environment = new Environment("development", transactionFactory,dataSource);

        Configuration configuration = new Configuration(environment);
        configuration.getTypeAliasRegistry().registerAlias("user", User.class);

        configuration.addMappers("top.hting.mapper");



        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);

        return sqlSessionFactory;


    }




}
