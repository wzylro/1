/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yuangonggangzi;

/**
 *
 * @author 27009
 */
public class GongZiText {

    public static void main(String[] args) {
        final int Bace = 4000;
        people[] arrys = new people[4];
        arrys[0] = new GuDingGongZidepeople(18, Bace, "GuDingGongZidepeople");
        arrys[1] = new HourlyWorkwers(23, 19, Bace, "HourlyWorkwers");
        arrys[2] = new XiaoShouYuan(22, 0, "XiaoShouYuan", 10000);
        arrys[3] = new DaiDiXingDeXiaoShouYuan(21, 25, Bace, "DaiDiXingDeXiaoShouYuan");
        for (int i = 0; i < arrys.length; i++) {
            System.out.println(arrys[i]);
        }

    }

}
