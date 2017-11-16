
    node('mypod') {

   kubernetes.pod('buildpod').withImage('maven').inside {
    //for a single container you can avoid the .withNewContainer() thing.
    git 'https://github.com/jenkinsci/kubernetes-pipeline.git'
    sh 'mvn clean install'
}
    }
