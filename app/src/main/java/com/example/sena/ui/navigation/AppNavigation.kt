package com.example.sena.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.sena.ui.screen.CatalogScreen
import com.example.sena.ui.screen.HomeScreen
import com.example.sena.ui.screen.ProductDetailScreen
import com.example.sena.ui.screen.ProfileScreen
import com.example.sena.ui.screen.SettingsScreen

@Composable
fun AppNavigation(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = HomeRoute.route,
        modifier = modifier
    ) {
        // Ruta 1: Inicio (sin parámetros)
        composable(HomeRoute.route) {
            HomeScreen(
                onNavigateToCatalog = {
                    navController.navigate(CatalogRoute.route)
                },
                onNavigateToProfile = { userName ->
                    navController.navigate(ProfileRoute.createRoute(userName))
                },
                onNavigateToSettings = {
                    navController.navigate(SettingsRoute.route)
                }
            )
        }

        // Ruta 2: Catálogo (sin parámetros)
        composable(CatalogRoute.route) {
            CatalogScreen(
                onNavigateToProductDetail = { productId, title ->
                    navController.navigate(ProductDetailRoute.createRoute(productId, title))
                },
                onNavigateToHome = {
                    navController.navigate(HomeRoute.route) {
                        popUpTo(HomeRoute.route) { inclusive = true }
                    }
                }
            )
        }

        // Ruta 3: Detalle de Producto (con 2 parámetros: productId, title)
        composable(
            route = ProductDetailRoute.route,
            arguments = listOf(
                navArgument("productId") { type = NavType.StringType },
                navArgument("title") { type = NavType.StringType }
            )
        ) { backStackEntry ->
            val productId = backStackEntry.arguments?.getString("productId") ?: ""
            val title = backStackEntry.arguments?.getString("title") ?: ""
            ProductDetailScreen(
                productId = productId,
                title = title,
                onNavigateBackToCatalog = {
                    navController.popBackStack()
                },
                onNavigateToHome = {
                    navController.navigate(HomeRoute.route) {
                        popUpTo(HomeRoute.route) { inclusive = true }
                    }
                }
            )
        }

        // Ruta 4: Perfil (con 1 parámetro: userName)
        composable(
            route = ProfileRoute.route,
            arguments = listOf(
                navArgument("userName") { type = NavType.StringType }
            )
        ) { backStackEntry ->
            val userName = backStackEntry.arguments?.getString("userName") ?: ""
            ProfileScreen(
                userName = userName,
                onNavigateToSettings = {
                    navController.navigate(SettingsRoute.route)
                },
                onNavigateToHome = {
                    navController.navigate(HomeRoute.route) {
                        popUpTo(HomeRoute.route) { inclusive = true }
                    }
                }
            )
        }

        // Ruta 5: Ajustes (sin parámetros)
        composable(SettingsRoute.route) {
            SettingsScreen(
                onNavigateToHome = {
                    navController.navigate(HomeRoute.route) {
                        popUpTo(HomeRoute.route) { inclusive = true }
                    }
                }
            )
        }
    }
}
