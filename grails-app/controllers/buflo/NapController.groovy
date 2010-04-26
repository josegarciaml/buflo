package buflo

class NapController {
	
	def login = { }
    
    def authenticate = {
    		def user = User.findByLoginAndPassword(params.login, params.password)
    		if (user){
    			session.user = user
    			flash.message = "Hola ${user.name}"
    			redirect(controller:"search",action:"index")
    			
    		}
    		else{
    			flash.message = "Im sorry my perry!!"
        		redirect(action:"login")
    		}
    }
    
    def logout = {
    		flash.message = "Adios, session.user.name"
    		session.user = null
    }
}
