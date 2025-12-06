plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
}

// 应用通用库配置
apply(from = "${rootProject.projectDir}/gradles/library.gradle")

android {
    namespace = "com.lzk.core.storage"
}

dependencies {
    // DataStore dependencies
    implementation("androidx.datastore:datastore-preferences:1.0.0")
}
