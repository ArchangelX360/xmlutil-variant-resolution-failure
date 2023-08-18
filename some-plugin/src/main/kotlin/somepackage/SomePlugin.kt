package somepackage

import org.gradle.api.Plugin
import org.gradle.api.Project

class SomePlugin: Plugin<Project> {
    override fun apply(project: Project) {
        // do nothing
    }
}