package com.matthewlogan.reversedrawerlayout;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.matthewlogan.reversedrawerlayout.library.ReverseDrawerLayout;

/**
 * Created by matthewlogan on 6/28/14.
 */
public class SampleActivity extends Activity {

    private ListView listView;
    private ImageView imageView;

    private static int[] images = new int[] {
            R.drawable.pug1,
            R.drawable.pug2,
            R.drawable.pug3,
            R.drawable.pug4,
            R.drawable.pug5,
            R.drawable.pug6,
            R.drawable.pug7,
            R.drawable.pug8,
            R.drawable.pug9
    };

    private static String[] imageNames = new String[] {
            "Baby Pug",
            "Renaissance Pug",
            "Black and White Pugs",
            "Scrunchy Pug",
            "Accusatory Pug",
            "Forest Pug",
            "Profile Pug",
            "Reindeer Pug",
            "Laughing Pug"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);

        ReverseDrawerLayout reverseDrawerLayout = (ReverseDrawerLayout) findViewById(R.id.reverse_drawer_layout);
        reverseDrawerLayout.setScrimColor(0);

        imageView = (ImageView) findViewById(R.id.top_content);
        imageView.setImageResource(images[0]);

        listView = (ListView) findViewById(R.id.bottom_content);
        listView.setAdapter(new ImageAdapter());
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                imageView.setImageResource(images[i]);
            }
        });
    }

    private static class ViewHolder {
        TextView textView;
    }

    private class ImageAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int i) {
            return images[i];
        }

        @Override
        public long getItemId(int i) {
            return images[i];
        }

        @Override
        public View getView(int position, View view, ViewGroup viewGroup) {
            ViewHolder vh;
            if (view == null) {
                LayoutInflater li = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
                view = li.inflate(R.layout.list_item, viewGroup, false);

                vh = new ViewHolder();
                vh.textView = (TextView) view.findViewById(R.id.list_item_text);
                view.setTag(vh);
            } else {
                vh = (ViewHolder) view.getTag();
            }

            vh.textView.setText(imageNames[position]);

            return view;
        }
    }
}
