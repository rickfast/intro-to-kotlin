run {
    fun removeVowels(text: String?) = if (text != null) {
        text.replace(Regex("[AEIOUaeiou]"), "")
    } else {
        ""
    }
}

run {
    fun removeVowels(text: String?): String {
        return text!!.replace(Regex("[AEIOUaeiou]"), "")
    }
}

run {
    fun removeVowels(text: String?): String? {
        return text?.replace(Regex("[AEIOUaeiou]"), "")
    }
}

run {
    data class Name(val first: String?)
    data class PersonalInfo(val name: Name?)
    data class Author(val personalInfo: PersonalInfo?)

    class AuthorRepository {
        fun findByBookId(id: Int): Author? = Author(null)
    }

    val authorRepository = AuthorRepository()
    val author: Author? = authorRepository.findByBookId(200)

    println(author?.personalInfo?.name?.first)
}

run {
    val x: Int? = null
    val y = 10

    x?.let {
        // use x safely here
        y + it
    }
}