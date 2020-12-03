package edu.nf.lsp;

/**
 * 长方形
 */
public class Rectangle {
    protected int width;
    protected int height;


    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * 计算面积
     * @return
     */
    public int area(){
        return width*height;
    }
}
