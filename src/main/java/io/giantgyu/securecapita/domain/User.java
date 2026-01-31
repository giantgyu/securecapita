package io.giantgyu.securecapita.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(NON_DEFAULT)
public class User {

    private Long id;

    @NotEmpty(message = "名は必須です。")
    private String firstName;

    @NotEmpty(message = "姓は必須です。")
    private String lastName;

    @NotEmpty(message = "メールアドレスは必須です。")
    @Email(message = "有効なメールアドレスを入力してください。")
    private String email;

    @NotEmpty(message = "パスワードは必須です。")
    private String password;

    private String address;

    private String phone;

    private String title;

    private String bio;

    private String imageUrl;

    private boolean enabled;

    private boolean isNotLocked;

    private boolean isUsingMfa;

    private LocalDateTime createdAt;

}
