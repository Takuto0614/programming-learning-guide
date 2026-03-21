SELECT name
FROM users
WHERE id = (
    SELECT user_id
    FROM orders
    LIMIT 1
);