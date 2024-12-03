package io.github.abdullahahmad98.blefinder

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform