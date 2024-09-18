package ru.potemkin.messages

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import ru.potemkin.messages.databinding.FragmentMessagesBinding


class MessagesFragment : Fragment(R.layout.fragment_messages) {

    private val binding by viewBinding<FragmentMessagesBinding>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}