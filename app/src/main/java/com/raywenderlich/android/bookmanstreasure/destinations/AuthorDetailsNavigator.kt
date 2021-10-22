package com.raywenderlich.android.bookmanstreasure.destinations

import android.os.Bundle
import androidx.navigation.NavDestination
import androidx.navigation.NavOptions
import androidx.navigation.Navigator

// 1
@Navigator.Name("author")
class AuthorDetailsNavigator : Navigator<AuthorDetailsNavigator.Destination>() {

    // 2
    override fun navigate(destination: Destination, args: Bundle?, navOptions: NavOptions?) {}

    // 3
    override fun createDestination(): Destination {
        return Destination(this)
    }

    // 4
    override fun popBackStack(): Boolean {
        return false
    }

    // 5
    class Destination(authorDetailsNavigator: AuthorDetailsNavigator) :
            NavDestination(authorDetailsNavigator)
}