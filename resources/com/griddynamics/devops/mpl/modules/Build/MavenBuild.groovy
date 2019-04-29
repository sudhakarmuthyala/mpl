
/**

 * Simple Maven Build

 */



withEnv(["PATH+MAVEN=${tool(CFG.'maven.tool_version' ?: 'Maven 3')}\bin"]) {

  def settings = CFG.'maven.settings_path' ? "CMD '${CFG.'maven.settings_path'}'" : ''

  bat """mvn -B ${settings} -DargLine='-Xmx1024m -XX:MaxPermSize=1024m' clean install"""

}
