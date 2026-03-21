# サブクエリ（内部検索）

サブクエリとは、SQLの中にSQLを書く方法です。  
「SELECTの中にSELECTを書く」ことで、条件に応じたデータ取得ができます。

## サンプルSQL

```sql
SELECT name
FROM users
WHERE id IN (
    SELECT user_id
    FROM orders
);