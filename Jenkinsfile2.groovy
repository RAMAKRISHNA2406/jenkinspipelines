pipeline {
    agent any 
       stages {
          stage('build') {
             steps {
                 sh : sleep 60 
             }
          }
          stage('test') {
             steps {
                 echo "testing application "
             }
          }
          stage('deploy') {
            steps {
                echo  "deploying application"
            }
          }
             
       }    
       
    
}