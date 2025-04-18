package com.example.cinema_client.models;
import lombok.Data;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Size;
import java.util.Set;


@Data
public class
User {
	private Integer id;
    @NotBlank(message = "Không được để trống email!")
    @Email(message = "Bạn cần nhập email hợp lệ!")
    private String username;

    @NotBlank(message = "Không được để trống mật khẩu!")
    @Size(min=6,message = "Mật khẩu phải có ít nhất 6 ký tự")
    private String password;

    @NotBlank(message = "Không được để trống họ tên!")
    private String fullName;
    @Size(min = 9, max = 11, message = "Số điện thoại không phù hợp")
    @NotBlank(message = "Không được để trống họ tên!")
    private String phone;
    
    private Set<Role> roles;
}