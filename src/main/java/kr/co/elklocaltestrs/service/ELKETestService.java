package kr.co.elklocaltestrs.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ELKETestService {

    public void testLogs() {
        log.info("Info level log - Application started successfully.");
    }
}
