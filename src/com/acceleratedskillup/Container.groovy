package com.acceleratedskillup;

def buildImage(String imageTag, String imageName, String filePath = ".") {
  docker.withRegistry('https://index.docker.io/v1/', 'dockerhub') {
    def app = docker.build("wakeupcolumn/${imageTag}:${commitId}", "${filePath}").push()
  }
}
