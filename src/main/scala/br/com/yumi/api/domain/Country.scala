package br.com.yumi.api.domain

sealed trait Country {
  def name: String
  def code: String
}

case class Brazil(name: "Brasil", code: "BR") extends Country