/*@Library('mpl@release') _
MPLPipeline {}

node {
  
  stage( 'Junit' ) {
	  
     junit 'target/surefire-reports/*.xml'	    
    
  }
  	
}*/

node { 
 
         def mvnHome = tool name: 'M3', type: 'maven'
    
         def mvnCMD = "${mvnHome}\bin\mvn"
         
    
     stage ('SCM Checkout') { 
        
  
          url: 'git 'https://github.com/sudhakarmuthyala/mpl.git'


              }
    
  
           
        stage ('Maven clean install') {
      
        sh "${mvnCMD} clean install"
      
              }  
	
}




