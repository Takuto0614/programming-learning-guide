SELECT users.name, orders.product_name
FROM users
JOIN orders
  ON users.id = orders.user_id;