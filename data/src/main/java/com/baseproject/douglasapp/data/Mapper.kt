package com.baseproject.douglasapp.data

interface Mapper<in FROM, out TO> {

    fun map(from: FROM): TO
}
