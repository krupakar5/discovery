pipeline {

   agent { label "default" }
   
    tools {

       jdk 'Java8'

       maven 'maven3'

   }
   stages {

       stage('Checkout') {

           steps {

               checkout([$class: 'GitSCM',

                         branches: [[name: "master"]],

                         doGenerateSubmoduleConfigurations: false,

                         extensions: [[$class: 'BuildChooserSetting',

                                      [$class: 'WipeWorkspace']],

                         submoduleCfg: [],

                         userRemoteConfigs: [[url: 'git@hibbert.githost.io:HibbertCommon/discovery-server.git']])

           }

       }
       
        stage ('Build') {
           steps {
               sh 'mvn clean install'
           }
        
    }        

}
}
post {

       always {

           findbugs(canComputeNew: false,

                    defaultEncoding: '',

                    excludePattern: '',

                    healthy: '',

                    includePattern: '',

                    pattern: '**/findbugsXml.xml',

                    unHealthy: '')

           checkstyle(canComputeNew: false,

                      defaultEncoding: '',

                      healthy: '',

                      pattern: '**/target/checkstyle-result.xml',

                      unHealthy: '')

           junit '**/target/surefire-reports/*.xml'
           step ( [ $class: 'JacocoPublisher'  ,execPattern:'fms-common/target/jacoco.exec' ,classPattern :'fms-common/target/classes' ,sourcePattern:'fms-common/src/main/java'])
             sh 'rm -rf /jenkins/tools/hudson.tasks.Maven_MavenInstallation/mvn_latest'

       }

   }
}
