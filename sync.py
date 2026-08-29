import requests
import os

url = "https://leetcode.com"
headers = {
    "Cookie": "csrftoken=TSZJO5msoxReedSXrbApUboO1aMgD8LQ; LEETCODE_SESSION=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfYXV0aF91c2VyX2lkIjoiMjI4NjA2OTEiLCJfYXV0aF91c2VyX2lhIjoxNzg4MDI5MDY2LCJfYXV0aF91c2VyX2JhY2tlbmQiOiJhbGxhdXRoLmFjY291bnQuYXV0aF9iYWNrZW5kcy5BdXRoZW50aWNhdGlvbkJhY2tlbmQiLCJfYXV0aF91c2VyX2hhc2giOiJiNzliM2YwZmYwNzI2YzM1MjYyYjJlNDhjNmFjZDQyNWIxZTUxMjg0ZGJiM2MxZmZlODFkMGU2MDBmMmIxNGM4Iiwic2Vzc2lvbl91dWlkIjoiZjQwNzM0NTUiLCJpZCI6MjI4NjA2OTEsImVtYWlsIjoiZHJheml5YTY4QGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiZHJheml5YTY4IiwidXNlcl9zbHVnIjoiZGFud2FyYmFiYSIsImF2YXRhciI6Imh0dHBzOi8vYXNzZXRzLmxlZXRjb2RlLmNvbS91c2Vycy9kYW53YXJiYWJhL2F2YXRhcl8xNzg0NzczMzYwLnBuZyIsInJlZnJlc2hlZF9hdCI6MTc4ODAxMjk3MSwiaXAiOiIyNDA5OjQwZjA6MjQwYTo4ZGY4OmUxYTE6ZWQzYjpkZjc4OjIwOTciLCJpZGVudGl0eSI6ImIxNTNiNjU5MTk1MGVmMzVmYTU4MzgzN2YyMTg4ZmY2IiwiZGV2aWNlX3dpdGhfaXAiOlsiZWY5YWE1MzUxZWQwZjA0ODQ3Yzc4ZDE2MWYxNzY4MjUiLCIyNDA5OjQwZjA6MjQwYTo4ZGY4OmUxYTE6ZWQzYjpkZjc4OjIwOTciXX0.GFLgkTwik8QEjteMjgmHovBH_hyS3gJAWGcHSjfOL6E",
    "X-Csrftoken": "TSZJO5msoxReedSXrbApUboO1aMgD8LQ",
    "User-Agent": "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36",
    "Referer": "https://leetcode.com"
}

print("📥 Connecting directly to LeetCode's active data stream...")
try:
    res = requests.get(url, headers=headers)
    data = res.json()
    dump = data.get("submissions_dump", [])
    
    if not dump:
        print("❌ Session mismatch. Ensure you are completely logged into leetcode.com on your browser.")
        exit(1)
        
    os.makedirs("my_solutions", exist_ok=True)
    count = 0
    for sub in dump:
        if sub.get("status_display") == "Accepted":
            name = sub["title"].replace(" ", "_")
            lang = sub.get("lang", "py")
            ext = "py" if "python" in lang else "js" if "javascript" in lang else "cpp" if "cpp" in lang else "java"
            with open(f"my_solutions/{name}.{ext}", "w") as out:
                out.write(sub["code"])
            count += 1
            
    print(f"✅ Success! Localized {count} accepted solutions inside your workspace directory.")
except Exception as err:
    print(f"⚠️ Operation stopped: {err}")
