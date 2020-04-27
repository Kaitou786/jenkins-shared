def call(){
  pipeline{
    agent {label 'jenkins-slave'}
    stages{
      stage('Sample stage'){
        steps{
        echo "I am called from a shared pipeline"
        }
      }
    }
  } 
}
