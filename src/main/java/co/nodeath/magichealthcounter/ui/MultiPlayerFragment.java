package co.nodeath.magichealthcounter.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

public final class MultiPlayerFragment extends MagicFragment {

  public static MultiPlayerFragment newInstance() {
    return new MultiPlayerFragment();
  }

  @Override public View onCreateView(
      LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    View view = super.onCreateView(inflater, container, savedInstanceState);
    ButterKnife.inject(this, view);

    ButterKnife.apply(scoreViews, SET_COMMANDER_LIFE);
    ButterKnife.apply(poisonCounters, SET_ZERO);

    return view;
  }
}
