package com.haier.jiuzhidao.biz2_phone_pay_wx2.presenter;

import com.haier.cellarette.libmvp.mvp.Presenter;
import com.haier.cellarette.libretrofit.RetrofitNetNew;
import com.haier.jiuzhidao.biz2_phone_pay_wx2.api.GetWx;
import com.haier.jiuzhidao.biz2_phone_pay_wx2.bean.WxBean;
import com.haier.jiuzhidao.biz2_phone_pay_wx2.view.GetWxView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MyWxPresenter extends Presenter<GetWxView> {
    public void getCode() {
        RetrofitNetNew.build(GetWx.class, getIdentifier()).getWx().enqueue(new Callback<WxBean>() {
            @Override
            public void onResponse(Call<WxBean> call, Response<WxBean> response) {
                getView().onWxSuccess(response.body());
            }

            @Override
            public void onFailure(Call<WxBean> call, Throwable t) {
                String string = t.toString();
            }
        });

    }


}
