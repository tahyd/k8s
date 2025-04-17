pipeline {
  agent any
  stages {
    stage('checkout') {
      steps {
        git(url: 'https://github.com/tahyd/k8s.git', branch: 'main', credentialsId: 'git-tahyd-token', poll: true)
      }
    }

  }
}