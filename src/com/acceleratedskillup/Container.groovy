package com.acceleratedskillup;

def build() {
  docker.withRegistry('https://index.docker.io/v1/', 'dockerhub') {
  def app = docker.build("wakeupcolumn/jenkinsrepo:${commit_id}", '.').push()
  }
}
