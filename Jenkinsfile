/*@Library('mpl@release') _
MPLPipeline {}

node {
  
  stage( 'Junit' ) {
	  
     junit 'target/surefire-reports/*.xml'	    
    
  }
  	
}*/


@Library('mpl@release') _


node {

         def mvnHome = tool name: 'M3', type: 'maven'
    
         def mvnCMD = '${mvnHome}\bin\mvn'
		 
		  stage ('Maven clean install') {
      
        bat '${mvnCMD} clean install'
      
              } 


  stage( 'Post' ) {

     junit 'target/surefire-reports/*.xml'

  }

  }


