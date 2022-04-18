package com.jane.xjutils;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ActivityManager;
import android.os.Bundle;

import com.jane.utils.android.HtmlUtils;
import com.jane.utils.android.LogUtils;

public class MainActivity extends AppCompatActivity {

    String json = "{\"name\":\"测试\",\"publishTime\":\"2022-04-16 00:00:00\",\"unpublishTime\":\"2022-04-30 00:00:00\",\"fullNum\":\"99\",\"giftNum\":\"9\",\"mode\":0,\"activityProducts\":[{\"productId\":\"1500663847672803329\",\"categoryLevel1Id\":\"1495689710149189635\",\"categoryLevel2Id\":\"1495689710149189636\",\"categoryLevel3Id\":\"1495689710149189637\",\"title\":\"小推车置物架新生儿婴儿用品落地多层储物架床头带轮可移动收纳架【合作品牌】（预售1~3天发货）\",\"subTitle\":\"多功能 省空间 带轮可移动 多层置物架\",\"mainImage\":\"https://image01.bckid.com.cn/product/1649417183401_30626776.jpg\",\"boost\":998,\"salePrice\":118.8,\"maxCostPrice\":118.8,\"minCostPrice\":118.8,\"maxSalePrice\":118.8,\"minSalePrice\":118.8,\"minActivityPrice\":89,\"totalStock\":785,\"salesCount\":23,\"publishStatus\":1,\"createTime\":\"2022-03-07 10:45:29\",\"hasSelected\":0,\"hasEnabled\":1,\"productName\":\"小推车置物架新生儿婴儿用品落地多层储物架床头带轮可移动收纳架【合作品牌】（预售1~3天发货）\",\"checked\":true}],\"enabled\":0,\"calcMode\":1}";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LogUtils.wJson(json, "https://www.baidu.com");

        HtmlUtils.form("");
    }
}