package io.openems.edge.simulator.battery;

import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition( //
		name = "BMS Simulated", //
		description = "Implements a simulated battery management system that sends values given in the configuration")
@interface Config {
	String service_pid();

	String id() default "bms0";

	boolean enabled() default true;
	
	int disChargeMinVoltage();
	int chargeMaxVoltage();
	int disChargeMaxCurrent();
	int chargeMaxCurrent();
	int SOC() default 50;
	
	String webconsole_configurationFactory_nameHint() default "BMS Simulated [{id}]";
}