pipeline {
    agent {
        docker {
            image "openjdk:11"
        }
    }  
    stages {
       

        stage("Run pattern code") {
            steps {
                // Run your Java code
                script {
                    sh 'java pattern.java'
                }
            }
        }
    }
}
