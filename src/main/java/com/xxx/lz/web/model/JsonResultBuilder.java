package com.xxx.lz.web.model;

public class JsonResultBuilder {

    public static <T> JsonResult<T> succ(T info) {
        JsonResult<T> jsonResult = new JsonResult<>();
        jsonResult.setSuccess(true);
        jsonResult.setInfo(info);
        return jsonResult;
    }

    public static JsonResult succ() {
        JsonResult jsonResult = new JsonResult();
        jsonResult.setSuccess(true);
        return jsonResult;
    }

    public static <T> JsonResult<T> fail(CommonError error) {
        JsonResult<T> jsonResult = new JsonResult<>();
        jsonResult.setSuccess(false);
        jsonResult.setErrorCode(error.getErrorCode());
        jsonResult.setErrorMessage(error.getErrorMessage());
        return jsonResult;
    }

    public static <T> JsonResult<T> fail(String errCode, String errMsg) {
        JsonResult<T> jsonResult = new JsonResult<>();
        jsonResult.setSuccess(false);
        jsonResult.setErrorCode(errCode);
        jsonResult.setErrorMessage(errMsg);
        return jsonResult;
    }

}
