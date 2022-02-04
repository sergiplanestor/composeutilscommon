plugins {
    appPlugins().forEach(::id)
}

android {

    namespace = "com.revolhope.composeutilscommon"

    applyAppDefaultConfig()

    applySigningConfig(
        /*SigningData(
            name = release,
            keystore = file("app_release_keystore.jks"),
            keystorePassword = "SmockLess31012022!:)*",
            alias = "release_sign_key",
            password = "SmockLess31012022!:)*"
        )*/
    )

    applyAppFlavors()

    applyCompileOptions()

    kotlinOptions { jvmTarget() }

    excludeCommonPackages()
}

dependencies {

    androidCore()
    androidRuntime()

    compose()

    test()
}