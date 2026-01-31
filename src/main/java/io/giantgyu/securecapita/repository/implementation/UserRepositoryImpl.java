package io.giantgyu.securecapita.repository.implementation;

import io.giantgyu.securecapita.domain.User;
import io.giantgyu.securecapita.exception.ApiException;
import io.giantgyu.securecapita.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@Repository
@RequiredArgsConstructor
@Slf4j
public class UserRepositoryImpl implements UserRepository<User> {
    private static final String COUNT_USER_EMAIL_QUERY = "";
    public final NamedParameterJdbcTemplate jdbc;

    @Override
    public User create(User user) {
        //Check if email is unique
        //メールの重複チェック
        if (getEmailCount(user.getEmail().trim().toLowerCase())>0) throw new ApiException("Email already in use. Please use a different email and try again.");
        return null;
    }


    @Override
    public Collection<User> list(int page, int pageSize) {
        return List.of();
    }

    @Override
    public User get(Long id) {
        return null;
    }

    @Override
    public User update(User data) {
        return null;
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }

    private int getEmailCount(String email) {
        return jdbc.queryForObject(COUNT_USER_EMAIL_QUERY, Map.of("email", email), Integer.class);
    }

}