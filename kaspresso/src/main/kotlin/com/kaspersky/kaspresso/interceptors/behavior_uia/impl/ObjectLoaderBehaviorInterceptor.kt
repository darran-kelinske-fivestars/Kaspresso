package com.kaspersky.kaspresso.interceptors.behavior_uia.impl

import com.kaspersky.components.uiautomator_dsl.intercepting.action_and_assertion.UiObjectAction
import com.kaspersky.components.uiautomator_dsl.intercepting.action_and_assertion.UiObjectAssertion
import com.kaspersky.components.uiautomator_dsl.intercepting.interaction.UiObjectInteraction
import com.kaspersky.kaspresso.interceptors.behavior_uia.ObjectBehaviorInterceptor
import com.kaspersky.kaspresso.logger.UiTestLogger
import com.kaspersky.kaspresso.objectloader.ObjectLoaderProvider
import com.kaspersky.kaspresso.objectloader.ObjectLoaderProviderImpl

class ObjectLoaderBehaviorInterceptor(
    private val logger: UiTestLogger
) : ObjectBehaviorInterceptor,
    ObjectLoaderProvider by ObjectLoaderProviderImpl(logger) {

    override fun <T> interceptCheck(
        interaction: UiObjectInteraction,
        assertion: UiObjectAssertion,
        activity: () -> T
    ): T = handleObjectAbsence(interaction = interaction, action = activity)

    override fun <T> interceptPerform(
        interaction: UiObjectInteraction,
        action: UiObjectAction,
        activity: () -> T
    ): T = handleObjectAbsence(interaction = interaction, action = activity)
}