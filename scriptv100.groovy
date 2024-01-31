def buildApp(){
  echo "Building package"
  sh "mvn package"
}
  
def deployApp(){
  echo "Deploying package"
  sh "docker build -t privatecr.azurecr.io/app:1.0.0 ."
  sh "echo $PASSWORD | docker login privatecr.azurecr.io -u $USERNAME --password-stdin"
  sh "docker push privatecr.azurecr.io/app:1.0.0"
}

return this
