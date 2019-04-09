package com.aevi.sdk.flow.constants;

/**
 * Types of modifiers.
 */
public interface ModifierTypes {

    /**
     * For representing tax applied to a basket item.
     */
    String MODIFIER_TYPE_TAX = "tax";

    /**
     * For extras added to an item, such as "Cheese" added to a "Burger" item.
     */
    String MODIFIER_TYPE_EXTRA = "extra";

    /**
     * The opposite of extra - a part of an item removed, such as a "Cheese Burger" without "Cheese".
     */
    String MODIFIER_TYPE_DEDUCTION = "deduction";

    /**
     * A discount applies to a basket item.
     */
    String MODIFIER_TYPE_DISCOUNT = "discount";
}
