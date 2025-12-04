package com.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class InvoiceRequest {

    @JsonProperty("invoiceType")
    private String invoiceType;

    @JsonProperty("invoiceDate")
    private String invoiceDate;

    @JsonProperty("sellerNTNCNIC")
    private String sellerNTNCNIC;

    @JsonProperty("sellerBusinessName")
    private String sellerBusinessName;

    @JsonProperty("sellerProvince")
    private String sellerProvince;

    @JsonProperty("sellerAddress")
    private String sellerAddress;

    @JsonProperty("buyerNTNCNIC")
    private String buyerNTNCNIC;

    @JsonProperty("buyerBusinessName")
    private String buyerBusinessName;

    @JsonProperty("buyerProvince")
    private String buyerProvince;

    @JsonProperty("buyerAddress")
    private String buyerAddress;

    @JsonProperty("buyerRegistrationType")
    private String buyerRegistrationType;

    @JsonProperty("invoiceRefNo")
    private String invoiceRefNo;

    @JsonProperty("scenarioId")
    private String scenarioId;

    @JsonProperty("items")
    private List<Item> items;

    // ==================== GETTERS & SETTERS ====================

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getSellerNTNCNIC() {
        return sellerNTNCNIC;
    }

    public void setSellerNTNCNIC(String sellerNTNCNIC) {
        this.sellerNTNCNIC = sellerNTNCNIC;
    }

    public String getSellerBusinessName() {
        return sellerBusinessName;
    }

    public void setSellerBusinessName(String sellerBusinessName) {
        this.sellerBusinessName = sellerBusinessName;
    }

    public String getSellerProvince() {
        return sellerProvince;
    }

    public void setSellerProvince(String sellerProvince) {
        this.sellerProvince = sellerProvince;
    }

    public String getSellerAddress() {
        return sellerAddress;
    }

    public void setSellerAddress(String sellerAddress) {
        this.sellerAddress = sellerAddress;
    }

    public String getBuyerNTNCNIC() {
        return buyerNTNCNIC;
    }

    public void setBuyerNTNCNIC(String buyerNTNCNIC) {
        this.buyerNTNCNIC = buyerNTNCNIC;
    }

    public String getBuyerBusinessName() {
        return buyerBusinessName;
    }

    public void setBuyerBusinessName(String buyerBusinessName) {
        this.buyerBusinessName = buyerBusinessName;
    }

    public String getBuyerProvince() {
        return buyerProvince;
    }

    public void setBuyerProvince(String buyerProvince) {
        this.buyerProvince = buyerProvince;
    }

    public String getBuyerAddress() {
        return buyerAddress;
    }

    public void setBuyerAddress(String buyerAddress) {
        this.buyerAddress = buyerAddress;
    }

    public String getBuyerRegistrationType() {
        return buyerRegistrationType;
    }

    public void setBuyerRegistrationType(String buyerRegistrationType) {
        this.buyerRegistrationType = buyerRegistrationType;
    }

    public String getInvoiceRefNo() {
        return invoiceRefNo;
    }

    public void setInvoiceRefNo(String invoiceRefNo) {
        this.invoiceRefNo = invoiceRefNo;
    }

    public String getScenarioId() {
        return scenarioId;
    }

    public void setScenarioId(String scenarioId) {
        this.scenarioId = scenarioId;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    // ==================== INNER CLASS ====================

    public static class Item {
        @JsonProperty("hsCode")
        private String hsCode;

        @JsonProperty("productDescription")
        private String productDescription;

        @JsonProperty("rate")
        private String rate;

        @JsonProperty("uoM")
        private String uoM;

        @JsonProperty("quantity")
        private Double quantity;

        @JsonProperty("totalValues")
        private Double totalValues;

        @JsonProperty("valueSalesExcludingST")
        private Double valueSalesExcludingST;

        @JsonProperty("fixedNotifiedValueOrRetailPrice")
        private Double fixedNotifiedValueOrRetailPrice;

        @JsonProperty("salesTaxApplicable")
        private String salesTaxApplicable;

        @JsonProperty("salesTaxWithheldAtSource")
        private Double salesTaxWithheldAtSource;

        @JsonProperty("extraTax")
        private Double extraTax = 0.0;

        @JsonProperty("furtherTax")
        private Double furtherTax;

        @JsonProperty("sroScheduleNo")
        private String sroScheduleNo;

        @JsonProperty("fedPayable")
        private Double fedPayable;

        @JsonProperty("discount")
        private Double discount;

        @JsonProperty("saleType")
        private String saleType;

        @JsonProperty("sroItemSerialNo")
        private String sroItemSerialNo;

        // GETTERS & SETTERS
        public String getHsCode() {
            return hsCode;
        }

        public void setHsCode(String hsCode) {
            this.hsCode = hsCode;
        }

        public String getProductDescription() {
            return productDescription;
        }

        public void setProductDescription(String productDescription) {
            this.productDescription = productDescription;
        }

        public String getRate() {
            return rate;
        }

        public void setRate(String rate) {
            this.rate = rate;
        }

        public String getUoM() {
            return uoM;
        }

        public void setUoM(String uoM) {
            this.uoM = uoM;
        }

        public Double getQuantity() {
            return quantity;
        }

        public void setQuantity(Double quantity) {
            this.quantity = quantity;
        }

        public Double getTotalValues() {
            return totalValues;
        }

        public void setTotalValues(Double totalValues) {
            this.totalValues = totalValues;
        }

        public Double getValueSalesExcludingST() {
            return valueSalesExcludingST;
        }

        public void setValueSalesExcludingST(Double valueSalesExcludingST) {
            this.valueSalesExcludingST = valueSalesExcludingST;
        }

        public Double getFixedNotifiedValueOrRetailPrice() {
            return fixedNotifiedValueOrRetailPrice;
        }

        public void setFixedNotifiedValueOrRetailPrice(Double fixedNotifiedValueOrRetailPrice) {
            this.fixedNotifiedValueOrRetailPrice = fixedNotifiedValueOrRetailPrice;
        }

        public String getSalesTaxApplicable() {
            return salesTaxApplicable;
        }

        public void setSalesTaxApplicable(String salesTaxApplicable) {
            this.salesTaxApplicable = salesTaxApplicable;
        }

        public Double getSalesTaxWithheldAtSource() {
            return salesTaxWithheldAtSource;
        }

        public void setSalesTaxWithheldAtSource(Double salesTaxWithheldAtSource) {
            this.salesTaxWithheldAtSource = salesTaxWithheldAtSource;
        }

        public Double getExtraTax() {
            return extraTax;
        }

        public void setExtraTax(Double extraTax) {
            this.extraTax = (extraTax == null) ? 0.0 : extraTax;
        }

        public Double getFurtherTax() {
            return furtherTax;
        }

        public void setFurtherTax(Double furtherTax) {
            this.furtherTax = furtherTax;
        }

        public String getSroScheduleNo() {
            return sroScheduleNo;
        }

        public void setSroScheduleNo(String sroScheduleNo) {
            this.sroScheduleNo = sroScheduleNo;
        }

        public Double getFedPayable() {
            return fedPayable;
        }

        public void setFedPayable(Double fedPayable) {
            this.fedPayable = fedPayable;
        }

        public Double getDiscount() {
            return discount;
        }

        public void setDiscount(Double discount) {
            this.discount = discount;
        }

        public String getSaleType() {
            return saleType;
        }

        public void setSaleType(String saleType) {
            this.saleType = saleType;
        }

        public String getSroItemSerialNo() {
            return sroItemSerialNo;
        }

        public void setSroItemSerialNo(String sroItemSerialNo) {
            this.sroItemSerialNo = sroItemSerialNo;
        }
    }
}