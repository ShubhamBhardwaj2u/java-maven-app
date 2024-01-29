def appTest(){
  echo "Testing the application"
}

def appBuild(){
  echo "Building the application"
}

def appDeploy(){
  echo "Deploying the application"
  echo "Deploying version ${params.VERSION}"
}

return this
