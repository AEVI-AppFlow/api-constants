/*
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.aevi.sdk.flow.constants;

/**
 * Receipt data keys for receipt related requests.
 */
public interface ReceiptKeys {

    String RECEIPT_PAYMENT_METHOD = "receiptPaymentMethod";
    String RECEIPT_AMOUNTS = "receiptAmounts";
    String RECEIPT_OUTCOME = "receiptOutcome";
    String RECEIPT_BASKET = "receiptBasket";

    String RECEIPT_TERMINAL_PARAMS = "receiptTerminalParams";
    String RECEIPT_CARD_EXTRAS = "receiptCardExtras";
    String RECEIPT_TRANSACTION_EXTRAS = "receiptTransactionExtras";
    String RECEIPT_FLOW_EXTRAS = "receiptFlowExtras";

    String RECEIPT_LABEL_TOTAL = "receiptLabelTotal";
    String RECEIPT_LABEL_BASKET_SUBTOTAL = "receiptLabelBasketSubtotal";

    String RECEIPT_LABEL_PAN = "pan";
    String RECEIPT_LABEL_EXPIRY = "expiry";
    String RECEIPT_LABEL_DATE = "date";
    String RECEIPT_LABEL_STATUS = "status";
    String RECEIPT_LABEL_AUTH_CODE = "authCode";
    String RECEIPT_LABEL_TYPE = "type";
    String RECEIPT_LABEL_REFERENCE = "reference";
    String RECEIPT_LABEL_TIP_ADJUST = "tipAdjust";
    String RECEIPT_LABEL_TIP_ADJUST_TOTAL = "tipAdjustTotal";
    String RECEIPT_LABEL_VERIFIED_BY_PIN = "verifiedByPin";
    String RECEIPT_LABEL_VERIFIED_BY_SIGNATURE = "verifiedBySignature";
    String RECEIPT_LABEL_SIGNATUE = "signature";
    String RECEIPT_LABEL_PLEASE_SIGN = "pleaseSign";
}
