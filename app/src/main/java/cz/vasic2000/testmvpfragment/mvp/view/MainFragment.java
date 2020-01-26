package cz.vasic2000.testmvpfragment.mvp.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import butterknife.BindView;
import butterknife.ButterKnife;
import cz.vasic2000.testmvpfragment.R;
import cz.vasic2000.testmvpfragment.mvp.MainView;
import cz.vasic2000.testmvpfragment.mvp.presenter.MainPresenter;
import moxy.MvpAppCompatFragment;
import moxy.presenter.InjectPresenter;
import moxy.presenter.ProvidePresenter;

public class MainFragment extends MvpAppCompatFragment implements MainView {

    @InjectPresenter
    MainPresenter mainPresenter;

    @BindView(R.id.buttonFind)
    Button buttonOne;
    @BindView(R.id.latitude)
    EditText et_latitude;
    @BindView(R.id.longitude)
    EditText et_longitude;
    @InjectPresenter
    MainPresenter presenter;

    @ProvidePresenter
    public MainPresenter createPresenter() {
        return new MainPresenter();
    }

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.main_fragment, container, false);
        ButterKnife.bind(getViewLifecycleOwner(), root);
        return root;
    }
}
