package com.rex.paperdiy.controller;

import android.content.Context;

import com.rex.paperdiy.R;

import java.util.HashMap;
import java.util.Map;

import dswork.android.lib.core.controller.BaseWebController;
import dswork.android.lib.core.util.webutil.HttpResultObj;

/**
 * Created by mac373 on 15/11/25.
 */
public class NavDrawerDataController extends BaseWebController {

    private Context ctx;

    public NavDrawerDataController(Context ctx) {
        this.ctx = ctx;
    }

    @Override
    public String getModulePath() {
        return ctx.getString(R.string.app_path);
    }

    public HttpResultObj<String> getDataJson() {
        Map<String,String> m = new HashMap<String,String>();
        HttpResultObj<String> r = submitHttpAction("client/nav/getNavDataJson.action", String.class, m, 5000, 5000, "POST");
        return r;
    }
}
