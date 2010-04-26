package buflo

class VipController {

//	def defaultAction = show
	BuyService buyService
	def test = {
			def paramValue = params.id
			println(paramValue)
			println(params.id)
			render "hola $paramValue"
			
	}
	
    def index = {
			
			
	}
	
	def show = {
			def itemId = params.id
			[item : Item.findById(itemId)]

//			render "paramValue: $paramValue"
	}
	
	def buy = {
			def itemId = params.itemId
			def userId = 1
			println(itemId)
			
			buyService.processBuy (userId, itemId)
			println("finalizado")
	}
}
