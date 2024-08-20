package com.chris.airbnb_platform_back.user.repository;

import com.chris.airbnb_platform_back.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findOneByEmail(String email);
    Optional<User> findOneByPublicId(UUID publicId);
}
