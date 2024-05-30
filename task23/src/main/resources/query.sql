CREATE TABLE spring_session (
                                session_id CHAR(36) NOT NULL PRIMARY KEY,
                                creation_time TIMESTAMP NOT NULL,
                                last_access_time TIMESTAMP NOT NULL,
                                max_inactive_interval INT NOT NULL,
                                expired BOOLEAN NOT NULL
);