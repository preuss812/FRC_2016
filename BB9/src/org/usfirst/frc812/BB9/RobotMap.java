// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc812.BB9;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveTrainRtFront;
    public static SpeedController driveTrainRtBack;
    public static SpeedController driveTrainLftFront;
    public static SpeedController driveTrainLftBack;
    public static RobotDrive driveTrainRobotDrive41;
    public static Compressor compressor;
    public static Solenoid leftSolenoid;
    public static Solenoid rightSolenoid;
    public static DoubleSolenoid grabber;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainRtFront = new Talon(0);
        LiveWindow.addActuator("Drive Train", "RtFront", (Talon) driveTrainRtFront);
        
        driveTrainRtBack = new Talon(1);
        LiveWindow.addActuator("Drive Train", "RtBack", (Talon) driveTrainRtBack);
        
        driveTrainLftFront = new Talon(2);
        LiveWindow.addActuator("Drive Train", "LftFront", (Talon) driveTrainLftFront);
        
        driveTrainLftBack = new Talon(3);
        LiveWindow.addActuator("Drive Train", "LftBack", (Talon) driveTrainLftBack);
        
        driveTrainRobotDrive41 = new RobotDrive(driveTrainLftFront, driveTrainLftBack,
              driveTrainRtFront, driveTrainRtBack);
        // if we want to reverse the understanding of the motors, something like the following
        // is advised for each of the motors.
        //   driveTrainRobotDrive41.setInvertedMotor(RobotDrive.MotorType.kRearLeft, false); 

        
        driveTrainRobotDrive41.setSafetyEnabled(true);
        driveTrainRobotDrive41.setExpiration(0.1);
        driveTrainRobotDrive41.setSensitivity(0.5);
        driveTrainRobotDrive41.setMaxOutput(1.0);


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
      compressor = new Compressor();
  //    rightSolenoid = new Solenoid(0); 
   //   leftSolenoid = new Solenoid(1);
      grabber = new DoubleSolenoid(4,5);
      System.out.println("grabber doublesolenoid defined");
      
    }
}
