node('windows'){
    def nodeOS = isUnix()? "unix" : "windows";
    stage("Git Checkout"){
        println "Stage: Checkout running on ${nodeOS}";
        if (nodeOS =="windows")
            //bat "git clone git@github.com:manulife-ca-sandbox/mu-se-ph-08-abadmar-km-rest.git .";
            println "running commands in windows os";
        else
            //sh "git clone git@github.com:manulife-ca-sandbox/mu-se-ph-08-abadmar-km-rest.git .";
            println "running commands in unix os";
        //dir('mu-se-ph-08-abadmar-km-rest\\build'){
        //    //bat "npm install";
        //}
    }
    stage("Build/Compile"){
        println "Stage: Build/Compile";
        //bat "npm build";
    }
    stage("Testing"){
        println "Stage: Testing";
    }
    stage("Staging/Artifactory"){
        println "Stage: Staging/Artifactory";
    }
    stage("Code Scans"){
        println "Stage: Code Scans";
    }
    stage("Create infra"){
        println "Stage: Create infra";
    }
    stage("Configuration"){
        println "Stage: Configuration";
    }
    stage("Deploy"){
        println "Stage: Deploy";
        //bat "cf push";
    }
}