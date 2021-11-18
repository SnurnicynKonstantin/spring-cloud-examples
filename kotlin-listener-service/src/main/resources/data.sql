DROP TABLE IF EXISTS basket;

CREATE TABLE basket (
  id int8 AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(250) NOT NULL
);

CREATE TABLE basket_product (
  id int8 AUTO_INCREMENT PRIMARY KEY,
  basket_id int8 NOT NULL REFERENCES basket (id),
  product_id integer NOT NULL
);

INSERT INTO basket (id, name) VALUES
  (1, 'Simple basket');

INSERT INTO basket_product (id, basket_id, product_id) VALUES
  (1, 1, 1),
  (2, 1, 2);
