package com.github.edsergeev

import org.gradle.api.Plugin
import org.gradle.api.Project


class JiraUpdaterPlugin implements Plugin<Project> {
    void apply(Project target) {
        def showDevicesTask = target.tasks.create("showDevices") << {
            def adbExe = target.android.getAdbExe().toString()
            println "${adbExe} devices".execute().text
        }

        showDevicesTask.group = "jiraupdater"
        showDevicesTask.description = "cool gradlw plugin for jira"
    }
}
