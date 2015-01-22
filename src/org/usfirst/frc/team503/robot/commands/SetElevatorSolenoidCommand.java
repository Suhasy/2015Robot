package org.usfirst.frc.team503.robot.commands;

import org.usfirst.frc.team503.robot.subsystems.ElevatorSubsystem;
import org.usfirst.frc.team503.robot.subsystems.ElevatorSubsystem.ElevatorSolenoidPosition;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class SetElevatorSolenoidCommand extends Command {
	ElevatorSubsystem instance = ElevatorSubsystem.getInstance();
	ElevatorSolenoidPosition position;

    public SetElevatorSolenoidCommand(ElevatorSolenoidPosition position) {
    	this.position = position;
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	instance.setSolenoidPosition(position);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
