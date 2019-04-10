package com.igorvd.chuckfacts.utils.matcher

import android.view.View
import androidx.annotation.DrawableRes
import androidx.annotation.IdRes
import org.hamcrest.Matcher
import org.hamcrest.TypeSafeMatcher

class CustomMatchers {

    companion object {

        fun withDrawable(@DrawableRes drawableRes: Int): TypeSafeMatcher<View> {
            return DrawableMatcher(drawableRes)
        }

        fun withFontSize(fontSize: Float): Matcher<View> {
            return FontSizeMatcher(fontSize)
        }

        fun withRecyclerViewChildAt(
            @IdRes recyclerViewRes: Int,
            @IdRes childId: Int,
            position: Int
        ): Matcher<View> {
            return RecyclerViewMatcher(recyclerViewRes).atPositionOnView(position, childId)
        }

    }


}