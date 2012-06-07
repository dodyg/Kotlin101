// Module script for production
import kotlin.modules.*
fun project() {
    module("Kotlin101") {
        sources += "F:/Repository/Kotlin101/src/Strings.kt"
        sources += "F:/Repository/Kotlin101/src/HelloWorld.kt"
        // Boot classpath
        classpath += "F:/Program Files/Java/jdk1.6.0_21/jre/lib/alt-rt.jar"
        classpath += "F:/Program Files/Java/jdk1.6.0_21/jre/lib/charsets.jar"
        classpath += "F:/Program Files/Java/jdk1.6.0_21/jre/lib/deploy.jar"
        classpath += "F:/Program Files/Java/jdk1.6.0_21/jre/lib/javaws.jar"
        classpath += "F:/Program Files/Java/jdk1.6.0_21/jre/lib/jce.jar"
        classpath += "F:/Program Files/Java/jdk1.6.0_21/jre/lib/jsse.jar"
        classpath += "F:/Program Files/Java/jdk1.6.0_21/jre/lib/management-agent.jar"
        classpath += "F:/Program Files/Java/jdk1.6.0_21/jre/lib/plugin.jar"
        classpath += "F:/Program Files/Java/jdk1.6.0_21/jre/lib/resources.jar"
        classpath += "F:/Program Files/Java/jdk1.6.0_21/jre/lib/rt.jar"
        classpath += "F:/Program Files/Java/jdk1.6.0_21/jre/lib/ext/dnsns.jar"
        classpath += "F:/Program Files/Java/jdk1.6.0_21/jre/lib/ext/localedata.jar"
        classpath += "F:/Program Files/Java/jdk1.6.0_21/jre/lib/ext/sunjce_provider.jar"
        classpath += "F:/Program Files/Java/jdk1.6.0_21/jre/lib/ext/sunmscapi.jar"
        classpath += "F:/Program Files/Java/jdk1.6.0_21/jre/lib/ext/sunpkcs11.jar"
        // Compilation classpath
        // Output directory, commented out
        //         classpath += "F:/Repository/Kotlin101/out/test/Kotlin101"
        // Output directory, commented out
        //         classpath += "F:/Repository/Kotlin101/out/production/Kotlin101"
        classpath += "F:/Repository/Kotlin101/lib/kotlin-runtime.jar"
        // Java classpath (for Java sources)
        classpath += "C:/Users/Adam/.IdeaIC11/system/compiler/kotlin101.5612a567/.generated/aapt/Kotlin101.9d49f0c3/test"
        classpath += "C:/Users/Adam/.IdeaIC11/system/compiler/kotlin101.5612a567/.generated/aidl/Kotlin101.9d49f0c3/production"
        classpath += "C:/Users/Adam/.IdeaIC11/system/compiler/kotlin101.5612a567/.generated/aidl/Kotlin101.9d49f0c3/test"
        classpath += "C:/Users/Adam/.IdeaIC11/system/compiler/kotlin101.5612a567/.generated/Android_PNG_files_caching_compiler/Kotlin101.9d49f0c3/production"
        classpath += "F:/Repository/Kotlin101/src"
        classpath += "C:/Users/Adam/.IdeaIC11/system/compiler/kotlin101.5612a567/.generated/Android_Renderscript_Compiler/Kotlin101.9d49f0c3/test"
        classpath += "C:/Users/Adam/.IdeaIC11/system/compiler/kotlin101.5612a567/.generated/Android_BuildConfig_Generator/Kotlin101.9d49f0c3/production"
        classpath += "C:/Users/Adam/.IdeaIC11/system/compiler/kotlin101.5612a567/.generated/Android_BuildConfig_Generator/Kotlin101.9d49f0c3/test"
        classpath += "C:/Users/Adam/.IdeaIC11/system/compiler/kotlin101.5612a567/.generated/aapt/Kotlin101.9d49f0c3/production"
        classpath += "C:/Users/Adam/.IdeaIC11/system/compiler/kotlin101.5612a567/.generated/Android_External_Apklib_Extracting_Compiler/Kotlin101.9d49f0c3/test"
        classpath += "C:/Users/Adam/.IdeaIC11/system/compiler/kotlin101.5612a567/.generated/Android_Including_Compiler/Kotlin101.9d49f0c3/production"
        classpath += "C:/Users/Adam/.IdeaIC11/system/compiler/kotlin101.5612a567/.generated/Android_Including_Compiler/Kotlin101.9d49f0c3/test"
        classpath += "C:/Users/Adam/.IdeaIC11/system/compiler/kotlin101.5612a567/.generated/Android_Renderscript_Compiler/Kotlin101.9d49f0c3/production"
        classpath += "C:/Users/Adam/.IdeaIC11/system/compiler/kotlin101.5612a567/.generated/Android_Maven_Resources_Compiler/Kotlin101.9d49f0c3/test"
        classpath += "C:/Users/Adam/.IdeaIC11/system/compiler/kotlin101.5612a567/.generated/Android_Maven_Resources_Compiler/Kotlin101.9d49f0c3/production"
        classpath += "C:/Users/Adam/.IdeaIC11/system/compiler/kotlin101.5612a567/.generated/Android_PNG_files_caching_compiler/Kotlin101.9d49f0c3/test"
        classpath += "C:/Users/Adam/.IdeaIC11/system/compiler/kotlin101.5612a567/.generated/Android_External_Apklib_Extracting_Compiler/Kotlin101.9d49f0c3/production"
        // Main output
    }
}
