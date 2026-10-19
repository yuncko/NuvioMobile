package com.nuvio.app.features.plugins

/** Nuvio-compatible JavaScript scraper repositories included by Hearbor. */
internal object BuiltInPluginRepositories {
    const val ANIME_NUVIO = "https://raw.githubusercontent.com/D3adlyRocket/Anime-Nuvio/refs/heads/main/manifest.json"
    const val YORUIX_PROVIDERS = "https://raw.githubusercontent.com/yoruix/nuvio-providers/refs/heads/main/manifest.json"
    const val ALL_IN_ONE_NUVIO = "https://raw.githubusercontent.com/D3adlyRocket/All-in-One-Nuvio/refs/heads/main/manifest.json"
    const val RAYS_PLUGINS = "https://raw.githubusercontent.com/hihihihihiiray/nuvio-plugins/refs/heads/main/manifest.json"

    val manifestUrls: List<String> = listOf(
        ANIME_NUVIO,
        YORUIX_PROVIDERS,
        ALL_IN_ONE_NUVIO,
        RAYS_PLUGINS,
    )

    fun displayName(manifestUrl: String): String? = when (manifestUrl) {
        ANIME_NUVIO -> "Anime Nuvio"
        YORUIX_PROVIDERS -> "Nuvio Providers"
        ALL_IN_ONE_NUVIO -> "All-in-One Nuvio"
        RAYS_PLUGINS -> "Nuvio Plugins"
        else -> null
    }

    fun contains(manifestUrl: String): Boolean = manifestUrl in manifestUrls
}
