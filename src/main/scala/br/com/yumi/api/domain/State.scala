package br.com.yumi.api.domain

sealed trait State {
  def name: String
  def code: String
}

case class Acre(name: "Acre", code: "AC") extends State
case class Alagos(name: "Alagoas", code: "AL") extends State
case class Amapa(name: "Amapá", code: "AP") extends State
case class Amazonas(name: "Amazonas", code: "AM") extends State
case class Bahia(name: "Bahia", code: "BA") extends State
case class Ceara(name: "Ceará", code: "CE") extends State
case class DistritoFederal(name: "Distrito Federal", code: "DF") extends State
case class EspiritoSanto(name: "Espírito Santo", code: "ES") extends State
case class Goias(name: "Goiás", code: "GO") extends State
case class Maranhao(name: "Maranhão", code: "MA") extends State
case class MatoGrosso(name: "Mato Grosso", code: "MT") extends State
case class MatoGrossoDoSul(name: "Mato Grosso do Sul", code: "MS") extends State
case class MinasGerais(name: "Minas Gerais", code: "MG") extends State
case class Para(name: "Pará", code: "PA") extends State
case class Paraiba(name: "Paraíba", code: "PB") extends State
case class Parana(name: "Paraná", code: "PR") extends State
case class Pernambuco(name: "Pernambuco", code: "PE") extends State
case class Piaui(name: "Piauí", code: "PI") extends State
case class RioDeJaneiro(name: "Rio de Janeiro", code: "RJ") extends State
case class RioGrandeDoNorte(name: "Rio Grande do Norte", code: "RN") extends State
case class RioGrandeDoSul(name: "Rio Grande do Sul", code: "RS") extends State
case class Rondonia(name: "Rondônia", code: "RO") extends State
case class Roraima(name: "Roraima", code: "RR") extends State
case class SantaCatarina(name: "Santa Catarina", code: "SC") extends State
case class SaoPaulo(name: "São Paulo", code: "SP") extends State
case class Sergipe(name: "Sergipe", code: "SE") extends State
case class Tocantins(name: "Tocantins", code: "TO") extends State