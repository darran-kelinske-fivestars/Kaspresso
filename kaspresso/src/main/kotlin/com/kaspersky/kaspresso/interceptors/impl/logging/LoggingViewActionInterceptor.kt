package com.kaspersky.kaspresso.interceptors.impl.logging

import android.view.View
import android.support.test.espresso.ViewAction
import com.kaspersky.kaspresso.interceptors.ViewActionInterceptor
import com.kaspersky.kaspresso.logger.UiTestLogger
import com.kaspersky.kaspresso.util.describe

/**
 * An implementation of [ViewActionInterceptor] that logs info about [ViewAction].
 */
class LoggingViewActionInterceptor(
    private val logger: UiTestLogger
): ViewActionInterceptor {

    /**
     * Writes info to [logger].
     *
     * @param viewAction responsible for performing an interaction on the given [View] element.
     * @param view an Android [View], on which [viewAction] is performed.
     */
    override fun intercept(viewAction: ViewAction, view: View) {
        logger.i("${viewAction.description} on ${view.describe()}")
    }
}