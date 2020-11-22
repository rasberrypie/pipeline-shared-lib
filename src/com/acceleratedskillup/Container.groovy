package com.acceleratedskillup;

def buildImage(String imageName, String imageTag, String filePath = ".") {
  docker.withRegistry('https://index.docker.io/v1/', 'dockerhub') {
    def app = docker.build("wakeupcolumn/${imageName}:${imageTag}", "${filePath}").push()
  }
}
