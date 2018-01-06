


podTemplate(label: 'mypod', containers: [
    containerTemplate(name: 'maven', image: 'maven:3.3.9-jdk-8-alpine', ttyEnabled: true, command: 'cat'),
  ]) {

    node('mypod') {
        stage('Build Artifact') {
            git 'https://github.com/smileisak/java-demo.git'
            container('maven') {
                stage('Build a Maven project') {
                    sh 'cd complete && mvn clean install'
                }
            }
        }

    }
}