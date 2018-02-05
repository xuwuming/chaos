package chaos.core.dao;

import chaos.core.model.RegionModel_;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface RegionModel_Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table region_
     *
     * @mbg.generated
     */
    @Delete({
        "delete from region_",
        "where id = #{id,jdbcType=SMALLINT}"
    })
    int deleteByPrimaryKey(Short id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table region_
     *
     * @mbg.generated
     */
    @Insert({
        "insert into region_ (name, code, ",
        "parent_id)",
        "values (#{name,jdbcType=VARCHAR}, #{code,jdbcType=SMALLINT}, ",
        "#{parentId,jdbcType=SMALLINT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Short.class)
    int insert(RegionModel_ record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table region_
     *
     * @mbg.generated
     */
    int insertSelective(RegionModel_ record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table region_
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, name, code, parent_id",
        "from region_",
        "where id = #{id,jdbcType=SMALLINT}"
    })
    @ResultMap("chaos.core.dao.RegionModel_Mapper.BaseResultMap")
    RegionModel_ selectByPrimaryKey(Short id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table region_
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(RegionModel_ record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table region_
     *
     * @mbg.generated
     */
    @Update({
        "update region_",
        "set name = #{name,jdbcType=VARCHAR},",
          "code = #{code,jdbcType=SMALLINT},",
          "parent_id = #{parentId,jdbcType=SMALLINT}",
        "where id = #{id,jdbcType=SMALLINT}"
    })
    int updateByPrimaryKey(RegionModel_ record);
}