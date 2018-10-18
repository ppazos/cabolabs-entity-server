package com.cabolabs.entities.structure

class Cluster extends Item {

   static hasMany = [items: Item]

   static constraints = {
   }
}
