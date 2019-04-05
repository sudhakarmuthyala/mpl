@Library('mpl@release') _
MPLPipeline {}

node {
  
  stage( 'Post' ) {
	  
     junit 'target/surefire-reports/*.xml'	    
    
  }
  
   stage( 'Sample' ) {
    MPLModule()
  }
	
}




