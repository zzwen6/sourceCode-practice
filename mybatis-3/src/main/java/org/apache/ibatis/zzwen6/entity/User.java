package org.apache.ibatis.zzwen6.entity;

import java.io.Serializable;

public class User implements Serializable {

  private Integer id;

  private String name;

  private EnumSex sex;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EnumSex getSex() {
    return sex;
  }

  public void setSex(EnumSex sex) {
    this.sex = sex;
  }

  @Override
  public String toString() {
    return "User{" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", sex=" + sex +
      '}';
  }
}
