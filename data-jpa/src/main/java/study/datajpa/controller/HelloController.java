package study.datajpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Test 컨트롤러", description = "test 코드 API입니다.")
@RestController
public class HelloController {

    @Operation(summary = "hello", description = "테스트")
    @GetMapping
    public String hello() {
        return "Hello";
    }
}
