CREATE TABLE Players(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    surname VARCHAR(255),
    number INT
);

CREATE TABLE Comments(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    player_id BIGINT NOT NULL,
    comment VARCHAR(255) NOT NULL
);

ALTER TABLE Comments
    ADD CONSTRAINT comment_player_id
    FOREIGN KEY (player_id) REFERENCES players(id)