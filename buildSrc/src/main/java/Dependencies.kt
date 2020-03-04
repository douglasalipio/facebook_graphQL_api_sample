object PluginDependencies {
	val gradle = "com.android.tools.build:gradle:${Versions.gradleAndroidPlugin}"
	val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
}

object ProjectDependencies {
	val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
	val ktlint = "com.github.shyiko:ktlint:${Versions.ktlint}"

	val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
	val androidX = "androidx.core:core-ktx:${Versions.androidX}"
	val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constrantLayout}"

	val facebookSdk = "com.facebook.android:facebook-android-sdk:${Versions.facebookSdk}"
	val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
	val gson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
	val loggingInterceptor =
		"com.squareup.okhttp3:logging-interceptor:${Versions.loggingInterceptor}"

	val daggerAndroid = "com.google.dagger:dagger-android:${Versions.dagger}"
	val daggerAnnotationProcessor = "com.google.dagger:dagger-android-processor:${Versions.dagger}"
	val daggerCompiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"
	val javaInject = "javax.inject:javax.inject:${Versions.javaxInject}"

	val junit = "junit:junit:${Versions.junit}"
	val assertJ = "org.assertj:assertj-core:${Versions.assertJ}"
	val mockito = "org.mockito:mockito-core:${Versions.mockito}"
	val mockitoKotlin = "com.nhaarman:mockito-kotlin:${Versions.mockitoKotlin}"
	val androidTestRunner = "com.android.support.test:runner:${Versions.androidTestRunner}"
	val espresso = "com.android.support.test.espresso:espresso-core:${Versions.espresso}"
	val kakao = "com.agoda.kakao:kakao:${Versions.kakao}"
	val lifecycle = "android.arch.lifecycle:extensions:${Versions.lifecycle}"
	val lifecycleTesting = "android.arch.core:core-testing:${Versions.lifecycle}"

	val rxJava2 = "io.reactivex.rxjava2:rxjava:${Versions.rxJava}"
	val rxAndroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxAndroid}"

	val koin = "org.koin:koin-android:${Versions.koin}"
	val koinViewModel = "org.koin:koin-android-viewmodel:${Versions.koin}"
}

object ProjectModules {
	val data = ":data"
	val domain = ":domain"
}

object Versions {
	val gradleAndroidPlugin = "3.5.3"

	val compileSdk = 29
	val targetSdk = 29
	val minSdkVersion = 21
	val releaseVersionCode = 1
	val releaseVersionName = "1.0.0"

	val kotlin = "1.3.61"
	val ktlint = "0.20.0"

	val appcompat = "1.1.0"
	val androidX = "1.1.0"
	val constrantLayout = "1.1.3"

	val retrofit = "2.7.2"
	val facebookSdk = "5.0.0"
	val loggingInterceptor = "3.10.0"

	val dagger = "2.13"
	val javaxInject = "1"

	val rxJava = "2.1.12"
	val rxAndroid = "2.0.2"

	val kakao = "1.4.0"
	val junit = "4.12"
	val androidTestRunner = "1.0.1"
	val espresso = "3.0.1"
	val assertJ = "3.9.1"
	val mockito = "2.18.0"
	val mockitoKotlin = "1.5.0"

	val koin = "1.0.1"
	val lifecycle = "1.1.1"

}
