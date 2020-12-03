package edu.nf.lsp;

/**
 * 正方形
 */
public class Square extends Rectangle{
//    @Override
//    public void setWidth(int width) {
//        this.width=width;
//        this.height=width;
//    }
//
//    @Override
//    public void setHeight(int height) {
//        this.width=height;
//        this.height=height;
//    }

    /**
     * 遵循里氏替换原则，不应覆盖父类默认行为
     * 但可以在子类增加自己新的行为方法
     * @param side
     */
    public void setSide(int side){
        this.width=side;
        this.height=side;
    }
}
