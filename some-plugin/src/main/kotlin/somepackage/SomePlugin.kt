package somepackage

import org.gradle.api.Plugin
import org.gradle.api.Project
import nl.adaptivity.xmlutil.serialization.XML

class SomePlugin: Plugin<Project> {
    override fun apply(project: Project) {
        val xml = XML()
        println(xml.toString())
    }
}
