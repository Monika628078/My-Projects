import java.util.Scanner;

public class UnitConvertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AreaUnit a = new AreaUnit();
        WeightAndMass w = new WeightAndMass();
        int choose;
        System.out.println("Sam' Unit Convertor");
         System.out.println("************************************---------------------------------------------**************************************");
         System.out.println("Press 1 for Area Unit Covertor");
         System.out.println("Press 2 for Weight and Mass Convertor");
         System.out.println("Press 3 for Length Unit Convertor");
         System.out.println("Press 4 for Other Units");
         int choice = sc.nextInt();
         switch (choice) {
         case 1:
             System.out.println("************************************---------------------------------------------**************************************");
         System.out.println("1. Ac to Sq.ft || Sq.ft to Ac");
         System.out.println("2. Hc to Ac || Ac to Hc");
         System.out.println("3. Sq.ft to Sq.m || sq.m to Sq.ft");
         System.out.println("4. Ac to Sq.m || Sq.m to Ac");
         System.out.println("5. Sq.ft to Sq.y || Sq.y to Sq.ft");
         System.out.println("6. Exit...");
          choose = sc.nextInt();
         System.out.println("************************************---------------------------------------------**************************************");
             switch (choose){
             case 1:
                    a.acresToSquareFeet();
                    break;
             case 2:
                    a.hectareToAcres();
                    break;
             case 3:
                    a.sqFtToSqMeter();
                    break;
             case 4:
                     a.acresToSqMiles();
                     break;
             case 5:
                     a.sqFtToSqYards();
                     break;
             case 6:
                 System.exit(0);
                 break;
             default:
                 System.out.println("invalid option choosed");
         }
             case 2:
                 System.out.println("************************************---------------------------------------------**************************************");
                 System.out.println("1. gm to Pu || Pu to gm");
                 System.out.println("2. g to kg || kg to g");
                 System.out.println("3. gm to mg || mg to gm");
                 System.out.println("4. lbs to st || st to lbs");
                 System.out.println("5. ton to lbs || lbs to ton");
                 System.out.println("6. kg to lbs || lbs to kg");
                 System.out.println("7. gm to Ounces || Ounces to gm");
                 System.out.println("8. Ltr to gallon || gallon to Ltr");
                 System.out.println("9. Pu to Ounces || Ounces to Pu");
                 choose = sc.nextInt();
                 switch (choose)
                 {
                     case 1:
                         w.gmToPu();
                         break;
                     case 2:
                         w.gToKg();
                         break;
                     case 3:
                         w.gmToMg();
                         break;
                     case 4:
                         w.lbsToStone();
                         break;
                     case 5:
                         w.tonToLbs();
                         break;
                     case 6:
                         w.kgToLbs();
                         break;
                     case 7:
                         w.gmToOunces();
                         break;
                     case 8:
                         w.ltrToGallon();
                         break;
                     case 9:
                         w.puToOunces();
                         break;
                     case 10:
                         System.exit(0);
                         break;
                     default:
                         System.out.println("invalid option");
                 }
         }
    }
}
class AreaUnit{
    Scanner sc = new Scanner(System.in);
    final static float ACRES = 43560f;
    final static float HECTARE  = 2.4711f;
    final static float SQUARE_FEET = 0.09290304f;
    final static float SQUARE_MILES  = 640f;
    final static float SQUARE_YARDS = 9f;
    float acres, sq_ft, hec, sq_meter, sq_miles,sq_yards;
    double result = 0;
    int choice;

