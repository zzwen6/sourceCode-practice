package org.apache.ibatis.zzwen6;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.zzwen6.entity.EnumSex;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class SexTypeHandler extends BaseTypeHandler<EnumSex>{


  private Class<EnumSex> type;
  private EnumSex[] enums;

  public SexTypeHandler(Class<EnumSex> type){
    if (type == null) {
      throw new IllegalArgumentException("Type argument cannot be null");
    }
    this.type = type;
    this.enums = type.getEnumConstants();
    if (this.enums == null) {
      throw new IllegalArgumentException(type.getSimpleName() + " does not represent an enum type.");
    }

  }


  @Override
  public void setNonNullParameter(PreparedStatement ps, int i, EnumSex parameter, JdbcType jdbcType) throws SQLException {
    ps.setInt(i, parameter.ordinal());

  }

  @Override
  public EnumSex getNullableResult(ResultSet rs, String columnName) throws SQLException {
    int ordinal = rs.getInt(columnName);
    if (ordinal == 0 && rs.wasNull()) {
      return null;
    }
    return toOrdinalEnum(ordinal);

  }

  @Override
  public EnumSex getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
    int ordinal = rs.getInt(columnIndex);
    if (ordinal == 0 && rs.wasNull()) {
      return null;
    }
    return toOrdinalEnum(ordinal);
  }

  @Override
  public EnumSex getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
    int ordinal = cs.getInt(columnIndex);
    if (ordinal == 0 && cs.wasNull()) {
      return null;
    }
    return toOrdinalEnum(ordinal);
  }

  private EnumSex toOrdinalEnum(int ordinal) {
    return EnumSex.valueOf(ordinal);

  }
}
