package co.nodeath.magichealthcounter.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

public class CasualFragment extends MagicFragment {

  @Override public View onCreateView(
      LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    View view = super.onCreateView(inflater, container, savedInstanceState);
    ButterKnife.inject(this, view);

    ButterKnife.apply(themViews, FLIP_VIEWS);
    ButterKnife.apply(scoreViews, SET_STANDARD_LIFE);
    ButterKnife.apply(poisonCounters, SET_STANDARD_LIFE);

    return view;
  }
}
