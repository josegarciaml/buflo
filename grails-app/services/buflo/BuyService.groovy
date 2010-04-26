package buflo

class BuyService {

    static transactional = true
    
    def processBuy(userId, itemId){
    	def buy = new Buy(userId, itemId)
    	
    	def item = Item.findById(itemId)
    	item.decrease()
    	item.save()
    	
    }
   

    def serviceMethod() {

    }
}
