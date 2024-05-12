package com.architect.kmppermissions

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform