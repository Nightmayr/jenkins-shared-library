pipelineJob('FootballManager-AccountApi'){
    parameters{
        gitParam('branch'){
            type('BRANCH')
            sortMode('ASCENDING_SMART')
            defaultValue('origin/master')
        }
    }
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        github("Nightmayr/FootballManager-AccountApi", "ssh")
                        credentials("github-key")
                    }
                    branch('$branch')
                }
            }
            scriptPath('Jenkinsfile')
        }
    }
}
