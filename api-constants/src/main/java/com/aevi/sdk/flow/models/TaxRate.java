package com.aevi.sdk.flow.models;

import android.support.annotation.NonNull;

import java.util.Objects;

/**
 * Represents a tax rate consisting of the rate as a decimal fraction and an associated label describing it.
 */
public class TaxRate {

    private final float rate;
    private final String label;

    /**
     * Create an instance with associated rate and label.
     *
     * @param rate  The decimal fraction rate (such as 20.5f represents a 20.5% tax rate)
     * @param label The label describing the rate (such as "VAT" or "GST")
     */
    public TaxRate(float rate, String label) {
        this.rate = rate;
        this.label = label != null ? label : "";
    }

    /**
     * Get the tax rate decimal fraction.
     *
     * @return The tax rate decimal fraction (such as 20.5f represents a 20.5% tax rate)
     */
    public float getRate() {
        return rate;
    }

    /**
     * Get the label describing the tax rate.
     *
     * May be empty string if not set.
     *
     * @return The label describing the tax rate (such as "VAT" or "GST")
     */
    @NonNull
    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return "TaxRate{" +
                "rate=" + rate +
                ", label='" + label + '\'' +
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
        TaxRate taxRate = (TaxRate) o;
        return Float.compare(taxRate.rate, rate) == 0 &&
                Objects.equals(label, taxRate.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rate, label);
    }
}

