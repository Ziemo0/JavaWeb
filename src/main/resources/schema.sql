CREATE TABLE Player(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    surname VARCHAR(255),
    number INT
);

CREATE TABLE Comment(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    player_id BIGINT NOT NULL,
    comment VARCHAR(255) NOT NULL
);

ALTER TABLE Comment
    ADD CONSTRAINT comment_player_id
    FOREIGN KEY (player_id) REFERENCES player(id)