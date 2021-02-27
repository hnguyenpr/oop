load("@rules_java//java:defs.bzl", "java_binary", "java_library", "java_test")

package(default_visibility = ["//visibility:public"])

java_library(
    name = "lib",
    srcs = glob(["src/main/java/com/siu/edu/vn/chess/*.java"]),
    deps = ["@maven//com/google/guava"],
)

java_binary(
    name = "example",
    resources = glob(["src/main/resources/*"]),
    main_class = "com.siu.edu.vn.chess.App",
    runtime_deps = [":lib"],
)

java_test(
    name = "tests",
    srcs = glob(["src/main/test/java/com/siu/edu/vn/chess/*.java"]),
    test_class = "com.siu.edu.vn.chess.TestApp",
    deps = [
        ":lib",
        "@maven//com/google/guava",
        "@maven//junit",
    ],
)
