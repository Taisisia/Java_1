package org.example._20240603;

import java.util.Scanner;

public class PraktikaStependiia {
    public static void main(String[] args)
    {
// Ежемесячная стипендия студента составяляет N гривен б а расходы на проживание превышают степендию
// и составляют M гривен в месяц. Рост цен ежемесячно увеличиванет  расход на 3%.
// Составте программу расчета суммы денег, которую необходимо единовременно попросить у родителей,
// чтобы можно было прожить учебный год (10 месяцев), используя только ти деньги и степендиюю
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите размер стипендии");
        int stipend = scanner.nextInt();
        System.out.println("введите реальный расход в месяц");
        int raschod = scanner.nextInt();
        int yDefiz =0;
        int neobchSumm=0;
        if (stipend>=raschod){
            System.out.println("вам повезло");

        } else {
            for (int i = 1; i <= 10; i++) {
                raschod= (raschod+ (raschod) / 100 * 3);
                yDefiz = yDefiz + raschod ;
            }
            neobchSumm = yDefiz- stipend*10;
            System.out.println("необходимо просить сумму " + neobchSumm);
        }
    }
    }


