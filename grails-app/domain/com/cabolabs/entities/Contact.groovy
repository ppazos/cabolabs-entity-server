package com.cabolabs.entities

import com.cabolabs.entities.structure.datatypes.DvText

class Contact {

   String id
   DvText name

   Date validity_from
   Date validity_to

   Party owner

   static hasMany = [addressess: Address]

   static constraints = {
   }

   static mapping = {
      id generator:'uuid2'
   }
}
