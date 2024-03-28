package hoods.com.jetshopping.data.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "shopping_list")
data class ShoppingList(
    @ColumnInfo(name = "list_id")
    @PrimaryKey
    val id:Int,

    val name: String
)

@Entity(tableName = "items")
data class Items(
    @ColumnInfo(name = "item_id")
    @PrimaryKey(autoGenerate = true) val id: Int,

    val itemName: String,
    val quantity: String,
    val listId: Int,
    val storeId: Int,
    val isChecked: Boolean,
    val date: Date
)

@Entity(tableName = "stores")
data class Store(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "store_id")
    val id: Int,

    val listId: Int
)

