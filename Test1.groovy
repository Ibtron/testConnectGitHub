pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building the project...'
                // Aquí irían los pasos para compilar o construir el proyecto, como Maven, Gradle, etc.
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                // Aquí se ejecutarían los tests, como comandos de pruebas unitarias, etc.
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying the application...'
                // Aquí irían los pasos para desplegar la aplicación en el entorno adecuado.
            }
        }
    }

    post {
        always {
            echo 'This will always run, regardless of the build result.'
            // Pasos que se deben ejecutar siempre, como limpieza o notificación.
        }
        success {
            echo 'This will run if the build was successful.'
        }
        failure {
            echo 'This will run if the build failed.'
        }
    }
}