    float acresToSquareFeet()
    {
        System.out.println("press 1 for Ac to sq.ft");
        System.out.println("press 2 for sqft to Ac");
        choice = sc.nextInt();
        if(choice == 1) {
            System.out.print("Please Enter value in Acres = ");
            acres = sc.nextFloat();
            result = acres * ACRES;
            System.out.println("value of " + acres + " acres into sq.ft is = " + result);
        }
        else if(choice == 2)
             {
            System.out.print("Please Enter value in SQ.FT = ");
            sq_ft = sc.nextFloat();
            result = sq_ft / ACRES;
            System.out.println("value of " + sq_ft + " Sq.Ft into acres is = " + result);
        }
        return (float)result;
    }
    float hectareToAcres()
    {
        System.out.println("press 1 for hc to Ac ");
        System.out.println("press 2 for Ac to hc");
        choice = sc.nextInt();
        if(choice == 1)
        {
            System.out.print("Please Enter value in Hc = ");
            hec = sc.nextFloat();
            result =  hec * HECTARE;
            System.out.println("value of " + hec + " hectare into acres is = " + result);
        }
        else if(choice == 2){
            System.out.print("Please Enter value in Acres = ");
            acres = sc.nextFloat();
            result =  acres / HECTARE;
            System.out.println("value of " + acres + " acres into hectare is = " + result);
        }
        return (float)result;
    }
    double sqFtToSqMeter()
    {

        System.out.println("press 1 for Sq.ft to Sq.M ");
        System.out.println("press 2 for Sq.M to Sq.ft");
        choice = sc.nextInt();
        if(choice == 1)
        {
            System.out.print("Please Enter value in SQUARE_FEET = ");
            sq_ft = sc.nextFloat();
            result =  sq_ft * SQUARE_FEET;
            System.out.println("value of " + sq_ft + " Sq.ft into Sq.m is = " + result);
        }
        else if(choice == 2)
        {
            System.out.print("Please Enter value in SQ_Meter = ");
            sq_meter = sc.nextFloat();
            result =  sq_meter / SQUARE_FEET;
            System.out.println("value of " + sq_meter + " Sq.meter into Sq.ft is = " + result);
        }
        return result;
    }
    float acresToSqMiles()
    {
        System.out.println("press 1 for Ac to Sq.M");
        System.out.println("press 2 for Sq.M to Ac");
        choice = sc.nextInt();
        if(choice == 1)
        {
            System.out.print("please Enter value in Acres = ");
            acres = sc.nextFloat();
            result = acres / SQUARE_MILES;
            System.out.println("value of " + acres + " acres into Sq.miles = " + result);
        }
        else if(choice == 2)
        {
            System.out.print("please Enter value in Square miles = ");
            sq_miles = sc.nextFloat();
            result = sq_miles * SQUARE_MILES;
            System.out.println("value of " + sq_miles + " Sq.miles into acres is = " + result);
        }
        return (float)result;
    }
    float sqFtToSqYards()
    {
        System.out.println("press 1 for sq.Ft to Sq.Y");
        System.out.println("press 2 for Sq.Y to sq.ft");
        choice = sc.nextInt();
         if(choice == 1)
         {
             System.out.print("please enter value in square_feet = ");
             sq_ft = sc.nextFloat();
             result = sq_ft / SQUARE_YARDS;
             System.out.println("value of " + sq_ft + " Sq.Ft into Sq.Y is = " + result);
         }
         else if(choice == 2)
         {
             System.out.print("please enter value in Sq.Miles = ");
             sq_yards = sc.nextFloat();
             result = sq_yards * SQUARE_YARDS;
             System.out.println("value of " + sq_yards + " Sq.yards into Sq.Ft is = " + result);
         }
         return (float)result;
    }

}
                          /** weight and mass convertor class, Methods and variables **/

      class WeightAndMass {
          Scanner sc = new Scanner(System.in);
          float gm, pu, kg, mg, lbs, stone, ton, ounces, ltr, gallon;
          double result = 0;
          int choice;

          float gmToPu()
          {
              System.out.println("press 1 for Gm to Pu");
              System.out.println("press 2 for Pu to Gm");
              choice = sc.nextInt();
              if (choice == 1)
              {
                  System.out.println("Enter value in Gm");
                  gm = sc.nextFloat();
                  result = gm / 453.6;
                  System.out.println("value of " + gm + " Gm in Pu is = " + result);
              }
              else if (choice == 2)
              {
                  System.out.println("Enter value in Pu");
                  pu = sc.nextFloat();
                  result = pu * 453.6;
                  System.out.println("value of " + pu + " Pounds in Gm is = " + result);
              }
              return (float) result;
          }

          float gToKg() {
              System.out.println("press 1 for Gm to Kg");
              System.out.println("press 2 for Kg to Gm");
              choice = sc.nextInt();
              if (choice == 1)
              {
                  System.out.println("Enter value in Gm");
                  gm = sc.nextFloat();
                  result = gm / 1000;
                  System.out.println("value of " + gm + " Gm in Kg is = " + result);
              }
              else if (choice == 2)
              {
                  System.out.println("Enter value in Kg");
                  kg = sc.nextFloat();
                  result = kg * 1000;
                  System.out.println("value of " + kg + " Kg in Gm is = " + result);
              }
              return (float) result;
          }

          float gmToMg() {
              System.out.println("press 1 for Gm to Mg");
              System.out.println("press 2 for Mg to Gm");
              choice = sc.nextInt();
              if (choice == 1)
              {
                  System.out.println("Enter value in Gm");
                  gm = sc.nextFloat();
                  result = gm * 1000;
                  System.out.println("value of " + gm + " Gm in Mg is = " + result);
              }
              else if (choice == 2)
              {
                  System.out.println("Enter value in Mg");
                  mg = sc.nextFloat();
                  result = mg / 1000;
                  System.out.println("value of " + mg + " Mg in Gm is = " + result);
              }
              return (float) result;
          }

          float lbsToStone()
          {
              System.out.println("press 1 for lbs to stone");
              System.out.println("press 2 for stone to lbs");
              choice = sc.nextInt();
              if(choice == 1)
              {
                  System.out.println("Enter value in lbs");
                  lbs = sc.nextFloat();
                  result = lbs / 14;
                  System.out.println("value of "+ lbs + " lbs in stone is = " + result);
              }
              else if(choice == 2)
              {
                  System.out.println("Enter value in stone");
                  stone = sc.nextFloat();
                  result = stone * 14;
                  System.out.println("value of "+ stone + " stone in lbs is = " + result);
              }
              return (float)result;
          }

          float tonToLbs()
          {
              System.out.println("press 1 for ton to lbs");
              System.out.println("press 2 for lbs to ton");
              choice = sc.nextInt();
              if (choice == 1)
              {
                  System.out.println("Enter value in ton");
                  ton = sc.nextFloat();
                  result = ton * 2000;
                  System.out.println("value of " + ton + " ton in lbs is = " + result);
              }
              else if (choice == 2)
              {
                  System.out.println("Enter value in lbs");
                  lbs = sc.nextFloat();
                  result = lbs / 2000 ;
                  System.out.println("value of " + lbs + " lbs in ton is = " + result);
              }
              return (float) result;
          }
          float kgToLbs()
          {
              System.out.println("press 1 for kg to lbs");
              System.out.println("press 2 for lbs to kg");
              choice = sc.nextInt();
              if(choice == 1)
              {
                  System.out.println("Enter value in kg");
                  kg = sc.nextFloat();
                  result = kg * 2.205;
                  System.out.println("value of "+ kg + " kg in lbs is = " + result);
              }
              else if(choice == 2)
              {
                  System.out.println("Enter value in lbs");
                  lbs = sc.nextFloat();
                  result = lbs / 2.205;
                  System.out.println("value of "+ lbs + " lbs in kg is = " + result);
              }
              return (float)result;
          }

          float gmToOunces()
          {
              System.out.println("press 1 for Gm to oz");
              System.out.println("press 2 for oz to Gm");
              choice = sc.nextInt();
              if (choice == 1)
              {
                  System.out.println("Enter value in Gm");
                  gm = sc.nextFloat();
                  result = gm / 28.34952;
                  System.out.println("value of " + gm + " Gm in ounces is = " + result);
              }
              else if (choice == 2)
              {
                  System.out.println("Enter value in oz");
                  ounces = sc.nextFloat();
                  result = ounces * 28.34952;
                  System.out.println("value of " + ounces + " ounces in Gm is = " + result);
              }
              return (float) result;
          }

          float ltrToGallon()
          {
              System.out.println("press 1 for ltr to gallon");
              System.out.println("press 2 for gallon to ltr");
              choice = sc.nextInt();
              if (choice == 1)
              {
                  System.out.println("Enter value in ltr");
                  ltr = sc.nextFloat();
                  result = ltr / 3.785;
                  System.out.println("value of " + ltr + " ltr in gallon is = " + result);
              }
              else if (choice == 2)
              {
                  System.out.println("Enter value in gallon");
                  gallon = sc.nextFloat();
                  result = gallon * 3.785;
                  System.out.println("value of " + gallon + " gallon in ltr is = " + result);
              }
              return (float) result;
          }

          float puToOunces()
          {
              System.out.println("press 1 for Pu to ounces");
              System.out.println("press 2 for ounces to pu");
              choice = sc.nextInt();
              if (choice == 1)
              {
                  System.out.println("Enter value in pu");
                  pu = sc.nextFloat();
                  result = pu * 16;
                  System.out.println("value of " + gm + " Gm in Pu is = " + result);
              }
              else if (choice == 2)
              {
                  System.out.println("Enter value in ounces");
                  ounces = sc.nextFloat();
                  result = ounces / 16;
                  System.out.println("value of " + ounces + " ounces in pu is = " + result);
              }
              return (float) result;
          }
      }