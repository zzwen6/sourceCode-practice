package org.apache.ibatis.zzwen6.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

  private Integer id;

  private String name;

  private EnumSex sex;

}
