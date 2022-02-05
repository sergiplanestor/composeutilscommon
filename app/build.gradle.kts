plugins {
    appPlugins().forEach(::id)
}

android {

    namespace = "com.revolhope.composeutilscommon"

    applyAppDefaultConfig()

    applySigningConfig(
        SigningData(
            name = release,
            keystore = file("app_release_keystore.jks"),
            keystorePassword = "ComposeUtilsCommon05022022!:)*",
            alias = "release_sign_key",
            password = "ComposeUtilsCommon05022022!:)*"
        )
    )

    applyAppFlavors()

    applyCompileOptions()

    kotlinOptions { jvmTarget() }

    excludeCommonPackages()
}

dependencies {

    module(name = "common")

    androidCore()
    androidRuntime()

    compose()

    test()
}