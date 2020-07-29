package pe.devussy.droidknights2020

import android.app.Application
import com.facebook.soloader.SoLoader

class SampleApp : Application() {

    override fun onCreate() {
        super.onCreate()

        // for Litho
        SoLoader.init(this, false)
    }
}
