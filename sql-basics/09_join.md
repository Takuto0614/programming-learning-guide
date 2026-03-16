
---

## 09_join.md
```md
# JOIN

テーブルを結合する

```sql
SELECT users.name, orders.price
FROM users
JOIN orders
ON users.id = orders.user_id;