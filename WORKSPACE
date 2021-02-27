load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")
load("@bazel_tools//tools/build_defs/repo:git.bzl", "git_repository", "new_git_repository")

git_repository(
    name = "rules_java",
    tag="4.0.0",
    remote = "https://github.com/bazelbuild/rules_java.git"
)

RULES_JVM_EXTERNAL_TAG = "2.5"

RULES_JVM_EXTERNAL_SHA = "249e8129914be6d987ca57754516be35a14ea866c616041ff0cd32ea94d2f3a1"

http_archive(
    name = "rules_jvm_external",
    sha256 = RULES_JVM_EXTERNAL_SHA,
    strip_prefix = "rules_jvm_external-%s" % RULES_JVM_EXTERNAL_TAG,
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/%s.zip" % RULES_JVM_EXTERNAL_TAG,
)

BUILD_FILE_CONTENT = """
java_import(
    name = "jetifier_standalone_jars",
    jars = glob(["lib/*.jar"]),
)
java_binary(
    main_class = "com.android.tools.build.jetifier.standalone.Main",
    name = "jetifier_standalone",
    runtime_deps = [
        ":jetifier_standalone_jars"
    ],
    visibility = ["//visibility:public"],
)
"""

http_archive(
    sha256 = "8ef877e8245f8dcf8f379b2cdc4958ba714147eb8d559d8334a1840e137e5a2c",
    strip_prefix = "jetifier-standalone",
    name = "bazel_maven_repository_jetifier",
    url = "https://dl.google.com/dl/android/studio/jetifier-zips/1.0.0-beta08/jetifier-standalone.zip",
    build_file_content = BUILD_FILE_CONTENT,
)

MAVEN_REPOSITORY_RULES_VERSION = "1.2.0"
MAVEN_REPOSITORY_RULES_SHA = "9e23155895d2bfc60b35d2dfd88c91701892a7efba5afacdf00cebc0982229fe"
http_archive(
    name = "maven_repository_rules",
    urls = ["https://github.com/square/bazel_maven_repository/archive/%s.zip" % MAVEN_REPOSITORY_RULES_VERSION],
    type = "zip",
    strip_prefix = "bazel_maven_repository-%s" % MAVEN_REPOSITORY_RULES_VERSION,
    sha256 = MAVEN_REPOSITORY_RULES_SHA,
)
load("@maven_repository_rules//maven:maven.bzl", "maven_repository_specification")

maven_repository_specification(
    name = "maven",
    artifacts = {
        "com.google.guava:guava:25.0-jre": { "sha256": "3fd4341776428c7e0e5c18a7c10de129475b69ab9d30aeafbb5c277bb6074fa9" },
        "com.google.code.findbugs:jsr305:1.3.9": { "insecure": True },
        "org.checkerframework:checker-compat-qual:2.0.0" : { "insecure": True },
        "com.google.errorprone:error_prone_annotations:2.1.3" : { "insecure": True },
        "com.google.j2objc:j2objc-annotations:1.1" : { "insecure": True } ,
        "org.codehaus.mojo:animal-sniffer-annotations:1.14" : { "insecure": True },

    }
)