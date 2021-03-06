package chaos.core.dao;

import chaos.core.model.SAccountRole;
import org.apache.ibatis.annotations.*;

public interface SAccountRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_account_role
     *
     * @mbg.generated
     */
    @Delete({
            "delete from s_account_role",
            "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_account_role
     *
     * @mbg.generated
     */
    @Insert({
        "insert into s_account_role (a_id, r_id)",
        "values (#{aId,jdbcType=BIGINT}, #{rId,jdbcType=BIGINT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(SAccountRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_account_role
     *
     * @mbg.generated
     */
    int insertSelective(SAccountRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_account_role
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, a_id, r_id",
        "from s_account_role",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @ResultMap("chaos.core.dao.SAccountRoleMapper.BaseResultMap")
    SAccountRole selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_account_role
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SAccountRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_account_role
     *
     * @mbg.generated
     */
    @Update({
        "update s_account_role",
        "set a_id = #{aId,jdbcType=BIGINT},",
          "r_id = #{rId,jdbcType=BIGINT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(SAccountRole record);

    @Select({
            "select",
            "id, a_id, r_id",
            "from s_account_role",
            "where a_id = #{aId,jdbcType=BIGINT}"
    })
    @ResultMap("chaos.core.dao.SAccountRoleMapper.BaseResultMap")
    SAccountRole selectByAId(String aId);
}