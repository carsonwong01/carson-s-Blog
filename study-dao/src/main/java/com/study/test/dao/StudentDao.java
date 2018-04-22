package com.study.test.dao;


import com.study.test.dao.base.BaseDao;
import com.study.test.model.Student;
import org.springframework.stereotype.Repository;

/**
 * Created by songl on 2017/8/8.
 */
@Repository
public interface  StudentDao extends BaseDao<Student> {
}
