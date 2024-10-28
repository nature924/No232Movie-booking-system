package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusszixunxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusszixunxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusszixunxinxiView;


/**
 * 资讯信息评论表
 *
 * @author 
 * @email 
 * @date 2023-04-18 22:15:57
 */
public interface DiscusszixunxinxiService extends IService<DiscusszixunxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszixunxinxiVO> selectListVO(Wrapper<DiscusszixunxinxiEntity> wrapper);
   	
   	DiscusszixunxinxiVO selectVO(@Param("ew") Wrapper<DiscusszixunxinxiEntity> wrapper);
   	
   	List<DiscusszixunxinxiView> selectListView(Wrapper<DiscusszixunxinxiEntity> wrapper);
   	
   	DiscusszixunxinxiView selectView(@Param("ew") Wrapper<DiscusszixunxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszixunxinxiEntity> wrapper);
   	

}

