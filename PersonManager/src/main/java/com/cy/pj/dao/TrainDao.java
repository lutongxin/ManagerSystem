package com.cy.pj.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cy.pj.pojo.Train;

@Mapper
public interface TrainDao {
	/**
	 * 查询所有培训记录
	 * @return 将查询的结果封装到list<Train>中
	 */
	public List<Train> findObjects();
	/**
	 * 添加一条培训记录
	 * @param train 封装添加的培训信息
	 * @return 改变的行数
	 */
	public int addTrainObject(Train train);
	/**
	 * 根据id查询培训信息
	 * @param id
	 * @return Train
	 */
	public Train findTrainObjectById(Integer id);
	/**
	 * 根据id删除培训信息
	 * @param id
	 * @return int 删除的行数
	 */
	public int deleteTrainObjectById(Integer id);
}
