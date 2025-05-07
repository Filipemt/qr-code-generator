package com.ofilipecode.qrcode.generator.controller;

import com.ofilipecode.qrcode.generator.dto.request.QrCodeGenerateRequest;
import com.ofilipecode.qrcode.generator.dto.response.QrCodeGeneratorResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/qrcode")
public class QrCodeController {

    @PostMapping
    public ResponseEntity<QrCodeGeneratorResponse> generate(@RequestBody QrCodeGenerateRequest request) {

        return null;
    }
}
