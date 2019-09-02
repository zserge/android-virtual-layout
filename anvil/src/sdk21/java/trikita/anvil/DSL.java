package trikita.anvil;

import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.app.Activity;
import android.app.FragmentBreadCrumbs;
import android.app.FragmentManager;
import android.app.LocalActivityManager;
import android.app.MediaRouteButton;
import android.app.SearchableInfo;
import android.appwidget.AppWidgetHostView;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.gesture.Gesture;
import android.gesture.GestureOverlayView;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.inputmethodservice.ExtractEditText;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.media.MediaPlayer;
import android.media.tv.TvView;
import android.net.Uri;
import android.opengl.GLSurfaceView;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.text.method.MovementMethod;
import android.text.method.TransformationMethod;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.DragEvent;
import android.view.InputEvent;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewStub;
import android.view.WindowInsets;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LayoutAnimationController;
import android.view.inputmethod.ExtractedText;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AbsListView;
import android.widget.AbsSeekBar;
import android.widget.AbsSpinner;
import android.widget.AbsoluteLayout;
import android.widget.ActionMenuView;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterViewAnimator;
import android.widget.AdapterViewFlipper;
import android.widget.AnalogClock;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.Chronometer;
import android.widget.CompoundButton;
import android.widget.CursorAdapter;
import android.widget.DatePicker;
import android.widget.DialerFilter;
import android.widget.DigitalClock;
import android.widget.EditText;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.Gallery;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.MultiAutoCompleteTextView;
import android.widget.NumberPicker;
import android.widget.ProgressBar;
import android.widget.QuickContactBadge;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Scroller;
import android.widget.SearchView;
import android.widget.SeekBar;
import android.widget.SlidingDrawer;
import android.widget.Space;
import android.widget.Spinner;
import android.widget.StackView;
import android.widget.Switch;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextClock;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.ToggleButton;
import android.widget.Toolbar;
import android.widget.TwoLineListItem;
import android.widget.VideoView;
import android.widget.ViewAnimator;
import android.widget.ViewFlipper;
import android.widget.ViewSwitcher;
import android.widget.ZoomButton;
import android.widget.ZoomControls;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.Boolean;
import java.lang.CharSequence;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Void;
import java.util.Locale;

/**
 * DSL for creating views and settings their attributes.
 * This file has been generated by {@code gradle generateSDK21DSL}.
 * It contains views and their setters from API level 21.
 * Please, don't edit it manually unless for debugging.
 */
public final class DSL extends BaseDSL implements Anvil.AttributeSetter {
  static {
    Anvil.registerAttributeSetter(new DSL());
  }

  public static BaseDSL.ViewClassResult fragmentBreadCrumbs() {
    return BaseDSL.v(FragmentBreadCrumbs.class);
  }

  public static Void fragmentBreadCrumbs(Anvil.Renderable r) {
    return BaseDSL.v(FragmentBreadCrumbs.class, r);
  }

  public static BaseDSL.ViewClassResult mediaRouteButton() {
    return BaseDSL.v(MediaRouteButton.class);
  }

  public static Void mediaRouteButton(Anvil.Renderable r) {
    return BaseDSL.v(MediaRouteButton.class, r);
  }

  public static BaseDSL.ViewClassResult appWidgetHostView() {
    return BaseDSL.v(AppWidgetHostView.class);
  }

  public static Void appWidgetHostView(Anvil.Renderable r) {
    return BaseDSL.v(AppWidgetHostView.class, r);
  }

  public static BaseDSL.ViewClassResult gestureOverlayView() {
    return BaseDSL.v(GestureOverlayView.class);
  }

  public static Void gestureOverlayView(Anvil.Renderable r) {
    return BaseDSL.v(GestureOverlayView.class, r);
  }

  public static BaseDSL.ViewClassResult extractEditText() {
    return BaseDSL.v(ExtractEditText.class);
  }

  public static Void extractEditText(Anvil.Renderable r) {
    return BaseDSL.v(ExtractEditText.class, r);
  }

  public static BaseDSL.ViewClassResult keyboardView() {
    return BaseDSL.v(KeyboardView.class);
  }

  public static Void keyboardView(Anvil.Renderable r) {
    return BaseDSL.v(KeyboardView.class, r);
  }

  public static BaseDSL.ViewClassResult tvView() {
    return BaseDSL.v(TvView.class);
  }

  public static Void tvView(Anvil.Renderable r) {
    return BaseDSL.v(TvView.class, r);
  }

  public static BaseDSL.ViewClassResult gLSurfaceView() {
    return BaseDSL.v(GLSurfaceView.class);
  }

  public static Void gLSurfaceView(Anvil.Renderable r) {
    return BaseDSL.v(GLSurfaceView.class, r);
  }

  public static BaseDSL.ViewClassResult surfaceView() {
    return BaseDSL.v(SurfaceView.class);
  }

  public static Void surfaceView(Anvil.Renderable r) {
    return BaseDSL.v(SurfaceView.class, r);
  }

  public static BaseDSL.ViewClassResult textureView() {
    return BaseDSL.v(TextureView.class);
  }

  public static Void textureView(Anvil.Renderable r) {
    return BaseDSL.v(TextureView.class, r);
  }

  public static BaseDSL.ViewClassResult view() {
    return BaseDSL.v(View.class);
  }

  public static Void view(Anvil.Renderable r) {
    return BaseDSL.v(View.class, r);
  }

  public static BaseDSL.ViewClassResult viewGroup() {
    return BaseDSL.v(ViewGroup.class);
  }

  public static Void viewGroup(Anvil.Renderable r) {
    return BaseDSL.v(ViewGroup.class, r);
  }

  public static BaseDSL.ViewClassResult viewStub() {
    return BaseDSL.v(ViewStub.class);
  }

  public static Void viewStub(Anvil.Renderable r) {
    return BaseDSL.v(ViewStub.class, r);
  }

  public static BaseDSL.ViewClassResult webView() {
    return BaseDSL.v(WebView.class);
  }

  public static Void webView(Anvil.Renderable r) {
    return BaseDSL.v(WebView.class, r);
  }

  public static BaseDSL.ViewClassResult absListView() {
    return BaseDSL.v(AbsListView.class);
  }

  public static Void absListView(Anvil.Renderable r) {
    return BaseDSL.v(AbsListView.class, r);
  }

  public static BaseDSL.ViewClassResult absSeekBar() {
    return BaseDSL.v(AbsSeekBar.class);
  }

  public static Void absSeekBar(Anvil.Renderable r) {
    return BaseDSL.v(AbsSeekBar.class, r);
  }

  public static BaseDSL.ViewClassResult absSpinner() {
    return BaseDSL.v(AbsSpinner.class);
  }

  public static Void absSpinner(Anvil.Renderable r) {
    return BaseDSL.v(AbsSpinner.class, r);
  }

  public static BaseDSL.ViewClassResult absoluteLayout() {
    return BaseDSL.v(AbsoluteLayout.class);
  }

  public static Void absoluteLayout(Anvil.Renderable r) {
    return BaseDSL.v(AbsoluteLayout.class, r);
  }

  public static BaseDSL.ViewClassResult actionMenuView() {
    return BaseDSL.v(ActionMenuView.class);
  }

  public static Void actionMenuView(Anvil.Renderable r) {
    return BaseDSL.v(ActionMenuView.class, r);
  }

  public static BaseDSL.ViewClassResult adapterView() {
    return BaseDSL.v(AdapterView.class);
  }

  public static Void adapterView(Anvil.Renderable r) {
    return BaseDSL.v(AdapterView.class, r);
  }

  public static BaseDSL.ViewClassResult adapterViewAnimator() {
    return BaseDSL.v(AdapterViewAnimator.class);
  }

  public static Void adapterViewAnimator(Anvil.Renderable r) {
    return BaseDSL.v(AdapterViewAnimator.class, r);
  }

  public static BaseDSL.ViewClassResult adapterViewFlipper() {
    return BaseDSL.v(AdapterViewFlipper.class);
  }

  public static Void adapterViewFlipper(Anvil.Renderable r) {
    return BaseDSL.v(AdapterViewFlipper.class, r);
  }

  public static BaseDSL.ViewClassResult analogClock() {
    return BaseDSL.v(AnalogClock.class);
  }

  public static Void analogClock(Anvil.Renderable r) {
    return BaseDSL.v(AnalogClock.class, r);
  }

  public static BaseDSL.ViewClassResult autoCompleteTextView() {
    return BaseDSL.v(AutoCompleteTextView.class);
  }

  public static Void autoCompleteTextView(Anvil.Renderable r) {
    return BaseDSL.v(AutoCompleteTextView.class, r);
  }

  public static BaseDSL.ViewClassResult button() {
    return BaseDSL.v(Button.class);
  }

  public static Void button(Anvil.Renderable r) {
    return BaseDSL.v(Button.class, r);
  }

  public static BaseDSL.ViewClassResult calendarView() {
    return BaseDSL.v(CalendarView.class);
  }

  public static Void calendarView(Anvil.Renderable r) {
    return BaseDSL.v(CalendarView.class, r);
  }

  public static BaseDSL.ViewClassResult checkBox() {
    return BaseDSL.v(CheckBox.class);
  }

  public static Void checkBox(Anvil.Renderable r) {
    return BaseDSL.v(CheckBox.class, r);
  }

  public static BaseDSL.ViewClassResult checkedTextView() {
    return BaseDSL.v(CheckedTextView.class);
  }

  public static Void checkedTextView(Anvil.Renderable r) {
    return BaseDSL.v(CheckedTextView.class, r);
  }

  public static BaseDSL.ViewClassResult chronometer() {
    return BaseDSL.v(Chronometer.class);
  }

  public static Void chronometer(Anvil.Renderable r) {
    return BaseDSL.v(Chronometer.class, r);
  }

  public static BaseDSL.ViewClassResult compoundButton() {
    return BaseDSL.v(CompoundButton.class);
  }

  public static Void compoundButton(Anvil.Renderable r) {
    return BaseDSL.v(CompoundButton.class, r);
  }

  public static BaseDSL.ViewClassResult datePicker() {
    return BaseDSL.v(DatePicker.class);
  }

  public static Void datePicker(Anvil.Renderable r) {
    return BaseDSL.v(DatePicker.class, r);
  }

  public static BaseDSL.ViewClassResult dialerFilter() {
    return BaseDSL.v(DialerFilter.class);
  }

  public static Void dialerFilter(Anvil.Renderable r) {
    return BaseDSL.v(DialerFilter.class, r);
  }

  public static BaseDSL.ViewClassResult digitalClock() {
    return BaseDSL.v(DigitalClock.class);
  }

  public static Void digitalClock(Anvil.Renderable r) {
    return BaseDSL.v(DigitalClock.class, r);
  }

  public static BaseDSL.ViewClassResult editText() {
    return BaseDSL.v(EditText.class);
  }

  public static Void editText(Anvil.Renderable r) {
    return BaseDSL.v(EditText.class, r);
  }

  public static BaseDSL.ViewClassResult expandableListView() {
    return BaseDSL.v(ExpandableListView.class);
  }

  public static Void expandableListView(Anvil.Renderable r) {
    return BaseDSL.v(ExpandableListView.class, r);
  }

  public static BaseDSL.ViewClassResult frameLayout() {
    return BaseDSL.v(FrameLayout.class);
  }

  public static Void frameLayout(Anvil.Renderable r) {
    return BaseDSL.v(FrameLayout.class, r);
  }

  public static BaseDSL.ViewClassResult gallery() {
    return BaseDSL.v(Gallery.class);
  }

  public static Void gallery(Anvil.Renderable r) {
    return BaseDSL.v(Gallery.class, r);
  }

  public static BaseDSL.ViewClassResult gridLayout() {
    return BaseDSL.v(GridLayout.class);
  }

  public static Void gridLayout(Anvil.Renderable r) {
    return BaseDSL.v(GridLayout.class, r);
  }

  public static BaseDSL.ViewClassResult gridView() {
    return BaseDSL.v(GridView.class);
  }

  public static Void gridView(Anvil.Renderable r) {
    return BaseDSL.v(GridView.class, r);
  }

  public static BaseDSL.ViewClassResult horizontalScrollView() {
    return BaseDSL.v(HorizontalScrollView.class);
  }

  public static Void horizontalScrollView(Anvil.Renderable r) {
    return BaseDSL.v(HorizontalScrollView.class, r);
  }

  public static BaseDSL.ViewClassResult imageButton() {
    return BaseDSL.v(ImageButton.class);
  }

  public static Void imageButton(Anvil.Renderable r) {
    return BaseDSL.v(ImageButton.class, r);
  }

  public static BaseDSL.ViewClassResult imageSwitcher() {
    return BaseDSL.v(ImageSwitcher.class);
  }

  public static Void imageSwitcher(Anvil.Renderable r) {
    return BaseDSL.v(ImageSwitcher.class, r);
  }

  public static BaseDSL.ViewClassResult imageView() {
    return BaseDSL.v(ImageView.class);
  }

  public static Void imageView(Anvil.Renderable r) {
    return BaseDSL.v(ImageView.class, r);
  }

  public static BaseDSL.ViewClassResult linearLayout() {
    return BaseDSL.v(LinearLayout.class);
  }

  public static Void linearLayout(Anvil.Renderable r) {
    return BaseDSL.v(LinearLayout.class, r);
  }

  public static BaseDSL.ViewClassResult listView() {
    return BaseDSL.v(ListView.class);
  }

  public static Void listView(Anvil.Renderable r) {
    return BaseDSL.v(ListView.class, r);
  }

  public static BaseDSL.ViewClassResult mediaController() {
    return BaseDSL.v(MediaController.class);
  }

  public static Void mediaController(Anvil.Renderable r) {
    return BaseDSL.v(MediaController.class, r);
  }

  public static BaseDSL.ViewClassResult multiAutoCompleteTextView() {
    return BaseDSL.v(MultiAutoCompleteTextView.class);
  }

  public static Void multiAutoCompleteTextView(Anvil.Renderable r) {
    return BaseDSL.v(MultiAutoCompleteTextView.class, r);
  }

  public static BaseDSL.ViewClassResult numberPicker() {
    return BaseDSL.v(NumberPicker.class);
  }

  public static Void numberPicker(Anvil.Renderable r) {
    return BaseDSL.v(NumberPicker.class, r);
  }

  public static BaseDSL.ViewClassResult progressBar() {
    return BaseDSL.v(ProgressBar.class);
  }

  public static Void progressBar(Anvil.Renderable r) {
    return BaseDSL.v(ProgressBar.class, r);
  }

  public static BaseDSL.ViewClassResult quickContactBadge() {
    return BaseDSL.v(QuickContactBadge.class);
  }

  public static Void quickContactBadge(Anvil.Renderable r) {
    return BaseDSL.v(QuickContactBadge.class, r);
  }

  public static BaseDSL.ViewClassResult radioButton() {
    return BaseDSL.v(RadioButton.class);
  }

  public static Void radioButton(Anvil.Renderable r) {
    return BaseDSL.v(RadioButton.class, r);
  }

  public static BaseDSL.ViewClassResult radioGroup() {
    return BaseDSL.v(RadioGroup.class);
  }

  public static Void radioGroup(Anvil.Renderable r) {
    return BaseDSL.v(RadioGroup.class, r);
  }

  public static BaseDSL.ViewClassResult ratingBar() {
    return BaseDSL.v(RatingBar.class);
  }

  public static Void ratingBar(Anvil.Renderable r) {
    return BaseDSL.v(RatingBar.class, r);
  }

  public static BaseDSL.ViewClassResult relativeLayout() {
    return BaseDSL.v(RelativeLayout.class);
  }

  public static Void relativeLayout(Anvil.Renderable r) {
    return BaseDSL.v(RelativeLayout.class, r);
  }

  public static BaseDSL.ViewClassResult scrollView() {
    return BaseDSL.v(ScrollView.class);
  }

  public static Void scrollView(Anvil.Renderable r) {
    return BaseDSL.v(ScrollView.class, r);
  }

  public static BaseDSL.ViewClassResult searchView() {
    return BaseDSL.v(SearchView.class);
  }

  public static Void searchView(Anvil.Renderable r) {
    return BaseDSL.v(SearchView.class, r);
  }

  public static BaseDSL.ViewClassResult seekBar() {
    return BaseDSL.v(SeekBar.class);
  }

  public static Void seekBar(Anvil.Renderable r) {
    return BaseDSL.v(SeekBar.class, r);
  }

  public static BaseDSL.ViewClassResult slidingDrawer() {
    return BaseDSL.v(SlidingDrawer.class);
  }

  public static Void slidingDrawer(Anvil.Renderable r) {
    return BaseDSL.v(SlidingDrawer.class, r);
  }

  public static BaseDSL.ViewClassResult space() {
    return BaseDSL.v(Space.class);
  }

  public static Void space(Anvil.Renderable r) {
    return BaseDSL.v(Space.class, r);
  }

  public static BaseDSL.ViewClassResult spinner() {
    return BaseDSL.v(Spinner.class);
  }

  public static Void spinner(Anvil.Renderable r) {
    return BaseDSL.v(Spinner.class, r);
  }

  public static BaseDSL.ViewClassResult stackView() {
    return BaseDSL.v(StackView.class);
  }

  public static Void stackView(Anvil.Renderable r) {
    return BaseDSL.v(StackView.class, r);
  }

  public static BaseDSL.ViewClassResult switchView() {
    return BaseDSL.v(Switch.class);
  }

  public static Void switchView(Anvil.Renderable r) {
    return BaseDSL.v(Switch.class, r);
  }

  public static BaseDSL.ViewClassResult tabHost() {
    return BaseDSL.v(TabHost.class);
  }

  public static Void tabHost(Anvil.Renderable r) {
    return BaseDSL.v(TabHost.class, r);
  }

  public static BaseDSL.ViewClassResult tabWidget() {
    return BaseDSL.v(TabWidget.class);
  }

  public static Void tabWidget(Anvil.Renderable r) {
    return BaseDSL.v(TabWidget.class, r);
  }

  public static BaseDSL.ViewClassResult tableLayout() {
    return BaseDSL.v(TableLayout.class);
  }

  public static Void tableLayout(Anvil.Renderable r) {
    return BaseDSL.v(TableLayout.class, r);
  }

  public static BaseDSL.ViewClassResult tableRow() {
    return BaseDSL.v(TableRow.class);
  }

  public static Void tableRow(Anvil.Renderable r) {
    return BaseDSL.v(TableRow.class, r);
  }

  public static BaseDSL.ViewClassResult textClock() {
    return BaseDSL.v(TextClock.class);
  }

  public static Void textClock(Anvil.Renderable r) {
    return BaseDSL.v(TextClock.class, r);
  }

  public static BaseDSL.ViewClassResult textSwitcher() {
    return BaseDSL.v(TextSwitcher.class);
  }

  public static Void textSwitcher(Anvil.Renderable r) {
    return BaseDSL.v(TextSwitcher.class, r);
  }

  public static BaseDSL.ViewClassResult textView() {
    return BaseDSL.v(TextView.class);
  }

  public static Void textView(Anvil.Renderable r) {
    return BaseDSL.v(TextView.class, r);
  }

  public static BaseDSL.ViewClassResult timePicker() {
    return BaseDSL.v(TimePicker.class);
  }

  public static Void timePicker(Anvil.Renderable r) {
    return BaseDSL.v(TimePicker.class, r);
  }

  public static BaseDSL.ViewClassResult toggleButton() {
    return BaseDSL.v(ToggleButton.class);
  }

  public static Void toggleButton(Anvil.Renderable r) {
    return BaseDSL.v(ToggleButton.class, r);
  }

  public static BaseDSL.ViewClassResult toolbar() {
    return BaseDSL.v(Toolbar.class);
  }

  public static Void toolbar(Anvil.Renderable r) {
    return BaseDSL.v(Toolbar.class, r);
  }

  public static BaseDSL.ViewClassResult twoLineListItem() {
    return BaseDSL.v(TwoLineListItem.class);
  }

  public static Void twoLineListItem(Anvil.Renderable r) {
    return BaseDSL.v(TwoLineListItem.class, r);
  }

  public static BaseDSL.ViewClassResult videoView() {
    return BaseDSL.v(VideoView.class);
  }

  public static Void videoView(Anvil.Renderable r) {
    return BaseDSL.v(VideoView.class, r);
  }

  public static BaseDSL.ViewClassResult viewAnimator() {
    return BaseDSL.v(ViewAnimator.class);
  }

  public static Void viewAnimator(Anvil.Renderable r) {
    return BaseDSL.v(ViewAnimator.class, r);
  }

  public static BaseDSL.ViewClassResult viewFlipper() {
    return BaseDSL.v(ViewFlipper.class);
  }

  public static Void viewFlipper(Anvil.Renderable r) {
    return BaseDSL.v(ViewFlipper.class, r);
  }

  public static BaseDSL.ViewClassResult viewSwitcher() {
    return BaseDSL.v(ViewSwitcher.class);
  }

  public static Void viewSwitcher(Anvil.Renderable r) {
    return BaseDSL.v(ViewSwitcher.class, r);
  }

  public static BaseDSL.ViewClassResult zoomButton() {
    return BaseDSL.v(ZoomButton.class);
  }

  public static Void zoomButton(Anvil.Renderable r) {
    return BaseDSL.v(ZoomButton.class, r);
  }

  public static BaseDSL.ViewClassResult zoomControls() {
    return BaseDSL.v(ZoomControls.class);
  }

  public static Void zoomControls(Anvil.Renderable r) {
    return BaseDSL.v(ZoomControls.class, r);
  }

  public static Void accessibilityDelegate(View.AccessibilityDelegate arg) {
    return BaseDSL.attr("accessibilityDelegate", arg);
  }

  public static Void accessibilityLiveRegion(int arg) {
    return BaseDSL.attr("accessibilityLiveRegion", arg);
  }

  public static Void activated(boolean arg) {
    return BaseDSL.attr("activated", arg);
  }

  public static Void activity(Activity arg) {
    return BaseDSL.attr("activity", arg);
  }

  public static Void adapter(Adapter arg) {
    return BaseDSL.attr("adapter", arg);
  }

  public static Void adapter(ExpandableListAdapter arg) {
    return BaseDSL.attr("adapter", arg);
  }

  public static Void addStatesFromChildren(boolean arg) {
    return BaseDSL.attr("addStatesFromChildren", arg);
  }

  public static Void adjustViewBounds(boolean arg) {
    return BaseDSL.attr("adjustViewBounds", arg);
  }

  public static Void alignmentMode(int arg) {
    return BaseDSL.attr("alignmentMode", arg);
  }

  public static Void allCaps(boolean arg) {
    return BaseDSL.attr("allCaps", arg);
  }

  public static Void alpha(float arg) {
    return BaseDSL.attr("alpha", arg);
  }

  public static Void alwaysDrawnWithCacheEnabled(boolean arg) {
    return BaseDSL.attr("alwaysDrawnWithCacheEnabled", arg);
  }

  public static Void anchorView(View arg) {
    return BaseDSL.attr("anchorView", arg);
  }

  public static Void animateFirstView(boolean arg) {
    return BaseDSL.attr("animateFirstView", arg);
  }

  public static Void animation(Animation arg) {
    return BaseDSL.attr("animation", arg);
  }

  public static Void animationCacheEnabled(boolean arg) {
    return BaseDSL.attr("animationCacheEnabled", arg);
  }

  public static Void animationDuration(int arg) {
    return BaseDSL.attr("animationDuration", arg);
  }

  public static Void autoLinkMask(int arg) {
    return BaseDSL.attr("autoLinkMask", arg);
  }

  public static Void autoStart(boolean arg) {
    return BaseDSL.attr("autoStart", arg);
  }

  public static Void background(Drawable arg) {
    return BaseDSL.attr("background", arg);
  }

  public static Void backgroundColor(int arg) {
    return BaseDSL.attr("backgroundColor", arg);
  }

  public static Void backgroundResource(int arg) {
    return BaseDSL.attr("backgroundResource", arg);
  }

  public static Void backgroundTintList(@Nullable ColorStateList arg) {
    return BaseDSL.attr("backgroundTintList", arg);
  }

  public static Void backgroundTintMode(PorterDuff.Mode arg) {
    return BaseDSL.attr("backgroundTintMode", arg);
  }

  public static Void base(long arg) {
    return BaseDSL.attr("base", arg);
  }

  public static Void baseline(int arg) {
    return BaseDSL.attr("baseline", arg);
  }

  public static Void baselineAlignBottom(boolean arg) {
    return BaseDSL.attr("baselineAlignBottom", arg);
  }

  public static Void baselineAligned(boolean arg) {
    return BaseDSL.attr("baselineAligned", arg);
  }

  public static Void baselineAlignedChildIndex(int arg) {
    return BaseDSL.attr("baselineAlignedChildIndex", arg);
  }

  public static Void bottom(int arg) {
    return BaseDSL.attr("bottom", arg);
  }

  public static Void buttonDrawable(@Nullable Drawable arg) {
    return BaseDSL.attr("buttonDrawable", arg);
  }

  public static Void buttonDrawable(int arg) {
    return BaseDSL.attr("buttonDrawable", arg);
  }

  public static Void buttonTintList(@Nullable ColorStateList arg) {
    return BaseDSL.attr("buttonTintList", arg);
  }

