package com.example.internfactory

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import kotlin.math.log

class connecting : AppCompatActivity() {

    var count=1;

    private fun replaceFrag(fragment : Fragment){
        val fm : FragmentManager =supportFragmentManager
        val ft : FragmentTransaction = fm.beginTransaction()
        ft.replace(R.id.container, fragment)
        ft.commit()
    }

    fun signUpFrag(view: View){
        val signUpFrag = SignUp_Fragment()
        replaceFrag(signUpFrag)
    }

    fun logInFrag(view : View){
        val logInFrag = SignIn_Fragment()
        replaceFrag(logInFrag)
    }

    fun forgotPassFrag(view : View){
        val forgotPasswordFrag = ForgotPassword_Fragment()
        replaceFrag(forgotPasswordFrag)
    }

    fun otpVerificationFrag(view : View){
        val otpVerificationFrag = Verification_Fragment()
        replaceFrag(otpVerificationFrag)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_connecting)

        val fm : FragmentManager = supportFragmentManager
        val ft : FragmentTransaction = fm.beginTransaction()
        val logInFragment = SignIn_Fragment()
        ft.add(R.id.container, logInFragment)
        ft.commit()

        val actionBar = supportActionBar
        actionBar?.setDisplayShowHomeEnabled(false)
        actionBar?.setDisplayShowTitleEnabled(false)
    }
}