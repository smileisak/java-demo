


podTemplate(
    label: 'mypod', 
    containers: [
        containerTemplate(
            name: 'maven',
            image: 'maven:3.3.9-jdk-8-alpine', 
            ttyEnabled: true, 
            command: 'cat'
            ),
        containerTemplate(
            name: 'docker', 
            image: 'docker:1.11', 
            ttyEnabled: true, 
            command: 'cat',
            envVars: [
            secretEnvVar(key: 'DOCKERHUB_PASSWORD', secretName: 'dockerhub-secret', secretKey: 'password'),
        ],
            )
        ],
    volumes: [hostPathVolume(hostPath: '/var/run/docker.sock', mountPath: '/var/run/docker.sock')]
    ) {

    node('mypod') {
        stage("Checkout Github Repository"){
            git 'https://github.com/smileisak/java-demo.git'
        }
        stage('Run unit tests') {
            container('maven') {
                stage('Run unit tests') {
                    sh 'cd complete && mvn test' 
                }
            }
        }
        stage('Build Artifact') {
            container('maven') {
                stage('Build a Maven project') {
                    sh 'cd complete && mvn -DskipTests package' 
                }
            }
        }

        stage('Build  Docker Image') {
            container('docker') {
                stage('Build Docker images') {
                    sh 'cd complete && docker build -t smile0x90/demo-java:v1 .' 

                }
                stage('Push Docker images') {
                    sh 'docker login --username=smile0x90 --password=$DOCKERHUB_PASSWORD  && docker push  smile0x90/demo-java:v1' 

                }
            }
        }

    }
}