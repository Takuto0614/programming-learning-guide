# JOIN

JOINを使うと複数のテーブルを結合できます。

## サンプルSQL

```sql
SELECT users.name, orders.price
FROM users
JOIN orders
ON users.id = orders.user_id;