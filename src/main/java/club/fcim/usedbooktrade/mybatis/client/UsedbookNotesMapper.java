package club.fcim.usedbooktrade.mybatis.client;

import club.fcim.usedbooktrade.mybatis.model.UsedbookNotes;
import club.fcim.usedbooktrade.mybatis.model.UsedbookNotesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsedbookNotesMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table usedbook_notes
	 * @mbg.generated  Sun Oct 16 20:18:31 CST 2016
	 */
	long countByExample(UsedbookNotesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table usedbook_notes
	 * @mbg.generated  Sun Oct 16 20:18:31 CST 2016
	 */
	int deleteByExample(UsedbookNotesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table usedbook_notes
	 * @mbg.generated  Sun Oct 16 20:18:31 CST 2016
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table usedbook_notes
	 * @mbg.generated  Sun Oct 16 20:18:31 CST 2016
	 */
	int insert(UsedbookNotes record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table usedbook_notes
	 * @mbg.generated  Sun Oct 16 20:18:31 CST 2016
	 */
	int insertSelective(UsedbookNotes record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table usedbook_notes
	 * @mbg.generated  Sun Oct 16 20:18:31 CST 2016
	 */
	List<UsedbookNotes> selectByExample(UsedbookNotesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table usedbook_notes
	 * @mbg.generated  Sun Oct 16 20:18:31 CST 2016
	 */
	UsedbookNotes selectByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table usedbook_notes
	 * @mbg.generated  Sun Oct 16 20:18:31 CST 2016
	 */
	int updateByExampleSelective(@Param("record") UsedbookNotes record, @Param("example") UsedbookNotesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table usedbook_notes
	 * @mbg.generated  Sun Oct 16 20:18:31 CST 2016
	 */
	int updateByExample(@Param("record") UsedbookNotes record, @Param("example") UsedbookNotesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table usedbook_notes
	 * @mbg.generated  Sun Oct 16 20:18:31 CST 2016
	 */
	int updateByPrimaryKeySelective(UsedbookNotes record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table usedbook_notes
	 * @mbg.generated  Sun Oct 16 20:18:31 CST 2016
	 */
	int updateByPrimaryKey(UsedbookNotes record);
}