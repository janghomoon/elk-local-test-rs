package kr.co.elklocaltestrs.controller;

import kr.co.elklocaltestrs.service.ELKETestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ELKTestController {
    private final ELKETestService elkTestService;

    @GetMapping("/logs")
    public void testLogs() {
        elkTestService.testLogs();
    }
}
