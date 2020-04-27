@Library('kogito_shared') _
node('jenkins-slave'){
    stage('test'){
        def branch=input(
        message: 'Is it okay to publish?',
        parameters: [
        [$class: 'StringParameterDefinition', defaultValue: 'None', description: 'List of tags', name: 'coreImageTagsList'],
    ]
    )
        echo("hello there")
        sh "echo \$(env.branch)"
        sh "pwd && ls -l test"
    }
}
foo()
