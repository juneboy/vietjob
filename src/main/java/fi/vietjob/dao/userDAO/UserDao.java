package fi.vietjob.dao.userDAO;

import java.util.List;

import org.springframework.security.crypto.password.StandardPasswordEncoder;

import fi.vietjob.bean.user.User;

public interface UserDao {
    public int insertUser(User user, StandardPasswordEncoder encoder);
    public int editUser(User user);
    public List<User> getAllUser();
    public int deleteUser(int id);
}