  public static Void buttonTintMode(PorterDuff.Mode arg) {
    return BaseDSL.attr("buttonTintMode", arg);
  }

  public static Void cacheColorHint(int arg) {
    return BaseDSL.attr("cacheColorHint", arg);
  }

  public static Void calendarViewShown(boolean arg) {
    return BaseDSL.attr("calendarViewShown", arg);
  }

  public static Void callback(TvView.TvInputCallback arg) {
    return BaseDSL.attr("callback", arg);
  }

  public static Void callbackDuringFling(boolean arg) {
    return BaseDSL.attr("callbackDuringFling", arg);
  }

  public static Void cameraDistance(float arg) {
    return BaseDSL.attr("cameraDistance", arg);
  }

  public static Void captionEnabled(boolean arg) {
    return BaseDSL.attr("captionEnabled", arg);
  }

  public static Void checkMarkDrawable(@Nullable Drawable arg) {
    return BaseDSL.attr("checkMarkDrawable", arg);
  }

  public static Void checkMarkDrawable(int arg) {
    return BaseDSL.attr("checkMarkDrawable", arg);
  }

  public static Void checkMarkTintList(@Nullable ColorStateList arg) {
    return BaseDSL.attr("checkMarkTintList", arg);
  }

  public static Void checkMarkTintMode(PorterDuff.Mode arg) {
    return BaseDSL.attr("checkMarkTintMode", arg);
  }

  public static Void checked(boolean arg) {
    return BaseDSL.attr("checked", arg);
  }

  public static Void childDivider(Drawable arg) {
    return BaseDSL.attr("childDivider", arg);
  }

  public static Void childIndicator(Drawable arg) {
    return BaseDSL.attr("childIndicator", arg);
  }

  public static Void choiceMode(int arg) {
    return BaseDSL.attr("choiceMode", arg);
  }

  public static Void clickable(boolean arg) {
    return BaseDSL.attr("clickable", arg);
  }

  public static Void clipBounds(Rect arg) {
    return BaseDSL.attr("clipBounds", arg);
  }

  public static Void clipChildren(boolean arg) {
    return BaseDSL.attr("clipChildren", arg);
  }

  public static Void clipToOutline(boolean arg) {
    return BaseDSL.attr("clipToOutline", arg);
  }

  public static Void clipToPadding(boolean arg) {
    return BaseDSL.attr("clipToPadding", arg);
  }

  public static Void colorFilter(ColorFilter arg) {
    return BaseDSL.attr("colorFilter", arg);
  }

  public static Void colorFilter(int arg) {
    return BaseDSL.attr("colorFilter", arg);
  }

  public static Void columnCount(int arg) {
    return BaseDSL.attr("columnCount", arg);
  }

  public static Void columnOrderPreserved(boolean arg) {
    return BaseDSL.attr("columnOrderPreserved", arg);
  }

  public static Void columnWidth(int arg) {
    return BaseDSL.attr("columnWidth", arg);
  }

  public static Void completionHint(CharSequence arg) {
    return BaseDSL.attr("completionHint", arg);
  }

  public static Void compoundDrawablePadding(int arg) {
    return BaseDSL.attr("compoundDrawablePadding", arg);
  }

  public static Void contentDescription(CharSequence arg) {
    return BaseDSL.attr("contentDescription", arg);
  }

  public static Void cropToPadding(boolean arg) {
    return BaseDSL.attr("cropToPadding", arg);
  }

  public static Void currentHour(@NonNull Integer arg) {
    return BaseDSL.attr("currentHour", arg);
  }

  public static Void currentMinute(@NonNull Integer arg) {
    return BaseDSL.attr("currentMinute", arg);
  }

  public static Void currentTab(int arg) {
    return BaseDSL.attr("currentTab", arg);
  }

  public static Void currentTabByTag(String arg) {
    return BaseDSL.attr("currentTabByTag", arg);
  }

  public static Void currentText(CharSequence arg) {
    return BaseDSL.attr("currentText", arg);
  }

  public static Void cursorVisible(boolean arg) {
    return BaseDSL.attr("cursorVisible", arg);
  }

  public static Void customSelectionActionModeCallback(ActionMode.Callback arg) {
    return BaseDSL.attr("customSelectionActionModeCallback", arg);
  }

  public static Void date(long arg) {
    return BaseDSL.attr("date", arg);
  }

  public static Void dateTextAppearance(int arg) {
    return BaseDSL.attr("dateTextAppearance", arg);
  }

  public static Void debugFlags(int arg) {
    return BaseDSL.attr("debugFlags", arg);
  }

  public static Void descendantFocusability(int arg) {
    return BaseDSL.attr("descendantFocusability", arg);
  }

  public static Void digitsWatcher(TextWatcher arg) {
    return BaseDSL.attr("digitsWatcher", arg);
  }

  public static Void displayedChild(int arg) {
    return BaseDSL.attr("displayedChild", arg);
  }

  public static Void displayedValues(String[] arg) {
    return BaseDSL.attr("displayedValues", arg);
  }

  public static Void divider(@Nullable Drawable arg) {
    return BaseDSL.attr("divider", arg);
  }

  public static Void dividerDrawable(Drawable arg) {
    return BaseDSL.attr("dividerDrawable", arg);
  }

  public static Void dividerDrawable(int arg) {
    return BaseDSL.attr("dividerDrawable", arg);
  }

  public static Void dividerHeight(int arg) {
    return BaseDSL.attr("dividerHeight", arg);
  }

  public static Void dividerPadding(int arg) {
    return BaseDSL.attr("dividerPadding", arg);
  }

  public static Void downloadListener(DownloadListener arg) {
    return BaseDSL.attr("downloadListener", arg);
  }

  public static Void drawSelectorOnTop(boolean arg) {
    return BaseDSL.attr("drawSelectorOnTop", arg);
  }

  public static Void drawingCacheBackgroundColor(int arg) {
    return BaseDSL.attr("drawingCacheBackgroundColor", arg);
  }

  public static Void drawingCacheEnabled(boolean arg) {
    return BaseDSL.attr("drawingCacheEnabled", arg);
  }

  public static Void drawingCacheQuality(int arg) {
    return BaseDSL.attr("drawingCacheQuality", arg);
  }

  public static Void dropDownAnchor(int arg) {
    return BaseDSL.attr("dropDownAnchor", arg);
  }

  public static Void dropDownBackgroundDrawable(Drawable arg) {
    return BaseDSL.attr("dropDownBackgroundDrawable", arg);
  }

  public static Void dropDownBackgroundResource(int arg) {
    return BaseDSL.attr("dropDownBackgroundResource", arg);
  }

  public static Void dropDownHeight(int arg) {
    return BaseDSL.attr("dropDownHeight", arg);
  }

  public static Void dropDownHorizontalOffset(int arg) {
    return BaseDSL.attr("dropDownHorizontalOffset", arg);
  }

  public static Void dropDownVerticalOffset(int arg) {
    return BaseDSL.attr("dropDownVerticalOffset", arg);
  }

  public static Void dropDownWidth(int arg) {
    return BaseDSL.attr("dropDownWidth", arg);
  }

  public static Void duplicateParentStateEnabled(boolean arg) {
    return BaseDSL.attr("duplicateParentStateEnabled", arg);
  }

  public static Void eGLConfigChooser(GLSurfaceView.EGLConfigChooser arg) {
    return BaseDSL.attr("eGLConfigChooser", arg);
  }

  public static Void eGLConfigChooser(boolean arg) {
    return BaseDSL.attr("eGLConfigChooser", arg);
  }

  public static Void eGLContextClientVersion(int arg) {
    return BaseDSL.attr("eGLContextClientVersion", arg);
  }

  public static Void eGLContextFactory(GLSurfaceView.EGLContextFactory arg) {
    return BaseDSL.attr("eGLContextFactory", arg);
  }

  public static Void eGLWindowSurfaceFactory(GLSurfaceView.EGLWindowSurfaceFactory arg) {
    return BaseDSL.attr("eGLWindowSurfaceFactory", arg);
  }

  public static Void editableFactory(Editable.Factory arg) {
    return BaseDSL.attr("editableFactory", arg);
  }

  public static Void elegantTextHeight(boolean arg) {
    return BaseDSL.attr("elegantTextHeight", arg);
  }

  public static Void elevation(float arg) {
    return BaseDSL.attr("elevation", arg);
  }

  public static Void ellipsize(TextUtils.TruncateAt arg) {
    return BaseDSL.attr("ellipsize", arg);
  }

  public static Void emptyView(View arg) {
    return BaseDSL.attr("emptyView", arg);
  }

  public static Void ems(int arg) {
    return BaseDSL.attr("ems", arg);
  }

  public static Void enabled(boolean arg) {
    return BaseDSL.attr("enabled", arg);
  }

  public static Void error(CharSequence arg) {
    return BaseDSL.attr("error", arg);
  }

  public static Void eventsInterceptionEnabled(boolean arg) {
    return BaseDSL.attr("eventsInterceptionEnabled", arg);
  }

  public static Void excludeMimes(String[] arg) {
    return BaseDSL.attr("excludeMimes", arg);
  }

  public static Void extendedSettingsClickListener(View.OnClickListener arg) {
    return BaseDSL.attr("extendedSettingsClickListener", arg);
  }

  public static Void extractedText(ExtractedText arg) {
    return BaseDSL.attr("extractedText", arg);
  }

  public static Void factory(ViewSwitcher.ViewFactory arg) {
    return BaseDSL.attr("factory", arg);
  }

  public static Void fadeEnabled(boolean arg) {
    return BaseDSL.attr("fadeEnabled", arg);
  }

  public static Void fadeOffset(long arg) {
    return BaseDSL.attr("fadeOffset", arg);
  }

  public static Void fadingEdgeLength(int arg) {
    return BaseDSL.attr("fadingEdgeLength", arg);
  }

  public static Void fastScrollAlwaysVisible(boolean arg) {
    return BaseDSL.attr("fastScrollAlwaysVisible", arg);
  }

  public static Void fastScrollEnabled(boolean arg) {
    return BaseDSL.attr("fastScrollEnabled", arg);
  }

  public static Void fastScrollStyle(int arg) {
    return BaseDSL.attr("fastScrollStyle", arg);
  }

  public static Void fillViewport(boolean arg) {
    return BaseDSL.attr("fillViewport", arg);
  }

  public static Void filterText(String arg) {
    return BaseDSL.attr("filterText", arg);
  }

  public static Void filterTouchesWhenObscured(boolean arg) {
    return BaseDSL.attr("filterTouchesWhenObscured", arg);
  }

  public static Void filterWatcher(TextWatcher arg) {
    return BaseDSL.attr("filterWatcher", arg);
  }

  public static Void filters(InputFilter[] arg) {
    return BaseDSL.attr("filters", arg);
  }

  public static Void findListener(WebView.FindListener arg) {
    return BaseDSL.attr("findListener", arg);
  }

  public static Void firstDayOfWeek(int arg) {
    return BaseDSL.attr("firstDayOfWeek", arg);
  }

  public static Void fitsSystemWindows(boolean arg) {
    return BaseDSL.attr("fitsSystemWindows", arg);
  }

  public static Void flipInterval(int arg) {
    return BaseDSL.attr("flipInterval", arg);
  }

  public static Void focusable(boolean arg) {
    return BaseDSL.attr("focusable", arg);
  }

  public static Void focusableInTouchMode(boolean arg) {
    return BaseDSL.attr("focusableInTouchMode", arg);
  }

  public static Void focusedMonthDateColor(int arg) {
    return BaseDSL.attr("focusedMonthDateColor", arg);
  }

  public static Void fontFeatureSettings(@Nullable String arg) {
    return BaseDSL.attr("fontFeatureSettings", arg);
  }

  public static Void footerDividersEnabled(boolean arg) {
    return BaseDSL.attr("footerDividersEnabled", arg);
  }

  public static Void foreground(Drawable arg) {
    return BaseDSL.attr("foreground", arg);
  }

  public static Void foregroundGravity(int arg) {
    return BaseDSL.attr("foregroundGravity", arg);
  }

  public static Void foregroundTintList(ColorStateList arg) {
    return BaseDSL.attr("foregroundTintList", arg);
  }

  public static Void foregroundTintMode(PorterDuff.Mode arg) {
    return BaseDSL.attr("foregroundTintMode", arg);
  }

  public static Void format(String arg) {
    return BaseDSL.attr("format", arg);
  }

  public static Void format12Hour(CharSequence arg) {
    return BaseDSL.attr("format12Hour", arg);
  }

  public static Void format24Hour(CharSequence arg) {
    return BaseDSL.attr("format24Hour", arg);
  }

  public static Void formatter(NumberPicker.Formatter arg) {
    return BaseDSL.attr("formatter", arg);
  }

  public static Void freezesText(boolean arg) {
    return BaseDSL.attr("freezesText", arg);
  }

  public static Void friction(float arg) {
    return BaseDSL.attr("friction", arg);
  }

  public static Void gLWrapper(GLSurfaceView.GLWrapper arg) {
    return BaseDSL.attr("gLWrapper", arg);
  }

  public static Void gesture(Gesture arg) {
    return BaseDSL.attr("gesture", arg);
  }

  public static Void gestureColor(int arg) {
    return BaseDSL.attr("gestureColor", arg);
  }

  public static Void gestureStrokeAngleThreshold(float arg) {
    return BaseDSL.attr("gestureStrokeAngleThreshold", arg);
  }

  public static Void gestureStrokeLengthThreshold(float arg) {
    return BaseDSL.attr("gestureStrokeLengthThreshold", arg);
  }

  public static Void gestureStrokeSquarenessTreshold(float arg) {
    return BaseDSL.attr("gestureStrokeSquarenessTreshold", arg);
  }

  public static Void gestureStrokeType(int arg) {
    return BaseDSL.attr("gestureStrokeType", arg);
  }

  public static Void gestureStrokeWidth(float arg) {
    return BaseDSL.attr("gestureStrokeWidth", arg);
  }

  public static Void gestureVisible(boolean arg) {
    return BaseDSL.attr("gestureVisible", arg);
  }

  public static Void gravity(int arg) {
    return BaseDSL.attr("gravity", arg);
  }

  public static Void groupIndicator(Drawable arg) {
    return BaseDSL.attr("groupIndicator", arg);
  }

  public static Void hapticFeedbackEnabled(boolean arg) {
    return BaseDSL.attr("hapticFeedbackEnabled", arg);
  }

  public static Void hasTransientState(boolean arg) {
    return BaseDSL.attr("hasTransientState", arg);
  }

  public static Void headerDividersEnabled(boolean arg) {
    return BaseDSL.attr("headerDividersEnabled", arg);
  }

  public static Void height(int arg) {
    return BaseDSL.attr("height", arg);
  }

  public static Void highlightColor(int arg) {
    return BaseDSL.attr("highlightColor", arg);
  }

  public static Void hint(int arg) {
    return BaseDSL.attr("hint", arg);
  }

  public static Void hint(CharSequence arg) {
    return BaseDSL.attr("hint", arg);
  }

  public static Void hintTextColor(ColorStateList arg) {
    return BaseDSL.attr("hintTextColor", arg);
  }

  public static Void hintTextColor(int arg) {
    return BaseDSL.attr("hintTextColor", arg);
  }

  public static Void horizontalFadingEdgeEnabled(boolean arg) {
    return BaseDSL.attr("horizontalFadingEdgeEnabled", arg);
  }

  public static Void horizontalGravity(int arg) {
    return BaseDSL.attr("horizontalGravity", arg);
  }

  public static Void horizontalScrollBarEnabled(boolean arg) {
    return BaseDSL.attr("horizontalScrollBarEnabled", arg);
  }

  public static Void horizontalScrollbarOverlay(boolean arg) {
    return BaseDSL.attr("horizontalScrollbarOverlay", arg);
  }

  public static Void horizontalSpacing(int arg) {
    return BaseDSL.attr("horizontalSpacing", arg);
  }

  public static Void horizontallyScrolling(boolean arg) {
    return BaseDSL.attr("horizontallyScrolling", arg);
  }

  public static Void hovered(boolean arg) {
    return BaseDSL.attr("hovered", arg);
  }

  public static Void iconified(boolean arg) {
    return BaseDSL.attr("iconified", arg);
  }

  public static Void iconifiedByDefault(boolean arg) {
    return BaseDSL.attr("iconifiedByDefault", arg);
  }

  public static Void id(int arg) {
    return BaseDSL.attr("id", arg);
  }

  public static Void ignoreGravity(int arg) {
    return BaseDSL.attr("ignoreGravity", arg);
  }

  public static Void imageAlpha(int arg) {
    return BaseDSL.attr("imageAlpha", arg);
  }

  public static Void imageBitmap(Bitmap arg) {
    return BaseDSL.attr("imageBitmap", arg);
  }

  public static Void imageDrawable(Drawable arg) {
    return BaseDSL.attr("imageDrawable", arg);
  }

  public static Void imageLevel(int arg) {
    return BaseDSL.attr("imageLevel", arg);
  }

  public static Void imageMatrix(Matrix arg) {
    return BaseDSL.attr("imageMatrix", arg);
  }

  public static Void imageResource(int arg) {
    return BaseDSL.attr("imageResource", arg);
  }

  public static Void imageTintList(@Nullable ColorStateList arg) {
    return BaseDSL.attr("imageTintList", arg);
  }

  public static Void imageTintMode(PorterDuff.Mode arg) {
    return BaseDSL.attr("imageTintMode", arg);
  }

  public static Void imageURI(Uri arg) {
    return BaseDSL.attr("imageURI", arg);
  }

  public static Void imeOptions(int arg) {
    return BaseDSL.attr("imeOptions", arg);
  }

  public static Void importantForAccessibility(int arg) {
    return BaseDSL.attr("importantForAccessibility", arg);
  }

  public static Void inAnimation(ObjectAnimator arg) {
    return BaseDSL.attr("inAnimation", arg);
  }

  public static Void inAnimation(Animation arg) {
    return BaseDSL.attr("inAnimation", arg);
  }

  public static Void includeFontPadding(boolean arg) {
    return BaseDSL.attr("includeFontPadding", arg);
  }

  public static Void indeterminate(boolean arg) {
    return BaseDSL.attr("indeterminate", arg);
  }

  public static Void indeterminateDrawable(Drawable arg) {
    return BaseDSL.attr("indeterminateDrawable", arg);
  }

  public static Void indeterminateDrawableTiled(Drawable arg) {
    return BaseDSL.attr("indeterminateDrawableTiled", arg);
  }

  public static Void indeterminateTintList(@Nullable ColorStateList arg) {
    return BaseDSL.attr("indeterminateTintList", arg);
  }

  public static Void indeterminateTintMode(PorterDuff.Mode arg) {
    return BaseDSL.attr("indeterminateTintMode", arg);
  }

  public static Void inflatedId(int arg) {
    return BaseDSL.attr("inflatedId", arg);
  }

  public static Void initialScale(int arg) {
    return BaseDSL.attr("initialScale", arg);
  }

  public static Void inputExtras(int arg) {
    return BaseDSL.attr("inputExtras", arg);
  }

  public static Void inputType(int arg) {
    return BaseDSL.attr("inputType", arg);
  }

  public static Void interpolator(Interpolator arg) {
    return BaseDSL.attr("interpolator", arg);
  }

  public static Void is24HourView(@NonNull Boolean arg) {
    return BaseDSL.attr("is24HourView", arg);
  }

  public static Void isIndicator(boolean arg) {
    return BaseDSL.attr("isIndicator", arg);
  }

  public static Void isZoomInEnabled(boolean arg) {
    return BaseDSL.attr("isZoomInEnabled", arg);
  }

  public static Void isZoomOutEnabled(boolean arg) {
    return BaseDSL.attr("isZoomOutEnabled", arg);
  }

  public static Void itemsCanFocus(boolean arg) {
    return BaseDSL.attr("itemsCanFocus", arg);
  }

  public static Void keepScreenOn(boolean arg) {
    return BaseDSL.attr("keepScreenOn", arg);
  }

  public static Void keyListener(KeyListener arg) {
    return BaseDSL.attr("keyListener", arg);
  }

  public static Void keyProgressIncrement(int arg) {
    return BaseDSL.attr("keyProgressIncrement", arg);
  }

  public static Void keyboard(Keyboard arg) {
    return BaseDSL.attr("keyboard", arg);
  }

  public static Void labelFor(int arg) {
    return BaseDSL.attr("labelFor", arg);
  }

  public static Void layerPaint(@Nullable Paint arg) {
    return BaseDSL.attr("layerPaint", arg);
  }

  public static Void layoutAnimation(LayoutAnimationController arg) {
    return BaseDSL.attr("layoutAnimation", arg);
  }

  public static Void layoutAnimationListener(Animation.AnimationListener arg) {
    return BaseDSL.attr("layoutAnimationListener", arg);
  }

  public static Void layoutDirection(int arg) {
    return BaseDSL.attr("layoutDirection", arg);
  }

  public static Void layoutInflater(LayoutInflater arg) {
    return BaseDSL.attr("layoutInflater", arg);
  }

  public static Void layoutMode(int arg) {
    return BaseDSL.attr("layoutMode", arg);
  }

  public static Void layoutParams(ViewGroup.LayoutParams arg) {
    return BaseDSL.attr("layoutParams", arg);
  }

  public static Void layoutResource(int arg) {
    return BaseDSL.attr("layoutResource", arg);
  }

  public static Void layoutTransition(LayoutTransition arg) {
    return BaseDSL.attr("layoutTransition", arg);
  }

  public static Void left(int arg) {
    return BaseDSL.attr("left", arg);
  }

  public static Void leftStripDrawable(@Nullable Drawable arg) {
    return BaseDSL.attr("leftStripDrawable", arg);
  }

  public static Void leftStripDrawable(int arg) {
    return BaseDSL.attr("leftStripDrawable", arg);
  }

  public static Void letterSpacing(float arg) {
    return BaseDSL.attr("letterSpacing", arg);
  }

  public static Void lettersWatcher(TextWatcher arg) {
    return BaseDSL.attr("lettersWatcher", arg);
  }

  public static Void lines(int arg) {
    return BaseDSL.attr("lines", arg);
  }

  public static Void linkTextColor(ColorStateList arg) {
    return BaseDSL.attr("linkTextColor", arg);
  }

  public static Void linkTextColor(int arg) {
    return BaseDSL.attr("linkTextColor", arg);
  }

  public static Void linksClickable(boolean arg) {
    return BaseDSL.attr("linksClickable", arg);
  }

  public static Void listSelection(int arg) {
    return BaseDSL.attr("listSelection", arg);
  }

  public static Void logo(Drawable arg) {
    return BaseDSL.attr("logo", arg);
  }

  public static Void logo(int arg) {
    return BaseDSL.attr("logo", arg);
  }

  public static Void logoDescription(int arg) {
    return BaseDSL.attr("logoDescription", arg);
  }

  public static Void logoDescription(CharSequence arg) {
    return BaseDSL.attr("logoDescription", arg);
  }

  public static Void longClickable(boolean arg) {
    return BaseDSL.attr("longClickable", arg);
  }

  public static Void marqueeRepeatLimit(int arg) {
    return BaseDSL.attr("marqueeRepeatLimit", arg);
  }

  public static Void max(int arg) {
    return BaseDSL.attr("max", arg);
  }

  public static Void maxDate(long arg) {
    return BaseDSL.attr("maxDate", arg);
  }

  public static Void maxEms(int arg) {
    return BaseDSL.attr("maxEms", arg);
  }

  public static Void maxHeight(int arg) {
    return BaseDSL.attr("maxHeight", arg);
  }

  public static Void maxLines(int arg) {
    return BaseDSL.attr("maxLines", arg);
  }

  public static Void maxValue(int arg) {
    return BaseDSL.attr("maxValue", arg);
  }

  public static Void maxVisible(int arg) {
    return BaseDSL.attr("maxVisible", arg);
  }

  public static Void maxWidth(int arg) {
    return BaseDSL.attr("maxWidth", arg);
  }

  public static Void measureAllChildren(boolean arg) {
    return BaseDSL.attr("measureAllChildren", arg);
  }

  public static Void measureWithLargestChildEnabled(boolean arg) {
    return BaseDSL.attr("measureWithLargestChildEnabled", arg);
  }

  public static Void mediaController(MediaController arg) {
    return BaseDSL.attr("mediaController", arg);
  }

  public static Void mediaPlayer(MediaController.MediaPlayerControl arg) {
    return BaseDSL.attr("mediaPlayer", arg);
  }

  public static Void minDate(long arg) {
    return BaseDSL.attr("minDate", arg);
  }

  public static Void minEms(int arg) {
    return BaseDSL.attr("minEms", arg);
  }

  public static Void minHeight(int arg) {
    return BaseDSL.attr("minHeight", arg);
  }

  public static Void minLines(int arg) {
    return BaseDSL.attr("minLines", arg);
  }

  public static Void minValue(int arg) {
    return BaseDSL.attr("minValue", arg);
  }

  public static Void minWidth(int arg) {
    return BaseDSL.attr("minWidth", arg);
  }

  public static Void minimumHeight(int arg) {
    return BaseDSL.attr("minimumHeight", arg);
  }

  public static Void minimumWidth(int arg) {
    return BaseDSL.attr("minimumWidth", arg);
  }

