package test;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, String> {
    User findByNameAndPasswd(String name, String passwd);
    List<User> findByNameIn(List<String> names);
    List<User> findByAgeGreaterThan(int age);
    List<User> findByAgeBetween(int a, int b);
}
