package buflo

class SearchController {

	SearchService searchService
	
    def index = { }
    
    def search = {
    		println(params.textToSearch)
    		def items = Item.findAllByNameIlike("%${params.textToSearch}%")
//    		def items = Item.findByNameIlike('Ipod')
//    		println("texto " + params.textToSearch)
    		[itemList : items]
    		 
//    		render("count " + items.size())
//    		render("listo")
//    		def textToSearch = params.textSearch
//    		searchService.search (textToSearch)
    }
}
