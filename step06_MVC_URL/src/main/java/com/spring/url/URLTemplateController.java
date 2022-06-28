package com.spring.url;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class URLTemplateController {
	// 주소 전달 법 : http://localhost:8080/url/urlTest.do/1
	@GetMapping(value="urlTest.do/{id}") // url 전달시 슬래시 다음 숫자를 바로 쓰면 {id}에 값이 바로 저장된다.
	public String urlTest1(@PathVariable String id) {
		System.out.println("value = "+id);
		return "forward:../view.jsp";
	}
	
	// 주소 전달 법 : http://localhost:8080/url/urlTest.do/1/home/27
	@GetMapping(value="urlTest.do/{id}/home/{age}") // url 전달시 슬래시 다음 숫자를 바로 쓰면 {id}에 값이 바로 저장된다.
	public String urlTest2(@PathVariable String id,
			@PathVariable String age) {
		System.out.println("id value = "+id);
		System.out.println("age value = "+age);
//		return "forward:/view.jsp";
		return "forward:../../../view.jsp"; // view.jsp가 WEB-INF 안에 있기 때문에 25행처럼 forward로 바로 루트에 접근하듯이 /(슬래쉬)를 하나만 써도 된다.
		// 그런데 URL의 주소가 urlTest.do/{id}/home/{age} 이렇게 되어있기 때문에 요청값인 urlTest.do/를 제외하고 {id}와 home과 {age}를 건너 뛰고 view.jsp로 접근할 수 있기 때문에 
		// ../../../view.jsp 과 같이 3개의 칸을 올라가야 view.jsp에 닿을 수 있다.
	}
	
	/*
	 * @RequestMapping("getData2.do")// 확인을 위한 url :
	 * http://localhost:8080/mvc/getData2.do?name=busanKYJ&age=32 public String
	 * getTwo(Model model, Customer customer) {
	 * System.out.println("customer 값 :  "+customer);
	 * model.addAttribute("msg","전달되는 문자열 AAA");
	 * model.addAttribute("name",customer.getName());
	 * model.addAttribute("age",customer.getAge());
	 * model.addAttribute("customer",customer); return "view2"; }
	 */
}