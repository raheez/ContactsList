package com.example.contactslisting

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Upsert

@Dao
interface ContactDao {

    @Upsert
    fun upsertContact(contact: Contact)


}