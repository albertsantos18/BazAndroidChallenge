package com.santos.androidchallenge.data.entity

data class AlbumEntity(
    val id: Long,
    val title: String,
    val cover: String,
    val cover_small: String,
    val cover_medium: String,
    val cover_big: String,
    val cover_xl: String,
    val md5_image: String,
    val tracklist: String,
    val type: String,
)