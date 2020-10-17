def call(){
  pipeline{
    agent {label 'jenkins-slave'}
    stages{
      stage('Build'){
        steps{
        echo "I'm building the images"
        sh "pwd && touch test"
        sh "ls -l"
        }
      }
      stage('Test'){
        steps{
        echo "I'm Testing them"
        sh "pwd && touch test"
        sh "ls -l"
        }
      }
    }
  } 
}
