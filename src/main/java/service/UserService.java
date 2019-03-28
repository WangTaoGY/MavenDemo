package service;

import dao.UserDao;

import java.util.List;

/**
 * Created by W on 2019/3/28.
 */

public interface UserService {

    List<UserDao> getUserList();
}
