package com.txlong.android_iconicsdemo

import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import com.mikepenz.google_material_typeface_library.GoogleMaterial
import com.mikepenz.iconics.IconicsDrawable

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val d = IconicsDrawable(this)
                .icon(GoogleMaterial.Icon.gmd_3d_rotation)
                .color(Color.RED)
                .sizeDp(25)

        findViewById<TextView>(R.id.textView2).setCompoundDrawables(d, d, d, d)
    }
}