package github.gggxbbb.tujianlite_compose.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import github.gggxbbb.tujianlite_compose.data.TujianPic
import github.gggxbbb.tujianlite_compose.ui.theme.TujianLiteTheme

@Composable
fun OnePic(pic: TujianPic) {

    Box(
        contentAlignment = Alignment.BottomStart,
    ) {
        Image(
            painter = rememberImagePainter(pic.p_url),
            contentDescription = pic.p_title,
            modifier = Modifier.width(IntrinsicSize.Max)
        )
        Column {
            Text(text = pic.p_title)
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    val pic = TujianPic(
        PID = "6b54f29e-1afb-11ec-a2ad-c07c56ee9ffc",
        p_title = "胡桃！yyds！",
        p_content = "两个叫胡桃的都很可爱啊    \n图源：[Pixiv#Sayu](https://www.pixiv.net/artworks/87326546 \"Pixiv#Sayu\")",
        width = 640,
        height = 905,
        username = "全村人的希望",
        p_link = "https://img.dpic.dev/efbe2505162361a989130d4a7856c8f4",
        TID = "4ac1c07f-a9f7-11e8-a8ea-0202761b0892",
        p_date = "2021-09-23",
        theme_color = "#fef9fd",
        text_color = "#000000",
        nativePath = "/202109/efbe2505162361a989130d4a7856c8f4.jpg"
    )
    TujianLiteTheme {
        OnePic(pic)
    }
}