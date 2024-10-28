package com.dao;

import com.entity.ZixunleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZixunleixingVO;
import com.entity.view.ZixunleixingView;


/**
 * 资讯类型
 * 
 * @author 
 * @email 
 * @date 2023-04-18 22:15:57
 */
public interface ZixunleixingDao extends BaseMapper<ZixunleixingEntity> {
	
	List<ZixunleixingVO> selectListVO(@Param("ew") Wrapper<ZixunleixingEntity> wrapper);
	
	ZixunleixingVO selectVO(@Param("ew") Wrapper<ZixunleixingEntity> wrapper);
	
	List<ZixunleixingView> selectListView(@Param("ew") Wrapper<ZixunleixingEntity> wrapper);

	List<ZixunleixingView> selectListView(Pagination page,@Param("ew") Wrapper<ZixunleixingEntity> wrapper);
	
	ZixunleixingView selectView(@Param("ew") Wrapper<ZixunleixingEntity> wrapper);
	

}
