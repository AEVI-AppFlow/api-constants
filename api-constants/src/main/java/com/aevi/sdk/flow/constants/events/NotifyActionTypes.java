package com.aevi.sdk.flow.constants.events;

/**
 * Non-exhaustive llist of
 */
public interface NotifyActionTypes {

    String ABORT = "abort";
    String CLOSE_BATCH_ = "closeBatch"; // not required for AppFlow should use "batchClose" flow
    String DUPLICATE_RECEIPT = "duplicateReceipt";
    String DUPLICATE_RESPONSE = "duplicateResponse"; // TODO repeat response??
    String EMV_RECEIPT_PRINT = "emvReceiptPrint";
    String HANDSHAKE = "handshake"; // TODO do we need this for AppFlow??

    String EFT_COMMUNICATION_FINISHED = "eftFinished";
    String COMMUNICATION_FINISHED = "communicationFinished";
    String COMMUNICATION_STARTED = "communicationStarted";
}
