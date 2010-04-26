package buflo

class User {
	String login
	String password
	String name
	String email

    static constraints = {
		login(unique:true)
		password(password:true)
		email(email:true)
    }
	
	String toString(){
		name
	}
}
