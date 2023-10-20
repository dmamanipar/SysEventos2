/// <reference types="cypress" />

describe('template spec', () => {
  let url=''


  beforeEach(() => {
    url='http://localhost:8080/'

    cy.request({
      method: 'POST',
      url: 'http://localhost:8081/asis/login',
      body: { correo:'davidmp@upeu.edu.pe', password: 'Da12345*' },
    }).then(({ body }) => {
      window.localStorage.setItem('token', body.token)
      window.localStorage.setItem('ver', "Holas")
      
    })
    // Caching session when logging in via API
    cy.setCookie('session_id', '189jd09sufh33aaiidhf99d09')

  })

  it('login', () => {
    cy.visit(url)
    cy.get('input[type=text]').type('davidmp@upeu.edu.pe')
    cy.get('input[type=password]').type('Da12345*')
    cy.get('button').contains('Iniciar').click()
    
    
  })
  it('reporte de personas', ()=>{
    cy.visit(url+'app/periodo')
    //cy.visit(url+'/app/personal')
    //cy.url().should('include', '/app/personal')
    cy.get('input[placeholder=CI]').type('0')
    cy.get('input[placeholder=Nombre]').type('2024-1')
    cy.get('input[placeholder=Estado]').type('Inactivo')
    //cy.get('input[placeholder=Telefono]').type('951782520')
    //cy.get('input[placeholder=Email]').type('mamanipari@gmail.com')
    cy.get('button').contains('Guardar').click()




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