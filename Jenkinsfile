

// podTemplate(label: 'maven', containers: [
//   containerTemplate(name: 'maven', image: 'maven:3.3.3', ttyEnabled: true, command: 'cat')
//   ]) {

  node('maven') {
    kubernetes.pod('buildpod').withImage('maven').inside {
    //for a single container you can avoid the .withNewContainer() thing.
    git 'https://github.com/jenkinsci/kubernetes-pipeline.git'
    sh 'mvn clean install'
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
