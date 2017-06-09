package com.lzy.demo.okrx2;

import android.content.Intent;

import com.lzy.demo.base.MainFragment;
import com.lzy.demo.model.ItemModel;

import java.util.List;

/**
 * ================================================
 * 作    者：jeasonlzy（廖子尧）Github地址：https://github.com/jeasonlzy
 * 版    本：1.0
 * 创建日期：2017/6/9
 * 描    述：
 * 修订历史：
 * ================================================
 */
public class OkRx2Fragment extends MainFragment {

    @Override
    public void fillData(List<ItemModel> items) {
        items.add(new ItemModel("基本请求", //
                                "1.支持GET，HEAD，OPTIONS，POST，PUT，DELETE, PATCH, TRACE 8种请求方式\n" +//
                                "2.自动解析JSONObject对象\n" +//
                                "3.自动解析JSONArray对象\n" +//
                                "4.上传string文本\n" +//
                                "5.上传json数据"));
        items.add(new ItemModel("统一管理请求", "如果你熟悉Retrofit，那么和Retrofit一样，可以使用一个Api类管理所有的请求"));
        items.add(new ItemModel("请求图片", "请求服务器返回bitmap对象"));
        items.add(new ItemModel("文件上传", "支持参数和文件一起上传,并回调上传进度"));
        items.add(new ItemModel("文件下载", "支持下载进度回调"));
    }

    @Override
    public void onItemClick(int position) {
        if (position == 0) startActivity(new Intent(context, RxCommonActivity.class));
        if (position == 1) startActivity(new Intent(context, RxRetrofitActivity.class));
        if (position == 2) startActivity(new Intent(context, RxBitmapActivity.class));
        if (position == 3) startActivity(new Intent(context, RxFormUploadActivity.class));
        if (position == 4) startActivity(new Intent(context, RxFileDownloadActivity.class));
    }
}
