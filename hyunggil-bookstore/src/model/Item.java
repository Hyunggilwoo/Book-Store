// Finish and comment me!

package model;

import java.math.BigDecimal;

/**
 * Item class used in the Bookstore assignment.
 * @author Hyunggil Woo
 * @version Winter 2022
 *
 */
public final class Item {
    
    /** Name of an Item. */
    private String myName;
    
    /** Price of an Item. */
    private BigDecimal myPrice;
    
    /** Quantity of an Item. */
    private int myBulkQuantity;
    
    /** Price of a bulkQuantity of an Item. */
    private BigDecimal myBqPrice;
    
    /**
     * Constructor of an item that is not considered a bulk quantity.
     * 
     * @param theName name.
     * @param thePrice price.
     */
    public Item(final String theName, final BigDecimal thePrice) {
        myName = theName;
        myPrice = thePrice;
    }

    /**
     * Constructor of a bulk quantity of an item.
     * 
     * @param theName name.
     * @param thePrice price.
     * @param theBulkQuantity bulk quantity.
     * @param theBulkPrice bulk price.
     */
    public Item(final String theName, final BigDecimal thePrice, final int theBulkQuantity,
                final BigDecimal theBulkPrice) {
        myName = theName;
        myPrice = thePrice;
        myBulkQuantity = theBulkQuantity;
        myBqPrice = theBulkPrice;
    }


    public BigDecimal getPrice() {
        return null;
    }


    public int getBulkQuantity() {
        return 0;
    }


    public BigDecimal getBulkPrice() {
        return null;
    }

    
    public boolean isBulk() {
        return false;
    }


    @Override
    public String toString() {

        return null;
    }

    @Override
    public boolean equals(final Object theOther) {

        return false;
    }

    @Override
    public int hashCode() {

        return 0;
    }

}