  public static Void mode(int arg) {
    return BaseDSL.attr("mode", arg);
  }

  public static Void motionEventSplittingEnabled(boolean arg) {
    return BaseDSL.attr("motionEventSplittingEnabled", arg);
  }

  public static Void movementMethod(MovementMethod arg) {
    return BaseDSL.attr("movementMethod", arg);
  }

  public static Void multiChoiceModeListener(AbsListView.MultiChoiceModeListener arg) {
    return BaseDSL.attr("multiChoiceModeListener", arg);
  }

  public static Void navigationContentDescription(int arg) {
    return BaseDSL.attr("navigationContentDescription", arg);
  }

  public static Void navigationContentDescription(@Nullable CharSequence arg) {
    return BaseDSL.attr("navigationContentDescription", arg);
  }

  public static Void navigationIcon(@Nullable Drawable arg) {
    return BaseDSL.attr("navigationIcon", arg);
  }

  public static Void navigationIcon(int arg) {
    return BaseDSL.attr("navigationIcon", arg);
  }

  public static Void navigationOnClickListener(View.OnClickListener arg) {
    return BaseDSL.attr("navigationOnClickListener", arg);
  }

  public static Void nestedScrollingEnabled(boolean arg) {
    return BaseDSL.attr("nestedScrollingEnabled", arg);
  }

  public static Void networkAvailable(boolean arg) {
    return BaseDSL.attr("networkAvailable", arg);
  }

  public static Void nextFocusDownId(int arg) {
    return BaseDSL.attr("nextFocusDownId", arg);
  }

  public static Void nextFocusForwardId(int arg) {
    return BaseDSL.attr("nextFocusForwardId", arg);
  }

  public static Void nextFocusLeftId(int arg) {
    return BaseDSL.attr("nextFocusLeftId", arg);
  }

  public static Void nextFocusRightId(int arg) {
    return BaseDSL.attr("nextFocusRightId", arg);
  }

  public static Void nextFocusUpId(int arg) {
    return BaseDSL.attr("nextFocusUpId", arg);
  }

  public static Void numColumns(int arg) {
    return BaseDSL.attr("numColumns", arg);
  }

  public static Void numStars(int arg) {
    return BaseDSL.attr("numStars", arg);
  }

  public static Void onApplyWindowInsets(View.OnApplyWindowInsetsListener arg) {
    return BaseDSL.attr("onApplyWindowInsets", arg);
  }

  public static Void onBreadCrumbClick(FragmentBreadCrumbs.OnBreadCrumbClickListener arg) {
    return BaseDSL.attr("onBreadCrumbClick", arg);
  }

  public static Void onCheckedChange(CompoundButton.OnCheckedChangeListener arg) {
    return BaseDSL.attr("onCheckedChange", arg);
  }

  public static Void onCheckedChange(RadioGroup.OnCheckedChangeListener arg) {
    return BaseDSL.attr("onCheckedChange", arg);
  }

  public static Void onChildClick(ExpandableListView.OnChildClickListener arg) {
    return BaseDSL.attr("onChildClick", arg);
  }

  public static Void onChronometerTick(Chronometer.OnChronometerTickListener arg) {
    return BaseDSL.attr("onChronometerTick", arg);
  }

  public static Void onClick(View.OnClickListener arg) {
    return BaseDSL.attr("onClick", arg);
  }

  public static Void onClose(SearchView.OnCloseListener arg) {
    return BaseDSL.attr("onClose", arg);
  }

  public static Void onCompletion(MediaPlayer.OnCompletionListener arg) {
    return BaseDSL.attr("onCompletion", arg);
  }

  public static Void onCreateContextMenu(View.OnCreateContextMenuListener arg) {
    return BaseDSL.attr("onCreateContextMenu", arg);
  }

  public static Void onDateChange(CalendarView.OnDateChangeListener arg) {
    return BaseDSL.attr("onDateChange", arg);
  }

  public static Void onDismiss(AutoCompleteTextView.OnDismissListener arg) {
    return BaseDSL.attr("onDismiss", arg);
  }

  public static Void onDrag(View.OnDragListener arg) {
    return BaseDSL.attr("onDrag", arg);
  }

  public static Void onDrawerClose(SlidingDrawer.OnDrawerCloseListener arg) {
    return BaseDSL.attr("onDrawerClose", arg);
  }

  public static Void onDrawerOpen(SlidingDrawer.OnDrawerOpenListener arg) {
    return BaseDSL.attr("onDrawerOpen", arg);
  }

  public static Void onDrawerScroll(SlidingDrawer.OnDrawerScrollListener arg) {
    return BaseDSL.attr("onDrawerScroll", arg);
  }

  public static Void onEditorAction(TextView.OnEditorActionListener arg) {
    return BaseDSL.attr("onEditorAction", arg);
  }

  public static Void onError(MediaPlayer.OnErrorListener arg) {
    return BaseDSL.attr("onError", arg);
  }

  public static Void onFocusChange(View.OnFocusChangeListener arg) {
    return BaseDSL.attr("onFocusChange", arg);
  }

  public static Void onGenericMotion(View.OnGenericMotionListener arg) {
    return BaseDSL.attr("onGenericMotion", arg);
  }

  public static Void onGroupClick(ExpandableListView.OnGroupClickListener arg) {
    return BaseDSL.attr("onGroupClick", arg);
  }

  public static Void onGroupCollapse(ExpandableListView.OnGroupCollapseListener arg) {
    return BaseDSL.attr("onGroupCollapse", arg);
  }

  public static Void onGroupExpand(ExpandableListView.OnGroupExpandListener arg) {
    return BaseDSL.attr("onGroupExpand", arg);
  }

  public static Void onHierarchyChange(ViewGroup.OnHierarchyChangeListener arg) {
    return BaseDSL.attr("onHierarchyChange", arg);
  }

  public static Void onHover(View.OnHoverListener arg) {
    return BaseDSL.attr("onHover", arg);
  }

  public static Void onInflate(ViewStub.OnInflateListener arg) {
    return BaseDSL.attr("onInflate", arg);
  }

  public static Void onInfo(MediaPlayer.OnInfoListener arg) {
    return BaseDSL.attr("onInfo", arg);
  }

  public static Void onItemClick(AdapterView.OnItemClickListener arg) {
    return BaseDSL.attr("onItemClick", arg);
  }

  public static Void onItemLongClick(AdapterView.OnItemLongClickListener arg) {
    return BaseDSL.attr("onItemLongClick", arg);
  }

  public static Void onItemSelected(AdapterView.OnItemSelectedListener arg) {
    return BaseDSL.attr("onItemSelected", arg);
  }

  public static Void onKey(View.OnKeyListener arg) {
    return BaseDSL.attr("onKey", arg);
  }

  public static Void onKeyboardAction(KeyboardView.OnKeyboardActionListener arg) {
    return BaseDSL.attr("onKeyboardAction", arg);
  }

  public static Void onLongClick(View.OnLongClickListener arg) {
    return BaseDSL.attr("onLongClick", arg);
  }

  public static Void onLongPressUpdateInterval(long arg) {
    return BaseDSL.attr("onLongPressUpdateInterval", arg);
  }

  public static Void onMenuItemClick(ActionMenuView.OnMenuItemClickListener arg) {
    return BaseDSL.attr("onMenuItemClick", arg);
  }

  public static Void onMenuItemClick(Toolbar.OnMenuItemClickListener arg) {
    return BaseDSL.attr("onMenuItemClick", arg);
  }

  public static Void onPrepared(MediaPlayer.OnPreparedListener arg) {
    return BaseDSL.attr("onPrepared", arg);
  }

  public static Void onQueryText(SearchView.OnQueryTextListener arg) {
    return BaseDSL.attr("onQueryText", arg);
  }

  public static Void onQueryTextFocusChange(View.OnFocusChangeListener arg) {
    return BaseDSL.attr("onQueryTextFocusChange", arg);
  }

  public static Void onRatingBarChange(RatingBar.OnRatingBarChangeListener arg) {
    return BaseDSL.attr("onRatingBarChange", arg);
  }

  public static Void onScroll(AbsListView.OnScrollListener arg) {
    return BaseDSL.attr("onScroll", arg);
  }

  public static Void onScroll(NumberPicker.OnScrollListener arg) {
    return BaseDSL.attr("onScroll", arg);
  }

  public static Void onSearchClick(View.OnClickListener arg) {
    return BaseDSL.attr("onSearchClick", arg);
  }

  public static Void onSeekBarChange(SeekBar.OnSeekBarChangeListener arg) {
    return BaseDSL.attr("onSeekBarChange", arg);
  }

  public static Void onSuggestion(SearchView.OnSuggestionListener arg) {
    return BaseDSL.attr("onSuggestion", arg);
  }

  public static Void onSystemUiVisibilityChange(View.OnSystemUiVisibilityChangeListener arg) {
    return BaseDSL.attr("onSystemUiVisibilityChange", arg);
  }

  public static Void onTabChanged(TabHost.OnTabChangeListener arg) {
    return BaseDSL.attr("onTabChanged", arg);
  }

  public static Void onTimeChanged(TimePicker.OnTimeChangedListener arg) {
    return BaseDSL.attr("onTimeChanged", arg);
  }

  public static Void onTouch(View.OnTouchListener arg) {
    return BaseDSL.attr("onTouch", arg);
  }

  public static Void onUnhandledInputEvent(TvView.OnUnhandledInputEventListener arg) {
    return BaseDSL.attr("onUnhandledInputEvent", arg);
  }

  public static Void onValueChanged(NumberPicker.OnValueChangeListener arg) {
    return BaseDSL.attr("onValueChanged", arg);
  }

  public static Void onZoomInClick(View.OnClickListener arg) {
    return BaseDSL.attr("onZoomInClick", arg);
  }

  public static Void onZoomOutClick(View.OnClickListener arg) {
    return BaseDSL.attr("onZoomOutClick", arg);
  }

  public static Void opaque(boolean arg) {
    return BaseDSL.attr("opaque", arg);
  }

  public static Void orientation(int arg) {
    return BaseDSL.attr("orientation", arg);
  }

  public static Void outAnimation(ObjectAnimator arg) {
    return BaseDSL.attr("outAnimation", arg);
  }

  public static Void outAnimation(Animation arg) {
    return BaseDSL.attr("outAnimation", arg);
  }

  public static Void outlineProvider(ViewOutlineProvider arg) {
    return BaseDSL.attr("outlineProvider", arg);
  }

  public static Void overScrollMode(int arg) {
    return BaseDSL.attr("overScrollMode", arg);
  }

  public static Void overlay(Drawable arg) {
    return BaseDSL.attr("overlay", arg);
  }

  public static Void overscrollFooter(Drawable arg) {
    return BaseDSL.attr("overscrollFooter", arg);
  }

  public static Void overscrollHeader(Drawable arg) {
    return BaseDSL.attr("overscrollHeader", arg);
  }

  public static Void paintFlags(int arg) {
    return BaseDSL.attr("paintFlags", arg);
  }

  public static Void persistentDrawingCache(int arg) {
    return BaseDSL.attr("persistentDrawingCache", arg);
  }

  public static Void pivotX(float arg) {
    return BaseDSL.attr("pivotX", arg);
  }

  public static Void pivotY(float arg) {
    return BaseDSL.attr("pivotY", arg);
  }

  public static Void popupBackgroundDrawable(Drawable arg) {
    return BaseDSL.attr("popupBackgroundDrawable", arg);
  }

  public static Void popupBackgroundResource(int arg) {
    return BaseDSL.attr("popupBackgroundResource", arg);
  }

  public static Void popupParent(View arg) {
    return BaseDSL.attr("popupParent", arg);
  }

  public static Void popupTheme(int arg) {
    return BaseDSL.attr("popupTheme", arg);
  }

  public static Void preserveEGLContextOnPause(boolean arg) {
    return BaseDSL.attr("preserveEGLContextOnPause", arg);
  }

  public static Void pressed(boolean arg) {
    return BaseDSL.attr("pressed", arg);
  }

  public static Void previewEnabled(boolean arg) {
    return BaseDSL.attr("previewEnabled", arg);
  }

  public static Void privateImeOptions(String arg) {
    return BaseDSL.attr("privateImeOptions", arg);
  }

  public static Void progress(int arg) {
    return BaseDSL.attr("progress", arg);
  }

  public static Void progressBackgroundTintList(@Nullable ColorStateList arg) {
    return BaseDSL.attr("progressBackgroundTintList", arg);
  }

  public static Void progressBackgroundTintMode(PorterDuff.Mode arg) {
    return BaseDSL.attr("progressBackgroundTintMode", arg);
  }

  public static Void progressDrawable(Drawable arg) {
    return BaseDSL.attr("progressDrawable", arg);
  }

  public static Void progressDrawableTiled(Drawable arg) {
    return BaseDSL.attr("progressDrawableTiled", arg);
  }

  public static Void progressTintList(@Nullable ColorStateList arg) {
    return BaseDSL.attr("progressTintList", arg);
  }

  public static Void progressTintMode(PorterDuff.Mode arg) {
    return BaseDSL.attr("progressTintMode", arg);
  }

  public static Void prompt(CharSequence arg) {
    return BaseDSL.attr("prompt", arg);
  }

  public static Void promptId(int arg) {
    return BaseDSL.attr("promptId", arg);
  }

  public static Void proximityCorrectionEnabled(boolean arg) {
    return BaseDSL.attr("proximityCorrectionEnabled", arg);
  }

  public static Void queryHint(@Nullable CharSequence arg) {
    return BaseDSL.attr("queryHint", arg);
  }

  public static Void queryRefinementEnabled(boolean arg) {
    return BaseDSL.attr("queryRefinementEnabled", arg);
  }

  public static Void rating(float arg) {
    return BaseDSL.attr("rating", arg);
  }

  public static Void rawInputType(int arg) {
    return BaseDSL.attr("rawInputType", arg);
  }

  public static Void recyclerListener(AbsListView.RecyclerListener arg) {
    return BaseDSL.attr("recyclerListener", arg);
  }

  public static Void remoteViewsAdapter(Intent arg) {
    return BaseDSL.attr("remoteViewsAdapter", arg);
  }

  public static Void renderMode(int arg) {
    return BaseDSL.attr("renderMode", arg);
  }

  public static Void renderer(GLSurfaceView.Renderer arg) {
    return BaseDSL.attr("renderer", arg);
  }

  public static Void right(int arg) {
    return BaseDSL.attr("right", arg);
  }

  public static Void rightStripDrawable(@Nullable Drawable arg) {
    return BaseDSL.attr("rightStripDrawable", arg);
  }

  public static Void rightStripDrawable(int arg) {
    return BaseDSL.attr("rightStripDrawable", arg);
  }

  public static Void rotation(float arg) {
    return BaseDSL.attr("rotation", arg);
  }

  public static Void rotationX(float arg) {
    return BaseDSL.attr("rotationX", arg);
  }

  public static Void rotationY(float arg) {
    return BaseDSL.attr("rotationY", arg);
  }

  public static Void routeTypes(int arg) {
    return BaseDSL.attr("routeTypes", arg);
  }

  public static Void rowCount(int arg) {
    return BaseDSL.attr("rowCount", arg);
  }

  public static Void rowOrderPreserved(boolean arg) {
    return BaseDSL.attr("rowOrderPreserved", arg);
  }

  public static Void saveEnabled(boolean arg) {
    return BaseDSL.attr("saveEnabled", arg);
  }

  public static Void saveFromParentEnabled(boolean arg) {
    return BaseDSL.attr("saveFromParentEnabled", arg);
  }

  public static Void scaleType(ImageView.ScaleType arg) {
    return BaseDSL.attr("scaleType", arg);
  }

  public static Void scaleX(float arg) {
    return BaseDSL.attr("scaleX", arg);
  }

  public static Void scaleY(float arg) {
    return BaseDSL.attr("scaleY", arg);
  }

  public static Void scrollBarDefaultDelayBeforeFade(int arg) {
    return BaseDSL.attr("scrollBarDefaultDelayBeforeFade", arg);
  }

  public static Void scrollBarFadeDuration(int arg) {
    return BaseDSL.attr("scrollBarFadeDuration", arg);
  }

  public static Void scrollBarSize(int arg) {
    return BaseDSL.attr("scrollBarSize", arg);
  }

  public static Void scrollBarStyle(int arg) {
    return BaseDSL.attr("scrollBarStyle", arg);
  }

  public static Void scrollContainer(boolean arg) {
    return BaseDSL.attr("scrollContainer", arg);
  }

  public static Void scrollX(int arg) {
    return BaseDSL.attr("scrollX", arg);
  }

  public static Void scrollY(int arg) {
    return BaseDSL.attr("scrollY", arg);
  }

  public static Void scrollbarFadingEnabled(boolean arg) {
    return BaseDSL.attr("scrollbarFadingEnabled", arg);
  }

  public static Void scroller(Scroller arg) {
    return BaseDSL.attr("scroller", arg);
  }

  public static Void scrollingCacheEnabled(boolean arg) {
    return BaseDSL.attr("scrollingCacheEnabled", arg);
  }

  public static Void searchableInfo(SearchableInfo arg) {
    return BaseDSL.attr("searchableInfo", arg);
  }

  public static Void secondaryProgress(int arg) {
    return BaseDSL.attr("secondaryProgress", arg);
  }

  public static Void secondaryProgressTintList(@Nullable ColorStateList arg) {
    return BaseDSL.attr("secondaryProgressTintList", arg);
  }

  public static Void secondaryProgressTintMode(PorterDuff.Mode arg) {
    return BaseDSL.attr("secondaryProgressTintMode", arg);
  }

  public static Void secure(boolean arg) {
    return BaseDSL.attr("secure", arg);
  }

  public static Void selectAllOnFocus(boolean arg) {
    return BaseDSL.attr("selectAllOnFocus", arg);
  }

  public static Void selected(boolean arg) {
    return BaseDSL.attr("selected", arg);
  }

  public static Void selectedDateVerticalBar(Drawable arg) {
    return BaseDSL.attr("selectedDateVerticalBar", arg);
  }

  public static Void selectedDateVerticalBar(int arg) {
    return BaseDSL.attr("selectedDateVerticalBar", arg);
  }

  public static Void selectedGroup(int arg) {
    return BaseDSL.attr("selectedGroup", arg);
  }

  public static Void selectedWeekBackgroundColor(int arg) {
    return BaseDSL.attr("selectedWeekBackgroundColor", arg);
  }

  public static Void selection(int arg) {
    return BaseDSL.attr("selection", arg);
  }

  public static Void selector(Drawable arg) {
    return BaseDSL.attr("selector", arg);
  }

  public static Void selector(int arg) {
    return BaseDSL.attr("selector", arg);
  }

  public static Void shifted(boolean arg) {
    return BaseDSL.attr("shifted", arg);
  }

  public static Void showDividers(int arg) {
    return BaseDSL.attr("showDividers", arg);
  }

  public static Void showSoftInputOnFocus(boolean arg) {
    return BaseDSL.attr("showSoftInputOnFocus", arg);
  }

  public static Void showText(boolean arg) {
    return BaseDSL.attr("showText", arg);
  }

  public static Void showWeekNumber(boolean arg) {
    return BaseDSL.attr("showWeekNumber", arg);
  }

  public static Void shownWeekCount(int arg) {
    return BaseDSL.attr("shownWeekCount", arg);
  }

  public static Void shrinkAllColumns(boolean arg) {
    return BaseDSL.attr("shrinkAllColumns", arg);
  }

  public static Void singleLine(boolean arg) {
    return BaseDSL.attr("singleLine", arg);
  }

  public static Void smoothScrollbarEnabled(boolean arg) {
    return BaseDSL.attr("smoothScrollbarEnabled", arg);
  }

  public static Void smoothScrollingEnabled(boolean arg) {
    return BaseDSL.attr("smoothScrollingEnabled", arg);
  }

  public static Void soundEffectsEnabled(boolean arg) {
    return BaseDSL.attr("soundEffectsEnabled", arg);
  }

  public static Void spacing(int arg) {
    return BaseDSL.attr("spacing", arg);
  }

  public static Void spannableFactory(Spannable.Factory arg) {
    return BaseDSL.attr("spannableFactory", arg);
  }

  public static Void spinnersShown(boolean arg) {
    return BaseDSL.attr("spinnersShown", arg);
  }

  public static Void splitTrack(boolean arg) {
    return BaseDSL.attr("splitTrack", arg);
  }

  public static Void stackFromBottom(boolean arg) {
    return BaseDSL.attr("stackFromBottom", arg);
  }

  public static Void stateListAnimator(StateListAnimator arg) {
    return BaseDSL.attr("stateListAnimator", arg);
  }

  public static Void stepSize(float arg) {
    return BaseDSL.attr("stepSize", arg);
  }

  public static Void streamVolume(float arg) {
    return BaseDSL.attr("streamVolume", arg);
  }

  public static Void stretchAllColumns(boolean arg) {
    return BaseDSL.attr("stretchAllColumns", arg);
  }

  public static Void stretchMode(int arg) {
    return BaseDSL.attr("stretchMode", arg);
  }

  public static Void stripEnabled(boolean arg) {
    return BaseDSL.attr("stripEnabled", arg);
  }

  public static Void submitButtonEnabled(boolean arg) {
    return BaseDSL.attr("submitButtonEnabled", arg);
  }

  public static Void subtitle(int arg) {
    return BaseDSL.attr("subtitle", arg);
  }

  public static Void subtitle(CharSequence arg) {
    return BaseDSL.attr("subtitle", arg);
  }

  public static Void subtitleTextColor(int arg) {
    return BaseDSL.attr("subtitleTextColor", arg);
  }

  public static Void suggestionsAdapter(CursorAdapter arg) {
    return BaseDSL.attr("suggestionsAdapter", arg);
  }

  public static Void surfaceTexture(SurfaceTexture arg) {
    return BaseDSL.attr("surfaceTexture", arg);
  }

  public static Void surfaceTextureListener(TextureView.SurfaceTextureListener arg) {
    return BaseDSL.attr("surfaceTextureListener", arg);
  }

  public static Void switchMinWidth(int arg) {
    return BaseDSL.attr("switchMinWidth", arg);
  }

  public static Void switchPadding(int arg) {
    return BaseDSL.attr("switchPadding", arg);
  }

  public static Void switchTypeface(Typeface arg) {
    return BaseDSL.attr("switchTypeface", arg);
  }

  public static Void systemUiVisibility(int arg) {
    return BaseDSL.attr("systemUiVisibility", arg);
  }

  public static Void tag(Object arg) {
    return BaseDSL.attr("tag", arg);
  }

  public static Void text(int arg) {
    return BaseDSL.attr("text", arg);
  }

  public static Void text(CharSequence arg) {
    return BaseDSL.attr("text", arg);
  }

  public static Void textAlignment(int arg) {
    return BaseDSL.attr("textAlignment", arg);
  }

  public static Void textColor(ColorStateList arg) {
    return BaseDSL.attr("textColor", arg);
  }

  public static Void textColor(int arg) {
    return BaseDSL.attr("textColor", arg);
  }

  public static Void textDirection(int arg) {
    return BaseDSL.attr("textDirection", arg);
  }

  public static Void textFilterEnabled(boolean arg) {
    return BaseDSL.attr("textFilterEnabled", arg);
  }

  public static Void textIsSelectable(boolean arg) {
    return BaseDSL.attr("textIsSelectable", arg);
  }

  public static Void textKeepState(CharSequence arg) {
    return BaseDSL.attr("textKeepState", arg);
  }

  public static Void textLocale(@NonNull Locale arg) {
    return BaseDSL.attr("textLocale", arg);
  }

  public static Void textOff(CharSequence arg) {
    return BaseDSL.attr("textOff", arg);
  }

  public static Void textOn(CharSequence arg) {
    return BaseDSL.attr("textOn", arg);
  }

  public static Void textScaleX(float arg) {
    return BaseDSL.attr("textScaleX", arg);
  }

  public static Void threshold(int arg) {
    return BaseDSL.attr("threshold", arg);
  }

  public static Void thumb(Drawable arg) {
    return BaseDSL.attr("thumb", arg);
  }

  public static Void thumbDrawable(Drawable arg) {
    return BaseDSL.attr("thumbDrawable", arg);
  }

  public static Void thumbOffset(int arg) {
    return BaseDSL.attr("thumbOffset", arg);
  }

  public static Void thumbResource(int arg) {
    return BaseDSL.attr("thumbResource", arg);
  }

  public static Void thumbTextPadding(int arg) {
    return BaseDSL.attr("thumbTextPadding", arg);
  }

  public static Void thumbTintList(@Nullable ColorStateList arg) {
    return BaseDSL.attr("thumbTintList", arg);
  }

  public static Void thumbTintMode(PorterDuff.Mode arg) {
    return BaseDSL.attr("thumbTintMode", arg);
  }

  public static Void timeZone(String arg) {
    return BaseDSL.attr("timeZone", arg);
  }

  public static Void title(int arg) {
    return BaseDSL.attr("title", arg);
  }

  public static Void title(CharSequence arg) {
    return BaseDSL.attr("title", arg);
  }

  public static Void titleTextColor(int arg) {
    return BaseDSL.attr("titleTextColor", arg);
  }

