package com.dao;

import com.entity.DiscusszixunxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusszixunxinxiVO;
import com.entity.view.DiscusszixunxinxiView;


/**
 * 资讯信息评论表
 * 
 * @author 
 * @email 
 * @date 2023-04-18 22:15:57
 */
public interface DiscusszixunxinxiDao extends BaseMapper<DiscusszixunxinxiEntity> {
	
	List<DiscusszixunxinxiVO> selectListVO(@Param("ew") Wrapper<DiscusszixunxinxiEntity> wrapper);
	
	DiscusszixunxinxiVO selectVO(@Param("ew") Wrapper<DiscusszixunxinxiEntity> wrapper);
	
	List<DiscusszixunxinxiView> selectListView(@Param("ew") Wrapper<DiscusszixunxinxiEntity> wrapper);

	List<DiscusszixunxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusszixunxinxiEntity> wrapper);
	
	DiscusszixunxinxiView selectView(@Param("ew") Wrapper<DiscusszixunxinxiEntity> wrapper);
	

}
