
public class Find {
    public static void main(String[] args) {
        int [][] array={
                {1,2,3,4,5,6},
                {7,8,9,10,0,12},
                {8,8,9,10,11,12},
                {7,8,3,10,11,12},
                {88,66,92,102,151,999}
        };
        arrayFindValue(array,999);
    }
    public static void arrayFindValue(int array[][],int value){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j]==value) {
                    System.out.println("值为："+value+"----坐标在：第"+i+"行第"+j+"列");
                    if ((i-1)<0){
                        System.out.println("上方超出边界");
                    }else {
                        System.out.println("元素相邻上方的值："+array[i-1][j]+"坐标为:行"+(i-1)+"列"+j);
                    }
                    if ((i+1)>array.length-1){
                        System.out.println("下方超出边界");
                    }else {
                        System.out.println("元素相邻下方的值："+array[i+1][j]+"坐标为:行"+(i+1)+"列"+j);
                    }
                    if ((j-1)<0){
                        System.out.println("左方超出边界");
                    }else {
                        System.out.println("元素相邻左方的值："+array[i][j-1]+"坐标为:行"+i+"列"+(j-1));
                    }
                    if ((j+1)>array[0].length-1){
                        System.out.println("右方超出边界");
                    }else {
                        System.out.println("元素相邻右方的值："+array[i][j+1]+"坐标为:行"+i+"列"+(j+1));
                    }
                    System.out.println();
                }
            }
        }
    }
}
