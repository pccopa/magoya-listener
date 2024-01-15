package com.magoya.listener.repository;

import com.magoya.listener.models.EventModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<EventModel, String> {
}
