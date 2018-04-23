package ng.com.donsoft.fitit.search;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * Created by Loisg on 9/15/17 at 12:16 PM.
 */

public class DelayAutoCompleteTextView extends android.support.v7.widget.AppCompatAutoCompleteTextView {

    private static final int MESSAGE_TEXT_CHANGED = 100;
    private static final int DEFAULT_AUTOCOMPLETE_DELAY = 750;
    private final String TAG = "DelayAutocompletedView";
    private int mAutoCompleteDelay = DEFAULT_AUTOCOMPLETE_DELAY;
    private View loadingIndicator;
    private View addButton;

    private final Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            DelayAutoCompleteTextView.super.performFiltering((CharSequence) msg.obj, msg.arg1);
        }
    };

    public DelayAutoCompleteTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setLoadingIndicator(View progressBar) {
        loadingIndicator = progressBar;
    }

    public void setAddButton(View addButton) {
        this.addButton = addButton;
    }

    public void setAutoCompleteDelay(int autoCompleteDelay) {
        mAutoCompleteDelay = autoCompleteDelay;
    }

    @Override
    protected void performFiltering(CharSequence text, int keyCode) {
        if (loadingIndicator != null) {
            loadingIndicator.setVisibility(View.VISIBLE);
        }

        if (addButton !=null) {
            addButton.setVisibility(GONE);
        }
        Log.w("DelayAutocompletedView", "performFiltering: "+ text);
        Log.w("DelayAutocompletedView", "performFiltering: "+ loadingIndicator);
        mHandler.removeMessages(MESSAGE_TEXT_CHANGED);
        mHandler.sendMessageDelayed(mHandler.obtainMessage(MESSAGE_TEXT_CHANGED, text), mAutoCompleteDelay);
    }

    @Override
    public void onFilterComplete(int count) {
        if (loadingIndicator != null) {
            loadingIndicator.setVisibility(View.GONE);
        }

        if(addButton!= null){
            addButton.setVisibility(VISIBLE);
        }
        super.onFilterComplete(count);
    }
}
