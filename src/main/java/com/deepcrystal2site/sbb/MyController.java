package com.deepcrystal2site.sbb;

// import : 다른 클래스, 패키지, 라이브러리 요소를 가져오기
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
// MyController 클래스가 컨트롤러 기능 수행
public class MyController {
    @GetMapping("/jump")
    // 클라이언트의 요청으로 hello 메서드 실행됨
    @ResponseBody
    // hello 메서드 출력값 그대로 리턴

    public String hello(){
        return "점프 투 스프링부트";
    }
}
