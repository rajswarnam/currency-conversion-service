pipeline{
	agent any
	
	tools{
		maven 'M2_Home'
		jdk 'JDK'
	}
	stages{
		stage('Build'){
			steps{
				sh 'mvn clean compile'
			}
		}
		stage('Package'){
			steps{
			sh 'mvn package'
			}
		}
		stage('Publish'){
			steps{
			sh 'mvn publish'
			}
		}
	}
}