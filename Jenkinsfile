
pipeline{
        agent any
        stages{
                stage('---build---'){
                        steps{
                               sh "docker build -t ayshamarty/account-num-gen-high ."
                        }
                }
                stage('---push---'){
                        steps{
                                sh "docker push ayshamarty/account-num-gen-high"
                        }
                }

                stage('---redeploy stack---') {
                    steps {
                            build job: "Account-API-Deploy", wait: true

                        }
                }
        }
}

