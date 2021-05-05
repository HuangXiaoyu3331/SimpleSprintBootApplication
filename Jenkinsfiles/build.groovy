pipeline {
    agent any

    stages {
        stage('repoClone') {
            steps {
                echo 'repoClone...'
                echo "Running ${env.BUILD_ID} ${env.BUILD_DISPLAY_NAME} on ${env.NODE_NAME} and JOB ${env.JOB_NAME}"
            }
        }
    }
}