package com.laotan.horizontalscrollview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by quantan.liu on 2017/3/4.
 */

public class HorizontalScrollHighDownView extends View {
    public HorizontalScrollHighDownView(Context context) {
        this(context,null);
    }

    public HorizontalScrollHighDownView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public HorizontalScrollHighDownView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);


    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint mPaint = new Paint();
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.WHITE);
       canvas.drawCircle(360,1050,1000,mPaint);
    }
}



