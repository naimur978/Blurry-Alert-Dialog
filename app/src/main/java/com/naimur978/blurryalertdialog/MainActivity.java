package com.naimur978.blurryalertdialog;

import android.os.Bundle;

import static androidx.constraintlayout.widget.Constraints.TAG;


public class MainActivity extends BaseActivity {

    @Override
    protected boolean hasBackBtn() {
        return false;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void init(Bundle bundle) {

    }

    @OnClick(R.id.button)
    void buttonClicked() {
        SampleDialogFragment dialogFragment = SampleDialogFragment.newInstance();
        dialogFragment.show(getSupportFragmentManager(), TAG);
    }

    @OnClick(R.id.button2)
    void button2Clicked() {
        SampleBottomDialogFragment dialogFragment = SampleBottomDialogFragment.newInstance();
        dialogFragment.show(getSupportFragmentManager(), TAG);
    }
}
