// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
      
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import frc.robot.Constants;
import com.revrobotics.MotorFeedbackSensor;
import com.revrobotics.CANSparkMax.IdleMode;
import 



public class DriveTrain extends SubsystemBase {
    // Local SparkMax Variables
    private final CANSparkMax rightMaster;
    private final CANSparkMax leftMaster;

    private final CANSparkMax m_rightMotor2;
    private final CANSparkMax m_rightMotor3;
    private final CANSparkMax m_leftMotor2;
    private final CANSparkMax m_leftMotor3;
    private final DifferentialDrive drive;
    
    private final IdleMode IdleMode = IdleMode.kBrake;
    private double rampRate = 0.15;
    
    public DriveTrain() {
      // NEOs
      rightMaster =  new CANSparkMax(1, MotorType.kBrushless);
      m_rightMotor2 = new CANSparkMax(2, MotorType.kBrushless);
      m_rightMotor3 = new CANSparkMax(3, MotorType.kBrushless);

      leftMaster = new CANSparkMax(1, MotorType.kBrushless);
      m_leftMotor2 = new CANSparkMax(2, MotorType.kBrushless);
      m_leftMotor3 = new CANSparkMax(3, MotorType.kBrushless);
      
      // Motor Break/Coast
      
      rightMaster.setIdleMode(IdleMode);
		m_rightMotor2.setIdleMode(IdleMode);
		m_rightMotor3.setIdleMode(IdleMode);

		leftMaster.setIdleMode(IdleMode);
		m_leftMotor2.setIdleMode(IdleMode);
		m_leftMotor3.setIdleMode(IdleMode);


    }

}