package com.acceleratedskillup;

def generateImageTag(String env, String version) {
   sh "git rev-parse --short HEAD > .git/commit-id"               
   commit_id = readFile('.git/commit-id').trim()
   
   if ("${env}" == "master") {
      newTag = "${version}-master-${commit_id}"
   }
   if ("${env}" == "qa") {
      newTag = "${version}-qa-${commit_id}"
   }
   if ("${env}" != "master" && "${env}" != "qa") {
      newTag = "${version}-dev-${commit_id}"
   }
   sh "echo ${newTag}"
   return "${newTag}"   
}
