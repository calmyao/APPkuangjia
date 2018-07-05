package com.haier.index.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;

import com.haier.cellarette.baselibrary.baseactivitys.BaseFragment;
import com.haier.cellarette.baselibrary.glidenetpicpressnormal.SelectorUtil;
import com.haier.cellarette.baselibrary.likebutton.LikeButtonActivity;
import com.haier.cellarette.baselibrary.toasts2.Toasty;
import com.haier.cellarette.baselibrary.zothers.NoDoubleClickListener;
import com.haier.cellarette.libwebview.DemoWebviewMainActivity;
import com.haier.cellarette.libwebview.hois2.HiosHelper;
import com.haier.index.R;

public class FragmentContent3 extends BaseFragment {

    private String tablayoutId;
    private Context mContext;
    private ImageView iv1;

    @Override
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        mContext = getActivity();
//        Bundle arg = getArguments();
        if (getArguments() != null) {
            tablayoutId = getArguments().getString("tablayoutId");
        }
    }

    @Override
    protected void setup(View rootView, @Nullable Bundle savedInstanceState) {
        super.setup(rootView, savedInstanceState);
//        iv1 = rootView.findViewById(R.id.iv1);
        initData();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_fragment3;
    }

    /**
     * 第一次进来加载bufen
     */
    public void initData() {

        Toasty.normal(getActivity(), "初始化内容" + tablayoutId).show();
    }


    /**
     * 底部点击bufen
     *
     * @param cateId
     * @param isrefresh
     */
    public void getCate(String cateId, boolean isrefresh) {

        if (!isrefresh) {
            return;
        }
        Toasty.normal(getActivity(), "下拉刷新啦").show();
    }

}
