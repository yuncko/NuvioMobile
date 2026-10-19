package com.nuvio.app.features.addons

/** Stremio-compatible sources automatically made available by Hearbor. */
internal object BuiltInAddonSources {
    const val OPEN_SUBTITLES = "https://opensubtitlesv3-pro.dexter21767.com/manifest.json"
    const val COMET = "https://comet.elfhosted.com/manifest.json"

    val manifestUrls: List<String> = listOf(
        OPEN_SUBTITLES,
        COMET,
    )

    fun displayName(manifestUrl: String): String? = when (manifestUrl) {
        OPEN_SUBTITLES -> "OpenSubtitles V3 Pro"
        COMET -> "Comet"
        else -> null
    }

    fun contains(manifestUrl: String): Boolean = manifestUrl in manifestUrls
}
