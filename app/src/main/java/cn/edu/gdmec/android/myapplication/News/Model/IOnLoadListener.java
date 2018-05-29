package cn.edu.gdmec.android.myapplication.News.Model;

import cn.edu.gdmec.android.myapplication.Bean.NewsBean;

/**
 * Created by apple on 18/5/22.
 */

public interface IOnLoadListener {
    void success(NewsBean newsBean);
    void fail(String error);
}
