package com.zb.mapper;
import com.zb.pojo.Sort;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SortMapper {

	public Sort getSortById(@Param(value = "id") Long id)throws Exception;

	public List<Sort>	getSortListByMap()throws Exception;

	public Integer getSortCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertSort(Sort sort)throws Exception;

	public Integer updateSort(Sort sort)throws Exception;


}
