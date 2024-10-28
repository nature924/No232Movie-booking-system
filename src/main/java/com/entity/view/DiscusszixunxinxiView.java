package com.entity.view;

import com.entity.DiscusszixunxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 资讯信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-04-18 22:15:57
 */
@TableName("discusszixunxinxi")
public class DiscusszixunxinxiView  extends DiscusszixunxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusszixunxinxiView(){
	}
 
 	public DiscusszixunxinxiView(DiscusszixunxinxiEntity discusszixunxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discusszixunxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
