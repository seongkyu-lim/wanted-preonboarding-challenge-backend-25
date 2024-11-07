package com.wanted.clone.oneport.payments.representation.web;

import com.wanted.clone.oneport.payments.representation.port.in.PaymentRequestUseCase;
import com.wanted.clone.oneport.payments.representation.web.request.PaymentRequestMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/payment")
public class PaymentController {

    //adaptor에서는 usecase(interface, 명세서)를 사용하고, input port는 usecase 구현. 여기서는 PaymentRequestService.
    private final PaymentRequestUseCase paymentRequestUseCase;

    @GetMapping("/request")
    public String paymentRequest(PaymentRequestMessage message, Model model) {
        model.addAttribute("userId", "jinho-yoo");
        return paymentRequestUseCase.renderPgUi();
    }

}
