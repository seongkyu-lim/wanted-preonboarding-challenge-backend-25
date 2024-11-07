package com.wanted.clone.oneport.payments.application.service;

import com.wanted.clone.oneport.payments.representation.port.in.PaymentRequestUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
@RequiredArgsConstructor
// input port
public class PaymentRequestService implements PaymentRequestUseCase {

    // TODO: output port(인터페이스) 사용해서 outbound(db) 로직 구현하기. 
    // domain 계층 구현하기.

    @Override
    public String renderPgUi() {
        return "toss/checkout";
    }
}
