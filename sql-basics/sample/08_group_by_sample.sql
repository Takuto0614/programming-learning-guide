SELECT city, COUNT(*) AS user_count
FROM users
GROUP BY city;