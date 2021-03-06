package co.nodeath.magichealthcounter.ui.misc;

import android.app.DialogFragment;
import android.os.Bundle;

import butterknife.ButterKnife;
import icepick.Icepick;

public abstract class BaseDialogFragment extends DialogFragment {
  @Override public void onActivityCreated(Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    // Restore objects saved with Icepick
    Icepick.restoreInstanceState(this, savedInstanceState);
  }

  @Override public void onSaveInstanceState(Bundle outState) {
    super.onSaveInstanceState(outState);
    // Save out objects annotated with @Icicle
    Icepick.saveInstanceState(this, outState);
  }

  @Override public void onDestroyView() {
    super.onDestroyView();

    // Release the views injected by butterknife
    ButterKnife.reset(this);
  }
}
