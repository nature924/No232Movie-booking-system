package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscusszixunxinxiDao;
import com.entity.DiscusszixunxinxiEntity;
import com.service.DiscusszixunxinxiService;
import com.entity.vo.DiscusszixunxinxiVO;
import com.entity.view.DiscusszixunxinxiView;

@Service("discusszixunxinxiService")
public class DiscusszixunxinxiServiceImpl extends ServiceImpl<DiscusszixunxinxiDao, DiscusszixunxinxiEntity> implements DiscusszixunxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusszixunxinxiEntity> page = this.selectPage(
                new Query<DiscusszixunxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscusszixunxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusszixunxinxiEntity> wrapper) {
		  Page<DiscusszixunxinxiView> page =new Query<DiscusszixunxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusszixunxinxiVO> selectListVO(Wrapper<DiscusszixunxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusszixunxinxiVO selectVO(Wrapper<DiscusszixunxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusszixunxinxiView> selectListView(Wrapper<DiscusszixunxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusszixunxinxiView selectView(Wrapper<DiscusszixunxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
