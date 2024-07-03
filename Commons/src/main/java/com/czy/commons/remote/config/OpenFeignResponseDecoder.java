package com.czy.commons.remote.config;

import com.alibaba.fastjson2.JSONObject;
import com.czy.commons.error.response.Result;
import com.czy.commons.error.system.SystemErrorCode;
import com.fasterxml.jackson.databind.ObjectMapper;
import feign.FeignException;
import feign.Response;
import feign.Util;
import feign.codec.DecodeException;
import feign.codec.Decoder;
import lombok.RequiredArgsConstructor;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.Charset;

@RequiredArgsConstructor
public class OpenFeignResponseDecoder implements Decoder {

    private final ObjectMapper objectMapper;

    @Override
    public Object decode(Response response, Type type) throws IOException, FeignException {
        if (null == response.body()) {
            throw new DecodeException(response.status(), "OpenFeign返回数据异常", response.request());
        }

        String str = Util.toString(response.body().asReader(Charset.defaultCharset()));
        JSONObject result = JSONObject.parseObject(str);
        int code = result.getIntValue("code");
        String msg = result.getString("msg");
        Object data = result.getObject("data", Object.class);
        if (code != SystemErrorCode.SUCCESS.getCode()) {
            throw new DecodeException(code, "OpenFeign接口返回错误：" + msg, response.request());
        }
        return data;
    }
}
