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
package com.aevi.sdk.flow.constants.config;

/**
 * Keys used to pass labels into receipt printing flow services
 */
public interface ReceiptLabelKeys {

    String RECEIPT_LABEL_TOTAL = "receiptLabelTotal";
    String RECEIPT_LABEL_BASKET_SUBTOTAL = "receiptLabelBasketSubtotal";
    String RECEIPT_LABEL_PAN = "receiptLabelPan";
    String RECEIPT_LABEL_EXPIRY = "receiptLabelExpiry";
    String RECEIPT_LABEL_DATE = "receiptLabelDate";
    String RECEIPT_LABEL_STATUS = "receiptLabelStatus";
    String RECEIPT_LABEL_AUTH_CODE = "receiptLabelAuthCode";
    String RECEIPT_LABEL_PAYMENT_METHOD = "receiptLabelPaymentMethod";
    String RECEIPT_LABEL_REFERENCE = "receiptLabelReference";

    String RECEIPT_SECTION_TIP_ADJUST = "receiptSectionTipAdjust";
    String RECEIPT_SECTION_TERMINAL_PARAMS = "receiptSectionTerminalParams";
    String RECEIPT_SECTION_CARD_EXTRAS = "receiptSectionCardExtras";
}