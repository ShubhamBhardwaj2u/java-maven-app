def fnTest(){
  echo "Testing!"
  echo "Running pipeline $NAME"
}

def fnBuild(){
  echo "Building!"
  echo "Build version: $VERSION"
}

def fnDeploy(){
  echo "Deploying!"
}

return this
