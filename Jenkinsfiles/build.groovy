pipeline {
    agent any

    stages {
        stage('repoClone') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: 'main']],
                          userRemoteConfigs: [[url: 'https://github.com/HuangXiaoyu3331/SimpleSprintBootApplication']]])
            }
        }
    }
}