package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {
    Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    int left;
    int bottom;

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private void drawText(Canvas canvas, String text) {
        canvas.drawText(text, left+50, bottom+30, mPaint);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        // 画两条线（x,y轴）
        mPaint.setColor(Color.WHITE);
        mPaint.setStrokeWidth(3);
        canvas.drawLine(100, 50, 100, 600, mPaint);
        canvas.drawLine(100, 600, 1200, 600, mPaint);

        // 画矩形和文字
        mPaint.setColor(Color.GREEN);
        mPaint.setTextSize(30);
        mPaint.setTextAlign(Paint.Align.CENTER);
        left = 100+20;
        bottom = 600;
        canvas.drawRect(left, bottom-5, left+100, bottom, mPaint);
        drawText(canvas, "Froyo");
        left += 120;
        canvas.drawRect(left, bottom-20, left+100, bottom, mPaint);
        drawText(canvas, "GB");
        left += 120;
        canvas.drawRect(left, bottom-20, left+100, bottom, mPaint);
        drawText(canvas, "ICS");
        left += 120;
        canvas.drawRect(left, bottom-150, left+100, bottom, mPaint);
        drawText(canvas, "JB");
        left += 120;
        canvas.drawRect(left, bottom-300, left+100, bottom, mPaint);
        drawText(canvas, "KitKat");
        left += 120;
        canvas.drawRect(left, bottom-350, left+100, bottom, mPaint);
        drawText(canvas, "L");
        left += 120;
        canvas.drawRect(left, bottom-160, left+100, bottom, mPaint);
        drawText(canvas, "M");
    }
}
