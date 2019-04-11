package com.aevi.sdk.flow.models;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Represents tax information consisting of an absolute amount and a list of tax rates.
 *
 * Both the tax amount and the tax rates are optional and clients simply provide the information available to them.
 */
public class TaxInfo {

    private final Float taxAmount;
    private final List<TaxRate> taxRates;

    /**
     * Create an instance without a tax amount and empty tax rates list.
     */
    public TaxInfo() {
        this(null);
    }

    /**
     * Create an instance with the provided tax amount and empty tax rates list.
     *
     * @param taxAmount The tax amount
     * @param taxRates  Optional var-args list of tax rates
     */
    public TaxInfo(Float taxAmount, TaxRate... taxRates) {
        this(taxAmount, new ArrayList<>(Arrays.asList(taxRates)));
    }

    /**
     * Create an instance with the provided tax amount and tax rates list.
     *
     * @param taxAmount The tax amount
     * @param taxRates  The tax rates
     */
    public TaxInfo(Float taxAmount, List<TaxRate> taxRates) {
        this.taxAmount = taxAmount;
        this.taxRates = taxRates != null ? taxRates : new ArrayList<>();
    }

    /**
     * Add a tax rate.
     *
     * @param taxRate The tax rate
     */
    public void addTaxRate(TaxRate taxRate) {
        taxRates.add(taxRate);
    }

    /**
     * Get the tax amount, if any.
     *
     * If no tax amount is set, this returns null.
     *
     * @return The tax amount or null
     */
    @Nullable
    public Float getTaxAmount() {
        return taxAmount;
    }

    /**
     * Get the list of tax rates.
     *
     * This list may be empty, but is never null.
     *
     * @return The list of tax rates
     */
    @NonNull
    public List<TaxRate> getTaxRates() {
        return taxRates;
    }

    @Override
    public String toString() {
        return "TaxInfo{" +
                "taxAmount=" + taxAmount +
                ", taxRates=" + taxRates +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaxInfo taxInfo = (TaxInfo) o;
        return Objects.equals(taxAmount, taxInfo.taxAmount) &&
                Objects.equals(taxRates, taxInfo.taxRates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taxAmount, taxRates);
    }
}