  public static Void tokenizer(MultiAutoCompleteTextView.Tokenizer arg) {
    return BaseDSL.attr("tokenizer", arg);
  }

  public static Void top(int arg) {
    return BaseDSL.attr("top", arg);
  }

  public static Void touchDelegate(TouchDelegate arg) {
    return BaseDSL.attr("touchDelegate", arg);
  }

  public static Void touchscreenBlocksFocus(boolean arg) {
    return BaseDSL.attr("touchscreenBlocksFocus", arg);
  }

  public static Void trackDrawable(Drawable arg) {
    return BaseDSL.attr("trackDrawable", arg);
  }

  public static Void trackResource(int arg) {
    return BaseDSL.attr("trackResource", arg);
  }

  public static Void transcriptMode(int arg) {
    return BaseDSL.attr("transcriptMode", arg);
  }

  public static Void transform(Matrix arg) {
    return BaseDSL.attr("transform", arg);
  }

  public static Void transformationMethod(TransformationMethod arg) {
    return BaseDSL.attr("transformationMethod", arg);
  }

  public static Void transitionGroup(boolean arg) {
    return BaseDSL.attr("transitionGroup", arg);
  }

  public static Void transitionName(String arg) {
    return BaseDSL.attr("transitionName", arg);
  }

  public static Void translationX(float arg) {
    return BaseDSL.attr("translationX", arg);
  }

  public static Void translationY(float arg) {
    return BaseDSL.attr("translationY", arg);
  }

  public static Void translationZ(float arg) {
    return BaseDSL.attr("translationZ", arg);
  }

  public static Void typeface(@Nullable Typeface arg) {
    return BaseDSL.attr("typeface", arg);
  }

  public static Void uncertainGestureColor(int arg) {
    return BaseDSL.attr("uncertainGestureColor", arg);
  }

  public static Void unfocusedMonthDateColor(int arg) {
    return BaseDSL.attr("unfocusedMonthDateColor", arg);
  }

  public static Void unselectedAlpha(float arg) {
    return BaseDSL.attr("unselectedAlpha", arg);
  }

  public static Void up(LocalActivityManager arg) {
    return BaseDSL.attr("up", arg);
  }

  public static Void useDefaultMargins(boolean arg) {
    return BaseDSL.attr("useDefaultMargins", arg);
  }

  public static Void validator(AutoCompleteTextView.Validator arg) {
    return BaseDSL.attr("validator", arg);
  }

  public static Void value(int arg) {
    return BaseDSL.attr("value", arg);
  }

  public static Void velocityScale(float arg) {
    return BaseDSL.attr("velocityScale", arg);
  }

  public static Void verticalCorrection(int arg) {
    return BaseDSL.attr("verticalCorrection", arg);
  }

  public static Void verticalFadingEdgeEnabled(boolean arg) {
    return BaseDSL.attr("verticalFadingEdgeEnabled", arg);
  }

  public static Void verticalGravity(int arg) {
    return BaseDSL.attr("verticalGravity", arg);
  }

  public static Void verticalScrollBarEnabled(boolean arg) {
    return BaseDSL.attr("verticalScrollBarEnabled", arg);
  }

  public static Void verticalScrollbarOverlay(boolean arg) {
    return BaseDSL.attr("verticalScrollbarOverlay", arg);
  }

  public static Void verticalScrollbarPosition(int arg) {
    return BaseDSL.attr("verticalScrollbarPosition", arg);
  }

  public static Void verticalSpacing(int arg) {
    return BaseDSL.attr("verticalSpacing", arg);
  }

  public static Void videoPath(String arg) {
    return BaseDSL.attr("videoPath", arg);
  }

  public static Void videoURI(Uri arg) {
    return BaseDSL.attr("videoURI", arg);
  }

  public static Void visibility(int arg) {
    return BaseDSL.attr("visibility", arg);
  }

  public static Void webChromeClient(WebChromeClient arg) {
    return BaseDSL.attr("webChromeClient", arg);
  }

  public static Void webContentsDebuggingEnabled(boolean arg) {
    return BaseDSL.attr("webContentsDebuggingEnabled", arg);
  }

  public static Void webViewClient(WebViewClient arg) {
    return BaseDSL.attr("webViewClient", arg);
  }

  public static Void weekDayTextAppearance(int arg) {
    return BaseDSL.attr("weekDayTextAppearance", arg);
  }

  public static Void weekNumberColor(int arg) {
    return BaseDSL.attr("weekNumberColor", arg);
  }

  public static Void weekSeparatorLineColor(int arg) {
    return BaseDSL.attr("weekSeparatorLineColor", arg);
  }

  public static Void weightSum(float arg) {
    return BaseDSL.attr("weightSum", arg);
  }

  public static Void width(int arg) {
    return BaseDSL.attr("width", arg);
  }

  public static Void willNotCacheDrawing(boolean arg) {
    return BaseDSL.attr("willNotCacheDrawing", arg);
  }

  public static Void willNotDraw(boolean arg) {
    return BaseDSL.attr("willNotDraw", arg);
  }

  public static Void wrapSelectorWheel(boolean arg) {
    return BaseDSL.attr("wrapSelectorWheel", arg);
  }

  public static Void x(float arg) {
    return BaseDSL.attr("x", arg);
  }

  public static Void y(float arg) {
    return BaseDSL.attr("y", arg);
  }

  public static Void z(float arg) {
    return BaseDSL.attr("z", arg);
  }

  public static Void zOrderMediaOverlay(boolean arg) {
    return BaseDSL.attr("zOrderMediaOverlay", arg);
  }

  public static Void zOrderOnTop(boolean arg) {
    return BaseDSL.attr("zOrderOnTop", arg);
  }

  public static Void zoomSpeed(long arg) {
    return BaseDSL.attr("zoomSpeed", arg);
  }

