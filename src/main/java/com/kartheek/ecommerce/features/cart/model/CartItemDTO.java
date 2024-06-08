package com.kartheek.ecommerce.features.cart.model;

import com.kartheek.ecommerce.admin.product.model.ProductDTO;

public class CartItemDTO {
    private Long cartItemId;
    private ProductDTO product;
    private Integer quantity;

    public Long getCartItemId() {
        return cartItemId;
    }

    public void setCartItemId(Long cartItemId) {
        this.cartItemId = cartItemId;
    }


    public ProductDTO getProduct() {
        return product;
    }

    public void setProduct(ProductDTO product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
