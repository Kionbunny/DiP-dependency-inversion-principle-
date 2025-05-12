#FROM ubuntu:latest
#LABEL authors="masha"
#ENTRYPOINT ["top", "-b"]

# Use an official JDK image
FROM openjdk:17
LABEL author="masha"
# Set the working directory inside the container
WORKDIR /app

# Copy all Java files into the container
COPY src/ /app
#here we are copying all files from src dir to app dir which is inside the container

# Compile all Java files
RUN javac *.java

#Set the entrypoint to run the compiled Main class
CMD ["java", "Main"]