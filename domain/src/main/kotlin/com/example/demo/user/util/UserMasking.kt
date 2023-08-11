package com.example.demo.user.util

import com.example.demo.user.constant.UserConstants.Companion.MASKING_STR
import com.example.demo.user.vo.Email
import com.example.demo.user.vo.Phone

class UserMasking {
    companion object {
        fun maskEmail(email: Email): String {
            return maskEmail(email.value)
        }

        private fun maskEmail(email: String): String {
            val split: List<String> = email.split("@")
            val name: String = split[0]
            val (before: Int, after: Int, masking: String) = getMaskingInfo(name)
            return email.substring(0, before) + masking + email.substring(after)
        }

        fun maskPhone(phone: Phone): String {
            return maskPhone(phone.number)
        }

        private fun maskPhone(phone: String): String {
            val (before: Int, after: Int, masking: String) = getMaskingInfo(phone)
            return phone.substring(0, before) + masking + phone.substring(after)
        }

        private fun getMaskingInfo(str: String): Triple<Int, Int, String> {
            val length: Int = str.length
            val halfLength: Int = length / 2
            val before: Int = (length - halfLength) / 2
            val after: Int = before + halfLength

            val masking: String = MASKING_STR.repeat(halfLength)
            return Triple(before, after, masking)
        }
    }
}
