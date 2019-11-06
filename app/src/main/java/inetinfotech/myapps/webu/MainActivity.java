package inetinfotech.myapps.webu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
WebView wb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wb=findViewById(R.id.Web);
        wb.loadUrl("https://www.keralapsc.gov.in/status_of_advice");
    }
}
