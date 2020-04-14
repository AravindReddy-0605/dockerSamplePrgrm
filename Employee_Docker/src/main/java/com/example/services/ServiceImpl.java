package com.example.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.classes.MyClass;
import com.example.dao.SpringDao;


@Service
public class ServiceImpl implements ServiceInterface {

	@Autowired
	private SpringDao sDao;

	@Override
	public MyClass saveDetails(MyClass cls) {

		return sDao.save(cls);

	}

}
