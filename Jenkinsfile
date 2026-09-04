pipeline {

    agent any

    stages {

        stage('Checkout') {
            steps {
                echo 'Checkout source code'
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo 'Building application'
                sh './mvnw clean compile'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests'
                sh './mvnw test'
            }
        }

        stage('Package') {
            steps {
                echo 'Packaging application'
                sh './mvnw package -DskipTests'
            }
        }
    }

    post {

        success {
            echo 'Pipeline completed successfully!'
        }

        failure {
            echo 'Pipeline failed!'
        }
    }
}