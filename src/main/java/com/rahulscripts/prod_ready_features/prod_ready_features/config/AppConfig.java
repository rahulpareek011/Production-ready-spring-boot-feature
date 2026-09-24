package com.rahulscripts.prod_ready_features.prod_ready_features.config;

import com.rahulscripts.prod_ready_features.prod_ready_features.auth.AuditAwareImpl;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.ui.ModelMap;

import java.util.Optional;

@Configuration
@EnableJpaAuditing(auditorAwareRef = "AuditAwareImpl")
public class AppConfig {

    @Bean
    ModelMapper getMapper(){
        return new ModelMapper();
    }

    @Bean
    AuditorAware<String> AuditAwareImpl() {
        return new AuditAwareImpl();
    }
    /*
    The Action: You create a new entity (e.g., User) that extends your AuditableEntity class and call userRepository.save(user).

    The Interception: Before Hibernate generates the SQL INSERT or UPDATE statement, it fires a JPA lifecycle event (@PrePersist for new records, @PreUpdate for existing ones).

    The Listener: Because you added @EntityListeners(AuditingEntityListener.class), Spring's AuditingEntityListener catches this event.

    The Population:

    The listener scans your entity and finds the @CreatedDate and @LastModifiedDate annotations, automatically injecting the current system time.

    It finds the @CreatedBy and @LastModifiedBy annotations. It then looks at your @EnableJpaAuditing(auditorAwareRef = "AuditAwareImpl") configuration to find your bean.

    It calls your AuditAwareImpl.getCurrentAuditor() method, takes the returned string ("Rahul Pareek"), and injects it into the createdBy and updatedBy fields.

     */
}
