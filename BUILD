
load("@rules_java//java:defs.bzl", "java_binary", "java_library")

package(default_visibility = ["//visibility:public"])

java_library(
    name = "lib",
    srcs = glob(["src/main/java/com/siu/edu/vn/chess/*.java"]),
    deps = ["@maven//com/google/guava"],
)

java_binary(
    name = "chess",
    main_class = "com.siu.edu.vn.chess.App",
    runtime_deps = [":lib"],
)
