SELECT o.id, u.name, o.total_price
FROM orders o
INNER JOIN users u
  ON o.user_id = u.id;