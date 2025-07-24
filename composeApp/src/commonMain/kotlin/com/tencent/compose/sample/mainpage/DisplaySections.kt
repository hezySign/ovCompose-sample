/*
 * Tencent is pleased to support the open source community by making ovCompose available.
 * Copyright (C) 2025 THL A29 Limited, a Tencent company. All rights reserved.
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

package com.tencent.compose.sample.mainpage

import com.tencent.compose.sample.LinearGradientLine
import com.tencent.compose.sample.MultiTouches
import com.tencent.compose.sample.data.DisplayItem
import com.tencent.compose.sample.data.DisplaySection
import com.tencent.compose.sample.mainpage.sectionItem.BouncingBallsApp
import com.tencent.compose.sample.mainpage.sectionItem.CarouselTransition
import com.tencent.compose.sample.mainpage.sectionItem.CheckboxExamples
import com.tencent.compose.sample.mainpage.sectionItem.DialogExamples
import com.tencent.compose.sample.mainpage.sectionItem.DropdownMenu
import com.tencent.compose.sample.mainpage.sectionItem.FallingBalls
import com.tencent.compose.sample.mainpage.sectionItem.GestureDemo
import com.tencent.compose.sample.mainpage.sectionItem.ImageExamplesScreen
import com.tencent.compose.sample.mainpage.sectionItem.NestedScrollDemo
import com.tencent.compose.sample.mainpage.sectionItem.ProgressIndicatorExamples
import com.tencent.compose.sample.mainpage.sectionItem.SimpleImage
import com.tencent.compose.sample.mainpage.sectionItem.SimpleTextPage
import com.tencent.compose.sample.mainpage.sectionItem.SliderExamples
import com.tencent.compose.sample.mainpage.sectionItem.SwitchExamples
import com.tencent.compose.sample.mainpage.sectionItem.TextField2
import com.tencent.compose.sample.mainpage.sectionItem.TextField3
import com.tencent.compose.sample.mainpage.sectionItem.ManyViewsPage
import com.tencent.compose.sample.mainpage.sectionItem.ManyViewsPage2
import composesample.composeapp.generated.resources.Res
import composesample.composeapp.generated.resources.balls
import composesample.composeapp.generated.resources.carousel
import composesample.composeapp.generated.resources.cat
import composesample.composeapp.generated.resources.checkbox
import composesample.composeapp.generated.resources.dialog
import composesample.composeapp.generated.resources.dog
import composesample.composeapp.generated.resources.falling
import composesample.composeapp.generated.resources.gesture
import composesample.composeapp.generated.resources.gradient
import composesample.composeapp.generated.resources.layers
import composesample.composeapp.generated.resources.menu
import composesample.composeapp.generated.resources.multi_touch
import composesample.composeapp.generated.resources.progress
import composesample.composeapp.generated.resources.scroll
import composesample.composeapp.generated.resources.simple_text
import composesample.composeapp.generated.resources.sliders
import composesample.composeapp.generated.resources.switch
import composesample.composeapp.generated.resources.text_field
import org.jetbrains.compose.resources.ExperimentalResourceApi

@OptIn(ExperimentalResourceApi::class)
internal fun displaySections(): List<DisplaySection> {
    return listOf(
        DisplaySection(
            sectionTitle = "Compose Component",
            items = listOf(
                DisplayItem("dialog", Res.drawable.dialog) { DialogExamples() },
                DisplayItem("switch", Res.drawable.switch) { SwitchExamples() },
                DisplayItem("sliders", Res.drawable.sliders) { SliderExamples() },
                DisplayItem("checkbox", Res.drawable.checkbox) { CheckboxExamples() },
                DisplayItem("progress", Res.drawable.progress) { ProgressIndicatorExamples() },
                DisplayItem("simple-text", Res.drawable.simple_text) { SimpleTextPage() },
                DisplayItem("image-cat", Res.drawable.cat) { SimpleImage() },
                DisplayItem("image-dog", Res.drawable.dog) { ImageExamplesScreen() },
                DisplayItem("carousel", Res.drawable.carousel) { CarouselTransition() },
            )
        ),
        DisplaySection(
            sectionTitle = "Input Box",
            items = listOf(
                DisplayItem("keyboard-type", Res.drawable.text_field) { TextField2() },
                DisplayItem("alert-type", Res.drawable.text_field) { TextField3() },
            )
        ),
        DisplaySection(
            sectionTitle = "Mixed native UI & Gesture",
            items = listOf(
                DisplayItem("NestedScrollDemo", Res.drawable.scroll) { NestedScrollDemo() },
                DisplayItem("MultiTouches", Res.drawable.multi_touch) { MultiTouches() },
                DisplayItem("drag", Res.drawable.gesture) { GestureDemo() }
            ) + platformSections()
        ),
        DisplaySection(
            sectionTitle = "Others",
            items = listOf(
                DisplayItem("Bouncing Balls", Res.drawable.balls) { BouncingBallsApp() },
                DisplayItem("Falling Balls", Res.drawable.falling) { FallingBalls() },
                DisplayItem("DropdownMenu", Res.drawable.menu) { DropdownMenu() },
                DisplayItem("GradientLine", Res.drawable.gradient) { LinearGradientLine() },
                DisplayItem("ManyViewsPage", Res.drawable.layers) { ManyViewsPage(1500) },
                DisplayItem("ManyViewsPage2", Res.drawable.layers) { ManyViewsPage2(1500) }
            )
        )
    )
}

internal expect fun platformSections() : List<DisplayItem>
