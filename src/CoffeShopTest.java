import CoffeeType.Beverage;
import CoffeeType.Espresso;
import CoffeeType.Frappuccino;
import CoffeeType.Latte;
import MustSetting.*;
import SyrupType.CaramelSyrup;
import SyrupType.OriSyrup;
import SyrupType.VanillaSyrup;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CoffeShopTest {
    public static Scanner scanner = new Scanner(System.in);

    //验证输入：判断是否为数字，判断输入的数字范围是否正确
    public static String InputCheck(){
        String output;
        if (scanner.hasNextLine()){
            output = scanner.nextLine();
            List<String> syrup_list = Arrays.asList(output.split("，"));
            if (syrup_list.size()==2){
                return output;
            }
        }
        return "1";
    }
    
    public static void main(String[] args) {
        System.out.println("欢迎点单～");
        System.out.println("提示：如果未按照要求输入正确的格式，系统会选择默认值！！");

        System.out.println("请选择咖啡：");
        System.out.println("1. 浓缩    2. 拿铁   3.星冰乐  （默认拿铁）");
        Scanner scanner = new Scanner(System.in);
        int coffeeIndex = scanner.nextInt();

        Beverage coffee;
        switch (coffeeIndex){
            case 1:
                coffee = new Espresso();
                break;
            case 2:
                coffee = new Latte();
                break;
            case 3:
                coffee = new Frappuccino();
                break;
            default:
                coffee = new Latte(); //默认拿铁
        }

        System.out.println("请选择杯型：");
        System.out.println("1. 中杯    2. 大杯   3.超大杯  （默认大杯）");

        int size = scanner.nextInt();
        switch (size){
            case 1:
                coffee.setSize(CupSize.Tall);
                break;
            case 2:
                coffee.setSize(CupSize.Grande);
                break;
            case 3:
                coffee.setSize(CupSize.Venti);
                break;
        }

        System.out.println("请选择温度：");
        System.out.println("1. 正常冰    2. 少冰   3.去冰  （默认去冰）");

        int temprature = scanner.nextInt();
        switch (temprature){
            case 1:
                coffee.setTemprature(Temprature.Regular);
                break;
            case 2:
                coffee.setTemprature(Temprature.Easy);
                break;
            case 3:
                coffee.setTemprature(Temprature.Icefree);
                break;
        }

        System.out.println("请选择牛奶种类：");
        System.out.println("1. 全脂牛奶    2. 脱脂牛奶     3.燕麦牛奶       4.不加牛奶  （默认不加）");
        int milk = scanner.nextInt();
        scanner.nextLine();
        switch (milk){
            case 1:
                coffee.setMilk(Milk.Whole);
                break;
            case 2:
                coffee.setMilk(Milk.Skimmed);
                break;
            case 3:
                coffee.setMilk(Milk.Oat);
                break;
            case 4:
                coffee.setMilk(Milk.Ori);
                break;
        }



        Beverage coffeeWithCondiment;
        System.out.println("请选择所加糖浆类型及数量：");
        System.out.println("糖浆类型包括：原味糖浆，香草糖浆，焦糖糖浆，要加入的数量写在类型之后（输入格式为类型+数量）");
        System.out.println("例如：原味+3 ；不加(直接回车)");


        System.out.println("请选择所加糖浆类型及数量：");
        String syrup = InputCheck();
        while (syrup.equals("1")){
            System.out.println("亲请按照指示格式输入");
            syrup = InputCheck();
        }
        List<String> syrup_list = Arrays.asList(syrup.split("，"));
            // 获取配料种类和数量

        String syrup_type = syrup_list.get(0);
        int syrup_num =  Integer.parseInt(syrup_list.get(1));
        switch (syrup_type){
            case "原味":
                coffeeWithCondiment = new OriSyrup(coffee);
                while(syrup_num>1){
                    coffeeWithCondiment = new OriSyrup(coffeeWithCondiment);
                    syrup_num-=1;
                }
                break;
            case "香草":
                coffeeWithCondiment = new VanillaSyrup(coffee);
                while(syrup_num>1){
                    coffeeWithCondiment = new OriSyrup(coffeeWithCondiment);
                    syrup_num-=1;
                }
                break;
            case "焦糖":
                coffeeWithCondiment = new CaramelSyrup(coffee);
                while(syrup_num>1){
                    coffeeWithCondiment = new OriSyrup(coffeeWithCondiment);
                    syrup_num-=1;
                }
                break;

            default:
                System.out.println("亲暂时没有您要找的配料，或者您没有按照指定格式输入哦");
                coffeeWithCondiment = coffee;
        }
        







        System.out.println("====================请确认您的订单====================");
        System.out.println(coffeeWithCondiment.getDescription());
        System.out.println(" 总共的价格是："+ coffeeWithCondiment.cost());
        System.out.println("====================下单成功，请稍等====================");

    }
}
