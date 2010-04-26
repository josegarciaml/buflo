package buflo

class Item {
	String name
	String desc
	Float amount
	Date dateCreated
	Integer quantity
	
	def decrease() {
		quantity --
	}

    static constraints = {
    }
}
