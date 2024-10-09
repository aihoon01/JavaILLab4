pipeline {
    agent any

    stages {
        stage('Clone Repository') {
            steps {
                git branch: 'master', url: 'https://github.com/aihoon01/JavaILLab4.git'
            }
        }
        stage('Build') {
            steps {
                sh './mvnw clean compile'
            }
        }
        stage('Test') {
            steps {
                sh './mvnw test'
            }
        }
        stage('Package') {
            steps {
                sh './mvnw package'
            }
        }
    }

    post {
        success {
            echo 'Build, Test, and Packaging were successful!'
        }
        failure {
            echo 'Build failed.'
        }
    }
}
