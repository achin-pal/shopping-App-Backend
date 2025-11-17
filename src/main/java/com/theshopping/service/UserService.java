package com.theshopping.service;

import com.theshopping.exception.UserException;
import com.theshopping.model.User;

public interface UserService {

    public User findUserById(Long userid) throws UserException;

    public User findUserProfileByJwt(String jwt) throws UserException;
}
