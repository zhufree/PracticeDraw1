package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {
    Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    Path path = new Path();

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        int halfWidth = getWidth()/2;
        int halfHeight = getHeight()/2;
        mPaint.setColor(Color.RED);
        canvas.drawArc(halfWidth-270, halfHeight-270, halfWidth+230, halfHeight+230, -70, -110, true, mPaint);
        mPaint.setColor(Color.YELLOW);
        canvas.drawArc(halfWidth-250, halfHeight-250, halfWidth+250, halfHeight+250, -2, -68, true, mPaint);
        mPaint.setColor(Color.LTGRAY);
        canvas.drawArc(halfWidth-250, halfHeight-250, halfWidth+250, halfHeight+250, 1, -3, true, mPaint);
        mPaint.setColor(Color.MAGENTA);
        canvas.drawArc(halfWidth-250, halfHeight-250, halfWidth+250, halfHeight+250, 1, 9, true, mPaint);
        mPaint.setColor(Color.GRAY);
        canvas.drawArc(halfWidth-250, halfHeight-250, halfWidth+250, halfHeight+250, 11, 10, true, mPaint);
        mPaint.setColor(Color.GREEN);
        canvas.drawArc(halfWidth-250, halfHeight-250, halfWidth+250, halfHeight+250, 23, 45, true, mPaint);
        mPaint.setColor(Color.BLUE);
        canvas.drawArc(halfWidth-250, halfHeight-250, halfWidth+250, halfHeight+250, 70, 110, true, mPaint);

        mPaint.setColor(Color.WHITE);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(2);
        mPaint.setTextSize(30);
        canvas.drawText("Lollipop", 50, 100, mPaint);
        path.moveTo(200, 100);
        path.lineTo(400, 100);
        path.rLineTo(30, 30);
        canvas.drawPath(path, mPaint);

        canvas.drawText("KitKat", 50, 600, mPaint);
        path.moveTo(200, 600);
        path.lineTo(350, 600);
        path.rLineTo(30, -30);
        canvas.drawPath(path, mPaint);

        canvas.drawText("Marshmallow", 900, 200, mPaint);
        path.moveTo(870, 200);
        path.rLineTo(-100, 0);
        path.rLineTo(-30, 30);
        canvas.drawPath(path, mPaint);

        canvas.drawText("Froyo", 900, halfHeight, mPaint);
        path.moveTo(870, halfHeight);
        path.rLineTo(-100, 0);
        canvas.drawPath(path, mPaint);

        canvas.drawText("Gingerbread", 900, halfHeight+50, mPaint);
        path.moveTo(870, halfHeight+50);
        path.rLineTo(-40, 0);
        path.rLineTo(-20, -20);
        path.rLineTo(-30, 0);
        canvas.drawPath(path, mPaint);

        canvas.drawText("Ice Cream", 900, halfHeight+100, mPaint);
        path.moveTo(870, halfHeight+100);
        path.rLineTo(-40, 0);
        path.rLineTo(-20, -30);
        path.rLineTo(-30, 0);
        canvas.drawPath(path, mPaint);

        canvas.drawText("Jelly Bean", 900, halfHeight+200, mPaint);
        path.moveTo(870, halfHeight+200);
        path.rLineTo(-100, 0);
        path.rLineTo(-40, -40);
        canvas.drawPath(path, mPaint);
    }
}
