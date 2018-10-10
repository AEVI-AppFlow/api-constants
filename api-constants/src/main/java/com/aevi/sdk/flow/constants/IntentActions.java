package com.aevi.sdk.flow.constants;

public interface IntentActions {

    String LEGACY_PAYMENT_ACTION = "com.aevi.payment.REQUEST";
    String LEGACY_CONFIGURATION_ACTION = "com.aevi.payment.CONFIGURATION";

    String GENERIC_REQUEST_ACTION = "com.aevi.sdk.flow.action.PROCESS_REQUEST";
    String GENERIC_RESPONSE_ACTION = "com.aevi.sdk.flow.action.PROCESS_RESPONSE";

    String PAYMENT_CARD_READING_STAGE_ACTION = "com.aevi.sdk.flow.action.READ_PAYMENT_CARD";
    String TRANSACTION_PROCESSING_STAGE_ACTION = "com.aevi.sdk.flow.action.PROCESS_TRANSACTION";
    String PRE_FLOW_STAGE_ACTION = "com.aevi.sdk.flow.action.PROCESS_PRE_FLOW";
    String SPLIT_STAGE_ACTION = "com.aevi.sdk.flow.action.PROCESS_SPLIT";
    String PRE_TRANSACTION_STAGE_ACTION = "com.aevi.sdk.flow.action.PROCESS_PRE_TRANSACTION";
    String POST_CARD_READING_STAGE_ACTION = "com.aevi.sdk.flow.action.PROCESS_POST_CARD_READING";
    String POST_TRANSACTION_STAGE_ACTION = "com.aevi.sdk.flow.action.PROCESS_POST_TRANSACTION";
    String POST_FLOW_STAGE_ACTION = "com.aevi.sdk.flow.action.PROCESS_POST_FLOW";

    String PAYMENT_RESPONSE_ACTION = "com.aevi.sdk.flow.action.PROCESS_PAYMENT_RESPONSE";

    String SERVICE_INFO_PROVIDER_ACTION = "com.aevi.sdk.flow.action.PROVIDE_SERVICE_INFO";
    String SERVICE_INFO_CHANGE_ACTION = "com.aevi.sdk.flow.action.PROCESS_SERVICE_INFO_CHANGE";

}
