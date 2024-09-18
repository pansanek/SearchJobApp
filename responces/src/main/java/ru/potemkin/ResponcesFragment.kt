package ru.potemkin.responces

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import ru.potemkin.responces.databinding.FragmentResponcesBinding


class ResponcesFragment : Fragment(R.layout.fragment_responces) {

    private val binding by viewBinding<FragmentResponcesBinding>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}
