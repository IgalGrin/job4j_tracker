package ru.job4j.ex;

import java.util.Objects;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User user = null;
        for (User find : users
             ) {
           if (Objects.equals(find.getUsername(), login)) {
               user = find;
           } else {
               throw new UserNotFoundException("user not found");
           }
        }
        return user;
    }

    public static boolean validate(User user) throws UserInvalidException {
        int length = user.getUsername().length();
        if (!user.isValid() || length < 3) {
            throw new UserInvalidException("the user is not valid");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
        User user = findUser(users, "Petr Arsentev");
        if (validate(user)) {
            System.out.println("This user has an access");
        }
        } catch (UserNotFoundException unf) {
            unf.printStackTrace();
        }
    }
}
