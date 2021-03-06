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
 * AEVI defined flow types, used to define flow configurations and to initiate flows with a given type.
 *
 * Note that any acquirer/application specific types, or custom request types, are not covered here.
 */
public interface FlowTypes {

    String FLOW_TYPE_SALE = "sale";
    String FLOW_TYPE_REFUND = "refund";
    String FLOW_TYPE_MOTO_SALE = "motoSale";
    String FLOW_TYPE_MOTO_REFUND = "motoRefund";
    String FLOW_TYPE_PRE_AUTHORISATION = "preAuthorisation";
    String FLOW_TYPE_PRE_AUTH_COMPLETION = "preAuthCompletion";
    String FLOW_TYPE_DEPOSIT = "deposit";
    String FLOW_TYPE_REVERSAL = "reversal";
    String FLOW_TYPE_TOKENISATION = "tokenisation";
    String FLOW_TYPE_BATCH_CLOSURE = "batchClosure";
    String FLOW_TYPE_RECEIPT_DELIVERY = "receiptDelivery";
    String FLOW_TYPE_BASKET_STATUS_UPDATE = "basketStatusUpdate";
    String FLOW_TYPE_CUSTOMER_STATUS_UPDATE = "customerStatusUpdate";
    String FLOW_TYPE_DEVICE_SETTINGS = "deviceSettings";

    String[] ALL_FLOW_TYPES = new String[]{
            FLOW_TYPE_SALE,
            FLOW_TYPE_REFUND,
            FLOW_TYPE_MOTO_SALE,
            FLOW_TYPE_MOTO_REFUND,
            FLOW_TYPE_PRE_AUTHORISATION,
            FLOW_TYPE_PRE_AUTH_COMPLETION,
            FLOW_TYPE_DEPOSIT,
            FLOW_TYPE_REVERSAL,
            FLOW_TYPE_TOKENISATION,
            FLOW_TYPE_BATCH_CLOSURE,
            FLOW_TYPE_RECEIPT_DELIVERY,
            FLOW_TYPE_BASKET_STATUS_UPDATE,
            FLOW_TYPE_CUSTOMER_STATUS_UPDATE,
            FLOW_TYPE_DEVICE_SETTINGS
    };
}
