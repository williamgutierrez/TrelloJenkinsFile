pipeline {
  agent any
  tools{
    gradle "gradle"
  }
  stages {
    stages("build") {
          steps {
             bat 'echo building'
          }
    }
    stages("test"){
          steps {
             bat 'echo Testing'
          }
    }
    stages("deploy"){
          steps {
             echo "echo deploying"  
          }
    }
  
  }
}
