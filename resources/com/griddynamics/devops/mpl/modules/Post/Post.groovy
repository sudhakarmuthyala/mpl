MPLPostStep('always') {
  junit 'target/surefire-reports/*.xml'
}
MPLModule('Build', CFG)
