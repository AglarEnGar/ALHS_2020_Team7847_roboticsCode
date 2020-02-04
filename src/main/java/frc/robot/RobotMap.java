/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.Spark;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.

  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  public static VictorSPX leftMotor1;
  public static VictorSPX leftMotor2;
  public static VictorSPX rightMotor1;
  public static VictorSPX rightMotor2;
  
  public static Spark shooter1;

  // ball intake motor/servo channels TODO: assign correct values to constants below
  public static int EXTENDER_CHANNEL = -1;
  public static int INTAKE_CHANNEL = -1;

  // ball intake constants
  public static double EXTENDER_IN  = 0;  // 0-4096
  public static double EXTENDER_OUT = 1024;  // 0-4096
  public static double INTAKE_SPEED = 1.0;  // 0-1

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
