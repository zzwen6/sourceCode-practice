package zzwen6;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import zzwen6.dto.UserRoleDto;
import zzwen6.mapper.UserMapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

public class CollectionsTest {


  private static SqlSessionFactory sqlSessionFactory;


  @BeforeAll
  public static void setup() throws IOException {

    String url = "mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(url);

    sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

  }

  @Test
  public void collectionTest() {
    SqlSession sqlSession = sqlSessionFactory.openSession();

    UserMapper mapper = sqlSession.getMapper(UserMapper.class);

    UserRoleDto userRoleDto = mapper.selectUserById(1);

    System.out.println(userRoleDto.toString());


  }


}
