package com.akas25n.entityListener.Auditable;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;

class AuditorAwareImpl implements AuditorAware<String> {

	@Override
	public Optional<String> getCurrentAuditor() {
		
		return Optional.of("Akash");
		
		// Can use Spring Security to return currently logged in user
        // return ((User) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUsername()
	}

}
