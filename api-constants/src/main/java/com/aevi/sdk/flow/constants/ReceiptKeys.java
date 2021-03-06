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

    /**
     * Key for holding receipt data for a customer
     */
    String RECEIPT_CUSTOMER = "customerReceipt";

    /**
     * Key for holding receipt data for a merchant
     */
    String RECEIPT_MERCHANT = "merchantReceipt";

    /**
     * Key used to declare what obfuscation method should be used for receipts (if any)
     */
    String RECEIPT_OBFUSCATION_METHOD = "receiptObfuscationMethod";
}
