package com.example.projetoressoflix

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projetoressoflix.databinding.ActivityHomeressoBinding


class homeresso : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var video = ActivityHomeressoBinding.inflate(layoutInflater)
        setContentView(video.root)

        video.btcarol.setOnClickListener {
            var a = Intent(Intent.ACTION_VIEW, Uri.parse("https://pt.wikipedia.org/wiki/Coraline_(filme)"))
            startActivity(a)
        }

        video.btmons.setOnClickListener {
            var b = Intent(Intent.ACTION_VIEW, Uri.parse("https://pt.wikipedia.org/wiki/Monster_House"))
            startActivity(b)
        }

        video.btluca.setOnClickListener {
            var c = Intent(Intent.ACTION_VIEW, Uri.parse("https://pt.wikipedia.org/wiki/Luca_(2021)"))
            startActivity(c)
        }

        video.btraya.setOnClickListener {
            var d = Intent(Intent.ACTION_VIEW, Uri.parse("https://pt.wikipedia.org/wiki/Raya_e_o_%C3%9Altimo_Drag%C3%A3o"))
            startActivity(d)
        }

        video.btviz.setOnClickListener {
            var e = Intent(Intent.ACTION_VIEW, Uri.parse("https://pt.wikipedia.org/wiki/Neighbors_2:_Sorority_Rising"))
            startActivity(e)
        }

            video.bthdt.setOnClickListener {
                var f = Intent(Intent.ACTION_VIEW, Uri.parse("https://pt.wikipedia.org/wiki/Don%27t_Breathe"))
                startActivity(f)
            }

                video.afterdark.setOnClickListener {
                    var g = Intent(Intent.ACTION_VIEW, Uri.parse("https://m.youtube.com/watch?v=sVx1mJDeUjY"))
                    startActivity(g)
                }

                    video.darkred.setOnClickListener {
                        var h = Intent(Intent.ACTION_VIEW, Uri.parse("https://m.youtube.com/watch?v=xRzbLQ_WKPs"))
                        startActivity(h)
                    }

                        video.daddy.setOnClickListener {
                            var i = Intent(Intent.ACTION_VIEW, Uri.parse("https://m.youtube.com/watch?v=vnLAa6_hB9A"))
                            startActivity(i)
                        }

                            video.czc.setOnClickListener {
                                var j = Intent(Intent.ACTION_VIEW, Uri.parse("https://m.youtube.com/watch?v=Dw7ine3xH20"))
                                startActivity(j)
                            }

                                video.tellem.setOnClickListener {
                                    var k = Intent(Intent.ACTION_VIEW, Uri.parse("https://m.youtube.com/watch?v=eH_TOrddnZ0"))
                                    startActivity(k)
                                }

                                    video.mtmt.setOnClickListener {
                                        var l = Intent(Intent.ACTION_VIEW, Uri.parse("https://m.youtube.com/watch?v=sYtFEk1B-ZE"))
                                        startActivity(l)
                                    }


                                }
                            }