@Library('mpl@release') _
MPLPipeline {}

node {
  stage( 'Application Checkout' ) {
    MPLModule('Checkout')
  }
  stage( 'Build' ) {
    MPLModule()
  }
  stage( 'Post' ) {
	  
     junit 'target/surefire-reports/*.xml'	  
	  
    
  }
  
  stage ( 'Deploy') {
    MPLModule()	
 }		
	
  stage( 'Test' ) {
    MPLModule()
  }
	
}



/* node {
stage('Post') {
	       junit 'target/surefire-reports/*.xml'
              }
 }*/
