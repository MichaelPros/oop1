package homework5.service;



import homework5.model.User;

import java.util.List;

public interface DataService {
    User create(User user);
    List<User> read();
}
