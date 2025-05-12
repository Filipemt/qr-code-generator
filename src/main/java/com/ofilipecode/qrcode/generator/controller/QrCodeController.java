package com.ofilipecode.qrcode.generator.controller;

import com.ofilipecode.qrcode.generator.dto.request.QrCodeGenerateRequest;
import com.ofilipecode.qrcode.generator.dto.response.QrCodeGeneratorResponse;
import com.ofilipecode.qrcode.generator.service.QrCodeGeneratorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/qrcode")
public class QrCodeController {

private final QrCodeGeneratorService qrCodeGeneratorService;

    public QrCodeController(QrCodeGeneratorService qrCodeGeneratorService) {
        this.qrCodeGeneratorService = qrCodeGeneratorService;
    }

    @PostMapping
    public ResponseEntity<QrCodeGeneratorResponse> generate(@RequestBody QrCodeGenerateRequest request) {
        try {
            QrCodeGeneratorResponse response = this.qrCodeGeneratorService.upload(request.text());
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }

    }
}
