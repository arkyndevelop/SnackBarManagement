package Model;

import java.util.ArrayList;
import java.util.List;

public class UserModel {
    private List<User> Users; // Remova o static

    public UserModel() {
        // Inicializa a lista de usuarios
        Users = new ArrayList<>();
        Users.add(new User("admin", "admin123", User.UserRole.ADMIN));

    }

    public User authenticate(String username, String password) {
        for (User user : Users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user; // Retorna o usuario autenticado
            }
        }
        return null; // Retorna null caso usuario não encontrado
    }
}