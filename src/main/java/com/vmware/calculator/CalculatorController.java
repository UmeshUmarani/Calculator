package com.vmware.calculator;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CalculatorController {
	@PostMapping("/add")
	public Result add(@RequestBody Operands operands) {
		return new Result(operands.x+operands.y);
	}
	
	@PostMapping("/diff")
	public Result diff(@RequestBody Operands operands) {
		return new Result(operands.x-operands.y);
	}
}
