package com.maple4fire.optimized.store;

import java.util.Map;

/**
 * @Author: fengyi
 * @Description: 所有的奖品无论是实物、虚拟还是第三方，都需要通过我们的程序实现此接口进行处理，以保证最终⼊参出参的统一性。
 * @Date: 2024/01/10 10:40
 */

public interface ICommodity {

    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;
}
