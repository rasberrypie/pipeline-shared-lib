package com.acceleratedskillup;

def buildImage(String commitId, String imageName, String filePath = ".") {
  docker.withRegistry('https://index.docker.io/v1/', 'dockerhub') {
    def app = docker.build("wakeupcolumn/${imageName}:${commitId}", "${filePath}").push()
  }
}
