def call()

  {
	
environment{
      scannerHome = tool 'sonars'
          }
    withSonarQubeEnv('sonar'){
      //sh '/var/lib/jenkins/tools/hudson.plugins.sonar.SonarRunnerInstallation/${sonarscanner}/bin/sonar-scanner -Dproject.settings=./sonar-project.properties'
	    //sh """${scannerHome}/bin/sonar-scanner 
	    sh """ mvn sonar:sonar -Dsonar.projectKey=SumaVarshitha_java-maven-junit-helloworld -Dsonar.organization=sumavarshitha -Dsonar.projectName=java-maven-junit-helloworld -Dsonar.projectVersion=1.0 -Dsonar.language=java -Dsonar.sources=src -Dsonar.java.binaries=. -Dsonar.host.url=https://sonarcloud.io/ -Dsonar.login=95353e35d624f95b314b6fe282755f73ccefad0d -Dsonar.java.coveragePlugin=jacoco -Dsonar.sourceEncoding=UTF-8 -Dsonar.coverage.jacoco.xmlReportPaths = target/site/jacoco/*.xml=true """
    }

}
