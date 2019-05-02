/*@Library('mpl@release') _
MPLPipeline {}

node {
  
  stage( 'Junit' ) {
	  
     junit 'target/surefire-reports/*.xml'	    
    
  }
  	
}*/


@Library('mpl@release') _


node {

stage ('Maven clean install') {

      

  withEnv(["PATH+MAVEN=${tool(CFG.'maven.tool_version' ?: 'Maven 3')}\bin"]) {



  def settings = CFG.'maven.settings_path' ? "-s '${CFG.'maven.settings_path'}'" : ''



  bat """mvn -B ${settings} -DargLine='-Xmx1024m -XX:MaxPermSize=1024m' clean install"""
  
  }
  }


  stage( 'Post' ) {

     junit 'target/surefire-reports/*.xml'

  }

  }


