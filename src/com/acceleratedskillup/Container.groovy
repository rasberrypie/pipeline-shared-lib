package com.acceleratedskillup;

def build(commit_id) {
  docker.withRegistry('https://index.docker.io/v1/', 'dockerhub') {
  def app = docker.build("wakeupcolumn/jenkinsrepo:${commit_id}", '.').push()
  }
}
