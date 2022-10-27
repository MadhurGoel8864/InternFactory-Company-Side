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
class SignIn_Fragment : Fragment() {
    private lateinit var password_text : TextInputEditText
    private lateinit var ed1 : TextInputEditText
    private lateinit var login_btn : Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign_in_, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        password_text = requireView().findViewById(R.id.password_input)
        ed1 = requireView().findViewById(R.id.email_inp)
        login_btn = requireView().findViewById(R.id.login_btn)
        ed1.addTextChangedListener(object: TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun afterTextChanged(p0: Editable?) {
                login_btn.isEnabled =
                    android.util.Patterns.EMAIL_ADDRESS.matcher(ed1.text.toString()).matches() and (password_text.text?.isNotEmpty() == true)
            }
        })
        password_text.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun afterTextChanged(p0: Editable?) {
                login_btn.isEnabled =
                    android.util.Patterns.EMAIL_ADDRESS.matcher(ed1.text.toString()).matches() and (password_text.text?.isNotEmpty() == true)
            }
        })

    }

}

