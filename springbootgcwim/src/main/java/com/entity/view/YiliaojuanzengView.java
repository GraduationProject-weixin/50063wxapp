package com.entity.view;

import com.entity.YiliaojuanzengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 医疗捐赠
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-16 10:16:29
 */
@TableName("yiliaojuanzeng")
public class YiliaojuanzengView  extends YiliaojuanzengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YiliaojuanzengView(){
	}
 
 	public YiliaojuanzengView(YiliaojuanzengEntity yiliaojuanzengEntity){
 	try {
			BeanUtils.copyProperties(this, yiliaojuanzengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
