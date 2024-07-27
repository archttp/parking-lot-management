// This file is auto-generated, don't edit it. Thanks.
package com.cf.pay.service.alipay.util.generic.models;

import com.aliyun.tea.*;

public class AlipayOpenApiGenericResponse extends TeaModel {
    @NameInMap("http_body")
    @Validation(required = true)
    public String httpBody;

    @NameInMap("code")
    @Validation(required = true)
    public String code;

    @NameInMap("msg")
    @Validation(required = true)
    public String msg;

    @NameInMap("sub_code")
    @Validation(required = true)
    public String subCode;

    @NameInMap("sub_msg")
    @Validation(required = true)
    public String subMsg;

    public static AlipayOpenApiGenericResponse build(java.util.Map<String, ?> map) throws Exception {
        AlipayOpenApiGenericResponse self = new AlipayOpenApiGenericResponse();
        return TeaModel.build(map, self);
    }

}
