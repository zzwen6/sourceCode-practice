package org.apache.ibatis.zzwen6;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.zzwen6.entity.User;
import org.apache.ibatis.zzwen6.mapper.UserMapper;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class ConfigurationTest {

  private static SqlSessionFactory sqlSessionFactory;


  @BeforeAll
  public static void setup() throws IOException {

    String url = "mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(url);

    sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

  }

  @Test
  public void testSelectById() {

    SqlSession sqlSession = sqlSessionFactory.openSession();


    User objects = sqlSession.selectOne("org.apache.ibatis.zzwen6.mapper.UserMapper.selectById", 1);

    UserMapper mapper = sqlSession.getMapper(UserMapper.class);

    User user = mapper.selectById(1);

    assertEquals(1, user.getId());

    System.out.println(user.toString());
  }


}
