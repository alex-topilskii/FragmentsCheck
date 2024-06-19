package com.ato.benchmark

import android.content.ComponentName
import android.content.Intent
import androidx.benchmark.macro.CompilationMode
import androidx.benchmark.macro.StartupMode
import androidx.benchmark.macro.StartupTimingMetric
import androidx.benchmark.macro.junit4.MacrobenchmarkRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.ato.fragmentscheck.simpleActivity.SimpleActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * This is an example startup benchmark.
 *
 * It navigates to the device's home screen, and launches the default activity.
 *
 * Before running this benchmark:
 * 1) switch your app's active build variant in the Studio (affects Studio runs only)
 * 2) add `<profileable android:shell="true" />` to your app's manifest, within the `<application>` tag
 *
 * Run this benchmark from Studio to see startup measurements, and captured system traces
 * for investigating your app's performance.
 */
@RunWith(AndroidJUnit4::class)
class ExampleStartupBenchmark {
    @get:Rule
    val benchmarkRule = MacrobenchmarkRule()

    @Test
    fun check_simple_activtiy() = benchmarkRule.measureRepeated(
        packageName = "com.ato.fragmentscheck",
        metrics = listOf(StartupTimingMetric()),
        iterations = 5,
        startupMode = StartupMode.COLD
    ) {
        pressHome()
        val intent = Intent().apply {
            action = Intent.ACTION_VIEW
            addCategory(Intent.CATEGORY_BROWSABLE)
            setPackage(packageName)
            component = ComponentName(packageName, "com.ato.fragmentscheck.simpleActivity.SimpleActivity")
        }

        startActivityAndWait(intent)
    }

    @Test
    fun check_3x30_activtiy() = benchmarkRule.measureRepeated(
        packageName = "com.ato.fragmentscheck",
        metrics = listOf(StartupTimingMetric()),
        iterations = 5,
        startupMode = StartupMode.COLD
    ) {
        pressHome()
        val intent = Intent().apply {
            action = Intent.ACTION_VIEW
            addCategory(Intent.CATEGORY_BROWSABLE)
            setPackage(packageName)
            component = ComponentName(packageName, "com.ato.fragmentscheck.cardsFragment3x30.Activity3x30")
        }

        startActivityAndWait(intent)
    }

    @Test
    fun check_3x30x4_activtiy() = benchmarkRule.measureRepeated(
        packageName = "com.ato.fragmentscheck",
        metrics = listOf(StartupTimingMetric()),
        iterations = 5,
        startupMode = StartupMode.COLD
    ) {
        pressHome()
        val intent = Intent().apply {
            action = Intent.ACTION_VIEW
            addCategory(Intent.CATEGORY_BROWSABLE)
            setPackage(packageName)
            component = ComponentName(packageName, "com.ato.fragmentscheck.cardsFragment3x30x4.Activity3x30x4")
        }

        startActivityAndWait(intent)
    }
}