package zzwen6.mapper;

import zzwen6.dto.UserRoleDto;
import zzwen6.entity.User;

public interface UserMapper {

  User selectById(Integer id);


  UserRoleDto selectUserById(Integer id);

}
