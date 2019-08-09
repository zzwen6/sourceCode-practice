package org.apache.ibatis.zzwen6.mapper;

import org.apache.ibatis.zzwen6.dto.UserRoleDto;
import org.apache.ibatis.zzwen6.entity.User;

public interface UserMapper {

  User selectById(Integer id);


  UserRoleDto selectUserById(Integer id);

}
