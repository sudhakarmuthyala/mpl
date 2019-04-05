MPLModulePostStep {
  junit 'target/junitReport/*.xml'
}

// Could fail but our poststep will be executed
MPLModule('Maven Build', CFG)
