# ファイル読み込み

Pythonでは、テキストファイルなどを読み込んで内容を扱うことができます。  
ログ処理やデータ分析などでよく使われます。

## サンプルコード

```python
with open("sample.txt", "r", encoding="utf-8") as f:
    content = f.read()
    print(content)