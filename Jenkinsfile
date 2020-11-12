pipeline {
 agent any
 tools {
    gradle "gradle"
 }
 stages {
   stage("build") {
         steps {
             bat 'gradle --version'
         }
    }
   stage("test"){
    steps{
      bat 'gradle clean executeFeatures'
    }
   }
   stage("deploy"){
    steps{
      echo "deploy aplication"
    }
  }   
 }
}
