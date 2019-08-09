package org.apache.ibatis.zzwen6.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.ibatis.zzwen6.entity.Role;
import org.apache.ibatis.zzwen6.entity.User;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserRoleDto {
  private User user;

  private List<Role> roles;

}
