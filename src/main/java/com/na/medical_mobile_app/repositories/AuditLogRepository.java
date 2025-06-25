package com.na.medical_mobile_app.repositories;

import com.na.medical_mobile_app.entities.AuditLog;
import com.na.medical_mobile_app.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface AuditLogRepository extends JpaRepository<AuditLog, Integer> {
    List<AuditLog> findByUser(User user);
    List<AuditLog> findByAction(String action);
    List<AuditLog> findByResourceTypeAndResourceId(String resourceType, Integer resourceId);
    List<AuditLog> findByTimestampBetween(LocalDateTime start, LocalDateTime end);
    List<AuditLog> findByIpAddress(String ipAddress);
    List<AuditLog> findByUserAndTimestampBetween(User user, LocalDateTime start, LocalDateTime end);
}