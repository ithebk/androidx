/*
 * Copyright 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package androidx.navigation.testing

import android.content.Context
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavHostController

/**
 * Subclass of [NavHostController] that offers additional APIs for testing Navigation.
 */
class TestNavHostController(context: Context) : NavHostController(context) {

    /**
     * Gets an immutable copy of the [elements][NavBackStackEntry] currently on the back stack.
     */
    val backStack get(): List<NavBackStackEntry> = getBackStack().toList()

    init {
        navigatorProvider = TestNavigatorProvider()
    }
}