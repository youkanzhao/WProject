package com.jyou.activitytracker;

import android.app.TabActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabHost.TabSpec;
import android.widget.Toast;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {
	TabHost tabHost;
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabHost = getTabHost();
        
        TabSpec readingTab = tabHost.newTabSpec(getResources().getString(R.string.tab_reading_str));
        //readingTab.setIndicator("", getResources().getDrawable(R.drawable.tab_bg_reading));
        readingTab.setContent(R.id.tabReading);
        readingTab.setIndicator(getLayoutInflater().inflate(R.layout.tab_reading, null));
        
        
		tabHost.addTab(readingTab);
		
		
		TabSpec graphTab = tabHost.newTabSpec(getResources().getString(R.string.tab_graph_str));
		
		//graphTab.setIndicator("", getResources().getDrawable(R.drawable.tab_bg_graph));
		
		graphTab.setIndicator(getLayoutInflater().inflate(R.layout.tab_graph, null));
		
		graphTab.setContent(R.id.tabGraph);
        
		tabHost.addTab(graphTab);
		
		TabSpec shareTab = tabHost.newTabSpec(getResources().getString(R.string.tab_share_str));
		//shareTab.setIndicator("", getResources().getDrawable(R.drawable.tab_bg_share));
		
		shareTab.setIndicator(getLayoutInflater().inflate(R.layout.tab_share, null));
		
		shareTab.setContent(R.id.tabShare);
        
		tabHost.addTab(shareTab);
		
		tabHost.setBackgroundColor(Color.argb(150, 255, 255, 255));
		tabHost.setCurrentTab(0);
		tabHost.setOnTabChangedListener(new OnTabChangeListener(){
			public void onTabChanged(String tabId){
				Toast.makeText(MainActivity.this, "This is a Test!===" + tabId, Toast.LENGTH_SHORT).show();
			}
		});
    }

}
