package com.brindabhattarai.Shopping.pojo;

import com.brindabhattarai.Shopping.entity.MyCart;
import com.brindabhattarai.Shopping.entity.Product;
import com.brindabhattarai.Shopping.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddToCartPojo {
    private Integer cart_id;
    private Integer p_id;
    private Integer user_id;


    public AddToCartPojo(MyCart myCart){
        this.cart_id= myCart.getCartId();
        this.p_id= myCart.getUser().getId();
        this.user_id= myCart.getProduct().getProductId();

    }

}
