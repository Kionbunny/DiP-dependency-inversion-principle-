🐳 DIP Java App – Dockerized  ✅
This is a simple Java-based application demonstrating how to Dockerize a project using the Dependency Inversion Principle (DIP). Below are the steps to build, run, and push the Docker image.

# 📁 Step 1: Create a Dockerfile ✅
In the root of your project folder, create a Dockerfile containing the necessary instructions to:

Use a base image (e.g., openjdk)

Set a working directory

Copy source files

Compile the Java code

Define the command to run the program

# All commands for docker are in BOLD 

# 🛠️ Step 2: Build the Docker Image ✅
Use the following command to build the image in your current working directory:

# docker build -t dip-app.

# 🧪 Step 3: Run the Container Interactively ✅
To interact with the Java program through the console (e.g., taking user input), run it in interactive mode:

# docker run -it dip-app

# ☁️ Step 4: Push Image to Docker Hub ✅
Log in to Docker Hub:
# docker login

Tag the image with your Docker Hub username and repository name:
# docker tag dip-app ajay120/dip-app:latest

 Push the tagged image: 
# docker push ajay120/dip-app:latest 

Now, the image is live and can be pulled anywhere using:

  # docker pull ajay120/dip-app
  # docker run -it ajay120/dip-app
