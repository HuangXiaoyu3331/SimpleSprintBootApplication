pipeline {
  agent any
  stages {
    stage('first step') {
      parallel {
        stage('first step') {
          steps {
            sh 'echo "first step"'
          }
        }

        stage('parallel step') {
          steps {
            echo 'parallel step'
          }
        }

      }
    }

    stage('second step') {
      steps {
        sh 'echo "second step"'
      }
    }

  }
}