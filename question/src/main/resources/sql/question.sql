CREATE TABLE question (
    id BIGSERIAL PRIMARY KEY,
    type VARCHAR(50) NOT NULL,
    title VARCHAR(500) NOT NULL,
    problem_statement TEXT NOT NULL,
    difficulty_level VARCHAR(50) NOT NULL,
    max_score INTEGER NOT NULL DEFAULT 100,
    negative_score INTEGER DEFAULT 0,
    time_bound_seconds INTEGER DEFAULT 0,
    is_active BOOLEAN NOT NULL DEFAULT TRUE,
    is_draft BOOLEAN NOT NULL DEFAULT TRUE,
    ai_evaluation_enabled BOOLEAN DEFAULT TRUE,
    created_at TIMESTAMP NOT NULL DEFAULT NOW(),
    created_by VARCHAR(255) NOT NULL,
    updated_at TIMESTAMP NOT NULL DEFAULT NOW(),
    updated_by VARCHAR(255) NOT NULL
);
