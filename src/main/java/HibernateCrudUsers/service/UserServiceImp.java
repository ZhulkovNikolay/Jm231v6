package HibernateCrudUsers.service;

import HibernateCrudUsers.dao.UserDao;
import HibernateCrudUsers.dao.UserDaoImp;
import HibernateCrudUsers.model.User;

import java.util.List;

public class UserServiceImp implements UserService {
    private UserDao userDao = new UserDaoImp();


    @Override
    public List<User> allUsers() {
        return userDao.allUsers();
    }

    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public void delete(User user) {
        userDao.delete(user);
    }

    @Override
    public void edit(User user) {
        userDao.edit(user);
    }

    @Override
    public User getById(int id) {
        return userDao.getById(id);
    }
}
