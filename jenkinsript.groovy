def buildApp(){
  echo "Building app"
  echo "New version = ${NEW_VERSION}" // using environment variable
}
def testApp(){
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
