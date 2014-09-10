package hello

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController {
	@RequestMapping(value=Array("/"))
	def returnMsg(msg: String):String = {
		 "hello world"
	}
	

}
