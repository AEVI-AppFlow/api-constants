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
 * Keys for reference data being passed back in responses
 */
public interface ReferenceKeys {

    String REFERENCE_KEY_MERCHANT_ID = "merchantId";
    String REFERENCE_KEY_MERCHANT_NAME = "merchantName";
    String REFERENCE_KEY_TERMINAL_ID = "terminalId";

    /**
     * ms since epoch
     *
     * The value of this parameter should be provided as a long
     */
    String REFERENCE_KEY_TRANSACTION_DATE_TIME = "transactionDateTime"; // ms since epoch

    /**
     * For terminals that provide a transaction number representing the count of transactions performed on a terminal so far.
     *
     * <strong>This is not the same as transactionId</strong>
     */
    String REFERENCE_KEY_TRANSACTION_NUMBER = "transactionNumber";

    String REFERENCE_KEY_PAYMENT_SERVICE = "paymentService";

}
