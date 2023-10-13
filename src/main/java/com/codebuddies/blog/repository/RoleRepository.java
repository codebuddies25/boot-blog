package com.codebuddies.blog.repository;

import com.codebuddies.blog.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
}
