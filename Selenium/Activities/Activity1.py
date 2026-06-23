from selenium import webdriver
from selenium.webdriver.common.by import By

# Launch Chrome browser
driver = webdriver.Chrome()

# Open the website
driver.get("https://training-support.net")

# Print title of the home page
print("Home Page Title:", driver.title)

# Click the About Us button
driver.find_element(By.LINK_TEXT, "About Us").click()

# Print title of the new page
print("About Us Page Title:", driver.title)

# Close the browser
driver.quit()