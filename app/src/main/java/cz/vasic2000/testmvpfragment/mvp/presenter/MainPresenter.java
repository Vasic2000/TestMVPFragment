package cz.vasic2000.testmvpfragment.mvp.presenter;


import cz.vasic2000.testmvpfragment.mvp.MainView;
import cz.vasic2000.testmvpfragment.mvp.model.MainViewModel;
import moxy.MvpPresenter;

public class MainPresenter extends MvpPresenter<MainView> {
    private MainViewModel mainViewModel = new MainViewModel();


    @Override
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
    }

}
