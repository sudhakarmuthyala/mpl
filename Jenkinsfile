@Library('mpl@release') _

node( 'LS' ) {
  stage( 'Application Checkout' ) {
    MPLModule('Checkout')
  }
  stage( 'Build' ) {
    MPLModule()
  }
  stage( 'Post' ) {
	  
     junit 'target/surefire-reports/*.xml'	  
	  
    
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
