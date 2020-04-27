#here sample pipeline will execute
def call(){
  pipeline{
    agent {label 'jenkins-slave'}
    stages{
      stage('Sample stage'){
        sh "I am called from a shared pipeline"
      }
    }
  } 
}