  public boolean set(View v, String name, final Object arg, final Object old) {
    switch (name) {
      case "accessibilityDelegate":
        if (arg instanceof View.AccessibilityDelegate) {
          v.setAccessibilityDelegate((View.AccessibilityDelegate) arg);
          return true;
        }
        break;
      case "accessibilityLiveRegion":
        if (arg instanceof Integer) {
          v.setAccessibilityLiveRegion((int) arg);
          return true;
        }
        break;
      case "activated":
        if (arg instanceof Boolean) {
          v.setActivated((boolean) arg);
          return true;
        }
        break;
      case "activity":
        if (v instanceof FragmentBreadCrumbs && arg instanceof Activity) {
          ((FragmentBreadCrumbs) v).setActivity((Activity) arg);
          return true;
        }
        break;
      case "adapter":
        if (v instanceof AdapterView && arg instanceof Adapter) {
          ((AdapterView) v).setAdapter((Adapter) arg);
          return true;
        }
        if (v instanceof ExpandableListView && arg instanceof ExpandableListAdapter) {
          ((ExpandableListView) v).setAdapter((ExpandableListAdapter) arg);
          return true;
        }
        break;
      case "addStatesFromChildren":
        if (v instanceof ViewGroup && arg instanceof Boolean) {
          ((ViewGroup) v).setAddStatesFromChildren((boolean) arg);
          return true;
        }
        break;
      case "adjustViewBounds":
        if (v instanceof ImageView && arg instanceof Boolean) {
          ((ImageView) v).setAdjustViewBounds((boolean) arg);
          return true;
        }
        break;
      case "alignmentMode":
        if (v instanceof GridLayout && arg instanceof Integer) {
          ((GridLayout) v).setAlignmentMode((int) arg);
          return true;
        }
        break;
      case "allCaps":
        if (v instanceof TextView && arg instanceof Boolean) {
          ((TextView) v).setAllCaps((boolean) arg);
          return true;
        }
        break;
      case "alpha":
        if (arg instanceof Float) {
          v.setAlpha((float) arg);
          return true;
        }
        break;
      case "alwaysDrawnWithCacheEnabled":
        if (v instanceof ViewGroup && arg instanceof Boolean) {
          ((ViewGroup) v).setAlwaysDrawnWithCacheEnabled((boolean) arg);
          return true;
        }
        break;
      case "anchorView":
        if (v instanceof MediaController && arg instanceof View) {
          ((MediaController) v).setAnchorView((View) arg);
          return true;
        }
        break;
      case "animateFirstView":
        if (v instanceof AdapterViewAnimator && arg instanceof Boolean) {
          ((AdapterViewAnimator) v).setAnimateFirstView((boolean) arg);
          return true;
        }
        if (v instanceof ViewAnimator && arg instanceof Boolean) {
          ((ViewAnimator) v).setAnimateFirstView((boolean) arg);
          return true;
        }
        break;
      case "animation":
        if (arg instanceof Animation) {
          v.setAnimation((Animation) arg);
          return true;
        }
        break;
      case "animationCacheEnabled":
        if (v instanceof ViewGroup && arg instanceof Boolean) {
          ((ViewGroup) v).setAnimationCacheEnabled((boolean) arg);
          return true;
        }
        break;
      case "animationDuration":
        if (v instanceof Gallery && arg instanceof Integer) {
          ((Gallery) v).setAnimationDuration((int) arg);
          return true;
        }
        break;
      case "autoLinkMask":
        if (v instanceof TextView && arg instanceof Integer) {
          ((TextView) v).setAutoLinkMask((int) arg);
          return true;
        }
        break;
      case "autoStart":
        if (v instanceof AdapterViewFlipper && arg instanceof Boolean) {
          ((AdapterViewFlipper) v).setAutoStart((boolean) arg);
          return true;
        }
        if (v instanceof ViewFlipper && arg instanceof Boolean) {
          ((ViewFlipper) v).setAutoStart((boolean) arg);
          return true;
        }
        break;
      case "background":
        if (arg instanceof Drawable) {
          v.setBackground((Drawable) arg);
          return true;
        }
        break;
      case "backgroundColor":
        if (arg instanceof Integer) {
          v.setBackgroundColor((int) arg);
          return true;
        }
        break;
      case "backgroundResource":
        if (arg instanceof Integer) {
          v.setBackgroundResource((int) arg);
          return true;
        }
        break;
      case "backgroundTintList":
        if (arg instanceof ColorStateList) {
          v.setBackgroundTintList((ColorStateList) arg);
          return true;
        }
        break;
      case "backgroundTintMode":
        if (arg instanceof PorterDuff.Mode) {
          v.setBackgroundTintMode((PorterDuff.Mode) arg);
          return true;
        }
        break;
      case "base":
        if (v instanceof Chronometer && arg instanceof Long) {
          ((Chronometer) v).setBase((long) arg);
          return true;
        }
        break;
      case "baseline":
        if (v instanceof ImageView && arg instanceof Integer) {
          ((ImageView) v).setBaseline((int) arg);
          return true;
        }
        break;
      case "baselineAlignBottom":
        if (v instanceof ImageView && arg instanceof Boolean) {
          ((ImageView) v).setBaselineAlignBottom((boolean) arg);
          return true;
        }
        break;
      case "baselineAligned":
        if (v instanceof LinearLayout && arg instanceof Boolean) {
          ((LinearLayout) v).setBaselineAligned((boolean) arg);
          return true;
        }
        break;
      case "baselineAlignedChildIndex":
        if (v instanceof LinearLayout && arg instanceof Integer) {
          ((LinearLayout) v).setBaselineAlignedChildIndex((int) arg);
          return true;
        }
        break;
      case "bottom":
        if (arg instanceof Integer) {
          v.setBottom((int) arg);
          return true;
        }
        break;
      case "buttonDrawable":
        if (v instanceof CompoundButton && (arg == null || arg instanceof Drawable)) {
          ((CompoundButton) v).setButtonDrawable((Drawable) arg);
          return true;
        }
        if (v instanceof CompoundButton && arg instanceof Integer) {
          ((CompoundButton) v).setButtonDrawable((int) arg);
          return true;
        }
        break;
      case "buttonTintList":
        if (v instanceof CompoundButton && (arg == null || arg instanceof ColorStateList)) {
          ((CompoundButton) v).setButtonTintList((ColorStateList) arg);
          return true;
        }
        break;
      case "buttonTintMode":
        if (v instanceof CompoundButton && (arg == null || arg instanceof PorterDuff.Mode)) {
          ((CompoundButton) v).setButtonTintMode((PorterDuff.Mode) arg);
          return true;
        }
        break;
      case "cacheColorHint":
        if (v instanceof AbsListView && arg instanceof Integer) {
          ((AbsListView) v).setCacheColorHint((int) arg);
          return true;
        }
        break;
      case "calendarViewShown":
        if (v instanceof DatePicker && arg instanceof Boolean) {
          ((DatePicker) v).setCalendarViewShown((boolean) arg);
          return true;
        }
        break;
      case "callback":
        if (v instanceof TvView && (arg == null || arg instanceof TvView.TvInputCallback)) {
          ((TvView) v).setCallback((TvView.TvInputCallback) arg);
          return true;
        }
        break;
      case "callbackDuringFling":
        if (v instanceof Gallery && arg instanceof Boolean) {
          ((Gallery) v).setCallbackDuringFling((boolean) arg);
          return true;
        }
        break;
      case "cameraDistance":
        if (arg instanceof Float) {
          v.setCameraDistance((float) arg);
          return true;
        }
        break;
      case "captionEnabled":
        if (v instanceof TvView && arg instanceof Boolean) {
          ((TvView) v).setCaptionEnabled((boolean) arg);
          return true;
        }
        break;
      case "checkMarkDrawable":
        if (v instanceof CheckedTextView && (arg == null || arg instanceof Drawable)) {
          ((CheckedTextView) v).setCheckMarkDrawable((Drawable) arg);
          return true;
        }
        if (v instanceof CheckedTextView && arg instanceof Integer) {
          ((CheckedTextView) v).setCheckMarkDrawable((int) arg);
          return true;
        }
        break;
      case "checkMarkTintList":
        if (v instanceof CheckedTextView && (arg == null || arg instanceof ColorStateList)) {
          ((CheckedTextView) v).setCheckMarkTintList((ColorStateList) arg);
          return true;
        }
        break;
      case "checkMarkTintMode":
        if (v instanceof CheckedTextView && (arg == null || arg instanceof PorterDuff.Mode)) {
          ((CheckedTextView) v).setCheckMarkTintMode((PorterDuff.Mode) arg);
          return true;
        }
        break;
      case "checked":
        if (v instanceof CheckedTextView && arg instanceof Boolean) {
          ((CheckedTextView) v).setChecked((boolean) arg);
          return true;
        }
        if (v instanceof CompoundButton && arg instanceof Boolean) {
          ((CompoundButton) v).setChecked((boolean) arg);
          return true;
        }
        break;
      case "childDivider":
        if (v instanceof ExpandableListView && arg instanceof Drawable) {
          ((ExpandableListView) v).setChildDivider((Drawable) arg);
          return true;
        }
        break;
      case "childIndicator":
        if (v instanceof ExpandableListView && arg instanceof Drawable) {
          ((ExpandableListView) v).setChildIndicator((Drawable) arg);
          return true;
        }
        break;
      case "choiceMode":
        if (v instanceof AbsListView && arg instanceof Integer) {
          ((AbsListView) v).setChoiceMode((int) arg);
          return true;
        }
        break;
      case "clickable":
        if (arg instanceof Boolean) {
          v.setClickable((boolean) arg);
          return true;
        }
        break;
      case "clipBounds":
        if (arg instanceof Rect) {
          v.setClipBounds((Rect) arg);
          return true;
        }
        break;
      case "clipChildren":
        if (v instanceof ViewGroup && arg instanceof Boolean) {
          ((ViewGroup) v).setClipChildren((boolean) arg);
          return true;
        }
        break;
      case "clipToOutline":
        if (arg instanceof Boolean) {
          v.setClipToOutline((boolean) arg);
          return true;
        }
        break;
      case "clipToPadding":
        if (v instanceof ViewGroup && arg instanceof Boolean) {
          ((ViewGroup) v).setClipToPadding((boolean) arg);
          return true;
        }
        break;
      case "colorFilter":
        if (v instanceof ImageView && arg instanceof ColorFilter) {
          ((ImageView) v).setColorFilter((ColorFilter) arg);
          return true;
        }
        if (v instanceof ImageView && arg instanceof Integer) {
          ((ImageView) v).setColorFilter((int) arg);
          return true;
        }
        break;
      case "columnCount":
        if (v instanceof GridLayout && arg instanceof Integer) {
          ((GridLayout) v).setColumnCount((int) arg);
          return true;
        }
        break;
      case "columnOrderPreserved":
        if (v instanceof GridLayout && arg instanceof Boolean) {
          ((GridLayout) v).setColumnOrderPreserved((boolean) arg);
          return true;
        }
        break;
      case "columnWidth":
        if (v instanceof GridView && arg instanceof Integer) {
          ((GridView) v).setColumnWidth((int) arg);
          return true;
        }
        break;
      case "completionHint":
        if (v instanceof AutoCompleteTextView && arg instanceof CharSequence) {
          ((AutoCompleteTextView) v).setCompletionHint((CharSequence) arg);
          return true;
        }
        break;
      case "compoundDrawablePadding":
        if (v instanceof TextView && arg instanceof Integer) {
          ((TextView) v).setCompoundDrawablePadding((int) arg);
          return true;
        }
        break;
      case "contentDescription":
        if (arg instanceof CharSequence) {
          v.setContentDescription((CharSequence) arg);
          return true;
        }
        break;
      case "cropToPadding":
        if (v instanceof ImageView && arg instanceof Boolean) {
          ((ImageView) v).setCropToPadding((boolean) arg);
          return true;
        }
        break;
      case "currentHour":
        if (v instanceof TimePicker && arg instanceof Integer) {
          ((TimePicker) v).setCurrentHour((Integer) arg);
          return true;
        }
        break;
      case "currentMinute":
        if (v instanceof TimePicker && arg instanceof Integer) {
          ((TimePicker) v).setCurrentMinute((Integer) arg);
          return true;
        }
        break;
      case "currentTab":
        if (v instanceof TabHost && arg instanceof Integer) {
          ((TabHost) v).setCurrentTab((int) arg);
          return true;
        }
        if (v instanceof TabWidget && arg instanceof Integer) {
          ((TabWidget) v).setCurrentTab((int) arg);
          return true;
        }
        break;
      case "currentTabByTag":
        if (v instanceof TabHost && arg instanceof String) {
          ((TabHost) v).setCurrentTabByTag((String) arg);
          return true;
        }
        break;
      case "currentText":
        if (v instanceof TextSwitcher && arg instanceof CharSequence) {
          ((TextSwitcher) v).setCurrentText((CharSequence) arg);
          return true;
        }
        break;
      case "cursorVisible":
        if (v instanceof TextView && arg instanceof Boolean) {
          ((TextView) v).setCursorVisible((boolean) arg);
          return true;
        }
        break;
      case "customSelectionActionModeCallback":
        if (v instanceof TextView && arg instanceof ActionMode.Callback) {
          ((TextView) v).setCustomSelectionActionModeCallback((ActionMode.Callback) arg);
          return true;
        }
        break;
      case "date":
        if (v instanceof CalendarView && arg instanceof Long) {
          ((CalendarView) v).setDate((long) arg);
          return true;
        }
        break;
      case "dateTextAppearance":
        if (v instanceof CalendarView && arg instanceof Integer) {
          ((CalendarView) v).setDateTextAppearance((int) arg);
          return true;
        }
        break;
      case "debugFlags":
        if (v instanceof GLSurfaceView && arg instanceof Integer) {
          ((GLSurfaceView) v).setDebugFlags((int) arg);
          return true;
        }
        break;
      case "descendantFocusability":
        if (v instanceof ViewGroup && arg instanceof Integer) {
          ((ViewGroup) v).setDescendantFocusability((int) arg);
          return true;
        }
        break;
      case "digitsWatcher":
        if (v instanceof DialerFilter && arg instanceof TextWatcher) {
          ((DialerFilter) v).setDigitsWatcher((TextWatcher) arg);
          return true;
        }
        break;
      case "displayedChild":
        if (v instanceof AdapterViewAnimator && arg instanceof Integer) {
          ((AdapterViewAnimator) v).setDisplayedChild((int) arg);
          return true;
        }
        if (v instanceof ViewAnimator && arg instanceof Integer) {
          ((ViewAnimator) v).setDisplayedChild((int) arg);
          return true;
        }
        break;
      case "displayedValues":
        if (v instanceof NumberPicker && arg instanceof String[]) {
          ((NumberPicker) v).setDisplayedValues((String[]) arg);
          return true;
        }
        break;
      case "divider":
        if (v instanceof ListView && (arg == null || arg instanceof Drawable)) {
          ((ListView) v).setDivider((Drawable) arg);
          return true;
        }
        break;
      case "dividerDrawable":
        if (v instanceof LinearLayout && arg instanceof Drawable) {
          ((LinearLayout) v).setDividerDrawable((Drawable) arg);
          return true;
        }
        if (v instanceof TabWidget && arg instanceof Integer) {
          ((TabWidget) v).setDividerDrawable((int) arg);
          return true;
        }
        break;
      case "dividerHeight":
        if (v instanceof ListView && arg instanceof Integer) {
          ((ListView) v).setDividerHeight((int) arg);
          return true;
        }
        break;
      case "dividerPadding":
        if (v instanceof LinearLayout && arg instanceof Integer) {
          ((LinearLayout) v).setDividerPadding((int) arg);
          return true;
        }
        break;
      case "downloadListener":
        if (v instanceof WebView && arg instanceof DownloadListener) {
          ((WebView) v).setDownloadListener((DownloadListener) arg);
          return true;
        }
        break;
      case "drawSelectorOnTop":
        if (v instanceof AbsListView && arg instanceof Boolean) {
          ((AbsListView) v).setDrawSelectorOnTop((boolean) arg);
          return true;
        }
        break;
      case "drawingCacheBackgroundColor":
        if (arg instanceof Integer) {
          v.setDrawingCacheBackgroundColor((int) arg);
          return true;
        }
        break;
      case "drawingCacheEnabled":
        if (arg instanceof Boolean) {
          v.setDrawingCacheEnabled((boolean) arg);
          return true;
        }
        break;
      case "drawingCacheQuality":
        if (arg instanceof Integer) {
          v.setDrawingCacheQuality((int) arg);
          return true;
        }
        break;
      case "dropDownAnchor":
        if (v instanceof AutoCompleteTextView && arg instanceof Integer) {
          ((AutoCompleteTextView) v).setDropDownAnchor((int) arg);
          return true;
        }
        break;
      case "dropDownBackgroundDrawable":
        if (v instanceof AutoCompleteTextView && arg instanceof Drawable) {
          ((AutoCompleteTextView) v).setDropDownBackgroundDrawable((Drawable) arg);
          return true;
        }
        break;
      case "dropDownBackgroundResource":
        if (v instanceof AutoCompleteTextView && arg instanceof Integer) {
          ((AutoCompleteTextView) v).setDropDownBackgroundResource((int) arg);
          return true;
        }
        break;
      case "dropDownHeight":
        if (v instanceof AutoCompleteTextView && arg instanceof Integer) {
          ((AutoCompleteTextView) v).setDropDownHeight((int) arg);
          return true;
        }
        break;
      case "dropDownHorizontalOffset":
        if (v instanceof AutoCompleteTextView && arg instanceof Integer) {
          ((AutoCompleteTextView) v).setDropDownHorizontalOffset((int) arg);
          return true;
        }
        if (v instanceof Spinner && arg instanceof Integer) {
          ((Spinner) v).setDropDownHorizontalOffset((int) arg);
          return true;
        }
        break;
      case "dropDownVerticalOffset":
        if (v instanceof AutoCompleteTextView && arg instanceof Integer) {
          ((AutoCompleteTextView) v).setDropDownVerticalOffset((int) arg);
          return true;
        }
        if (v instanceof Spinner && arg instanceof Integer) {
          ((Spinner) v).setDropDownVerticalOffset((int) arg);
          return true;
        }
        break;
      case "dropDownWidth":
        if (v instanceof AutoCompleteTextView && arg instanceof Integer) {
          ((AutoCompleteTextView) v).setDropDownWidth((int) arg);
          return true;
        }
        if (v instanceof Spinner && arg instanceof Integer) {
          ((Spinner) v).setDropDownWidth((int) arg);
          return true;
        }
        break;
      case "duplicateParentStateEnabled":
        if (arg instanceof Boolean) {
          v.setDuplicateParentStateEnabled((boolean) arg);
          return true;
        }
        break;
      case "eGLConfigChooser":
        if (v instanceof GLSurfaceView && arg instanceof GLSurfaceView.EGLConfigChooser) {
          ((GLSurfaceView) v).setEGLConfigChooser((GLSurfaceView.EGLConfigChooser) arg);
          return true;
        }
        if (v instanceof GLSurfaceView && arg instanceof Boolean) {
          ((GLSurfaceView) v).setEGLConfigChooser((boolean) arg);
          return true;
        }
        break;
      case "eGLContextClientVersion":
        if (v instanceof GLSurfaceView && arg instanceof Integer) {
          ((GLSurfaceView) v).setEGLContextClientVersion((int) arg);
          return true;
        }
        break;
      case "eGLContextFactory":
        if (v instanceof GLSurfaceView && arg instanceof GLSurfaceView.EGLContextFactory) {
          ((GLSurfaceView) v).setEGLContextFactory((GLSurfaceView.EGLContextFactory) arg);
          return true;
        }
        break;
      case "eGLWindowSurfaceFactory":
        if (v instanceof GLSurfaceView && arg instanceof GLSurfaceView.EGLWindowSurfaceFactory) {
          ((GLSurfaceView) v).setEGLWindowSurfaceFactory((GLSurfaceView.EGLWindowSurfaceFactory) arg);
          return true;
        }
        break;
      case "editableFactory":
        if (v instanceof TextView && arg instanceof Editable.Factory) {
          ((TextView) v).setEditableFactory((Editable.Factory) arg);
          return true;
        }
        break;
      case "elegantTextHeight":
        if (v instanceof TextView && arg instanceof Boolean) {
          ((TextView) v).setElegantTextHeight((boolean) arg);
          return true;
        }
        break;
      case "elevation":
        if (arg instanceof Float) {
          v.setElevation((float) arg);
          return true;
        }
        break;
      case "ellipsize":
        if (v instanceof TextView && arg instanceof TextUtils.TruncateAt) {
          ((TextView) v).setEllipsize((TextUtils.TruncateAt) arg);
          return true;
        }
        break;
      case "emptyView":
        if (v instanceof AdapterView && arg instanceof View) {
          ((AdapterView) v).setEmptyView((View) arg);
          return true;
        }
        break;
      case "ems":
        if (v instanceof TextView && arg instanceof Integer) {
          ((TextView) v).setEms((int) arg);
          return true;
        }
        break;
      case "enabled":
        if (arg instanceof Boolean) {
          v.setEnabled((boolean) arg);
          return true;
        }
        break;
      case "error":
        if (v instanceof TextView && arg instanceof CharSequence) {
          ((TextView) v).setError((CharSequence) arg);
          return true;
        }
        break;
      case "eventsInterceptionEnabled":
        if (v instanceof GestureOverlayView && arg instanceof Boolean) {
          ((GestureOverlayView) v).setEventsInterceptionEnabled((boolean) arg);
          return true;
        }
        break;
      case "excludeMimes":
        if (v instanceof QuickContactBadge && arg instanceof String[]) {
          ((QuickContactBadge) v).setExcludeMimes((String[]) arg);
          return true;
        }
        break;
      case "extendedSettingsClickListener":
        if (v instanceof MediaRouteButton && arg instanceof View.OnClickListener) {
          ((MediaRouteButton) v).setExtendedSettingsClickListener((View.OnClickListener) arg);
          return true;
        }
        break;
      case "extractedText":
        if (v instanceof TextView && arg instanceof ExtractedText) {
          ((TextView) v).setExtractedText((ExtractedText) arg);
          return true;
        }
        break;
      case "factory":
        if (v instanceof ViewSwitcher && arg instanceof ViewSwitcher.ViewFactory) {
          ((ViewSwitcher) v).setFactory((ViewSwitcher.ViewFactory) arg);
          return true;
        }
        break;
      case "fadeEnabled":
        if (v instanceof GestureOverlayView && arg instanceof Boolean) {
          ((GestureOverlayView) v).setFadeEnabled((boolean) arg);
          return true;
        }
        break;
      case "fadeOffset":
        if (v instanceof GestureOverlayView && arg instanceof Long) {
          ((GestureOverlayView) v).setFadeOffset((long) arg);
          return true;
        }
        break;
      case "fadingEdgeLength":
        if (arg instanceof Integer) {
          v.setFadingEdgeLength((int) arg);
          return true;
        }
        break;
      case "fastScrollAlwaysVisible":
        if (v instanceof AbsListView && arg instanceof Boolean) {
          ((AbsListView) v).setFastScrollAlwaysVisible((boolean) arg);
          return true;
        }
        break;
      case "fastScrollEnabled":
        if (v instanceof AbsListView && arg instanceof Boolean) {
          ((AbsListView) v).setFastScrollEnabled((boolean) arg);
          return true;
        }
        break;
      case "fastScrollStyle":
        if (v instanceof AbsListView && arg instanceof Integer) {
          ((AbsListView) v).setFastScrollStyle((int) arg);
          return true;
        }
        break;
      case "fillViewport":
        if (v instanceof HorizontalScrollView && arg instanceof Boolean) {
          ((HorizontalScrollView) v).setFillViewport((boolean) arg);
          return true;
        }
        if (v instanceof ScrollView && arg instanceof Boolean) {
          ((ScrollView) v).setFillViewport((boolean) arg);
          return true;
        }
        break;
      case "filterText":
        if (v instanceof AbsListView && arg instanceof String) {
          ((AbsListView) v).setFilterText((String) arg);
          return true;
        }
        break;
      case "filterTouchesWhenObscured":
        if (arg instanceof Boolean) {
          v.setFilterTouchesWhenObscured((boolean) arg);
          return true;
        }
        break;
      case "filterWatcher":
        if (v instanceof DialerFilter && arg instanceof TextWatcher) {
          ((DialerFilter) v).setFilterWatcher((TextWatcher) arg);
          return true;
        }
        break;
      case "filters":
        if (v instanceof TextView && arg instanceof InputFilter[]) {
          ((TextView) v).setFilters((InputFilter[]) arg);
          return true;
        }
        break;
      case "findListener":
        if (v instanceof WebView && arg instanceof WebView.FindListener) {
          ((WebView) v).setFindListener((WebView.FindListener) arg);
          return true;
        }
        break;
      case "firstDayOfWeek":
        if (v instanceof CalendarView && arg instanceof Integer) {
          ((CalendarView) v).setFirstDayOfWeek((int) arg);
          return true;
        }
        if (v instanceof DatePicker && arg instanceof Integer) {
          ((DatePicker) v).setFirstDayOfWeek((int) arg);
          return true;
        }
        break;
      case "fitsSystemWindows":
        if (arg instanceof Boolean) {
          v.setFitsSystemWindows((boolean) arg);
          return true;
        }
        break;
      case "flipInterval":
        if (v instanceof AdapterViewFlipper && arg instanceof Integer) {
          ((AdapterViewFlipper) v).setFlipInterval((int) arg);
          return true;
        }
        if (v instanceof ViewFlipper && arg instanceof Integer) {
          ((ViewFlipper) v).setFlipInterval((int) arg);
          return true;
        }
        break;
      case "focusable":
        if (arg instanceof Boolean) {
          v.setFocusable((boolean) arg);
          return true;
        }
        break;
      case "focusableInTouchMode":
        if (arg instanceof Boolean) {
          v.setFocusableInTouchMode((boolean) arg);
          return true;
        }
        break;
      case "focusedMonthDateColor":
        if (v instanceof CalendarView && arg instanceof Integer) {
          ((CalendarView) v).setFocusedMonthDateColor((int) arg);
          return true;
        }
        break;
      case "fontFeatureSettings":
        if (v instanceof TextView && (arg == null || arg instanceof String)) {
          ((TextView) v).setFontFeatureSettings((String) arg);
          return true;
        }
        break;
      case "footerDividersEnabled":
        if (v instanceof ListView && arg instanceof Boolean) {
          ((ListView) v).setFooterDividersEnabled((boolean) arg);
          return true;
        }
        break;
      case "foreground":
        if (v instanceof FrameLayout && arg instanceof Drawable) {
          ((FrameLayout) v).setForeground((Drawable) arg);
          return true;
        }
        break;
      case "foregroundGravity":
        if (v instanceof FrameLayout && arg instanceof Integer) {
          ((FrameLayout) v).setForegroundGravity((int) arg);
          return true;
        }
        break;
      case "foregroundTintList":
        if (v instanceof FrameLayout && arg instanceof ColorStateList) {
          ((FrameLayout) v).setForegroundTintList((ColorStateList) arg);
          return true;
        }
        break;
      case "foregroundTintMode":
        if (v instanceof FrameLayout && arg instanceof PorterDuff.Mode) {
          ((FrameLayout) v).setForegroundTintMode((PorterDuff.Mode) arg);
          return true;
        }
        break;
      case "format":
        if (v instanceof Chronometer && arg instanceof String) {
          ((Chronometer) v).setFormat((String) arg);
          return true;
        }
        break;
      case "format12Hour":
        if (v instanceof TextClock && arg instanceof CharSequence) {
          ((TextClock) v).setFormat12Hour((CharSequence) arg);
          return true;
        }
        break;
      case "format24Hour":
        if (v instanceof TextClock && arg instanceof CharSequence) {
          ((TextClock) v).setFormat24Hour((CharSequence) arg);
          return true;
        }
        break;
      case "formatter":
        if (v instanceof NumberPicker && arg instanceof NumberPicker.Formatter) {
          ((NumberPicker) v).setFormatter((NumberPicker.Formatter) arg);
          return true;
        }
        break;
      case "freezesText":
        if (v instanceof TextView && arg instanceof Boolean) {
          ((TextView) v).setFreezesText((boolean) arg);
          return true;
        }
        break;
      case "friction":
        if (v instanceof AbsListView && arg instanceof Float) {
          ((AbsListView) v).setFriction((float) arg);
          return true;
        }
        break;
      case "gLWrapper":
        if (v instanceof GLSurfaceView && arg instanceof GLSurfaceView.GLWrapper) {
          ((GLSurfaceView) v).setGLWrapper((GLSurfaceView.GLWrapper) arg);
          return true;
        }
        break;
      case "gesture":
        if (v instanceof GestureOverlayView && arg instanceof Gesture) {
          ((GestureOverlayView) v).setGesture((Gesture) arg);
          return true;
        }
        break;
      case "gestureColor":
        if (v instanceof GestureOverlayView && arg instanceof Integer) {
          ((GestureOverlayView) v).setGestureColor((int) arg);
          return true;
        }
        break;
      case "gestureStrokeAngleThreshold":
        if (v instanceof GestureOverlayView && arg instanceof Float) {
          ((GestureOverlayView) v).setGestureStrokeAngleThreshold((float) arg);
          return true;
        }
        break;
      case "gestureStrokeLengthThreshold":
        if (v instanceof GestureOverlayView && arg instanceof Float) {
          ((GestureOverlayView) v).setGestureStrokeLengthThreshold((float) arg);
          return true;
        }
        break;
      case "gestureStrokeSquarenessTreshold":
        if (v instanceof GestureOverlayView && arg instanceof Float) {
          ((GestureOverlayView) v).setGestureStrokeSquarenessTreshold((float) arg);
          return true;
        }
        break;
      case "gestureStrokeType":
        if (v instanceof GestureOverlayView && arg instanceof Integer) {
          ((GestureOverlayView) v).setGestureStrokeType((int) arg);
          return true;
        }
        break;
      case "gestureStrokeWidth":
        if (v instanceof GestureOverlayView && arg instanceof Float) {
          ((GestureOverlayView) v).setGestureStrokeWidth((float) arg);
          return true;
        }
        break;
      case "gestureVisible":
        if (v instanceof GestureOverlayView && arg instanceof Boolean) {
          ((GestureOverlayView) v).setGestureVisible((boolean) arg);
          return true;
        }
        break;
      case "gravity":
        if (v instanceof Gallery && arg instanceof Integer) {
          ((Gallery) v).setGravity((int) arg);
          return true;
        }
        if (v instanceof GridView && arg instanceof Integer) {
          ((GridView) v).setGravity((int) arg);
          return true;
        }
        if (v instanceof LinearLayout && arg instanceof Integer) {
          ((LinearLayout) v).setGravity((int) arg);
          return true;
        }
        if (v instanceof RelativeLayout && arg instanceof Integer) {
          ((RelativeLayout) v).setGravity((int) arg);
          return true;
        }
        if (v instanceof Spinner && arg instanceof Integer) {
          ((Spinner) v).setGravity((int) arg);
          return true;
        }
        if (v instanceof TextView && arg instanceof Integer) {
          ((TextView) v).setGravity((int) arg);
          return true;
        }
        break;
      case "groupIndicator":
        if (v instanceof ExpandableListView && arg instanceof Drawable) {
          ((ExpandableListView) v).setGroupIndicator((Drawable) arg);
          return true;
        }
        break;
      case "hapticFeedbackEnabled":
        if (arg instanceof Boolean) {
          v.setHapticFeedbackEnabled((boolean) arg);
          return true;
        }
        break;
      case "hasTransientState":
        if (arg instanceof Boolean) {
          v.setHasTransientState((boolean) arg);
          return true;
        }
        break;
      case "headerDividersEnabled":
        if (v instanceof ListView && arg instanceof Boolean) {
          ((ListView) v).setHeaderDividersEnabled((boolean) arg);
          return true;
        }
        break;
      case "height":
        if (v instanceof TextView && arg instanceof Integer) {
          ((TextView) v).setHeight((int) arg);
          return true;
        }
        break;
      case "highlightColor":
        if (v instanceof TextView && arg instanceof Integer) {
          ((TextView) v).setHighlightColor((int) arg);
          return true;
        }
        break;
      case "hint":
        if (v instanceof TextView && arg instanceof Integer) {
          ((TextView) v).setHint((int) arg);
          return true;
        }
        if (v instanceof TextView && arg instanceof CharSequence) {
          ((TextView) v).setHint((CharSequence) arg);
          return true;
        }
        break;
      case "hintTextColor":
        if (v instanceof TextView && arg instanceof ColorStateList) {
          ((TextView) v).setHintTextColor((ColorStateList) arg);
          return true;
        }
        if (v instanceof TextView && arg instanceof Integer) {
          ((TextView) v).setHintTextColor((int) arg);
          return true;
        }
        break;
      case "horizontalFadingEdgeEnabled":
        if (arg instanceof Boolean) {
          v.setHorizontalFadingEdgeEnabled((boolean) arg);
          return true;
        }
        break;
      case "horizontalGravity":
        if (v instanceof LinearLayout && arg instanceof Integer) {
          ((LinearLayout) v).setHorizontalGravity((int) arg);
          return true;
        }
        if (v instanceof RelativeLayout && arg instanceof Integer) {
          ((RelativeLayout) v).setHorizontalGravity((int) arg);
          return true;
        }
        break;
      case "horizontalScrollBarEnabled":
        if (arg instanceof Boolean) {
          v.setHorizontalScrollBarEnabled((boolean) arg);
          return true;
        }
        break;
      case "horizontalScrollbarOverlay":
        if (v instanceof WebView && arg instanceof Boolean) {
          ((WebView) v).setHorizontalScrollbarOverlay((boolean) arg);
          return true;
        }
        break;
      case "horizontalSpacing":
        if (v instanceof GridView && arg instanceof Integer) {
          ((GridView) v).setHorizontalSpacing((int) arg);
          return true;
        }
        break;
      case "horizontallyScrolling":
        if (v instanceof TextView && arg instanceof Boolean) {
          ((TextView) v).setHorizontallyScrolling((boolean) arg);
          return true;
        }
        break;
      case "hovered":
        if (arg instanceof Boolean) {
          v.setHovered((boolean) arg);
          return true;
        }
        break;
      case "iconified":
        if (v instanceof SearchView && arg instanceof Boolean) {
          ((SearchView) v).setIconified((boolean) arg);
          return true;
        }
        break;
      case "iconifiedByDefault":
        if (v instanceof SearchView && arg instanceof Boolean) {
          ((SearchView) v).setIconifiedByDefault((boolean) arg);
          return true;
        }
        break;
      case "id":
        if (arg instanceof Integer) {
          v.setId((int) arg);
          return true;
        }
        break;
      case "ignoreGravity":
        if (v instanceof RelativeLayout && arg instanceof Integer) {
          ((RelativeLayout) v).setIgnoreGravity((int) arg);
          return true;
        }
        break;
      case "imageAlpha":
        if (v instanceof ImageView && arg instanceof Integer) {
          ((ImageView) v).setImageAlpha((int) arg);
          return true;
        }
        break;
      case "imageBitmap":
        if (v instanceof ImageView && arg instanceof Bitmap) {
          ((ImageView) v).setImageBitmap((Bitmap) arg);
          return true;
        }
        break;
      case "imageDrawable":
        if (v instanceof ImageSwitcher && arg instanceof Drawable) {
          ((ImageSwitcher) v).setImageDrawable((Drawable) arg);
          return true;
        }
        if (v instanceof ImageView && (arg == null || arg instanceof Drawable)) {
          ((ImageView) v).setImageDrawable((Drawable) arg);
          return true;
        }
        break;
      case "imageLevel":
        if (v instanceof ImageView && arg instanceof Integer) {
          ((ImageView) v).setImageLevel((int) arg);
          return true;
        }
        break;
      case "imageMatrix":
        if (v instanceof ImageView && arg instanceof Matrix) {
          ((ImageView) v).setImageMatrix((Matrix) arg);
          return true;
        }
        break;
      case "imageResource":
        if (v instanceof ImageSwitcher && arg instanceof Integer) {
          ((ImageSwitcher) v).setImageResource((int) arg);
          return true;
        }
        if (v instanceof ImageView && arg instanceof Integer) {
          ((ImageView) v).setImageResource((int) arg);
          return true;
        }
        break;
      case "imageTintList":
        if (v instanceof ImageView && (arg == null || arg instanceof ColorStateList)) {
          ((ImageView) v).setImageTintList((ColorStateList) arg);
          return true;
        }
        break;
      case "imageTintMode":
        if (v instanceof ImageView && (arg == null || arg instanceof PorterDuff.Mode)) {
          ((ImageView) v).setImageTintMode((PorterDuff.Mode) arg);
          return true;
        }
        break;
      case "imageURI":
        if (v instanceof ImageSwitcher && arg instanceof Uri) {
          ((ImageSwitcher) v).setImageURI((Uri) arg);
          return true;
        }
        if (v instanceof ImageView && (arg == null || arg instanceof Uri)) {
          ((ImageView) v).setImageURI((Uri) arg);
          return true;
        }
        break;
      case "imeOptions":
        if (v instanceof SearchView && arg instanceof Integer) {
          ((SearchView) v).setImeOptions((int) arg);
          return true;
        }
        if (v instanceof TextView && arg instanceof Integer) {
          ((TextView) v).setImeOptions((int) arg);
          return true;
        }
        break;
      case "importantForAccessibility":
        if (arg instanceof Integer) {
          v.setImportantForAccessibility((int) arg);
          return true;
        }
        break;
      case "inAnimation":
        if (v instanceof AdapterViewAnimator && arg instanceof ObjectAnimator) {
          ((AdapterViewAnimator) v).setInAnimation((ObjectAnimator) arg);
          return true;
        }
        if (v instanceof ViewAnimator && arg instanceof Animation) {
          ((ViewAnimator) v).setInAnimation((Animation) arg);
          return true;
        }
        break;
      case "includeFontPadding":
        if (v instanceof TextView && arg instanceof Boolean) {
          ((TextView) v).setIncludeFontPadding((boolean) arg);
          return true;
        }
        break;
      case "indeterminate":
        if (v instanceof ProgressBar && arg instanceof Boolean) {
          ((ProgressBar) v).setIndeterminate((boolean) arg);
          return true;
        }
        break;
      case "indeterminateDrawable":
        if (v instanceof ProgressBar && arg instanceof Drawable) {
          ((ProgressBar) v).setIndeterminateDrawable((Drawable) arg);
          return true;
        }
        break;
      case "indeterminateDrawableTiled":
        if (v instanceof ProgressBar && arg instanceof Drawable) {
          ((ProgressBar) v).setIndeterminateDrawableTiled((Drawable) arg);
          return true;
        }
        break;
      case "indeterminateTintList":
        if (v instanceof ProgressBar && (arg == null || arg instanceof ColorStateList)) {
          ((ProgressBar) v).setIndeterminateTintList((ColorStateList) arg);
          return true;
        }
        break;
      case "indeterminateTintMode":
        if (v instanceof ProgressBar && (arg == null || arg instanceof PorterDuff.Mode)) {
          ((ProgressBar) v).setIndeterminateTintMode((PorterDuff.Mode) arg);
          return true;
        }
        break;
      case "inflatedId":
        if (v instanceof ViewStub && arg instanceof Integer) {
          ((ViewStub) v).setInflatedId((int) arg);
          return true;
        }
        break;
      case "initialScale":
        if (v instanceof WebView && arg instanceof Integer) {
          ((WebView) v).setInitialScale((int) arg);
          return true;
        }
        break;
      case "inputExtras":
        try {
        	if (v instanceof android.widget.TextView && arg instanceof Integer)
        		((android.widget.TextView) v).setInputExtras((int) arg);
        } catch (org.xmlpull.v1.XmlPullParserException e) {
        	e.printStackTrace();
        } catch (java.io.IOException e) {
        	e.printStackTrace();
        }
        break;
      case "inputType":
        if (v instanceof SearchView && arg instanceof Integer) {
          ((SearchView) v).setInputType((int) arg);
          return true;
        }
        if (v instanceof TextView && arg instanceof Integer) {
          ((TextView) v).setInputType((int) arg);
          return true;
        }
        break;
      case "interpolator":
        if (v instanceof ProgressBar && arg instanceof Interpolator) {
          ((ProgressBar) v).setInterpolator((Interpolator) arg);
          return true;
        }
        break;
      case "is24HourView":
        if (v instanceof TimePicker && arg instanceof Boolean) {
          ((TimePicker) v).setIs24HourView((Boolean) arg);
          return true;
        }
        break;
      case "isIndicator":
        if (v instanceof RatingBar && arg instanceof Boolean) {
          ((RatingBar) v).setIsIndicator((boolean) arg);
          return true;
        }
        break;
      case "isZoomInEnabled":
        if (v instanceof ZoomControls && arg instanceof Boolean) {
          ((ZoomControls) v).setIsZoomInEnabled((boolean) arg);
          return true;
        }
        break;
      case "isZoomOutEnabled":
        if (v instanceof ZoomControls && arg instanceof Boolean) {
          ((ZoomControls) v).setIsZoomOutEnabled((boolean) arg);
          return true;
        }
        break;
      case "itemsCanFocus":
        if (v instanceof ListView && arg instanceof Boolean) {
          ((ListView) v).setItemsCanFocus((boolean) arg);
          return true;
        }
        break;
      case "keepScreenOn":
        if (arg instanceof Boolean) {
          v.setKeepScreenOn((boolean) arg);
          return true;
        }
        break;
      case "keyListener":
        if (v instanceof TextView && arg instanceof KeyListener) {
          ((TextView) v).setKeyListener((KeyListener) arg);
          return true;
        }
        break;
      case "keyProgressIncrement":
        if (v instanceof AbsSeekBar && arg instanceof Integer) {
          ((AbsSeekBar) v).setKeyProgressIncrement((int) arg);
          return true;
        }
        break;
      case "keyboard":
        if (v instanceof KeyboardView && arg instanceof Keyboard) {
          ((KeyboardView) v).setKeyboard((Keyboard) arg);
          return true;
        }
        break;
      case "labelFor":
        if (arg instanceof Integer) {
          v.setLabelFor((int) arg);
          return true;
        }
        break;
      case "layerPaint":
        if (arg instanceof Paint) {
          v.setLayerPaint((Paint) arg);
          return true;
        }
        break;
      case "layoutAnimation":
        if (v instanceof ViewGroup && arg instanceof LayoutAnimationController) {
          ((ViewGroup) v).setLayoutAnimation((LayoutAnimationController) arg);
          return true;
        }
        break;
      case "layoutAnimationListener":
        if (v instanceof ViewGroup && arg instanceof Animation.AnimationListener) {
          ((ViewGroup) v).setLayoutAnimationListener((Animation.AnimationListener) arg);
          return true;
        }
        break;
      case "layoutDirection":
        if (arg instanceof Integer) {
          v.setLayoutDirection((int) arg);
          return true;
        }
        break;
      case "layoutInflater":
        if (v instanceof ViewStub && arg instanceof LayoutInflater) {
          ((ViewStub) v).setLayoutInflater((LayoutInflater) arg);
          return true;
        }
        break;
      case "layoutMode":
        if (v instanceof ViewGroup && arg instanceof Integer) {
          ((ViewGroup) v).setLayoutMode((int) arg);
          return true;
        }
        break;
      case "layoutParams":
        if (arg instanceof ViewGroup.LayoutParams) {
          v.setLayoutParams((ViewGroup.LayoutParams) arg);
          return true;
        }
        break;
      case "layoutResource":
        if (v instanceof ViewStub && arg instanceof Integer) {
          ((ViewStub) v).setLayoutResource((int) arg);
          return true;
        }
        break;
      case "layoutTransition":
        if (v instanceof ViewGroup && arg instanceof LayoutTransition) {
          ((ViewGroup) v).setLayoutTransition((LayoutTransition) arg);
          return true;
        }
        break;
      case "left":
        if (arg instanceof Integer) {
          v.setLeft((int) arg);
          return true;
        }
        break;
      case "leftStripDrawable":
        if (v instanceof TabWidget && (arg == null || arg instanceof Drawable)) {
          ((TabWidget) v).setLeftStripDrawable((Drawable) arg);
          return true;
        }
        if (v instanceof TabWidget && arg instanceof Integer) {
          ((TabWidget) v).setLeftStripDrawable((int) arg);
          return true;
        }
        break;
      case "letterSpacing":
        if (v instanceof TextView && arg instanceof Float) {
          ((TextView) v).setLetterSpacing((float) arg);
          return true;
        }
        break;
      case "lettersWatcher":
        if (v instanceof DialerFilter && arg instanceof TextWatcher) {
          ((DialerFilter) v).setLettersWatcher((TextWatcher) arg);
          return true;
        }
        break;
      case "lines":
        if (v instanceof TextView && arg instanceof Integer) {
          ((TextView) v).setLines((int) arg);
          return true;
        }
        break;
      case "linkTextColor":
        if (v instanceof TextView && arg instanceof ColorStateList) {
          ((TextView) v).setLinkTextColor((ColorStateList) arg);
          return true;
        }
        if (v instanceof TextView && arg instanceof Integer) {
          ((TextView) v).setLinkTextColor((int) arg);
          return true;
        }
        break;
      case "linksClickable":
        if (v instanceof TextView && arg instanceof Boolean) {
          ((TextView) v).setLinksClickable((boolean) arg);
          return true;
        }
        break;
      case "listSelection":
        if (v instanceof AutoCompleteTextView && arg instanceof Integer) {
          ((AutoCompleteTextView) v).setListSelection((int) arg);
          return true;
        }
        break;
      case "logo":
        if (v instanceof Toolbar && arg instanceof Drawable) {
          ((Toolbar) v).setLogo((Drawable) arg);
          return true;
        }
        if (v instanceof Toolbar && arg instanceof Integer) {
          ((Toolbar) v).setLogo((int) arg);
          return true;
        }
        break;
      case "logoDescription":
        if (v instanceof Toolbar && arg instanceof Integer) {
          ((Toolbar) v).setLogoDescription((int) arg);
          return true;
        }
        if (v instanceof Toolbar && arg instanceof CharSequence) {
          ((Toolbar) v).setLogoDescription((CharSequence) arg);
          return true;
        }
        break;
      case "longClickable":
        if (arg instanceof Boolean) {
          v.setLongClickable((boolean) arg);
          return true;
        }
        break;
      case "marqueeRepeatLimit":
        if (v instanceof TextView && arg instanceof Integer) {
          ((TextView) v).setMarqueeRepeatLimit((int) arg);
          return true;
        }
        break;
      case "max":
        if (v instanceof ProgressBar && arg instanceof Integer) {
          ((ProgressBar) v).setMax((int) arg);
          return true;
        }
        break;
      case "maxDate":
        if (v instanceof CalendarView && arg instanceof Long) {
          ((CalendarView) v).setMaxDate((long) arg);
          return true;
        }
        if (v instanceof DatePicker && arg instanceof Long) {
          ((DatePicker) v).setMaxDate((long) arg);
          return true;
        }
        break;
      case "maxEms":
        if (v instanceof TextView && arg instanceof Integer) {
          ((TextView) v).setMaxEms((int) arg);
          return true;
        }
        break;
      case "maxHeight":
        if (v instanceof ImageView && arg instanceof Integer) {
          ((ImageView) v).setMaxHeight((int) arg);
          return true;
        }
        if (v instanceof TextView && arg instanceof Integer) {
          ((TextView) v).setMaxHeight((int) arg);
          return true;
        }
        break;
      case "maxLines":
        if (v instanceof TextView && arg instanceof Integer) {
          ((TextView) v).setMaxLines((int) arg);
          return true;
        }
        break;
      case "maxValue":
        if (v instanceof NumberPicker && arg instanceof Integer) {
          ((NumberPicker) v).setMaxValue((int) arg);
          return true;
        }
        break;
      case "maxVisible":
        if (v instanceof FragmentBreadCrumbs && arg instanceof Integer) {
          ((FragmentBreadCrumbs) v).setMaxVisible((int) arg);
          return true;
        }
        break;
      case "maxWidth":
        if (v instanceof ImageView && arg instanceof Integer) {
          ((ImageView) v).setMaxWidth((int) arg);
          return true;
        }
        if (v instanceof SearchView && arg instanceof Integer) {
          ((SearchView) v).setMaxWidth((int) arg);
          return true;
        }
        if (v instanceof TextView && arg instanceof Integer) {
          ((TextView) v).setMaxWidth((int) arg);
          return true;
        }
        break;
      case "measureAllChildren":
        if (v instanceof FrameLayout && arg instanceof Boolean) {
          ((FrameLayout) v).setMeasureAllChildren((boolean) arg);
          return true;
        }
        break;
      case "measureWithLargestChildEnabled":
        if (v instanceof LinearLayout && arg instanceof Boolean) {
          ((LinearLayout) v).setMeasureWithLargestChildEnabled((boolean) arg);
          return true;
        }
        break;
      case "mediaController":
        if (v instanceof VideoView && arg instanceof MediaController) {
          ((VideoView) v).setMediaController((MediaController) arg);
          return true;
        }
        break;
      case "mediaPlayer":
        if (v instanceof MediaController && arg instanceof MediaController.MediaPlayerControl) {
          ((MediaController) v).setMediaPlayer((MediaController.MediaPlayerControl) arg);
          return true;
        }
        break;
      case "minDate":
        if (v instanceof CalendarView && arg instanceof Long) {
          ((CalendarView) v).setMinDate((long) arg);
          return true;
        }
        if (v instanceof DatePicker && arg instanceof Long) {
          ((DatePicker) v).setMinDate((long) arg);
          return true;
        }
        break;
      case "minEms":
        if (v instanceof TextView && arg instanceof Integer) {
          ((TextView) v).setMinEms((int) arg);
          return true;
        }
        break;
      case "minHeight":
        if (v instanceof TextView && arg instanceof Integer) {
          ((TextView) v).setMinHeight((int) arg);
          return true;
        }
        break;
      case "minLines":
        if (v instanceof TextView && arg instanceof Integer) {
          ((TextView) v).setMinLines((int) arg);
          return true;
        }
        break;
      case "minValue":
        if (v instanceof NumberPicker && arg instanceof Integer) {
          ((NumberPicker) v).setMinValue((int) arg);
          return true;
        }
        break;
      case "minWidth":
        if (v instanceof TextView && arg instanceof Integer) {
          ((TextView) v).setMinWidth((int) arg);
          return true;
        }
        break;
      case "minimumHeight":
        if (arg instanceof Integer) {
          v.setMinimumHeight((int) arg);
          return true;
        }
        break;
      case "minimumWidth":
        if (arg instanceof Integer) {
          v.setMinimumWidth((int) arg);
          return true;
        }
        break;
      case "mode":
        if (v instanceof DialerFilter && arg instanceof Integer) {
          ((DialerFilter) v).setMode((int) arg);
          return true;
        }
        if (v instanceof QuickContactBadge && arg instanceof Integer) {
          ((QuickContactBadge) v).setMode((int) arg);
          return true;
        }
        break;
      case "motionEventSplittingEnabled":
        if (v instanceof ViewGroup && arg instanceof Boolean) {
          ((ViewGroup) v).setMotionEventSplittingEnabled((boolean) arg);
          return true;
        }
        break;
      case "movementMethod":
        if (v instanceof TextView && arg instanceof MovementMethod) {
          ((TextView) v).setMovementMethod((MovementMethod) arg);
          return true;
        }
        break;
      case "multiChoiceModeListener":
        if (v instanceof AbsListView && arg instanceof AbsListView.MultiChoiceModeListener) {
          ((AbsListView) v).setMultiChoiceModeListener((AbsListView.MultiChoiceModeListener) arg);
          return true;
        }
        break;
      case "navigationContentDescription":
        if (v instanceof Toolbar && arg instanceof Integer) {
          ((Toolbar) v).setNavigationContentDescription((int) arg);
          return true;
        }
        if (v instanceof Toolbar && (arg == null || arg instanceof CharSequence)) {
          ((Toolbar) v).setNavigationContentDescription((CharSequence) arg);
          return true;
        }
        break;
      case "navigationIcon":
        if (v instanceof Toolbar && (arg == null || arg instanceof Drawable)) {
          ((Toolbar) v).setNavigationIcon((Drawable) arg);
          return true;
        }
        if (v instanceof Toolbar && arg instanceof Integer) {
          ((Toolbar) v).setNavigationIcon((int) arg);
          return true;
        }
        break;
      case "navigationOnClickListener":
        if (v instanceof Toolbar && arg instanceof View.OnClickListener) {
          ((Toolbar) v).setNavigationOnClickListener((View.OnClickListener) arg);
          return true;
        }
        break;
      case "nestedScrollingEnabled":
        if (arg instanceof Boolean) {
          v.setNestedScrollingEnabled((boolean) arg);
          return true;
        }
        break;
      case "networkAvailable":
        if (v instanceof WebView && arg instanceof Boolean) {
          ((WebView) v).setNetworkAvailable((boolean) arg);
          return true;
        }
        break;
      case "nextFocusDownId":
        if (arg instanceof Integer) {
          v.setNextFocusDownId((int) arg);
          return true;
        }
        break;
      case "nextFocusForwardId":
        if (arg instanceof Integer) {
          v.setNextFocusForwardId((int) arg);
          return true;
        }
        break;
      case "nextFocusLeftId":
        if (arg instanceof Integer) {
          v.setNextFocusLeftId((int) arg);
          return true;
        }
        break;
      case "nextFocusRightId":
        if (arg instanceof Integer) {
          v.setNextFocusRightId((int) arg);
          return true;
        }
        break;
      case "nextFocusUpId":
        if (arg instanceof Integer) {
          v.setNextFocusUpId((int) arg);
          return true;
        }
        break;
      case "numColumns":
        if (v instanceof GridView && arg instanceof Integer) {
          ((GridView) v).setNumColumns((int) arg);
          return true;
        }
        break;
      case "numStars":
        if (v instanceof RatingBar && arg instanceof Integer) {
          ((RatingBar) v).setNumStars((int) arg);
          return true;
        }
        break;
      case "onApplyWindowInsets":
        if (arg != null) {
          v.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
            public WindowInsets onApplyWindowInsets(View a0, WindowInsets a1) {
              WindowInsets r = ((View.OnApplyWindowInsetsListener) arg).onApplyWindowInsets(a0, a1);
              Anvil.render();
              return r;
            }
          });
        } else {
          v.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) null);
        }
        return true;
      case "onBreadCrumbClick":
        if (v instanceof FragmentBreadCrumbs && arg instanceof FragmentBreadCrumbs.OnBreadCrumbClickListener) {
          if (arg != null) {
            ((FragmentBreadCrumbs) v).setOnBreadCrumbClickListener(new FragmentBreadCrumbs.OnBreadCrumbClickListener() {
              public boolean onBreadCrumbClick(FragmentManager.BackStackEntry a0, int a1) {
                boolean r = ((FragmentBreadCrumbs.OnBreadCrumbClickListener) arg).onBreadCrumbClick(a0, a1);
                Anvil.render();
                return r;
              }
            });
          } else {
            ((FragmentBreadCrumbs) v).setOnBreadCrumbClickListener((FragmentBreadCrumbs.OnBreadCrumbClickListener) null);
          }
          return true;
        }
        break;
      case "onCheckedChange":
        if (v instanceof CompoundButton && arg instanceof CompoundButton.OnCheckedChangeListener) {
          if (arg != null) {
            ((CompoundButton) v).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
              public void onCheckedChanged(CompoundButton a0, boolean a1) {
                ((CompoundButton.OnCheckedChangeListener) arg).onCheckedChanged(a0, a1);
                Anvil.render();
              }
            });
          } else {
            ((CompoundButton) v).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
          }
          return true;
        }
        if (v instanceof RadioGroup && arg instanceof RadioGroup.OnCheckedChangeListener) {
          if (arg != null) {
            ((RadioGroup) v).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
              public void onCheckedChanged(RadioGroup a0, int a1) {
                ((RadioGroup.OnCheckedChangeListener) arg).onCheckedChanged(a0, a1);
                Anvil.render();
              }
            });
          } else {
            ((RadioGroup) v).setOnCheckedChangeListener((RadioGroup.OnCheckedChangeListener) null);
          }
          return true;
        }
        break;
      case "onChildClick":
        if (v instanceof ExpandableListView && arg instanceof ExpandableListView.OnChildClickListener) {
          if (arg != null) {
            ((ExpandableListView) v).setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
              public boolean onChildClick(ExpandableListView a0, View a1, int a2, int a3, long a4) {
                boolean r = ((ExpandableListView.OnChildClickListener) arg).onChildClick(a0, a1, a2, a3, a4);
                Anvil.render();
                return r;
              }
            });
          } else {
            ((ExpandableListView) v).setOnChildClickListener((ExpandableListView.OnChildClickListener) null);
          }
          return true;
        }
        break;
      case "onChronometerTick":
        if (v instanceof Chronometer && arg instanceof Chronometer.OnChronometerTickListener) {
          if (arg != null) {
            ((Chronometer) v).setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
              public void onChronometerTick(Chronometer a0) {
                ((Chronometer.OnChronometerTickListener) arg).onChronometerTick(a0);
                Anvil.render();
              }
            });
          } else {
            ((Chronometer) v).setOnChronometerTickListener((Chronometer.OnChronometerTickListener) null);
          }
          return true;
        }
        break;
      case "onClick":
        if (arg != null) {
          v.setOnClickListener(new View.OnClickListener() {
            public void onClick(View a0) {
              ((View.OnClickListener) arg).onClick(a0);
              Anvil.render();
            }
          });
        } else {
          v.setOnClickListener((View.OnClickListener) null);
        }
        return true;
      case "onClose":
        if (v instanceof SearchView && arg instanceof SearchView.OnCloseListener) {
          if (arg != null) {
            ((SearchView) v).setOnCloseListener(new SearchView.OnCloseListener() {
              public boolean onClose() {
                boolean r = ((SearchView.OnCloseListener) arg).onClose();
                Anvil.render();
                return r;
              }
            });
          } else {
            ((SearchView) v).setOnCloseListener((SearchView.OnCloseListener) null);
          }
          return true;
        }
        break;
      case "onCompletion":
        if (v instanceof VideoView && arg instanceof MediaPlayer.OnCompletionListener) {
          if (arg != null) {
            ((VideoView) v).setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
              public void onCompletion(MediaPlayer a0) {
                ((MediaPlayer.OnCompletionListener) arg).onCompletion(a0);
                Anvil.render();
              }
            });
          } else {
            ((VideoView) v).setOnCompletionListener((MediaPlayer.OnCompletionListener) null);
          }
          return true;
        }
        break;
      case "onCreateContextMenu":
        if (arg != null) {
          v.setOnCreateContextMenuListener(new View.OnCreateContextMenuListener() {
            public void onCreateContextMenu(ContextMenu a0, View a1, ContextMenu.ContextMenuInfo a2) {
              ((View.OnCreateContextMenuListener) arg).onCreateContextMenu(a0, a1, a2);
              Anvil.render();
            }
          });
        } else {
          v.setOnCreateContextMenuListener((View.OnCreateContextMenuListener) null);
        }
        return true;
      case "onDateChange":
        if (v instanceof CalendarView && arg instanceof CalendarView.OnDateChangeListener) {
          if (arg != null) {
            ((CalendarView) v).setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
              public void onSelectedDayChange(CalendarView a0, int a1, int a2, int a3) {
                ((CalendarView.OnDateChangeListener) arg).onSelectedDayChange(a0, a1, a2, a3);
                Anvil.render();
              }
            });
          } else {
            ((CalendarView) v).setOnDateChangeListener((CalendarView.OnDateChangeListener) null);
          }
          return true;
        }
        break;
      case "onDismiss":
        if (v instanceof AutoCompleteTextView && arg instanceof AutoCompleteTextView.OnDismissListener) {
          if (arg != null) {
            ((AutoCompleteTextView) v).setOnDismissListener(new AutoCompleteTextView.OnDismissListener() {
              public void onDismiss() {
                ((AutoCompleteTextView.OnDismissListener) arg).onDismiss();
                Anvil.render();
              }
            });
          } else {
            ((AutoCompleteTextView) v).setOnDismissListener((AutoCompleteTextView.OnDismissListener) null);
          }
          return true;
        }
        break;
      case "onDrag":
        if (arg != null) {
          v.setOnDragListener(new View.OnDragListener() {
            public boolean onDrag(View a0, DragEvent a1) {
              boolean r = ((View.OnDragListener) arg).onDrag(a0, a1);
              Anvil.render();
              return r;
            }
          });
        } else {
          v.setOnDragListener((View.OnDragListener) null);
        }
        return true;
      case "onDrawerClose":
        if (v instanceof SlidingDrawer && arg instanceof SlidingDrawer.OnDrawerCloseListener) {
          if (arg != null) {
            ((SlidingDrawer) v).setOnDrawerCloseListener(new SlidingDrawer.OnDrawerCloseListener() {
              public void onDrawerClosed() {
                ((SlidingDrawer.OnDrawerCloseListener) arg).onDrawerClosed();
                Anvil.render();
              }
            });
          } else {
            ((SlidingDrawer) v).setOnDrawerCloseListener((SlidingDrawer.OnDrawerCloseListener) null);
          }
          return true;
        }
        break;
      case "onDrawerOpen":
        if (v instanceof SlidingDrawer && arg instanceof SlidingDrawer.OnDrawerOpenListener) {
          if (arg != null) {
            ((SlidingDrawer) v).setOnDrawerOpenListener(new SlidingDrawer.OnDrawerOpenListener() {
              public void onDrawerOpened() {
                ((SlidingDrawer.OnDrawerOpenListener) arg).onDrawerOpened();
                Anvil.render();
              }
            });
          } else {
            ((SlidingDrawer) v).setOnDrawerOpenListener((SlidingDrawer.OnDrawerOpenListener) null);
          }
          return true;
        }
        break;
      case "onDrawerScroll":
        if (v instanceof SlidingDrawer && arg instanceof SlidingDrawer.OnDrawerScrollListener) {
          if (arg != null) {
            ((SlidingDrawer) v).setOnDrawerScrollListener(new SlidingDrawer.OnDrawerScrollListener() {
              public void onScrollEnded() {
                ((SlidingDrawer.OnDrawerScrollListener) arg).onScrollEnded();
                Anvil.render();
              }

              public void onScrollStarted() {
                ((SlidingDrawer.OnDrawerScrollListener) arg).onScrollStarted();
                Anvil.render();
              }
            });
          } else {
            ((SlidingDrawer) v).setOnDrawerScrollListener((SlidingDrawer.OnDrawerScrollListener) null);
          }
          return true;
        }
        break;
      case "onEditorAction":
        if (v instanceof TextView && arg instanceof TextView.OnEditorActionListener) {
          if (arg != null) {
            ((TextView) v).setOnEditorActionListener(new TextView.OnEditorActionListener() {
              public boolean onEditorAction(TextView a0, int a1, KeyEvent a2) {
                boolean r = ((TextView.OnEditorActionListener) arg).onEditorAction(a0, a1, a2);
                Anvil.render();
                return r;
              }
            });
          } else {
            ((TextView) v).setOnEditorActionListener((TextView.OnEditorActionListener) null);
          }
          return true;
        }
        break;
      case "onError":
        if (v instanceof VideoView && arg instanceof MediaPlayer.OnErrorListener) {
          if (arg != null) {
            ((VideoView) v).setOnErrorListener(new MediaPlayer.OnErrorListener() {
              public boolean onError(MediaPlayer a0, int a1, int a2) {
                boolean r = ((MediaPlayer.OnErrorListener) arg).onError(a0, a1, a2);
                Anvil.render();
                return r;
              }
            });
          } else {
            ((VideoView) v).setOnErrorListener((MediaPlayer.OnErrorListener) null);
          }
          return true;
        }
        break;
      case "onFocusChange":
        if (arg != null) {
          v.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public void onFocusChange(View a0, boolean a1) {
              ((View.OnFocusChangeListener) arg).onFocusChange(a0, a1);
              Anvil.render();
            }
          });
        } else {
          v.setOnFocusChangeListener((View.OnFocusChangeListener) null);
        }
        return true;
      case "onGenericMotion":
        if (arg != null) {
          v.setOnGenericMotionListener(new View.OnGenericMotionListener() {
            public boolean onGenericMotion(View a0, MotionEvent a1) {
              boolean r = ((View.OnGenericMotionListener) arg).onGenericMotion(a0, a1);
              Anvil.render();
              return r;
            }
          });
        } else {
          v.setOnGenericMotionListener((View.OnGenericMotionListener) null);
        }
        return true;
      case "onGroupClick":
        if (v instanceof ExpandableListView && arg instanceof ExpandableListView.OnGroupClickListener) {
          if (arg != null) {
            ((ExpandableListView) v).setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
              public boolean onGroupClick(ExpandableListView a0, View a1, int a2, long a3) {
                boolean r = ((ExpandableListView.OnGroupClickListener) arg).onGroupClick(a0, a1, a2, a3);
                Anvil.render();
                return r;
              }
            });
          } else {
            ((ExpandableListView) v).setOnGroupClickListener((ExpandableListView.OnGroupClickListener) null);
          }
          return true;
        }
        break;
      case "onGroupCollapse":
        if (v instanceof ExpandableListView && arg instanceof ExpandableListView.OnGroupCollapseListener) {
          if (arg != null) {
            ((ExpandableListView) v).setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {
              public void onGroupCollapse(int a0) {
                ((ExpandableListView.OnGroupCollapseListener) arg).onGroupCollapse(a0);
                Anvil.render();
              }
            });
          } else {
            ((ExpandableListView) v).setOnGroupCollapseListener((ExpandableListView.OnGroupCollapseListener) null);
          }
          return true;
        }
        break;
      case "onGroupExpand":
        if (v instanceof ExpandableListView && arg instanceof ExpandableListView.OnGroupExpandListener) {
          if (arg != null) {
            ((ExpandableListView) v).setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
              public void onGroupExpand(int a0) {
                ((ExpandableListView.OnGroupExpandListener) arg).onGroupExpand(a0);
                Anvil.render();
              }
            });
          } else {
            ((ExpandableListView) v).setOnGroupExpandListener((ExpandableListView.OnGroupExpandListener) null);
          }
          return true;
        }
        break;
      case "onHierarchyChange":
        if (v instanceof ViewGroup && arg instanceof ViewGroup.OnHierarchyChangeListener) {
          if (arg != null) {
            ((ViewGroup) v).setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() {
              public void onChildViewAdded(View a0, View a1) {
                ((ViewGroup.OnHierarchyChangeListener) arg).onChildViewAdded(a0, a1);
                Anvil.render();
              }

              public void onChildViewRemoved(View a0, View a1) {
                ((ViewGroup.OnHierarchyChangeListener) arg).onChildViewRemoved(a0, a1);
                Anvil.render();
              }
            });
          } else {
            ((ViewGroup) v).setOnHierarchyChangeListener((ViewGroup.OnHierarchyChangeListener) null);
          }
          return true;
        }
        break;
      case "onHover":
        if (arg != null) {
          v.setOnHoverListener(new View.OnHoverListener() {
            public boolean onHover(View a0, MotionEvent a1) {
              boolean r = ((View.OnHoverListener) arg).onHover(a0, a1);
              Anvil.render();
              return r;
            }
          });
        } else {
          v.setOnHoverListener((View.OnHoverListener) null);
        }
        return true;
      case "onInflate":
        if (v instanceof ViewStub && arg instanceof ViewStub.OnInflateListener) {
          if (arg != null) {
            ((ViewStub) v).setOnInflateListener(new ViewStub.OnInflateListener() {
              public void onInflate(ViewStub a0, View a1) {
                ((ViewStub.OnInflateListener) arg).onInflate(a0, a1);
                Anvil.render();
              }
            });
          } else {
            ((ViewStub) v).setOnInflateListener((ViewStub.OnInflateListener) null);
          }
          return true;
        }
        break;
      case "onInfo":
        if (v instanceof VideoView && arg instanceof MediaPlayer.OnInfoListener) {
          if (arg != null) {
            ((VideoView) v).setOnInfoListener(new MediaPlayer.OnInfoListener() {
              public boolean onInfo(MediaPlayer a0, int a1, int a2) {
                boolean r = ((MediaPlayer.OnInfoListener) arg).onInfo(a0, a1, a2);
                Anvil.render();
                return r;
              }
            });
          } else {
            ((VideoView) v).setOnInfoListener((MediaPlayer.OnInfoListener) null);
          }
          return true;
        }
        break;
      case "onItemClick":
        if (v instanceof AdapterView && arg instanceof AdapterView.OnItemClickListener) {
          if (arg != null) {
            ((AdapterView) v).setOnItemClickListener(new AdapterView.OnItemClickListener() {
              public void onItemClick(AdapterView a0, View a1, int a2, long a3) {
                ((AdapterView.OnItemClickListener) arg).onItemClick(a0, a1, a2, a3);
                Anvil.render();
              }
            });
          } else {
            ((AdapterView) v).setOnItemClickListener((AdapterView.OnItemClickListener) null);
          }
          return true;
        }
        if (v instanceof AutoCompleteTextView && arg instanceof AdapterView.OnItemClickListener) {
          if (arg != null) {
            ((AutoCompleteTextView) v).setOnItemClickListener(new AdapterView.OnItemClickListener() {
              public void onItemClick(AdapterView a0, View a1, int a2, long a3) {
                ((AdapterView.OnItemClickListener) arg).onItemClick(a0, a1, a2, a3);
                Anvil.render();
              }
            });
          } else {
            ((AutoCompleteTextView) v).setOnItemClickListener((AdapterView.OnItemClickListener) null);
          }
          return true;
        }
        break;
      case "onItemLongClick":
        if (v instanceof AdapterView && arg instanceof AdapterView.OnItemLongClickListener) {
          if (arg != null) {
            ((AdapterView) v).setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
              public boolean onItemLongClick(AdapterView a0, View a1, int a2, long a3) {
                boolean r = ((AdapterView.OnItemLongClickListener) arg).onItemLongClick(a0, a1, a2, a3);
                Anvil.render();
                return r;
              }
            });
          } else {
            ((AdapterView) v).setOnItemLongClickListener((AdapterView.OnItemLongClickListener) null);
          }
          return true;
        }
        break;
      case "onItemSelected":
        if (v instanceof AdapterView && arg instanceof AdapterView.OnItemSelectedListener) {
          if (arg != null) {
            ((AdapterView) v).setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
              public void onItemSelected(AdapterView a0, View a1, int a2, long a3) {
                ((AdapterView.OnItemSelectedListener) arg).onItemSelected(a0, a1, a2, a3);
                Anvil.render();
              }

              public void onNothingSelected(AdapterView a0) {
                ((AdapterView.OnItemSelectedListener) arg).onNothingSelected(a0);
                Anvil.render();
              }
            });
          } else {
            ((AdapterView) v).setOnItemSelectedListener((AdapterView.OnItemSelectedListener) null);
          }
          return true;
        }
        if (v instanceof AutoCompleteTextView && arg instanceof AdapterView.OnItemSelectedListener) {
          if (arg != null) {
            ((AutoCompleteTextView) v).setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
              public void onItemSelected(AdapterView a0, View a1, int a2, long a3) {
                ((AdapterView.OnItemSelectedListener) arg).onItemSelected(a0, a1, a2, a3);
                Anvil.render();
              }

              public void onNothingSelected(AdapterView a0) {
                ((AdapterView.OnItemSelectedListener) arg).onNothingSelected(a0);
                Anvil.render();
              }
            });
          } else {
            ((AutoCompleteTextView) v).setOnItemSelectedListener((AdapterView.OnItemSelectedListener) null);
          }
          return true;
        }
        break;
      case "onKey":
        if (arg != null) {
          v.setOnKeyListener(new View.OnKeyListener() {
            public boolean onKey(View a0, int a1, KeyEvent a2) {
              boolean r = ((View.OnKeyListener) arg).onKey(a0, a1, a2);
              Anvil.render();
              return r;
            }
          });
        } else {
          v.setOnKeyListener((View.OnKeyListener) null);
        }
        return true;
      case "onKeyboardAction":
        if (v instanceof KeyboardView && arg instanceof KeyboardView.OnKeyboardActionListener) {
          if (arg != null) {
            ((KeyboardView) v).setOnKeyboardActionListener(new KeyboardView.OnKeyboardActionListener() {
              public void onKey(int a0, int[] a1) {
                ((KeyboardView.OnKeyboardActionListener) arg).onKey(a0, a1);
                Anvil.render();
              }

              public void onPress(int a0) {
                ((KeyboardView.OnKeyboardActionListener) arg).onPress(a0);
                Anvil.render();
              }

              public void onRelease(int a0) {
                ((KeyboardView.OnKeyboardActionListener) arg).onRelease(a0);
                Anvil.render();
              }

              public void onText(CharSequence a0) {
                ((KeyboardView.OnKeyboardActionListener) arg).onText(a0);
                Anvil.render();
              }

              public void swipeDown() {
                ((KeyboardView.OnKeyboardActionListener) arg).swipeDown();
                Anvil.render();
              }

              public void swipeLeft() {
                ((KeyboardView.OnKeyboardActionListener) arg).swipeLeft();
                Anvil.render();
              }

              public void swipeRight() {
                ((KeyboardView.OnKeyboardActionListener) arg).swipeRight();
                Anvil.render();
              }

              public void swipeUp() {
                ((KeyboardView.OnKeyboardActionListener) arg).swipeUp();
                Anvil.render();
              }
            });
          } else {
            ((KeyboardView) v).setOnKeyboardActionListener((KeyboardView.OnKeyboardActionListener) null);
          }
          return true;
        }
        break;
      case "onLongClick":
        if (arg != null) {
          v.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View a0) {
              boolean r = ((View.OnLongClickListener) arg).onLongClick(a0);
              Anvil.render();
              return r;
            }
          });
        } else {
          v.setOnLongClickListener((View.OnLongClickListener) null);
        }
        return true;
      case "onLongPressUpdateInterval":
        if (v instanceof NumberPicker && arg instanceof Long) {
          ((NumberPicker) v).setOnLongPressUpdateInterval((long) arg);
          return true;
        }
        break;
      case "onMenuItemClick":
        if (v instanceof ActionMenuView && arg instanceof ActionMenuView.OnMenuItemClickListener) {
          if (arg != null) {
            ((ActionMenuView) v).setOnMenuItemClickListener(new ActionMenuView.OnMenuItemClickListener() {
              public boolean onMenuItemClick(MenuItem a0) {
                boolean r = ((ActionMenuView.OnMenuItemClickListener) arg).onMenuItemClick(a0);
                Anvil.render();
                return r;
              }
            });
          } else {
            ((ActionMenuView) v).setOnMenuItemClickListener((ActionMenuView.OnMenuItemClickListener) null);
          }
          return true;
        }
        if (v instanceof Toolbar && arg instanceof Toolbar.OnMenuItemClickListener) {
          if (arg != null) {
            ((Toolbar) v).setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
              public boolean onMenuItemClick(MenuItem a0) {
                boolean r = ((Toolbar.OnMenuItemClickListener) arg).onMenuItemClick(a0);
                Anvil.render();
                return r;
              }
            });
          } else {
            ((Toolbar) v).setOnMenuItemClickListener((Toolbar.OnMenuItemClickListener) null);
          }
          return true;
        }
        break;
      case "onPrepared":
        if (v instanceof VideoView && arg instanceof MediaPlayer.OnPreparedListener) {
          if (arg != null) {
            ((VideoView) v).setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
              public void onPrepared(MediaPlayer a0) {
                ((MediaPlayer.OnPreparedListener) arg).onPrepared(a0);
                Anvil.render();
              }
            });
          } else {
            ((VideoView) v).setOnPreparedListener((MediaPlayer.OnPreparedListener) null);
          }
          return true;
        }
        break;
      case "onQueryText":
        if (v instanceof SearchView && arg instanceof SearchView.OnQueryTextListener) {
          if (arg != null) {
            ((SearchView) v).setOnQueryTextListener(new SearchView.OnQueryTextListener() {
              public boolean onQueryTextChange(String a0) {
                boolean r = ((SearchView.OnQueryTextListener) arg).onQueryTextChange(a0);
                Anvil.render();
                return r;
              }

              public boolean onQueryTextSubmit(String a0) {
                boolean r = ((SearchView.OnQueryTextListener) arg).onQueryTextSubmit(a0);
                Anvil.render();
                return r;
              }
            });
          } else {
            ((SearchView) v).setOnQueryTextListener((SearchView.OnQueryTextListener) null);
          }
          return true;
        }
        break;
      case "onQueryTextFocusChange":
        if (v instanceof SearchView && arg instanceof View.OnFocusChangeListener) {
          if (arg != null) {
            ((SearchView) v).setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener() {
              public void onFocusChange(View a0, boolean a1) {
                ((View.OnFocusChangeListener) arg).onFocusChange(a0, a1);
                Anvil.render();
              }
            });
          } else {
            ((SearchView) v).setOnQueryTextFocusChangeListener((View.OnFocusChangeListener) null);
          }
          return true;
        }
        break;
      case "onRatingBarChange":
        if (v instanceof RatingBar && arg instanceof RatingBar.OnRatingBarChangeListener) {
          if (arg != null) {
            ((RatingBar) v).setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
              public void onRatingChanged(RatingBar a0, float a1, boolean a2) {
                ((RatingBar.OnRatingBarChangeListener) arg).onRatingChanged(a0, a1, a2);
                Anvil.render();
              }
            });
          } else {
            ((RatingBar) v).setOnRatingBarChangeListener((RatingBar.OnRatingBarChangeListener) null);
          }
          return true;
        }
        break;
      case "onScroll":
        if (v instanceof AbsListView && arg instanceof AbsListView.OnScrollListener) {
          if (arg != null) {
            ((AbsListView) v).setOnScrollListener(new AbsListView.OnScrollListener() {
              public void onScroll(AbsListView a0, int a1, int a2, int a3) {
                ((AbsListView.OnScrollListener) arg).onScroll(a0, a1, a2, a3);
                Anvil.render();
              }

              public void onScrollStateChanged(AbsListView a0, int a1) {
                ((AbsListView.OnScrollListener) arg).onScrollStateChanged(a0, a1);
                Anvil.render();
              }
            });
          } else {
            ((AbsListView) v).setOnScrollListener((AbsListView.OnScrollListener) null);
          }
          return true;
        }
        if (v instanceof NumberPicker && arg instanceof NumberPicker.OnScrollListener) {
          if (arg != null) {
            ((NumberPicker) v).setOnScrollListener(new NumberPicker.OnScrollListener() {
              public void onScrollStateChange(NumberPicker a0, int a1) {
                ((NumberPicker.OnScrollListener) arg).onScrollStateChange(a0, a1);
                Anvil.render();
              }
            });
          } else {
            ((NumberPicker) v).setOnScrollListener((NumberPicker.OnScrollListener) null);
          }
          return true;
        }
        break;
      case "onSearchClick":
        if (v instanceof SearchView && arg instanceof View.OnClickListener) {
          if (arg != null) {
            ((SearchView) v).setOnSearchClickListener(new View.OnClickListener() {
              public void onClick(View a0) {
                ((View.OnClickListener) arg).onClick(a0);
                Anvil.render();
              }
            });
          } else {
            ((SearchView) v).setOnSearchClickListener((View.OnClickListener) null);
          }
          return true;
        }
        break;
      case "onSeekBarChange":
        if (v instanceof SeekBar && arg instanceof SeekBar.OnSeekBarChangeListener) {
          if (arg != null) {
            ((SeekBar) v).setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
              public void onProgressChanged(SeekBar a0, int a1, boolean a2) {
                ((SeekBar.OnSeekBarChangeListener) arg).onProgressChanged(a0, a1, a2);
                Anvil.render();
              }

              public void onStartTrackingTouch(SeekBar a0) {
                ((SeekBar.OnSeekBarChangeListener) arg).onStartTrackingTouch(a0);
                Anvil.render();
              }

              public void onStopTrackingTouch(SeekBar a0) {
                ((SeekBar.OnSeekBarChangeListener) arg).onStopTrackingTouch(a0);
                Anvil.render();
              }
            });
          } else {
            ((SeekBar) v).setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener) null);
          }
          return true;
        }
        break;
      case "onSuggestion":
        if (v instanceof SearchView && arg instanceof SearchView.OnSuggestionListener) {
          if (arg != null) {
            ((SearchView) v).setOnSuggestionListener(new SearchView.OnSuggestionListener() {
              public boolean onSuggestionClick(int a0) {
                boolean r = ((SearchView.OnSuggestionListener) arg).onSuggestionClick(a0);
                Anvil.render();
                return r;
              }

              public boolean onSuggestionSelect(int a0) {
                boolean r = ((SearchView.OnSuggestionListener) arg).onSuggestionSelect(a0);
                Anvil.render();
                return r;
              }
            });
          } else {
            ((SearchView) v).setOnSuggestionListener((SearchView.OnSuggestionListener) null);
          }
          return true;
        }
        break;
      case "onSystemUiVisibilityChange":
        if (arg != null) {
          v.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
            public void onSystemUiVisibilityChange(int a0) {
              ((View.OnSystemUiVisibilityChangeListener) arg).onSystemUiVisibilityChange(a0);
              Anvil.render();
            }
          });
        } else {
          v.setOnSystemUiVisibilityChangeListener((View.OnSystemUiVisibilityChangeListener) null);
        }
        return true;
      case "onTabChanged":
        if (v instanceof TabHost && arg instanceof TabHost.OnTabChangeListener) {
          if (arg != null) {
            ((TabHost) v).setOnTabChangedListener(new TabHost.OnTabChangeListener() {
              public void onTabChanged(String a0) {
                ((TabHost.OnTabChangeListener) arg).onTabChanged(a0);
                Anvil.render();
              }
            });
          } else {
            ((TabHost) v).setOnTabChangedListener((TabHost.OnTabChangeListener) null);
          }
          return true;
        }
        break;
      case "onTimeChanged":
        if (v instanceof TimePicker && arg instanceof TimePicker.OnTimeChangedListener) {
          if (arg != null) {
            ((TimePicker) v).setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
              public void onTimeChanged(TimePicker a0, int a1, int a2) {
                ((TimePicker.OnTimeChangedListener) arg).onTimeChanged(a0, a1, a2);
                Anvil.render();
              }
            });
          } else {
            ((TimePicker) v).setOnTimeChangedListener((TimePicker.OnTimeChangedListener) null);
          }
          return true;
        }
        break;
      case "onTouch":
        if (arg != null) {
          v.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View a0, MotionEvent a1) {
              boolean r = ((View.OnTouchListener) arg).onTouch(a0, a1);
              Anvil.render();
              return r;
            }
          });
        } else {
          v.setOnTouchListener((View.OnTouchListener) null);
        }
        return true;
      case "onUnhandledInputEvent":
        if (v instanceof TvView && arg instanceof TvView.OnUnhandledInputEventListener) {
          if (arg != null) {
            ((TvView) v).setOnUnhandledInputEventListener(new TvView.OnUnhandledInputEventListener() {
              public boolean onUnhandledInputEvent(InputEvent a0) {
                boolean r = ((TvView.OnUnhandledInputEventListener) arg).onUnhandledInputEvent(a0);
                Anvil.render();
                return r;
              }
            });
          } else {
            ((TvView) v).setOnUnhandledInputEventListener((TvView.OnUnhandledInputEventListener) null);
          }
          return true;
        }
        break;
      case "onValueChanged":
        if (v instanceof NumberPicker && arg instanceof NumberPicker.OnValueChangeListener) {
          if (arg != null) {
            ((NumberPicker) v).setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
              public void onValueChange(NumberPicker a0, int a1, int a2) {
                ((NumberPicker.OnValueChangeListener) arg).onValueChange(a0, a1, a2);
                Anvil.render();
              }
            });
          } else {
            ((NumberPicker) v).setOnValueChangedListener((NumberPicker.OnValueChangeListener) null);
          }
          return true;
        }
        break;
      case "onZoomInClick":
        if (v instanceof ZoomControls && arg instanceof View.OnClickListener) {
          if (arg != null) {
            ((ZoomControls) v).setOnZoomInClickListener(new View.OnClickListener() {
              public void onClick(View a0) {
                ((View.OnClickListener) arg).onClick(a0);
                Anvil.render();
              }
            });
          } else {
            ((ZoomControls) v).setOnZoomInClickListener((View.OnClickListener) null);
          }
          return true;
        }
        break;
      case "onZoomOutClick":
        if (v instanceof ZoomControls && arg instanceof View.OnClickListener) {
          if (arg != null) {
            ((ZoomControls) v).setOnZoomOutClickListener(new View.OnClickListener() {
              public void onClick(View a0) {
                ((View.OnClickListener) arg).onClick(a0);
                Anvil.render();
              }
            });
          } else {
            ((ZoomControls) v).setOnZoomOutClickListener((View.OnClickListener) null);
          }
          return true;
        }
        break;
      case "opaque":
        if (v instanceof TextureView && arg instanceof Boolean) {
          ((TextureView) v).setOpaque((boolean) arg);
          return true;
        }
        break;
      case "orientation":
        if (v instanceof GestureOverlayView && arg instanceof Integer) {
          ((GestureOverlayView) v).setOrientation((int) arg);
          return true;
        }
        if (v instanceof GridLayout && arg instanceof Integer) {
          ((GridLayout) v).setOrientation((int) arg);
          return true;
        }
        if (v instanceof LinearLayout && arg instanceof Integer) {
          ((LinearLayout) v).setOrientation((int) arg);
          return true;
        }
        break;
      case "outAnimation":
        if (v instanceof AdapterViewAnimator && arg instanceof ObjectAnimator) {
          ((AdapterViewAnimator) v).setOutAnimation((ObjectAnimator) arg);
          return true;
        }
        if (v instanceof ViewAnimator && arg instanceof Animation) {
          ((ViewAnimator) v).setOutAnimation((Animation) arg);
          return true;
        }
        break;
      case "outlineProvider":
        if (arg instanceof ViewOutlineProvider) {
          v.setOutlineProvider((ViewOutlineProvider) arg);
          return true;
        }
        break;
      case "overScrollMode":
        if (arg instanceof Integer) {
          v.setOverScrollMode((int) arg);
          return true;
        }
        break;
      case "overlay":
        if (v instanceof QuickContactBadge && arg instanceof Drawable) {
          ((QuickContactBadge) v).setOverlay((Drawable) arg);
          return true;
        }
        break;
      case "overscrollFooter":
        if (v instanceof ListView && arg instanceof Drawable) {
          ((ListView) v).setOverscrollFooter((Drawable) arg);
          return true;
        }
        break;
      case "overscrollHeader":
        if (v instanceof ListView && arg instanceof Drawable) {
          ((ListView) v).setOverscrollHeader((Drawable) arg);
          return true;
        }
        break;
      case "paintFlags":
        if (v instanceof TextView && arg instanceof Integer) {
          ((TextView) v).setPaintFlags((int) arg);
          return true;
        }
        break;
      case "persistentDrawingCache":
        if (v instanceof ViewGroup && arg instanceof Integer) {
          ((ViewGroup) v).setPersistentDrawingCache((int) arg);
          return true;
        }
        break;
      case "pivotX":
        if (arg instanceof Float) {
          v.setPivotX((float) arg);
          return true;
        }
        break;
      case "pivotY":
        if (arg instanceof Float) {
          v.setPivotY((float) arg);
          return true;
        }
        break;
      case "popupBackgroundDrawable":
        if (v instanceof Spinner && arg instanceof Drawable) {
          ((Spinner) v).setPopupBackgroundDrawable((Drawable) arg);
          return true;
        }
        break;
      case "popupBackgroundResource":
        if (v instanceof Spinner && arg instanceof Integer) {
          ((Spinner) v).setPopupBackgroundResource((int) arg);
          return true;
        }
        break;
      case "popupParent":
        if (v instanceof KeyboardView && arg instanceof View) {
          ((KeyboardView) v).setPopupParent((View) arg);
          return true;
        }
        break;
      case "popupTheme":
        if (v instanceof ActionMenuView && arg instanceof Integer) {
          ((ActionMenuView) v).setPopupTheme((int) arg);
          return true;
        }
        if (v instanceof Toolbar && arg instanceof Integer) {
          ((Toolbar) v).setPopupTheme((int) arg);
          return true;
        }
        break;
      case "preserveEGLContextOnPause":
        if (v instanceof GLSurfaceView && arg instanceof Boolean) {
          ((GLSurfaceView) v).setPreserveEGLContextOnPause((boolean) arg);
          return true;
        }
        break;
      case "pressed":
        if (arg instanceof Boolean) {
          v.setPressed((boolean) arg);
          return true;
        }
        break;
      case "previewEnabled":
        if (v instanceof KeyboardView && arg instanceof Boolean) {
          ((KeyboardView) v).setPreviewEnabled((boolean) arg);
          return true;
        }
        break;
      case "privateImeOptions":
        if (v instanceof TextView && arg instanceof String) {
          ((TextView) v).setPrivateImeOptions((String) arg);
          return true;
        }
        break;
      case "progress":
        if (v instanceof ProgressBar && arg instanceof Integer) {
          ((ProgressBar) v).setProgress((int) arg);
          return true;
        }
        break;
      case "progressBackgroundTintList":
        if (v instanceof ProgressBar && (arg == null || arg instanceof ColorStateList)) {
          ((ProgressBar) v).setProgressBackgroundTintList((ColorStateList) arg);
          return true;
        }
        break;
      case "progressBackgroundTintMode":
        if (v instanceof ProgressBar && (arg == null || arg instanceof PorterDuff.Mode)) {
          ((ProgressBar) v).setProgressBackgroundTintMode((PorterDuff.Mode) arg);
          return true;
        }
        break;
      case "progressDrawable":
        if (v instanceof ProgressBar && arg instanceof Drawable) {
          ((ProgressBar) v).setProgressDrawable((Drawable) arg);
          return true;
        }
        break;
      case "progressDrawableTiled":
        if (v instanceof ProgressBar && arg instanceof Drawable) {
          ((ProgressBar) v).setProgressDrawableTiled((Drawable) arg);
          return true;
        }
        break;
      case "progressTintList":
        if (v instanceof ProgressBar && (arg == null || arg instanceof ColorStateList)) {
          ((ProgressBar) v).setProgressTintList((ColorStateList) arg);
          return true;
        }
        break;
      case "progressTintMode":
        if (v instanceof ProgressBar && (arg == null || arg instanceof PorterDuff.Mode)) {
          ((ProgressBar) v).setProgressTintMode((PorterDuff.Mode) arg);
          return true;
        }
        break;
      case "prompt":
        if (v instanceof Spinner && arg instanceof CharSequence) {
          ((Spinner) v).setPrompt((CharSequence) arg);
          return true;
        }
        break;
      case "promptId":
        if (v instanceof Spinner && arg instanceof Integer) {
          ((Spinner) v).setPromptId((int) arg);
          return true;
        }
        break;
      case "proximityCorrectionEnabled":
        if (v instanceof KeyboardView && arg instanceof Boolean) {
          ((KeyboardView) v).setProximityCorrectionEnabled((boolean) arg);
          return true;
        }
        break;
      case "queryHint":
        if (v instanceof SearchView && (arg == null || arg instanceof CharSequence)) {
          ((SearchView) v).setQueryHint((CharSequence) arg);
          return true;
        }
        break;
      case "queryRefinementEnabled":
        if (v instanceof SearchView && arg instanceof Boolean) {
          ((SearchView) v).setQueryRefinementEnabled((boolean) arg);
          return true;
        }
        break;
      case "rating":
        if (v instanceof RatingBar && arg instanceof Float) {
          ((RatingBar) v).setRating((float) arg);
          return true;
        }
        break;
      case "rawInputType":
        if (v instanceof TextView && arg instanceof Integer) {
          ((TextView) v).setRawInputType((int) arg);
          return true;
        }
        break;
      case "recyclerListener":
        if (v instanceof AbsListView && arg instanceof AbsListView.RecyclerListener) {
          ((AbsListView) v).setRecyclerListener((AbsListView.RecyclerListener) arg);
          return true;
        }
        break;
      case "remoteViewsAdapter":
        if (v instanceof AbsListView && arg instanceof Intent) {
          ((AbsListView) v).setRemoteViewsAdapter((Intent) arg);
          return true;
        }
        if (v instanceof AdapterViewAnimator && arg instanceof Intent) {
          ((AdapterViewAnimator) v).setRemoteViewsAdapter((Intent) arg);
          return true;
        }
        break;
      case "renderMode":
        if (v instanceof GLSurfaceView && arg instanceof Integer) {
          ((GLSurfaceView) v).setRenderMode((int) arg);
          return true;
        }
        break;
      case "renderer":
        if (v instanceof GLSurfaceView && arg instanceof GLSurfaceView.Renderer) {
          ((GLSurfaceView) v).setRenderer((GLSurfaceView.Renderer) arg);
          return true;
        }
        break;
      case "right":
        if (arg instanceof Integer) {
          v.setRight((int) arg);
          return true;
        }
        break;
      case "rightStripDrawable":
        if (v instanceof TabWidget && (arg == null || arg instanceof Drawable)) {
          ((TabWidget) v).setRightStripDrawable((Drawable) arg);
          return true;
        }
        if (v instanceof TabWidget && arg instanceof Integer) {
          ((TabWidget) v).setRightStripDrawable((int) arg);
          return true;
        }
        break;
      case "rotation":
        if (arg instanceof Float) {
          v.setRotation((float) arg);
          return true;
        }
        break;
      case "rotationX":
        if (arg instanceof Float) {
          v.setRotationX((float) arg);
          return true;
        }
        break;
      case "rotationY":
        if (arg instanceof Float) {
          v.setRotationY((float) arg);
          return true;
        }
        break;
      case "routeTypes":
        if (v instanceof MediaRouteButton && arg instanceof Integer) {
          ((MediaRouteButton) v).setRouteTypes((int) arg);
          return true;
        }
        break;
      case "rowCount":
        if (v instanceof GridLayout && arg instanceof Integer) {
          ((GridLayout) v).setRowCount((int) arg);
          return true;
        }
        break;
      case "rowOrderPreserved":
        if (v instanceof GridLayout && arg instanceof Boolean) {
          ((GridLayout) v).setRowOrderPreserved((boolean) arg);
          return true;
        }
        break;
      case "saveEnabled":
        if (arg instanceof Boolean) {
          v.setSaveEnabled((boolean) arg);
          return true;
        }
        break;
      case "saveFromParentEnabled":
        if (arg instanceof Boolean) {
          v.setSaveFromParentEnabled((boolean) arg);
          return true;
        }
        break;
      case "scaleType":
        if (v instanceof ImageView && arg instanceof ImageView.ScaleType) {
          ((ImageView) v).setScaleType((ImageView.ScaleType) arg);
          return true;
        }
        break;
      case "scaleX":
        if (arg instanceof Float) {
          v.setScaleX((float) arg);
          return true;
        }
        break;
      case "scaleY":
        if (arg instanceof Float) {
          v.setScaleY((float) arg);
          return true;
        }
        break;
      case "scrollBarDefaultDelayBeforeFade":
        if (arg instanceof Integer) {
          v.setScrollBarDefaultDelayBeforeFade((int) arg);
          return true;
        }
        break;
      case "scrollBarFadeDuration":
        if (arg instanceof Integer) {
          v.setScrollBarFadeDuration((int) arg);
          return true;
        }
        break;
      case "scrollBarSize":
        if (arg instanceof Integer) {
          v.setScrollBarSize((int) arg);
          return true;
        }
        break;
      case "scrollBarStyle":
        if (arg instanceof Integer) {
          v.setScrollBarStyle((int) arg);
          return true;
        }
        break;
      case "scrollContainer":
        if (arg instanceof Boolean) {
          v.setScrollContainer((boolean) arg);
          return true;
        }
        break;
      case "scrollX":
        if (arg instanceof Integer) {
          v.setScrollX((int) arg);
          return true;
        }
        break;
      case "scrollY":
        if (arg instanceof Integer) {
          v.setScrollY((int) arg);
          return true;
        }
        break;
      case "scrollbarFadingEnabled":
        if (arg instanceof Boolean) {
          v.setScrollbarFadingEnabled((boolean) arg);
          return true;
        }
        break;
      case "scroller":
        if (v instanceof TextView && arg instanceof Scroller) {
          ((TextView) v).setScroller((Scroller) arg);
          return true;
        }
        break;
      case "scrollingCacheEnabled":
        if (v instanceof AbsListView && arg instanceof Boolean) {
          ((AbsListView) v).setScrollingCacheEnabled((boolean) arg);
          return true;
        }
        break;
      case "searchableInfo":
        if (v instanceof SearchView && arg instanceof SearchableInfo) {
          ((SearchView) v).setSearchableInfo((SearchableInfo) arg);
          return true;
        }
        break;
      case "secondaryProgress":
        if (v instanceof ProgressBar && arg instanceof Integer) {
          ((ProgressBar) v).setSecondaryProgress((int) arg);
          return true;
        }
        break;
      case "secondaryProgressTintList":
        if (v instanceof ProgressBar && (arg == null || arg instanceof ColorStateList)) {
          ((ProgressBar) v).setSecondaryProgressTintList((ColorStateList) arg);
          return true;
        }
        break;
      case "secondaryProgressTintMode":
        if (v instanceof ProgressBar && (arg == null || arg instanceof PorterDuff.Mode)) {
          ((ProgressBar) v).setSecondaryProgressTintMode((PorterDuff.Mode) arg);
          return true;
        }
        break;
      case "secure":
        if (v instanceof SurfaceView && arg instanceof Boolean) {
          ((SurfaceView) v).setSecure((boolean) arg);
          return true;
        }
        break;
      case "selectAllOnFocus":
        if (v instanceof TextView && arg instanceof Boolean) {
          ((TextView) v).setSelectAllOnFocus((boolean) arg);
          return true;
        }
        break;
      case "selected":
        if (arg instanceof Boolean) {
          v.setSelected((boolean) arg);
          return true;
        }
        break;
      case "selectedDateVerticalBar":
        if (v instanceof CalendarView && arg instanceof Drawable) {
          ((CalendarView) v).setSelectedDateVerticalBar((Drawable) arg);
          return true;
        }
        if (v instanceof CalendarView && arg instanceof Integer) {
          ((CalendarView) v).setSelectedDateVerticalBar((int) arg);
          return true;
        }
        break;
      case "selectedGroup":
        if (v instanceof ExpandableListView && arg instanceof Integer) {
          ((ExpandableListView) v).setSelectedGroup((int) arg);
          return true;
        }
        break;
      case "selectedWeekBackgroundColor":
        if (v instanceof CalendarView && arg instanceof Integer) {
          ((CalendarView) v).setSelectedWeekBackgroundColor((int) arg);
          return true;
        }
        break;
      case "selection":
        if (v instanceof AdapterView && arg instanceof Integer) {
          ((AdapterView) v).setSelection((int) arg);
          return true;
        }
        if (v instanceof EditText && arg instanceof Integer) {
          ((EditText) v).setSelection((int) arg);
          return true;
        }
        break;
      case "selector":
        if (v instanceof AbsListView && arg instanceof Drawable) {
          ((AbsListView) v).setSelector((Drawable) arg);
          return true;
        }
        if (v instanceof AbsListView && arg instanceof Integer) {
          ((AbsListView) v).setSelector((int) arg);
          return true;
        }
        break;
      case "shifted":
        if (v instanceof KeyboardView && arg instanceof Boolean) {
          ((KeyboardView) v).setShifted((boolean) arg);
          return true;
        }
        break;
      case "showDividers":
        if (v instanceof LinearLayout && arg instanceof Integer) {
          ((LinearLayout) v).setShowDividers((int) arg);
          return true;
        }
        break;
      case "showSoftInputOnFocus":
        if (v instanceof TextView && arg instanceof Boolean) {
          ((TextView) v).setShowSoftInputOnFocus((boolean) arg);
          return true;
        }
        break;
      case "showText":
        if (v instanceof Switch && arg instanceof Boolean) {
          ((Switch) v).setShowText((boolean) arg);
          return true;
        }
        break;
      case "showWeekNumber":
        if (v instanceof CalendarView && arg instanceof Boolean) {
          ((CalendarView) v).setShowWeekNumber((boolean) arg);
          return true;
        }
        break;
      case "shownWeekCount":
        if (v instanceof CalendarView && arg instanceof Integer) {
          ((CalendarView) v).setShownWeekCount((int) arg);
          return true;
        }
        break;
      case "shrinkAllColumns":
        if (v instanceof TableLayout && arg instanceof Boolean) {
          ((TableLayout) v).setShrinkAllColumns((boolean) arg);
          return true;
        }
        break;
      case "singleLine":
        if (v instanceof TextView && arg instanceof Boolean) {
          ((TextView) v).setSingleLine((boolean) arg);
          return true;
        }
        break;
      case "smoothScrollbarEnabled":
        if (v instanceof AbsListView && arg instanceof Boolean) {
          ((AbsListView) v).setSmoothScrollbarEnabled((boolean) arg);
          return true;
        }
        break;
      case "smoothScrollingEnabled":
        if (v instanceof HorizontalScrollView && arg instanceof Boolean) {
          ((HorizontalScrollView) v).setSmoothScrollingEnabled((boolean) arg);
          return true;
        }
        if (v instanceof ScrollView && arg instanceof Boolean) {
          ((ScrollView) v).setSmoothScrollingEnabled((boolean) arg);
          return true;
        }
        break;
      case "soundEffectsEnabled":
        if (arg instanceof Boolean) {
          v.setSoundEffectsEnabled((boolean) arg);
          return true;
        }
        break;
      case "spacing":
        if (v instanceof Gallery && arg instanceof Integer) {
          ((Gallery) v).setSpacing((int) arg);
          return true;
        }
        break;
      case "spannableFactory":
        if (v instanceof TextView && arg instanceof Spannable.Factory) {
          ((TextView) v).setSpannableFactory((Spannable.Factory) arg);
          return true;
        }
        break;
      case "spinnersShown":
        if (v instanceof DatePicker && arg instanceof Boolean) {
          ((DatePicker) v).setSpinnersShown((boolean) arg);
          return true;
        }
        break;
      case "splitTrack":
        if (v instanceof AbsSeekBar && arg instanceof Boolean) {
          ((AbsSeekBar) v).setSplitTrack((boolean) arg);
          return true;
        }
        if (v instanceof Switch && arg instanceof Boolean) {
          ((Switch) v).setSplitTrack((boolean) arg);
          return true;
        }
        break;
      case "stackFromBottom":
        if (v instanceof AbsListView && arg instanceof Boolean) {
          ((AbsListView) v).setStackFromBottom((boolean) arg);
          return true;
        }
        break;
      case "stateListAnimator":
        if (arg instanceof StateListAnimator) {
          v.setStateListAnimator((StateListAnimator) arg);
          return true;
        }
        break;
      case "stepSize":
        if (v instanceof RatingBar && arg instanceof Float) {
          ((RatingBar) v).setStepSize((float) arg);
          return true;
        }
        break;
      case "streamVolume":
        if (v instanceof TvView && arg instanceof Float) {
          ((TvView) v).setStreamVolume((float) arg);
          return true;
        }
        break;
      case "stretchAllColumns":
        if (v instanceof TableLayout && arg instanceof Boolean) {
          ((TableLayout) v).setStretchAllColumns((boolean) arg);
          return true;
        }
        break;
      case "stretchMode":
        if (v instanceof GridView && arg instanceof Integer) {
          ((GridView) v).setStretchMode((int) arg);
          return true;
        }
        break;
      case "stripEnabled":
        if (v instanceof TabWidget && arg instanceof Boolean) {
          ((TabWidget) v).setStripEnabled((boolean) arg);
          return true;
        }
        break;
      case "submitButtonEnabled":
        if (v instanceof SearchView && arg instanceof Boolean) {
          ((SearchView) v).setSubmitButtonEnabled((boolean) arg);
          return true;
        }
        break;
      case "subtitle":
        if (v instanceof Toolbar && arg instanceof Integer) {
          ((Toolbar) v).setSubtitle((int) arg);
          return true;
        }
        if (v instanceof Toolbar && arg instanceof CharSequence) {
          ((Toolbar) v).setSubtitle((CharSequence) arg);
          return true;
        }
        break;
      case "subtitleTextColor":
        if (v instanceof Toolbar && arg instanceof Integer) {
          ((Toolbar) v).setSubtitleTextColor((int) arg);
          return true;
        }
        break;
      case "suggestionsAdapter":
        if (v instanceof SearchView && arg instanceof CursorAdapter) {
          ((SearchView) v).setSuggestionsAdapter((CursorAdapter) arg);
          return true;
        }
        break;
      case "surfaceTexture":
        if (v instanceof TextureView && arg instanceof SurfaceTexture) {
          ((TextureView) v).setSurfaceTexture((SurfaceTexture) arg);
          return true;
        }
        break;
      case "surfaceTextureListener":
        if (v instanceof TextureView && arg instanceof TextureView.SurfaceTextureListener) {
          ((TextureView) v).setSurfaceTextureListener((TextureView.SurfaceTextureListener) arg);
          return true;
        }
        break;
      case "switchMinWidth":
        if (v instanceof Switch && arg instanceof Integer) {
          ((Switch) v).setSwitchMinWidth((int) arg);
          return true;
        }
        break;
      case "switchPadding":
        if (v instanceof Switch && arg instanceof Integer) {
          ((Switch) v).setSwitchPadding((int) arg);
          return true;
        }
        break;
      case "switchTypeface":
        if (v instanceof Switch && arg instanceof Typeface) {
          ((Switch) v).setSwitchTypeface((Typeface) arg);
          return true;
        }
        break;
      case "systemUiVisibility":
        if (arg instanceof Integer) {
          v.setSystemUiVisibility((int) arg);
          return true;
        }
        break;
      case "tag":
        if (arg instanceof Object) {
          v.setTag((Object) arg);
          return true;
        }
        break;
      case "text":
        if (v instanceof TextView && arg instanceof Integer) {
          ((TextView) v).setText((int) arg);
          return true;
        }
        if (v instanceof TextSwitcher && arg instanceof CharSequence) {
          ((TextSwitcher) v).setText((CharSequence) arg);
          return true;
        }
        break;
      case "textAlignment":
        if (arg instanceof Integer) {
          v.setTextAlignment((int) arg);
          return true;
        }
        break;
      case "textColor":
        if (v instanceof TextView && arg instanceof ColorStateList) {
          ((TextView) v).setTextColor((ColorStateList) arg);
          return true;
        }
        if (v instanceof TextView && arg instanceof Integer) {
          ((TextView) v).setTextColor((int) arg);
          return true;
        }
        break;
      case "textDirection":
        if (arg instanceof Integer) {
          v.setTextDirection((int) arg);
          return true;
        }
        break;
      case "textFilterEnabled":
        if (v instanceof AbsListView && arg instanceof Boolean) {
          ((AbsListView) v).setTextFilterEnabled((boolean) arg);
          return true;
        }
        break;
      case "textIsSelectable":
        if (v instanceof TextView && arg instanceof Boolean) {
          ((TextView) v).setTextIsSelectable((boolean) arg);
          return true;
        }
        break;
      case "textKeepState":
        if (v instanceof TextView && arg instanceof CharSequence) {
          ((TextView) v).setTextKeepState((CharSequence) arg);
          return true;
        }
        break;
      case "textLocale":
        if (v instanceof TextView && arg instanceof Locale) {
          ((TextView) v).setTextLocale((Locale) arg);
          return true;
        }
        break;
      case "textOff":
        if (v instanceof Switch && arg instanceof CharSequence) {
          ((Switch) v).setTextOff((CharSequence) arg);
          return true;
        }
        if (v instanceof ToggleButton && arg instanceof CharSequence) {
          ((ToggleButton) v).setTextOff((CharSequence) arg);
          return true;
        }
        break;
      case "textOn":
        if (v instanceof Switch && arg instanceof CharSequence) {
          ((Switch) v).setTextOn((CharSequence) arg);
          return true;
        }
        if (v instanceof ToggleButton && arg instanceof CharSequence) {
          ((ToggleButton) v).setTextOn((CharSequence) arg);
          return true;
        }
        break;
      case "textScaleX":
        if (v instanceof TextView && arg instanceof Float) {
          ((TextView) v).setTextScaleX((float) arg);
          return true;
        }
        break;
      case "threshold":
        if (v instanceof AutoCompleteTextView && arg instanceof Integer) {
          ((AutoCompleteTextView) v).setThreshold((int) arg);
          return true;
        }
        break;
      case "thumb":
        if (v instanceof AbsSeekBar && arg instanceof Drawable) {
          ((AbsSeekBar) v).setThumb((Drawable) arg);
          return true;
        }
        break;
      case "thumbDrawable":
        if (v instanceof Switch && arg instanceof Drawable) {
          ((Switch) v).setThumbDrawable((Drawable) arg);
          return true;
        }
        break;
      case "thumbOffset":
        if (v instanceof AbsSeekBar && arg instanceof Integer) {
          ((AbsSeekBar) v).setThumbOffset((int) arg);
          return true;
        }
        break;
      case "thumbResource":
        if (v instanceof Switch && arg instanceof Integer) {
          ((Switch) v).setThumbResource((int) arg);
          return true;
        }
        break;
      case "thumbTextPadding":
        if (v instanceof Switch && arg instanceof Integer) {
          ((Switch) v).setThumbTextPadding((int) arg);
          return true;
        }
        break;
      case "thumbTintList":
        if (v instanceof AbsSeekBar && (arg == null || arg instanceof ColorStateList)) {
          ((AbsSeekBar) v).setThumbTintList((ColorStateList) arg);
          return true;
        }
        break;
      case "thumbTintMode":
        if (v instanceof AbsSeekBar && (arg == null || arg instanceof PorterDuff.Mode)) {
          ((AbsSeekBar) v).setThumbTintMode((PorterDuff.Mode) arg);
          return true;
        }
        break;
      case "timeZone":
        if (v instanceof TextClock && arg instanceof String) {
          ((TextClock) v).setTimeZone((String) arg);
          return true;
        }
        break;
      case "title":
        if (v instanceof Toolbar && arg instanceof Integer) {
          ((Toolbar) v).setTitle((int) arg);
          return true;
        }
        if (v instanceof Toolbar && arg instanceof CharSequence) {
          ((Toolbar) v).setTitle((CharSequence) arg);
          return true;
        }
        break;
      case "titleTextColor":
        if (v instanceof Toolbar && arg instanceof Integer) {
          ((Toolbar) v).setTitleTextColor((int) arg);
          return true;
        }
        break;
      case "tokenizer":
        if (v instanceof MultiAutoCompleteTextView && arg instanceof MultiAutoCompleteTextView.Tokenizer) {
          ((MultiAutoCompleteTextView) v).setTokenizer((MultiAutoCompleteTextView.Tokenizer) arg);
          return true;
        }
        break;
      case "top":
        if (arg instanceof Integer) {
          v.setTop((int) arg);
          return true;
        }
        break;
      case "touchDelegate":
        if (arg instanceof TouchDelegate) {
          v.setTouchDelegate((TouchDelegate) arg);
          return true;
        }
        break;
      case "touchscreenBlocksFocus":
        if (v instanceof ViewGroup && arg instanceof Boolean) {
          ((ViewGroup) v).setTouchscreenBlocksFocus((boolean) arg);
          return true;
        }
        break;
      case "trackDrawable":
        if (v instanceof Switch && arg instanceof Drawable) {
          ((Switch) v).setTrackDrawable((Drawable) arg);
          return true;
        }
        break;
      case "trackResource":
        if (v instanceof Switch && arg instanceof Integer) {
          ((Switch) v).setTrackResource((int) arg);
          return true;
        }
        break;
      case "transcriptMode":
        if (v instanceof AbsListView && arg instanceof Integer) {
          ((AbsListView) v).setTranscriptMode((int) arg);
          return true;
        }
        break;
      case "transform":
        if (v instanceof TextureView && arg instanceof Matrix) {
          ((TextureView) v).setTransform((Matrix) arg);
          return true;
        }
        break;
      case "transformationMethod":
        if (v instanceof TextView && arg instanceof TransformationMethod) {
          ((TextView) v).setTransformationMethod((TransformationMethod) arg);
          return true;
        }
        break;
      case "transitionGroup":
        if (v instanceof ViewGroup && arg instanceof Boolean) {
          ((ViewGroup) v).setTransitionGroup((boolean) arg);
          return true;
        }
        break;
      case "transitionName":
        if (arg instanceof String) {
          v.setTransitionName((String) arg);
          return true;
        }
        break;
      case "translationX":
        if (arg instanceof Float) {
          v.setTranslationX((float) arg);
          return true;
        }
        break;
      case "translationY":
        if (arg instanceof Float) {
          v.setTranslationY((float) arg);
          return true;
        }
        break;
      case "translationZ":
        if (arg instanceof Float) {
          v.setTranslationZ((float) arg);
          return true;
        }
        break;
      case "typeface":
        if (v instanceof TextView && (arg == null || arg instanceof Typeface)) {
          ((TextView) v).setTypeface((Typeface) arg);
          return true;
        }
        break;
      case "uncertainGestureColor":
        if (v instanceof GestureOverlayView && arg instanceof Integer) {
          ((GestureOverlayView) v).setUncertainGestureColor((int) arg);
          return true;
        }
        break;
      case "unfocusedMonthDateColor":
        if (v instanceof CalendarView && arg instanceof Integer) {
          ((CalendarView) v).setUnfocusedMonthDateColor((int) arg);
          return true;
        }
        break;
      case "unselectedAlpha":
        if (v instanceof Gallery && arg instanceof Float) {
          ((Gallery) v).setUnselectedAlpha((float) arg);
          return true;
        }
        break;
      case "up":
        if (v instanceof TabHost && arg instanceof LocalActivityManager) {
          ((TabHost) v).setup((LocalActivityManager) arg);
          return true;
        }
        break;
      case "useDefaultMargins":
        if (v instanceof GridLayout && arg instanceof Boolean) {
          ((GridLayout) v).setUseDefaultMargins((boolean) arg);
          return true;
        }
        break;
      case "validator":
        if (v instanceof AutoCompleteTextView && arg instanceof AutoCompleteTextView.Validator) {
          ((AutoCompleteTextView) v).setValidator((AutoCompleteTextView.Validator) arg);
          return true;
        }
        break;
      case "value":
        if (v instanceof NumberPicker && arg instanceof Integer) {
          ((NumberPicker) v).setValue((int) arg);
          return true;
        }
        break;
      case "velocityScale":
        if (v instanceof AbsListView && arg instanceof Float) {
          ((AbsListView) v).setVelocityScale((float) arg);
          return true;
        }
        break;
      case "verticalCorrection":
        if (v instanceof KeyboardView && arg instanceof Integer) {
          ((KeyboardView) v).setVerticalCorrection((int) arg);
          return true;
        }
        break;
      case "verticalFadingEdgeEnabled":
        if (arg instanceof Boolean) {
          v.setVerticalFadingEdgeEnabled((boolean) arg);
          return true;
        }
        break;
      case "verticalGravity":
        if (v instanceof LinearLayout && arg instanceof Integer) {
          ((LinearLayout) v).setVerticalGravity((int) arg);
          return true;
        }
        if (v instanceof RelativeLayout && arg instanceof Integer) {
          ((RelativeLayout) v).setVerticalGravity((int) arg);
          return true;
        }
        break;
      case "verticalScrollBarEnabled":
        if (arg instanceof Boolean) {
          v.setVerticalScrollBarEnabled((boolean) arg);
          return true;
        }
        break;
      case "verticalScrollbarOverlay":
        if (v instanceof WebView && arg instanceof Boolean) {
          ((WebView) v).setVerticalScrollbarOverlay((boolean) arg);
          return true;
        }
        break;
      case "verticalScrollbarPosition":
        if (arg instanceof Integer) {
          v.setVerticalScrollbarPosition((int) arg);
          return true;
        }
        break;
      case "verticalSpacing":
        if (v instanceof GridView && arg instanceof Integer) {
          ((GridView) v).setVerticalSpacing((int) arg);
          return true;
        }
        break;
      case "videoPath":
        if (v instanceof VideoView && arg instanceof String) {
          ((VideoView) v).setVideoPath((String) arg);
          return true;
        }
        break;
      case "videoURI":
        if (v instanceof VideoView && arg instanceof Uri) {
          ((VideoView) v).setVideoURI((Uri) arg);
          return true;
        }
        break;
      case "visibility":
        if (arg instanceof Integer) {
          v.setVisibility((int) arg);
          return true;
        }
        break;
      case "webChromeClient":
        if (v instanceof WebView && arg instanceof WebChromeClient) {
          ((WebView) v).setWebChromeClient((WebChromeClient) arg);
          return true;
        }
        break;
      case "webContentsDebuggingEnabled":
        if (v instanceof WebView && arg instanceof Boolean) {
          ((WebView) v).setWebContentsDebuggingEnabled((boolean) arg);
          return true;
        }
        break;
      case "webViewClient":
        if (v instanceof WebView && arg instanceof WebViewClient) {
          ((WebView) v).setWebViewClient((WebViewClient) arg);
          return true;
        }
        break;
      case "weekDayTextAppearance":
        if (v instanceof CalendarView && arg instanceof Integer) {
          ((CalendarView) v).setWeekDayTextAppearance((int) arg);
          return true;
        }
        break;
      case "weekNumberColor":
        if (v instanceof CalendarView && arg instanceof Integer) {
          ((CalendarView) v).setWeekNumberColor((int) arg);
          return true;
        }
        break;
      case "weekSeparatorLineColor":
        if (v instanceof CalendarView && arg instanceof Integer) {
          ((CalendarView) v).setWeekSeparatorLineColor((int) arg);
          return true;
        }
        break;
      case "weightSum":
        if (v instanceof LinearLayout && arg instanceof Float) {
          ((LinearLayout) v).setWeightSum((float) arg);
          return true;
        }
        break;
      case "width":
        if (v instanceof TextView && arg instanceof Integer) {
          ((TextView) v).setWidth((int) arg);
          return true;
        }
        break;
      case "willNotCacheDrawing":
        if (arg instanceof Boolean) {
          v.setWillNotCacheDrawing((boolean) arg);
          return true;
        }
        break;
      case "willNotDraw":
        if (arg instanceof Boolean) {
          v.setWillNotDraw((boolean) arg);
          return true;
        }
        break;
      case "wrapSelectorWheel":
        if (v instanceof NumberPicker && arg instanceof Boolean) {
          ((NumberPicker) v).setWrapSelectorWheel((boolean) arg);
          return true;
        }
        break;
      case "x":
        if (arg instanceof Float) {
          v.setX((float) arg);
          return true;
        }
        break;
      case "y":
        if (arg instanceof Float) {
          v.setY((float) arg);
          return true;
        }
        break;
      case "z":
        if (arg instanceof Float) {
          v.setZ((float) arg);
          return true;
        }
        break;
      case "zOrderMediaOverlay":
        if (v instanceof SurfaceView && arg instanceof Boolean) {
          ((SurfaceView) v).setZOrderMediaOverlay((boolean) arg);
          return true;
        }
        break;
      case "zOrderOnTop":
        if (v instanceof SurfaceView && arg instanceof Boolean) {
          ((SurfaceView) v).setZOrderOnTop((boolean) arg);
          return true;
        }
        break;
      case "zoomSpeed":
        if (v instanceof ZoomButton && arg instanceof Long) {
          ((ZoomButton) v).setZoomSpeed((long) arg);
          return true;
        }
        if (v instanceof ZoomControls && arg instanceof Long) {
          ((ZoomControls) v).setZoomSpeed((long) arg);
          return true;
        }
        break;
    }
    return false;
  }
}
