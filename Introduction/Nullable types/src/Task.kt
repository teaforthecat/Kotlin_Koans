fun sendMessageToClient(
        client: Client?, message: String?, mailer: Mailer
) {
    val personalInfo = client?.getPersonalInfoo()
    val email = personalInfo?.getEmaill()
    if (email != null && message != null ) {
        mailer.sendMessage(email, message)
    }

}

class Client(val personalInfo: PersonalInfo?) {
    fun getPersonalInfoo(): PersonalInfo? {
        return personalInfo
    }

}

class PersonalInfo(val email: String?) {
    fun getEmaill(): String? {
        return email
    }

}

interface Mailer {
    fun sendMessage(email: String, message: String)
}
