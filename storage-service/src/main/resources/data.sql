DROP TABLE IF EXISTS product;

CREATE TABLE product (
  id int8 AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  price integer NOT NULL
);

INSERT INTO product (id, name, price) VALUES
  (1, 'Banana', 100),
  (2, 'Toy', 400),
  (3, 'iPhone', 5000);
