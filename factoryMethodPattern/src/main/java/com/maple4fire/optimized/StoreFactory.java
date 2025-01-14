package com.maple4fire.optimized;


import com.maple4fire.optimized.store.ICommodity;
import com.maple4fire.optimized.store.impl.CardCommodityService;
import com.maple4fire.optimized.store.impl.CouponCommodityService;
import com.maple4fire.optimized.store.impl.GoodsCommodityService;

/**
 * @Author: fengyi
 * @Description:
 * @Date: 2024/01/10 10:40
 */

public class StoreFactory {

    public ICommodity getCommodityService(Integer commodityType) throws Exception {
        switch (commodityType) {
            case 1:
                return new CouponCommodityService();
            case 2:
                return new GoodsCommodityService();
            case 3:
                return new CardCommodityService();
            default:
                throw new Exception("不存在的商品服务类型");
        }
    }
}
