package com.raywenderlich.android.bookmanstreasure.destinations

import android.os.Bundle
import android.support.v4.app.FragmentManager
import androidx.navigation.NavDestination
import androidx.navigation.NavOptions
import androidx.navigation.Navigator
import com.raywenderlich.android.bookmanstreasure.ui.authordetails.AuthorDetailsDialog


// 1
@Navigator.Name("author")
class AuthorDetailsNavigator(
        private val manager: FragmentManager
) : Navigator<AuthorDetailsNavigator.Destination>() {

    // 2
    override fun navigate(destination: Destination, args: Bundle?, navOptions: NavOptions?) {
        val dialog = AuthorDetailsDialog()
        dialog.arguments = args
        dialog.show(manager, AuthorDetailsDialog.TAG)
    }

    // 3
    override fun createDestination(): Destination {
        return Destination(this)
    }

    // 4
    override fun popBackStack(): Boolean {
        return false
    }

    // 5
    class Destination(authorDetailsNavigator: AuthorDetailsNavigator) : NavDestination(authorDetailsNavigator)
}