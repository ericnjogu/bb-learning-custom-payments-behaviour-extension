package com.enjogu.bb.learning.service.impl;

import com.backbase.buildingblocks.presentation.errors.BadRequestException;
import com.backbase.dbs.payment.payment.model.CreatePaymentRequestDto;
import com.backbase.dbs.presentation.paymentorder.rest.spec.v2.paymentorders.ValidatedPaymentOrder;
import com.enjogu.bb.learning.route.CheckPriorityRoute;
import com.enjogu.bb.learning.service.PaymentPriorityService;
import org.apache.camel.Consume;
import org.springframework.stereotype.Service;

@Service
public class PaymentPriorityServiceImpl implements PaymentPriorityService {
  @Override
  @Consume(uri = CheckPriorityRoute.DIRECT_PAYMENT_CHECK_PRIORITY)
  public void checkPriority(CreatePaymentRequestDto paymentRequestDto) {
    ValidatedPaymentOrder.InstructionPriority instructionPriority = paymentRequestDto.getInitiatePaymentOrder()
        .getInstructionPriority();
    if (ValidatedPaymentOrder.InstructionPriority.HIGH.equals(instructionPriority)) {
      throw new BadRequestException("high priority payments not allowed");
    }
  }
}
