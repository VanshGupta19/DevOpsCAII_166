pipeline {
    agent any

    stages {

        stage('Setup Java') {
            steps {
                bat 'set JAVA_HOME=C:\\Program Files\\Eclipse Adoptium\\jdk-25.0.2.10-hotspot'
                bat 'set PATH=%JAVA_HOME%\\bin;%PATH%'
            }
        }

        stage('Compile') {
            steps {
                bat 'javac -cp ".;lib/*" src\\com\\selenium\\test\\StudentFeedbackTest.java'
            }
        }

        stage('Run Selenium Test') {
            steps {
                bat 'java -cp ".;lib/*;src" com.selenium.test.StudentFeedbackTest'
            }
        }
    }
}