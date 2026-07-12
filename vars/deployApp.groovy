def call(String environmentName = "production") {
    echo "Deploying the application to ${environmentName}"

    sh '''
        echo "Deploying command is running"
        echo "Environment " ${environmentName}"
        echo "Deployment Completed"
        '''
}
