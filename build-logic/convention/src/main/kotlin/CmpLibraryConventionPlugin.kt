import org.gradle.api.Project
import org.gradle.api.Plugin

class CmpLibraryConventionPlugin:Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.plcoding.convention.kmp.library")
                apply("org.jetbrains.kotlin.plugin.compose")
                apply("org.jetbrains.compose")
            }
        }
    }
}