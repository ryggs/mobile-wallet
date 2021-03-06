package org.mifos.mobilewallet.mifospay.home;

import org.mifos.mobilewallet.core.domain.model.Account;
import org.mifos.mobilewallet.core.domain.model.Client;
import org.mifos.mobilewallet.mifospay.base.BasePresenter;
import org.mifos.mobilewallet.mifospay.base.BaseView;

/**
 * Created by naman on 17/6/17.
 */

public interface HomeContract {

    interface HomeView extends BaseView<HomePresenter> {

        void showClientDetails(Client client);
    }

    interface HomePresenter extends BasePresenter {

        void fetchClientDetails();
    }


    interface WalletView extends BaseView<WalletPresenter> {

        void showSnackbar(String message);

        void showWallet(Account account);

        void showToast(String message);

        void hideSwipeProgress();
    }

    interface WalletPresenter extends BasePresenter {

        void fetchWallet();

    }


    interface TransferView extends BaseView<TransferPresenter> {

        void showVpa(String vpa);

        void showToast(String message);

        void showSnackbar(String message);
    }

    interface TransferPresenter extends BasePresenter {

        void fetchVpa();
    }

    interface ProfileView extends BaseView<ProfilePresenter> {

        void showProfile(Client client);

        void showToast(String message);

        void showSnackbar(String message);
    }

    interface ProfilePresenter extends BasePresenter {

        void fetchprofile();

    }


}
