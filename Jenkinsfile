pipeline {
    agent {
        docker {
            image "openjdk:11"
        }
    }  
    stages {
        stage("Build") {
            steps {
                // Compile and build your Java project
                script {
                    sh 'mkdir -p target'
                    sh 'javac -d target pattern.java'
                }
            }
        }

        stage("Run pattern code") {
            steps {
                // Run your Java code
                script {
                    sh 'java -cp target pattern'
                }
            }
        }
    }
}
