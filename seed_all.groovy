job('Seed All') {
  scm {
    git ('https://github.com/pingwin4ik/dsl.git')
  }
  steps {
    dsl {
      external('*.groovy')  
      // default behavior
      // removeAction('IGNORE')      
      removeAction('DELETE')
    }
  }
}
