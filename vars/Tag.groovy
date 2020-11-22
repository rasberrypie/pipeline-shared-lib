def generateImageTag(String env, String version) { 
   sh "git rev-parse --short HEAD > .git/commit-id"               
   commit_id = readFile('.git/commit-id').trim()
   newTag = "${version}-${env}-${commit_id}"
   sh "echo ${newTag}"
   return "${newTag}"
}
