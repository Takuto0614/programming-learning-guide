import requests

response = requests.get("https://api.github.com")

print("status_code:", response.status_code)
print("content_type:", response.headers.get("Content-Type"))