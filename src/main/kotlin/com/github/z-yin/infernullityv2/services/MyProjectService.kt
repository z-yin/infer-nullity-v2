package com.github.z-yin.infernullityv2.services

import com.intellij.openapi.project.Project
import com.github.z-yin.infernullityv2.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
