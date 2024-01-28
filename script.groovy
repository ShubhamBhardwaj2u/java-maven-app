def testApp(){
  echo "Testing is running!"
}

def buildApp(){
  echo "Building is running!"
}

def deployApp(){
  echo "Deployment is running!"
  echo "Deployment version is ${VERSION}"
}

return this
