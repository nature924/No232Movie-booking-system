package com.dao;

import com.entity.DianyingleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DianyingleixingVO;
import com.entity.view.DianyingleixingView;


/**
 * 电影类型
 * 
 * @author 
 * @email 
 * @date 2023-04-18 22:15:57
 */
public interface DianyingleixingDao extends BaseMapper<DianyingleixingEntity> {
	
	List<DianyingleixingVO> selectListVO(@Param("ew") Wrapper<DianyingleixingEntity> wrapper);
	
	DianyingleixingVO selectVO(@Param("ew") Wrapper<DianyingleixingEntity> wrapper);
	
	List<DianyingleixingView> selectListView(@Param("ew") Wrapper<DianyingleixingEntity> wrapper);

	List<DianyingleixingView> selectListView(Pagination page,@Param("ew") Wrapper<DianyingleixingEntity> wrapper);
	
	DianyingleixingView selectView(@Param("ew") Wrapper<DianyingleixingEntity> wrapper);
	

}
