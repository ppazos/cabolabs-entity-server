package com.cabolabs.entities

import com.cabolabs.entities.structure.ItemTree
import com.cabolabs.entities.structure.datatypes.DvText

class Party {

   String id // uuid
   DvText name
   ItemTree details

   static constraints = {
   }

   static mapping = {
      id generator:'uuid2'
   }
}
