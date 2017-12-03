package fr.marouni

import scala.language.experimental.macros
import scala.reflect.macros.blackbox.Context


object MyMacros {

  def maxMacro(c : Context)(a: c.Expr[Int], b: c.Expr[Int]): c.Expr[Int] = {
    import c.universe._
    c.Expr(
      q"""
       if($a > $b) $a else $b
     """
    )
  }

  def minMacro(c : Context)(a: c.Expr[Int], b: c.Expr[Int]): c.Expr[Int] = {
    import c.universe._
    c.Expr(
      q"""
       if($a < $b) $a else $b
     """
    )
  }

  def max(a : Int, b : Int) : Int = macro maxMacro
  def min(a : Int, b : Int) : Int = macro minMacro
}
