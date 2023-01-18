// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
      
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class DriveTrain extends SubsystemBase {
    // Local SparkMax Variables
    private final CANSparkMax rightMaster;
    private final CANSparkMax leftMaster;

    private final CANSparkMax m_rightMotor2;
    private final CANSparkMax m_rightMotor3;
    private final CANSparkMax m_leftMotor2;
    private final CANSparkMax m_leftmotor3;
    
    private final DifferentialDrive drive;
    
    private final NeutralMode neutralMode = NeutralMode.Brake;
    private double rampRate = 0.15;
    
    public DriveTrain() {
      // NEOs
      rightMaster =  new 
    }

}