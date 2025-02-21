package com.example.question.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Data
public abstract class Auditable {

    @CreatedBy
    @Column(name = "CREATED_BY", nullable = false, updatable = false)
    @JsonProperty(access = Access.READ_ONLY)
    private String createdBy = "System";

    @CreatedDate
    @Column(name = "CREATED_AT", nullable = false, updatable = false)
    @JsonProperty(access = Access.READ_ONLY)
    private LocalDateTime createdAt = LocalDateTime.now();

    @LastModifiedBy
    @Column(name = "UPDATED_BY", nullable = false)
    @JsonProperty(access = Access.READ_ONLY)
    private String updatedBy = "System";

    @LastModifiedDate
    @Column(name = "UPDATED_AT",nullable = false)
    @JsonProperty(access = Access.READ_ONLY)
    private LocalDateTime updatedAt = LocalDateTime.now();
}
