package com.jesper.seckill.dubbo_api;


import com.jesper.seckill.dubbo_dto.User;

public interface UserService {

	  public User getById(long id);
}
