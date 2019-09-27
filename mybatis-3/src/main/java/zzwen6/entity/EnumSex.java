package zzwen6.entity;

public enum EnumSex {
  man(1),
  woman(2);

  private int v;

  EnumSex(int v) {
    this.v = v;
  }

  public static EnumSex valueOf(int v){
    switch (v) {
      case 1:
        return man;
      case 2:
        return woman;
    }

    return null;
  }



}
