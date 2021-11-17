// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
//import com.revrobotics.CANError;
import com.revrobotics.CANSparkMax;
import com.revrobotics.ControlType;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.interfaces.Gyro;
import edu.wpi.first.wpilibj.AnalogGyro; 
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;


public class Motor extends SubsystemBase {
  /** Creates a new Motor. */
  public CANSparkMax LOL = new CANSparkMax(Constants.motorport, MotorType.kBrushless);
  public void setSpeed(double speed)
  {
      //LOL.getPIDController().setReference(speed, ControlType.kDutyCycle);
      
  }
  public Motor() {}

  @Override
  public void periodic() {

    LOL.getPIDController().setReference(0, ControlType.kDutyCycle);

    // This method will be called once per scheduler run
  }
}
