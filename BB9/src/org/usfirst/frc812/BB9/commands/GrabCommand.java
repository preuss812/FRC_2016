package org.usfirst.frc812.BB9.commands;

import org.usfirst.frc812.BB9.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;

public class GrabCommand extends Command {

	private Boolean open = true;
	
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void execute() {
		System.out.println("grab command executed");
		// TODO Auto-generated method stub
		if (open) {
			open = false;
			RobotMap.grabber.set(DoubleSolenoid.Value.kForward);
		} else {
			open = true;
			RobotMap.grabber.set(DoubleSolenoid.Value.kReverse);
		}
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub

	}

}
