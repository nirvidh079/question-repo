package com.example.question.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;

@Entity
@Table(name = "coding_question_template")
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@Data
public class CodingQuesTemplate extends Auditable implements Serializable {
    private static final long serialVersionUID = 4076468265819394259L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "language_code")
    private String languageCode;
    @Column(columnDefinition = "TEXT")
    private String snippet;
}
