package io.github.marktony.espresso.mvp.packagedetails;

import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;

import java.util.List;

import io.github.marktony.espresso.mvp.BasePresenter;
import io.github.marktony.espresso.mvp.BaseView;
import io.github.marktony.espresso.data.Package;
import io.github.marktony.espresso.data.PackageStatus;

/**
 * Created by lizhaotailang on 2017/2/10.
 */

public interface PackageDetailsContract {

    interface View extends BaseView<Presenter> {

        void setLoadingIndicator(boolean loading);

        void showNetworkError();

        void showPackageDetails(@NonNull Package p);

        void setToolbarBackground(@DrawableRes int resId);

        void shareTo(@NonNull Package pack);

        void copyPackageNumber(@NonNull String packageId);

        void exit();

    }

    interface Presenter extends BasePresenter {

        void setPackageUnread();

        void refreshPackage();

        void deletePackage();

        void copyPackageNumber();

        void shareTo();

        String getPackageName();

        void updatePackageName(String newName);

    }

}
