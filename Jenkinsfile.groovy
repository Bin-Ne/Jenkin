pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                // Thêm các lệnh để xây dựng ứng dụng của bạn ở đây
            }
        }

        stage('Test') {
            steps {
                // Thêm các lệnh để kiểm tra ứng dụng của bạn ở đây
            }
        }

        stage('Deploy') {
            steps {
                // Thêm các bước triển khai ứng dụng của bạn ở đây
            }
        }
    }
}
