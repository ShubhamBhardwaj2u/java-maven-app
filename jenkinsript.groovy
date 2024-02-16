def buildApp(){
  echo "Building app"
  echo "New version = ${NEW_VERSION}" // using environment variable
  sh 'mvn -v' // using build tools
}
def testApp(){
  // using credentials in jenkins
  withCredentials([
    usernamePassword(credentialsId: 'ShubhamBhardwaj2u', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')
  ]){
     echo "username = ${USERNAME} and password = ${PASSWORD}" 
  }
}
def deployApp(){
  echo "Deploying app"
}
return this
