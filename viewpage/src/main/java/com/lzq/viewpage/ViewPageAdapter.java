package com.lzq.viewpage;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by Dell on 2016/11/16 0016.
 */
public class ViewPageAdapter extends PagerAdapter {

    private List<ImageView> imageViews;

    public ViewPageAdapter(List<ImageView> imageViews) {
        this.imageViews = imageViews;
    }

    @Override
    public int getCount() {
        return Integer.MAX_VALUE;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    /**
     * 根据position返回对应Page需要显示的视图对象
     * <p/>
     * ViewGroup container : ViewPager对象
     * int position : 下标
     */
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        //Log.e("TAG", "instantiateItem() position="+position);
        position = position % (imageViews.size());
        ImageView imageView = imageViews.get(position);
        container.addView(imageView);
        return imageView;
    }

    /**
     * 根据position移除对应的page
     */
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        //Log.e("TAG", "instantiateItem() position="+position);
        container.removeView((View) object);
    }


}
