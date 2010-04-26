package buflo

class Buy {
	String userId
	String itemId
	Date dateCreated
	boolean informed

	Buy (user,item){
		userId = user
		itemId = item
		informed = false
	}
	
    static constraints = {
    }
}
