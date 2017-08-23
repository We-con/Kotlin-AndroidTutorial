
import android.text.TextUtils
import android.widget.TextView
import android.graphics.drawable.AnimationDrawable
import android.graphics.drawable.ColorDrawable
import android.support.v7.app.AppCompatDialog
import android.app.Activity
import android.app.Application
import android.graphics.Color
import android.view.animation.Animation
import android.widget.ImageView
import com.tutorial.mangob.gifprogress.R
import kotlinx.android.synthetic.main.dialog_progress_loading.*

class BaseApplication : Application() {

    private var progressDialog: AppCompatDialog? = null

    companion object {
        var instance: BaseApplication = BaseApplication()
    }

    fun progressON(activity: Activity, message: String) {
        if(progressDialog == null || progressDialog!!.isShowing().not()) {
            progressDialog = AppCompatDialog(activity)
            progressDialog!!.setCancelable(false)
            progressDialog!!.window.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            progressDialog!!.setContentView(R.layout.dialog_progress_loading)
            progressDialog!!.show()
        }

        progressSET(message)

        val imageProcess = progressDialog!!.image_loading_progress
        val frameAnimation = imageProcess.background as? AnimationDrawable
        imageProcess.post { frameAnimation!!.start() }
    }

    fun progressSET(message: String) {
        progressDialog!!.text_loading_title.text = message
    }

    fun progressOFF() {
        if(progressDialog != null && progressDialog!!.isShowing) {
            progressDialog!!.dismiss()
        }
    }

}