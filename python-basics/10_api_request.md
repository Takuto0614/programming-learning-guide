# APIリクエスト

APIを使うことで、外部サービスからデータを取得できます。  
ここでは `requests` ライブラリを使ってデータを取得します。

## サンプルコード

```python
import requests

res = requests.get("https://api.github.com")

print(res.status_code)