

describe('Mi función', () => {

  it('se ejecuta al hacer click', () => {
    cy.visit('/app/pru')
    cy.get('#dax').click()
  })

})