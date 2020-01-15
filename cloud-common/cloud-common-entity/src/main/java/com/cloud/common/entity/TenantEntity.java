package com.cloud.common.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Author Aijm
 * @Description  租户 实体
 * @Date 2020/1/15
 */
@Data
@Accessors(chain = true)
@ApiModel(description = "基础字段")
public class TenantEntity<T>  extends BaseEntity<T> {

    @ApiModelProperty("租户ID")
    private String tenantId;
}
