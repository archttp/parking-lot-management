// This file is auto-generated, don't edit it. Thanks.
package com.cf.pay.service.alipay.marketing.openlife.models;

import com.aliyun.tea.*;

public class Template extends TeaModel {
    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    @NameInMap("context")
    @Validation(required = true)
    public Context context;

    public static Template build(java.util.Map<String, ?> map) throws Exception {
        Template self = new Template();
        return TeaModel.build(map, self);
    }

}
