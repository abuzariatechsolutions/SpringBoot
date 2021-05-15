package com.iats.specification;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.Predicate;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import com.iats.entity.User;
import com.iats.model.request.UserRequest;

@Component
public class UserSpecification {

	public Specification<User> getUsers(UserRequest request) {
		return (root, query, criteriaBuilder) -> {

			List<Predicate> predicates = new ArrayList<>();

			if (request.getEmail() != null && !request.getEmail().isEmpty()) {
				predicates.add(criteriaBuilder.equal(root.get("email"), request.getEmail()));
			}
			if (request.getName() != null && !request.getName().isEmpty()) {
				predicates.add(criteriaBuilder.like(criteriaBuilder.lower(root.get("fullName")),
						"%" + request.getName().toLowerCase() + "%"));
			}
			if (request.getGender() != null && !request.getGender().isEmpty()) {
				predicates.add(criteriaBuilder.equal(root.get("gender"), request.getGender()));
			}

			query.orderBy(criteriaBuilder.desc(root.get("experience")));

			return criteriaBuilder.and(predicates.toArray(new Predicate[0]));

		};
	}
}
