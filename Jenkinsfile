pipeline {
    agent { docker 'maven:3.3.3' }
    stages {
      stage('discover') {
          steps {
              sh 'ls -al'
          }
      }
      // run unit test
      stage('unittest') {
          steps {
              sh 'cd complete && mvn test'
          }
      }
      // build jar file
      stage('build') {
          steps {
              sh 'ls -al'
              sh 'pwd'
              sh 'cd complete && mvn package'
          }
      }

    }
}
