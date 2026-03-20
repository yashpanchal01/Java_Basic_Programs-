import requests
import json

# 1. The Mirror URL (It will tell us what our disguise looks like)
url = "https://httpbin.org/user-agent"

# 2. THE DISGUISE (Headers)
# We create a dictionary of fake headers. You can paste your own User-Agent here.
my_disguise = {
    "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36",
    "Accept-Language": "en-US,en;q=0.9", # Pretend we speak English
    "Referer": "https://www.google.com/" # Pretend we clicked a link from Google
}

# 3. Make the request, but this time we hand the server our fake ID card
response = requests.get(url, headers=my_disguise)

# 4. Print the server's response to see if it fell for it
if response.status_code == 200:
    data = response.json()
    print("The server thinks we are:")
    print(json.dumps(data, indent=4))
else:
    print("Blocked!")