package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {
    Paint mPaint = new Paint();

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int halfWidth = getWidth()/2;
        int halfHeight = getHeight()/2;
        mPaint.setStrokeWidth(10);
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawArc(halfWidth-200, halfHeight-150, halfWidth+200, halfHeight+150, -110, 100, true, mPaint);
        canvas.drawArc(halfWidth-200, halfHeight-150, halfWidth+200, halfHeight+150, 20, 140, false, mPaint);
        mPaint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(halfWidth-200, halfHeight-150, halfWidth+200, halfHeight+150, -180, 60, false, mPaint);
//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
    }
}
