# MultiplatformExample

The solution to fix this problem is to add the following flag to gradle.properties

```
kotlin.mpp.import.enableKgpDependencyResolution=false
```

See: https://youtrack.jetbrains.com/issue/KT-60626/jvmTest-sourceSet-unable-to-access-content-from-another-multiplatform-module-in-same-project
