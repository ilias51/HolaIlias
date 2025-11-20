package cat.dam.ilias.holailias.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import cat.dam.ilias.holailias.R

// Definim la família de fonts usant el ttf de res/font
val ItalicFamily = FontFamily(
    Font(R.font.italic, FontWeight.Normal)
)

val AppTypography = Typography(
    bodyLarge = TextStyle(
        fontFamily = ItalicFamily,
        fontSize = 16.sp
    ),
    titleLarge = TextStyle(
        fontFamily = ItalicFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp
    )
)