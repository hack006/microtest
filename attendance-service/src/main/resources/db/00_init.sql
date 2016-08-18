CREATE TABLE attendances (
  id        BIGSERIAL PRIMARY KEY,
  person_id BIGINT NOT NULL,
  arrival   TIMESTAMP NOT NULL,
  departure TIMESTAMP
);

INSERT INTO attendances (person_id, arrival, departure) VALUES
  (1, '2016-04-21 12:00', '2016-04-21 20:10'),
  (1, '2016-04-22 12:10', '2016-04-21 20:00'),
  (1, '2016-04-23 12:20', '2016-04-21 16:10'),
  (1, '2016-04-24 12:00', '2016-04-21 18:05'),
  (1, '2016-05-21 11:55', '2016-04-21 19:00'),
  (1, '2016-04-22 11:50', '2016-04-21 18:00');