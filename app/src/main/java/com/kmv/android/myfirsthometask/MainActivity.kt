package com.kmv.android.myfirsthometask

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.kmv.android.myfirsthometask.databinding.ActivityMainBinding
import com.kmv.android.myfirsthometask.databinding.ToolbarBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var mainActivityBinding: ActivityMainBinding
    lateinit var toolbarBinding: ToolbarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainActivityBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainActivityBinding.root)

        toolbarBinding = ToolbarBinding.inflate(layoutInflater)
        setSupportActionBar(toolbarBinding.myToolbar)

        mainActivityBinding.recycleView1.layoutManager = LinearLayoutManager(this)
        mainActivityBinding.recycleView2.layoutManager = LinearLayoutManager(this)
        mainActivityBinding.recycleView3.layoutManager = LinearLayoutManager(this)

        mainActivityBinding.recycleView1.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        mainActivityBinding.recycleView1.adapter = CatalogAdapter(getCatalogList())

        mainActivityBinding.recycleView2.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        mainActivityBinding.recycleView2.adapter = ProductAdapter(getOfferList())

        mainActivityBinding.recycleView3.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        mainActivityBinding.recycleView3.adapter = ProductAdapter(getBestPrice())

    }


    /*private fun getCatalogList(): List<String> {
        return this.resources.getStringArray(R.array.catalog).toList()
    }

    private fun getOfferList(): List<String> {
        return this.resources.getStringArray(R.array.limited_offer).toList()
    }*/

    private fun getCatalogList(): ArrayList<RecycleItem> {
        val recycleItems = ArrayList<RecycleItem>()
        recycleItems.add(RecycleItem("??????", R.drawable.plant))
        recycleItems.add(RecycleItem("????????????????????????????", R.drawable.ic_baseline_catching_pokemon_24))
        recycleItems.add(RecycleItem("?????????????????? ??????????????", R.drawable.ic_baseline_catching_pokemon_24))
        recycleItems.add(RecycleItem("???????? ?? ??????????", R.drawable.ic_baseline_catching_pokemon_24))
        recycleItems.add(RecycleItem("??????????????????????????", R.drawable.ic_baseline_catching_pokemon_24))
        recycleItems.add(RecycleItem("???????????????? ??????", R.drawable.ic_baseline_catching_pokemon_24))

        return recycleItems
    }

    private fun getOfferList(): ArrayList<RecycleItem> {
        val recycleItems = ArrayList<RecycleItem>()
        recycleItems.add(RecycleItem(PLASTER, R.drawable.ic_baseline_sentiment_neutral_24))
        recycleItems.add(RecycleItem("????????????????????", R.drawable.ic_baseline_catching_pokemon_24))
        recycleItems.add(RecycleItem("??????????????????", R.drawable.ic_baseline_weekend_24))
        recycleItems.add(RecycleItem("?????????? ????????????????", R.drawable.ic_baseline_sentiment_neutral_24))
        recycleItems.add(RecycleItem("?????????? ??????????????????", R.drawable.ic_baseline_catching_pokemon_24))
        recycleItems.add(RecycleItem("???????? ????????????????", R.drawable.ic_baseline_weekend_24))
        recycleItems.add(RecycleItem("????????????????", R.drawable.ic_baseline_sentiment_neutral_24))
        recycleItems.add(RecycleItem("??????????????????", R.drawable.ic_baseline_weekend_24))
        recycleItems.add(RecycleItem("????????????????????????????????????????????", R.drawable.ic_baseline_catching_pokemon_24))
        recycleItems.add(RecycleItem("?????????????? ????????????", R.drawable.ic_baseline_sentiment_neutral_24))

        return recycleItems
    }

    private fun getBestPrice(): ArrayList<RecycleItem> {
        val recycleItems = ArrayList<RecycleItem>()
        recycleItems.add(RecycleItem(WALLPAPER1, R.drawable.ic_baseline_sentiment_neutral_24))
        recycleItems.add(RecycleItem(WALLPAPER2, R.drawable.ic_baseline_catching_pokemon_24))
        recycleItems.add(RecycleItem(TOILET_GEL, R.drawable.ic_baseline_weekend_24))
        recycleItems.add(RecycleItem(GLASS_CLEANER, R.drawable.ic_baseline_sentiment_neutral_24))
        recycleItems.add(RecycleItem(BATH_CLEANER, R.drawable.ic_baseline_catching_pokemon_24))
        recycleItems.add(RecycleItem(RACK, R.drawable.ic_baseline_weekend_24))

        return recycleItems
    }
}