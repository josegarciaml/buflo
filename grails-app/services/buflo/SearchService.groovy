package buflo

class SearchService {

    static transactional = true

    def search(textToSearch){
    	def items = Item.findByNameIlike("%${textToSearch}%")
//    	def items = Item.findByNameIlike('Ipod')
    	println("texto " + textToSearch)
    	println("resultado " + items?.desc)
    }
    
    def serviceMethod() {

    }
}
