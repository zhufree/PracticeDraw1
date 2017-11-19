package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {
    Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    Path path = new Path();

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形
        int halfWidth = getWidth()/2;
        int halfHeight = getHeight()/2;
        mPaint.setStyle(Paint.Style.FILL);
        // 左边弧形
        path.addArc(halfWidth-100, halfHeight-50, halfWidth, halfHeight+50, -225, 225);
        // 右边弧形
        path.arcTo(halfWidth, halfHeight-50, halfWidth+100, halfHeight+50, 180, 225, false);
        // 连接到底部
        path.lineTo(halfWidth, halfHeight+125);
        canvas.drawPath(path, mPaint);
    }
}
