package com.aevi.sdk.flow.constants;

/**
 * Data that can be passed to payment apps in particular.
 */
public interface PaymentDataKeys {

    String DATA_KEY_MERCHANT_ID = "merchantId";

    /**
     * See {@link CardEntryMethods} for possible values.
     * Should be passed as a String[].
     */
    String CARD_ENTRY_METHODS = "cardEntryMethods";


    /**
     * See {@link PaymentMethods} for possible values.
     * Should be passed as String[].
     */
    String CARD_PAYMENT_METHODS = "paymentMethods";

    /**
     * Also known as card schemes.
     * See {@link CardNetworks} for possible values.
     * Should be passed as String[].
     */
    String CARD_NETWORKS = "cardNetworks";

    /**
     * See {@link AccountTypes} for possible values.
     * Should be passed as String[].
     */
    String ACCOUNT_TYPES = "accountTypes";
}
