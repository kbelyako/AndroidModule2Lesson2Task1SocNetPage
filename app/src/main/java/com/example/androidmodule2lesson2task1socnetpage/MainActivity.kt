package com.example.androidmodule2lesson2task1socnetpage
/*
ДЗ. Задание 1. Легкое
Сверстайте свою/чужую страницу для соцсети. Там должно быть:
1) Большое фото и 3-5 маленьких
2) Имя, ник
3) Страна и город проживания
4) Интересы (с иконками, найдите нужные в интернете)
5) Количество друзей + список из 5 лучших друзей
6) Кнопки: Settings, Menu, Search (это могут быть ImageView)
При необходимости используем Фотошоп и творим!
 */

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}