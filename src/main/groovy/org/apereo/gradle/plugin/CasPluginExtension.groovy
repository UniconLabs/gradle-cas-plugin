package org.apereo.gradle.plugin

class CasPluginExtension {
    String version
    Set features = []

    def cas(Closure c) {
        c.delegate = this
        c()
    }

    def methodMissing(String name, args) {
        this."${name}".addAll(args)
    }
}
