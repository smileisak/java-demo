
podTemplate(label: 'maven', containers: [
  containerTemplate(name: 'maven', image: 'maven:3.3.9-jdk-8-alpine', ttyEnabled: true, command: 'cat')
  ]) {

  node('maven') {
    stage('Build a Maven project') {
      git 'https://github.com/smileisak/java-demo.git'
      container('maven') {
          sh 'mvn -version'
      }
    }
  }
}


// pipeline {
//     agent { docker 'maven:3.3.3' }
//     stages {
//       stage('discover') {
//           steps {
//               sh 'ls -al'
//           }
//       }
//       // run unit test
//       stage('unittest') {
//           steps {
//               sh 'cd complete && mvn test'
//           }
//       }
//       // build jar file
//       stage('build') {
//           steps {
//               sh 'ls -al'
//               sh 'pwd'
//               sh 'cd complete && mvn package'
//           }
//       }

//     }
// }
