def call(){
  pipeline{
    agent {label 'jenkins-slave'}
    stages{
      stage('Sample stage'){
        steps{
        sh "I am called from a shared pipeline"
        }
      }
    }
  } 
}
