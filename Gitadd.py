import shutil
import os
import subprocess
from datetime import datetime
import random

# Specify the source and destination folders


# Generate a funny file name and content
file_name = "my_file2561.txt"
file_content = "This is some random text for the funny file.\nHave a good laugh!"

# Create and write to the file
with open(file_name, 'w') as file:
    file.write(file_content)

# Initialize a Git repository if not already initialized
if not os.path.exists('.git'):
    subprocess.run(['git', 'init'])

# Add the file to the staging area
subprocess.run(['git', 'add', file_name])

# Commit the file
subprocess.run(['git', 'commit', '-m', 'Initial commit'])

# Amend the commit date to June 6, 2023
commit_date = "2023-06-07 12:00:00"
subprocess.run(['git', 'commit', '--amend', '--date', commit_date])

print(f"File '{file_name}' has been created and committed with the date set to June 6, 2023.")
