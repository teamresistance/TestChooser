package frc.robot;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class ChsrTest {

    //--------------------- Chooser 1 ---------------------------------------------
    private static SendableChooser<Integer> chsr01 = new SendableChooser<>();
    private static int[] intTest01 = {4000, 4250, 4500, 4750, 5000};
    private static int myChoice1;

    public static void chsr01Init(){
        chsr01.setDefaultOption("Default1", intTest01[0]);
        for(int i = 1; i < intTest01.length; i++){
            chsr01.addOption("My choice " + i + " - " + intTest01[i], intTest01[i]);
        }
        SmartDashboard.putData("Choices 1", chsr01);
    }
    
    public static void chsr01AutoInit(){
        myChoice1 = chsr01.getSelected();
        SmartDashboard.putNumber("Choice01A", myChoice1);
    }

    public static void chsr01AutoPeriodic(){
        myChoice1 = chsr01.getSelected();
        SmartDashboard.putNumber("Choice01B", myChoice1);
    }


    //--------------------- Chooser 2 ---------------------------------------------
    private static SendableChooser<Integer> chsr02 = new SendableChooser<>();
    private static int[] intTest02 = {4100, 4350, 4600, 4850, 5100};
    private static int myChoice2;

    public static void chsr02Init(){
        for(int i = 1; i < intTest02.length; i++){
            chsr02.addOption("My choice " + i + " - " + intTest02[i], intTest02[i]);
        }
        chsr02.setDefaultOption("Default2", intTest02[0]);
        SmartDashboard.putData("Choices 2", chsr02);
    }
    
    public static void chsr02AutoInit(){
        myChoice2 = chsr02.getSelected();
        SmartDashboard.putNumber("Choice02A", myChoice2);
    }

    public static void chsr02AutoPeriodic(){
        myChoice2 = chsr02.getSelected();
        SmartDashboard.putNumber("Choice02B", myChoice2);
    }

    //--------------------- Chooser 3 ---------------------------------------------
    private static SendableChooser<Integer> chsr03 = new SendableChooser<>();
    private static int[] intTest03 = {3100, 3350, 3600, 3850, 3100};
    private static int myChoice3;

    public static void chsr03Init(){
        for(int i = 1; i < intTest03.length; i++){
            chsr03.addOption("My choice - " + intTest03[i], intTest03[i]);
        }
        chsr03.setDefaultOption("My choice - " + intTest03[1], intTest03[1]);
        SmartDashboard.putData("Choices 3", chsr03);
    }
    
    public static void chsr03AutoInit(){
        myChoice3 = chsr03.getSelected();
        SmartDashboard.putNumber("Choice03A", myChoice3);
    }

    public static void chsr03AutoPeriodic(){
        myChoice3 = chsr03.getSelected();
        SmartDashboard.putNumber("Choice03B", myChoice3);
    }
}
