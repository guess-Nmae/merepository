package com.zb.mapper;
import com.zb.pojo.Detail;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DetailMapper {

	public Detail getDetailById(@Param(value = "id") Long id)throws Exception;

	public List<Detail>	getDetailListByMap(Map<String,Object> param)throws Exception;

	public Integer getDetailCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertDetail(Detail detail)throws Exception;

	public Integer updateDetail(Detail detail)throws Exception;


}
