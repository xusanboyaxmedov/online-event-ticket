package uz.pdp.university.DTO;

import uz.pdp.university.entity.UserType;

public record SignUpDTO(String name, String username, String password, UserType role) {
}
