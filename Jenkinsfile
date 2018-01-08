


podTemplate(
    label: 'mypod', 
    containers: [
        containerTemplate(name: 'maven', image: 'maven:3.3.9-jdk-8-alpine', ttyEnabled: true, command: 'cat'),
        containerTemplate(name: 'docker', image: 'docker:1.11', ttyEnabled: true, command: 'cat')
        ],
    volumes: [hostPathVolume(hostPath: '/var/run/docker.sock', mountPath: '/var/run/docker.sock')]
    ) {

    node('mypod') {
        stage('Run unit tests') {
            git 'https://github.com/smileisak/java-demo.git'
            container('maven') {
                stage('Run unit tests') {
                    sh 'cd complete && mvn test' 
                }
            }
        }
        stage('Build Artifact') {
            container('maven') {
                stage('Build a Maven project') {
                    sh 'cd complete && mvn install -DskipTests' 
                }
            }
        }

        stage('Build & Push Docker Image') {
            container('maven') {
                stage('Build & push Docker images') {
                    sh 'cd complete && make all' 
                }
            }
        }

    }
}