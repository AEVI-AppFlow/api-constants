package com.aevi.sdk.flow.constants.events;

/**
 * Non-exhaustive list of notify action types that can be sent during a payment transaction
 */
public interface NotifyActionTypes {

    String ABORT = "abort";
    String DUPLICATE_RECEIPT = "duplicateReceipt";
    String EMV_RECEIPT_PRINT = "emvReceiptPrint";

    String EFT_COMMUNICATION_FINISHED = "eftFinished";
    String COMMUNICATION_FINISHED = "communicationFinished";
    String COMMUNICATION_STARTED = "communicationStarted";
}
