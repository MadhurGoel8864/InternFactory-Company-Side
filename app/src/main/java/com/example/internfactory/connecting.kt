package com.example.internfactoryC

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
class connecting : AppCompatActivity() {
    var count=1;
    private fun replaceFrag(fragment : Fragment,name: String){
        val fm : FragmentManager =supportFragmentManager
        val ft : FragmentTransaction = fm.beginTransaction()
        ft.addToBackStack(name)
        ft.add(R.id.container, fragment)
        ft.commit()
    }

    fun signUpFrag(view: View){
        val signUpFrag = SignUp_Fragment()
        replaceFrag(signUpFrag,"signup")
    }
    fun logInFrag(view : View){
        val fm : FragmentManager = supportFragmentManager
        if(fm.backStackEntryCount>0){
            fm.popBackStackImmediate()
            return
        }
        val logInFrag = SignIn_Fragment()
        replaceFrag(logInFrag,"signin")
    }

    fun forgotPassFrag(view : View){
        val forgotPasswordFrag = ForgotPassword_Fragment()
        replaceFrag(forgotPasswordFrag,"forgotpass")
    }

    fun otpVerificationFrag(view : View){
        val otpVerificationFrag = Verification_Fragment()
        replaceFrag(otpVerificationFrag,"otppage")
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
