def gv

pipeline {
    agent any
    stages {
        stage("init") {
            steps {
                script {
                    gv = load "script.groovy"
                }
            }
        }
        stage("build jar") {
            steps {
                script {
                    echo "building jar"
                    //gv.buildJar()
                }
            }
        }
        stage("build image") {
            steps {
                when {
                    expression{
                        BRANCH_Name == "main"
                    }
                }
                script {
                    echo "building image"
                    //gv.buildImage()
                }
            }
        }
        stage("deploy") {
            steps {
                when {
                    expression{
                        BRANCH_Name == "main"
                    }
                }
                script {
                    echo "deploying"
                    //gv.deployApp()
                }
            }
        }
    }   
}
