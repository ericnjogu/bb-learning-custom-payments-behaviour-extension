package com.enjogu.bb.learning.route;

import com.backbase.dbs.payment.services.configuration.routes.InitiatePaymentOrderRoute;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CheckPriorityRoute extends InitiatePaymentOrderRoute {
  public static final String DIRECT_PAYMENT_CHECK_PRIORITY = "direct:custom-check-priority";
  @Override
  public void configure() throws Exception {
    interceptSendToEndpoint(DIRECT_PAYMENT_ENRICHED_VALIDATE).to(DIRECT_PAYMENT_CHECK_PRIORITY);
    super.configure();
  }
}
