package org.etekcity.cloud.award;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import org.etekcity.cloud.util.Util;

/**
 * @author KevinLiu
 */
public enum AwardType {
    /**
     * 未中奖
     */
    EMPTY,
    /**
     * 积分
     */
    POINTS,
    /**
     * 优惠券
     */
    COUPON,
    /**
     * 实物
     */
    ENTITY,
    /**
     * 虚拟物品
     */
    VIRTUAL_GOODS;

    private static final ImmutableMap<String, AwardType> STRING_2_ENUM_MAP = Maps.uniqueIndex(Stream.of(
            AwardType.values()).collect(Collectors.toList()), AwardType::toString);

    public static AwardType getAwardTypeByTypeOrException(String type) {
        return Util.getFromMapOrException(type, STRING_2_ENUM_MAP, String.format("%s is not a valid awardType", type));
    }
}
