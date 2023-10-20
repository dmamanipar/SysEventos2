describe('template spec', () => {
  let url=''
  beforeEach(() => {
    url='http://localhost:8080'
    //url='/'
  })

  it('login', () => {
    cy.visit(url)
    cy.get('input[type=text]').type('DMamani')
    cy.get('input[type=password]').type('micodigo')
    cy.get('button').contains('Iniciar').click()
    
    
  })
  it('reporte de personas', ()=>{
    //cy.visit('/app/personal')
    /*cy.visit(url+'/app/personal')
    //cy.url().should('include', '/app/personal')
    cy.get('input[placeholder=CI]').type('D43631917')
    cy.get('input[placeholder=Nombre]').type('Dario')
    cy.get('input[placeholder=Apellido]').type('Gonzales')
    cy.get('input[placeholder=Telefono]').type('951782520')
    cy.get('input[placeholder=Email]').type('mamanipari@gmail.com')
    cy.get('button').contains('Guardar').click()*/




    /*cy.get('button.is-success').as('addButton')

    cy.window().its('vm').then(vm => {
      cy.spy(vm.$options.methods, 'addPersonal').as('addSpy')
   })

   cy.get('@addButton').click()

   cy.get('@addSpy').should('be.called')*/

    //cy.get('a').contains('Seguridad').click()
    //cy.get('a[href="/app/personal"]').click()
    
  })
  

})