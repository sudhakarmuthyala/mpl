/*@Library('mpl@release') _
MPLPipeline {}

node {
  
  stage( 'Junit' ) {
	  
     junit 'target/surefire-reports/*.xml'	    
    
  }
  	
}*/


@Library('mpl@release') _


node {
	
	 stage ('SCM Checkout') { 
        
  
            git url: 'https://github.com/sudhakarmuthyala/mpl.git'


              }
	
	  stage ('Maven clean install') {

             def mvnHome = tool name: 'Maven 3', type: 'maven'
    
             def mvnCMD = '${mvnHome}/bin/mvn'
		  
             bat '${mvnCMD} clean install'
      
              } 


  stage( 'Post' ) {

     junit 'target/surefire-reports/*.xml'

  }

  }


