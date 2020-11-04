pipeline {
  agent any
  tools{
    gradle "gradle"
  }
  stages {
    stages("build") {
          steps {
             echo 'echo building'
          }
    }
    stages("test"){
          steps {
             echo 'echo Testing'
          }
    }
    stages("deploy"){
          steps {
             bat "echo deploying"  
          }
    }
  
  }
}
