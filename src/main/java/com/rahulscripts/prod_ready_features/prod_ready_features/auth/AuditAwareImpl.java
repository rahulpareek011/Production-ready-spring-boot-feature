package com.rahulscripts.prod_ready_features.prod_ready_features.auth;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class AuditAwareImpl implements AuditorAware {

    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("Rahul Pareek");
    }
}
