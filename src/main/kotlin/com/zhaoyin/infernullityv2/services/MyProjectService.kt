package com.zhaoyin.infernullityv2.services

import com.intellij.openapi.project.Project
import com.zhaoyin.infernullityv2.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
