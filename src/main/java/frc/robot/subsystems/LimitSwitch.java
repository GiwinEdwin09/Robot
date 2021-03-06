// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.DigitalInput; 
public class LimitSwitch extends SubsystemBase {
  /** Creates a new LimitSwitch. */

  DigitalInput limitSwitch = new DigitalInput(0);

  public LimitSwitch() {
    
  }
  public void checkLimit()
  {
    if (limitSwitch.get())
    {
      System.out.println("True");
    }
    else
    {
      System.out.println("False");
    }
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
