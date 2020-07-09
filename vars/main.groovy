def call(Map config):
{
  pipeline {
    agent any
    environment {
        myname = config.name
        myprofile = config.profile
    }
    stages {
        stage ('Print Hello') {
            steps {
                sh "echo \$myname"
            }
        }
    }
  }
}
