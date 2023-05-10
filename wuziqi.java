/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */package javaapplication1;
import java.util.Scanner;


/**
 *
 * @author 27009
 */public class wuziqi {
    //使用二维数组,实现五子棋功能.
    //⒈⒉⒊⒋⒌⒍⒎⒏⒐⒑如下图
    public static void main(String[] args) {
        String[][] a = new String[15][15];
     String[] c = {" ⒈ ", " ⒉ ", " ⒊ ", " ⒋ ", " ⒌ ", " ⒍ ", " ⒎ ", " ⒏ ", " ⒐ ", " ⒑ ", " ⒒ ", " ⒓ ", " ⒔ ", " ⒕ ", " ⒖ "};

        //初始化棋盘
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                //若判断为棋盘最后一列,则需要将行号c[i]赋值给对应位置,即在最后一列给出行号
                //若判断为棋盘最后一行,则需要将列号c[i]赋值给对应位置,即在最后一行给出列号
                //其余位置放置为"十"即可
                if (j == a.length - 1) {
                    a[i][a.length - 1] = c[i];
                } else if (i == a.length - 1) {
                    a[a.length - 1][j] = c[j];
                } else {
                    a[i][j] = " 十 ";
                }
                System.out.print(a[i][j]);
            }
            System.out.println();
        }

        //双方开始下棋,每下一颗棋子都必须同步更新一次棋盘.
        boolean flag = true;
        out:
        while (true) {
            Scanner input = new Scanner(System.in);
            //黑棋先走,若flag恒等于true，黑方下棋,否则白方下棋.
            if (flag == true) {
                System.out.println("请黑棋下,他的位置是:");
            } else {
                System.out.println("请白棋下,他的位置是:");
            }
            int x = input.nextInt();
            int y = input.nextInt();

            //判断当前用户输入值是否已超出棋盘限定范围。
            if (x < 0 || x > a.length - 1 || y < 0 || y > a.length - 1) {
                System.out.println("当前输入已超出棋盘有限范围，请重新选择位置");
                continue out;
            }
            //判断用户目前输入的位置是否有棋子,若已有棋子则需要重新选择位置。
            if (a[x - 1][y - 1] == " ● " || a[x - 1][y - 1] == " ○ ") {
                System.out.println("当前输入位置已被占用，请重新选择位置");
                continue out;
            }
            //黑方下的棋子输出显示为"●",白方下的棋子输出显示为"○".
            if (flag == true) {
                a[x - 1][y - 1] = " ● ";
                flag = false;
            } else {
                a[x - 1][y - 1] = " ○ ";
                flag = true;
            }

            //更新打印棋盘.
            for (int j = 0; j < a.length; j++) {
                for (int k = 0; k < a.length; k++) {
                    System.out.print(a[j][k]);
                }
                System.out.println();
            }

            //行检验输赢
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length - 4; j++) {
                    if (a[i][j] == a[i][j + 1] && a[i][j] == a[i][j + 2] && a[i][j] == a[i][j + 3] && a[i][j] == a[i][j + 4]) {
                        if (a[i][j] == " ● ") {
                            System.out.println("黑方胜");
                            break out;
                        }
                        if (a[i][j] == " ○ ") {
                            System.out.println("白方胜");
                            break out;
                        }
                    }
                }
            }

            //列检验输赢
            for (int i = 0; i < a.length - 4; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    if (a[i][j] == a[i + 1][j] && a[i][j] == a[i + 2][j] && a[i][j] == a[i + 3][j] && a[i][j] == a[i + 4][j]) {
                        if (a[i][j] == " ● ") {
                            System.out.println("黑方胜");
                            break out;
                        }
                        if (a[i][j] == " ○ ") {
                            System.out.println("白方胜");
                            break out;
                        }
                    }
                }
            }

            //从左上角到右下检验输赢
            for (int i = 0; i < a.length - 4; i++) {
                if (a[i][i] == a[i + 1][i + 1] && a[i][i] == a[i + 2][i + 2] && a[i][i] == a[i + 3][i + 3] && a[i][i] == a[i + 4][i + 4]) {
                    if (a[i][i] == " ● ") {
                        System.out.println("黑方胜");
                        break out;
                    }
                    if (a[i][i] == " ○ ") {
                        System.out.println("白方胜");
                        break out;
                    }
                }
            }

            //从右下角到左上检验输赢
            for (int i = a.length - 1; i > 4; i--) {
                if (a[i][i] == a[i - 1][i - 1] && a[i][i] == a[i - 2][i - 2] && a[i][i] == a[i - 3][i - 3] && a[i][i] == a[i - 4][i - 4]) {
                    if (a[i][i] == " ● ") {
                        System.out.println("黑方胜");
                        break out;
                    }
                    if (a[i][i] == " ○ ") {
                        System.out.println("白方胜");
                        break out;
                    }
                }
            }

            //从左下到右上检验输赢
            for (int i = a.length - 1; i > 4; i--) {
                for (int j = 0; j < a.length - 4; j++) {
                    if (a[i][j] == a[i - 1][j + 1] && a[i][j] == a[i - 2][j + 2] && a[i][j] == a[i - 3][j + 3] && a[i][j] == a[i - 4][j + 4]) {
                        if (a[i][j] == " 十 ") {
                            continue;
                        }
                        if (a[i][j] == " ● ") {
                            System.out.println("黑方胜");
                            break out;
                        }
                        if (a[i][j] == " ○ ") {
                            System.out.println("白方胜");
                            break out;
                        }
                    }
                }
            }

            //从右上角到左下检验输赢
            for (int i = 0; i < a.length - 4; i++) {
                for (int j = a.length - 1; j > 4; j--) {
                    if (a[i][j] == a[i + 1][j - 1] && a[i][j] == a[i + 2][j - 2] && a[i][j] == a[i + 3][j - 3] && a[i][j] == a[i + 4][j - 4]) {
                        if (a[i][j] == " 十 ") {
                            continue;
                        }
                        if (a[i][j] == " ● ") {
                            System.out.println("黑方胜");
                            break out;
                        }
                        if (a[i][j] == " ○ ") {
                            System.out.println("白方胜");
                            break out;
                        }
                    }
                }
            }
        }
    }
}


