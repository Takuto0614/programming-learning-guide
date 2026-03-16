
---

## 10_api_request.md
```md
# APIリクエスト

```python
import requests

res = requests.get("https://api.github.com")

print(res.status_code)