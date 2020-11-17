# Kotlinx Extensions
![badge][badge-maven] ![badge][badge-mpp] ![badge][badge-android] ![badge][badge-js] ![badge][badge-jvm]

A Bunch of classes, functions and extensions used in aSoft

## Common Extensions
- `Action<T>(name,handler:(T)->Unit)`
- `Json` -> Preconfigured Json for serialization

## Android Extensions
- ViewHolder -> Helps a lot with findViewById
### Usage
```kotlin
class VH: ViewHolder(view) {
    val name by Id<TextView>(R.id.name)
    val email by Id<EditText>(R.id.email)
}
```

## Js Extensions
Too many of them to write em down
See [here](https://github.com/aSoft-Ltd/kotlinx-extensions/tree/master/src/jsMain/kotlin/tz/co/asoft)

[badge-maven]: https://img.shields.io/maven-central/v/tz.co.asoft/test/1.0.1?style=flat
[badge-mpp]: https://img.shields.io/badge/kotlin-multiplatform-blue?style=flat
[badge-android]: http://img.shields.io/badge/platform-android-brightgreen.svg?style=flat
[badge-js]: http://img.shields.io/badge/platform-js-yellow.svg?style=flat
[badge-jvm]: http://img.shields.io/badge/platform-jvm-orange.svg?style=flat
