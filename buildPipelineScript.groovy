def buildApp(){
  echo "Building the application"
  sh "mvn package"
}

def buildANndDeploy(){
          echo "Building image and deploying!"
          withCredentials([
            usernamePassword(credentialsId: 'azure cr', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')
          ]){
            sh "docker build -t privatecr.azurecr.io/application:1.3 ."
            sh "echo $PASSWORD | docker login privatecr.azurecr.io -u $USERNAME --password-stdin"
            sh "docker push privatecr.azurecr.io/application:1.3"
          }
}

return this
