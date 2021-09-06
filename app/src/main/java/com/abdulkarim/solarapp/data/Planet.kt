package com.abdulkarim.solarapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "planet_table")
data class Planet(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    @ColumnInfo(name = "name")
    val name: String?,
    @ColumnInfo(name = "size")
    val size: String?,
    @ColumnInfo(name = "image")
    val imageUrl: String?,
    @ColumnInfo(name = "description")
    val description: String?,
): Serializable