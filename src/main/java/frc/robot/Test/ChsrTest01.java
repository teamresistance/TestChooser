package frc.robot.Test;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class ChsrTest01 {

    /*--------------------- Chooser 1 ---------------------------------------------
    The default is before the addOptions
    */
    private static SendableChooser<Integer> chsr = new SendableChooser<>();
    private static int[] intTest = {4000, 4250, 4500, 4750, 5000};
    private static int myChoice;
    private static String chsrGrp = "Grp1/";     //Change sdb group number

    public static void chsrInit(){
        chsr.setDefaultOption(chsrGrp + "Default", intTest[0]);
        for(int i = 1; i < intTest.length; i++){
            chsr.addOption(chsrGrp + "My Choice " + i + " - " + intTest[i], intTest[i]);
        }
        SmartDashboard.putData(chsrGrp + "Choices", chsr);
    }
    
    public static void chsrAutoInit(){
        myChoice = chsr.getSelected();
        SmartDashboard.putNumber(chsrGrp + "Choice A", myChoice);
    }

    public static void chsrAutoPeriodic(){
        myChoice = chsr.getSelected();
        SmartDashboard.putNumber(chsrGrp + "Choice B", myChoice);
    }

}
