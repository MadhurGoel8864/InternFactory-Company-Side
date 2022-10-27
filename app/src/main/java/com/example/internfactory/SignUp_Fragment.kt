package com.example.internfactory

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class SignUp_Fragment : Fragment() {
    private lateinit var email : TextInputEditText
    private lateinit var password : TextInputEditText
    private lateinit var conf_password : TextInputEditText
    private lateinit var button : Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        firstname = requireView().findViewById(R.id.first_name_inp)
//        firstname = requireView().findViewById(R.id.first_name)
//        lastname = requireView().findViewById(R.id.last_name_inp)
//        email = requireView().findViewById(R.id.email_inp)
//        password = requireView().findViewById(R.id.password_form_inp)
//        button = requireView().findViewById(R.id.sign_up_btn)
//        firstname.addTextChangedListener(object : TextWatcher {
//            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
//            }
//            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
//            }
//            override fun afterTextChanged(p0: Editable?) {
//                button.isEnabled =
//                    android.util.Patterns.EMAIL_ADDRESS.matcher(email.text.toString()).matches() and (password.text?.isNotEmpty() == true) and (firstname.text?.isNotEmpty()==true) and (lastname.text?.isNotEmpty()==true)
//            }
//        })
//        lastname.addTextChangedListener(object : TextWatcher {
//            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
//            }
//            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
//            }
//            override fun afterTextChanged(p0: Editable?) {
//                button.isEnabled =
//                    android.util.Patterns.EMAIL_ADDRESS.matcher(email.text.toString()).matches() and (password.text?.isNotEmpty() == true) and (firstname.text?.isNotEmpty()==true) and (lastname.text?.isNotEmpty()==true)
//            }
//        })
//
//        email.addTextChangedListener(object : TextWatcher {
//            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
//            }
//            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
//            }
//            override fun afterTextChanged(p0: Editable?) {
//                button.isEnabled =
//                    android.util.Patterns.EMAIL_ADDRESS.matcher(email.text.toString()).matches() and (password.text?.isNotEmpty() == true) and (firstname.text?.isNotEmpty()==true) and (lastname.text?.isNotEmpty()==true)
//            }
//        })
//
//        password.addTextChangedListener(object : TextWatcher {
//            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
//            }
//            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
//            }
//            override fun afterTextChanged(p0: Editable?) {
//                button.isEnabled =
//                    android.util.Patterns.EMAIL_ADDRESS.matcher(email.text.toString()).matches() and (password.text?.isNotEmpty() == true) and (firstname.text?.isNotEmpty()==true) and (lastname.text?.isNotEmpty()==true)
//            }
//        })

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign_up_, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        email = requireView().findViewById<TextInputEditText>(R.id.email_inp)
        password = requireView().findViewById<TextInputEditText>(R.id.password_form_inp)
        conf_password = requireView().findViewById<TextInputEditText>(R.id.conf_password_form_inp)
        button = requireView().findViewById<Button>(R.id.sign_up_btn)

        email.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun afterTextChanged(p0: Editable?) {
                button.isEnabled =
                    android.util.Patterns.EMAIL_ADDRESS.matcher(email.text.toString()).matches() and (password.text?.isNotEmpty() == true) and (conf_password.text?.isNotEmpty() == true)
            }
        })
        password.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun afterTextChanged(p0: Editable?) {
                button.isEnabled =
                    android.util.Patterns.EMAIL_ADDRESS.matcher(email.text.toString()).matches() and (password.text?.isNotEmpty() == true) and (conf_password.text?.isNotEmpty() == true)
            }
        })
        conf_password.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun afterTextChanged(p0: Editable?) {
                button.isEnabled =
                    android.util.Patterns.EMAIL_ADDRESS.matcher(email.text.toString()).matches() and (password.text?.isNotEmpty() == true) and (conf_password.text?.isNotEmpty() == true)
            }
        })
    }
}
