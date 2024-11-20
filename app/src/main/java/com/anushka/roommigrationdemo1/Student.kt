package com.anushka.roommigrationdemo1

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "student_info")
data class Student(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "student_id")
    val id : Int,

    @ColumnInfo(name = "student_name")
    var name : String,

    //열을 새로 추가하면 이미 저장된 데이터에는 해당 값이 없다고 나온다.
    //이걸 방지하고 싶으면 defaultValue값을 설정해줘라
    @ColumnInfo(name = "student_email", defaultValue = "이메일없음")
    var email : String,

    @ColumnInfo(name = "subject_name")
    var course: String?
)
