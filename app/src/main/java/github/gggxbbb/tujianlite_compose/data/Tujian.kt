package github.gggxbbb.tujianlite_compose.data

data class TujianPic(
    val PID: String,
    val p_title: String,
    val p_content: String,
    val width: Int,
    val height: Int,
    val username: String,
    val p_link: String,
    val TID: String,
    val p_date: String,
    val theme_color: String,
    val text_color: String,
    val nativePath: String,
    val p_url: String = "https://s2.images.dailypics.cn$nativePath"
)