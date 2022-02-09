package com.github.iamarjun.namethatcolor.services

import com.intellij.openapi.project.Project
import com.github.iamarjun.namethatcolor.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
