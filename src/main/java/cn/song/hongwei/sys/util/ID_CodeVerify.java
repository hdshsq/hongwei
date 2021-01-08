package cn.song.hongwei.sys.util;

/**
 * @program: hongwei
 * @description: 身份证号码验证
 * @author: Mr.Song
 * @create: 2020-10-15 10:20
 **/
public class ID_CodeVerify {

    public boolean verify(String ID_Code) {

        //获取身份证
        String[] iD_code = ID_Code.split("");
        if (iD_code.length != 18) {
            System.out.println("输入不正确");
            return false;
        }
        //身份证系数
        int[] ans = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
        String[] answer = {"1", "0", "X", "9", "8", "7", "6", "5", "4", "3", "2"};
        int count = 0;
        for (int i = 0; i < iD_code.length-1; i++) {
            System.out.print(iD_code[i]);
            //除尾号外全部转为数字
            Integer number = Integer.valueOf(iD_code[i]);
            count += number * ans[i];
        }
        //取余数验证尾号
        int remainder = count % 11;
        //验证
        if (iD_code[17].equals(answer[remainder])){
            System.out.println("身份正确");
            return true;
        }else {
            System.out.println("不正确:"+answer[remainder]);
            return false;
        }
    }
}
