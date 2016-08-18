CREATE TABLE persons (
  id BIGSERIAL PRIMARY KEY,
  name VARCHAR NOT NULL,
  birthday DATE NOT NULL
);

INSERT INTO persons (name, birthday) VALUES
('john deer', '1980-12-22'),
('ivan novakov', '1992-01-12'),
('jan hruby', '1923-02-17'),
('petra splane', '1976-08-04'),
('alena novakova', '1983-11-22');