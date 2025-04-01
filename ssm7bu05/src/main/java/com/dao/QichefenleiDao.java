package com.dao;

import com.entity.QichefenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QichefenleiVO;
import com.entity.view.QichefenleiView;


/**
 * 汽车分类
 * 
 * @author 
 * @email 
 * @date 2021-03-26 08:38:24
 */
public interface QichefenleiDao extends BaseMapper<QichefenleiEntity> {
	
	List<QichefenleiVO> selectListVO(@Param("ew") Wrapper<QichefenleiEntity> wrapper);
	
	QichefenleiVO selectVO(@Param("ew") Wrapper<QichefenleiEntity> wrapper);
	
	List<QichefenleiView> selectListView(@Param("ew") Wrapper<QichefenleiEntity> wrapper);

	List<QichefenleiView> selectListView(Pagination page,@Param("ew") Wrapper<QichefenleiEntity> wrapper);
	
	QichefenleiView selectView(@Param("ew") Wrapper<QichefenleiEntity> wrapper);
	
}
