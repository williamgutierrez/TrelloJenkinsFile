pipeline {
 agent any
 tools {
    gradle "gradle"
 }
 stages {
    stage("configuration") {
         steps {
             bat 'gradle uiTests'
         }
    }
    
     
 }
}
