package com.enjogu.bb.learning.service;

import com.backbase.dbs.payment.payment.model.CreatePaymentRequestDto;

public interface PaymentPriorityService {
  void checkPriority(CreatePaymentRequestDto paymentRequestDto);
}
