package com.example.internfactoryC

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Patterns
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class SignUp_Fragment : Fragment() {
    private lateinit var email_inp: TextInputEditText
    private lateinit var password_inp: TextInputEditText
    private lateinit var conf_password_inp: TextInputEditText
    private lateinit var button: Button
    private lateinit var conf_password: TextInputLayout
    private lateinit var password: TextInputLayout
    private lateinit var email: TextInputLayout
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_sign_up_, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        email_inp = requireView().findViewById(R.id.email_inp)
        password_inp= requireView().findViewById(R.id.password_form_inp)
        conf_password_inp= requireView().findViewById(R.id.conf_password_form_inp)
        button = requireView().findViewById(R.id.sign_up_btn)
        email = requireView().findViewById(R.id.email_box)
        password = requireView().findViewById(R.id.password_inp)
        conf_password =requireView().findViewById(R.id.conf_pass)

        email_inp.addTextChangedListener {
            email.helperText = validemail()
            button.isEnabled =
                (email.helperText == null) and (password.helperText == null) and (conf_password.helperText == null)
        }
        password_inp.addTextChangedListener {
            password.helperText = validPass()
            button.isEnabled =
                (email.helperText == null) and (password.helperText == null) and (conf_password.helperText == null)
        }
        conf_password_inp.addTextChangedListener {
            if(conf_password_inp.text.toString() == password_inp.text.toString()){
                conf_password.helperText = null
            }
            else{
                conf_password.helperText = "Password and Confirm Password Must be Same"
            }
            button.isEnabled =
                (email.helperText == null) and (password.helperText == null) and (conf_password.helperText == null)
        }
    }
    private fun validPass(): String? {
        val pass_txt = password_inp.text.toString()
        if(pass_txt.length<8){
            return "Minimum 8 characters Required"
        }
        else if(!pass_txt.matches(".*[A-Z]*.".toRegex())){
            return "At least 1 UpperCase Alphabet Required"
        }
        else if(!pass_txt.matches(".*[a-z]*.".toRegex())){
            return "At least 1 LowerCase Alphabet Required"
        }
        else if(!pass_txt.matches(".*[@#$%^&*+=]*.".toRegex())){
            return "At least 1  Special Character Required"
        }
        else {
            return null
        }
    }

    private fun validemail(): String? {
        val email_text = email_inp.text.toString()
        if(!Patterns.EMAIL_ADDRESS.matcher(email_text).matches()){
            return "Invalid Email Address"
        }
        return null
    }





}
