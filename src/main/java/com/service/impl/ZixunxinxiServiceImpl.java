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


import com.dao.ZixunxinxiDao;
import com.entity.ZixunxinxiEntity;
import com.service.ZixunxinxiService;
import com.entity.vo.ZixunxinxiVO;
import com.entity.view.ZixunxinxiView;

@Service("zixunxinxiService")
public class ZixunxinxiServiceImpl extends ServiceImpl<ZixunxinxiDao, ZixunxinxiEntity> implements ZixunxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZixunxinxiEntity> page = this.selectPage(
                new Query<ZixunxinxiEntity>(params).getPage(),
                new EntityWrapper<ZixunxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZixunxinxiEntity> wrapper) {
		  Page<ZixunxinxiView> page =new Query<ZixunxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZixunxinxiVO> selectListVO(Wrapper<ZixunxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZixunxinxiVO selectVO(Wrapper<ZixunxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZixunxinxiView> selectListView(Wrapper<ZixunxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZixunxinxiView selectView(Wrapper<ZixunxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
