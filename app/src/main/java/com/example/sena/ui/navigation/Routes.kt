package com.example.sena.ui.navigation

object HomeRoute {
    val route = "home"
}

object CatalogRoute {
    val route = "catalog"
}

object ProductDetailRoute {
    val route = "product_detail/{productId}/{title}"
    fun createRoute(productId: String, title: String): String {
        return "product_detail/$productId/$title"
    }
}

object ProfileRoute {
    val route = "profile/{userName}"
    fun createRoute(userName: String): String {
        return "profile/$userName"
    }
}

object SettingsRoute {
    val route = "settings"
}
