package com.acceleratedskillup;

def generateImageTag(String env, String version) {       
   commit_id = readFile('.git/commit-id').trim()
   newTag = "${version}-${env}-${commit_id}"
   sh "echo ${newTag}"
   return "${newTag}"
}
