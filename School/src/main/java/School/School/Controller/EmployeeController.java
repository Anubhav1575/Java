package School.School.Controller;
import School.School.Services.EmployeeService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/Employee")
@Validated
public class EmployeeController {

    private final EmployeeService EmployeeService;

    public EmployeeController(EmployeeService EmployeeService) {
        this.EmployeeService = EmployeeService;
    }

        @PostMapping("/emp")
    public ResponseEntity<String> addEmp(@PathVariable String empName, @RequestBody Employee employee) {
        EmployeeService.addEmp(empName, employee);
        return new ResponseEntity<>("Emp added successfully", HttpStatus.CREATED);
    }

        @GetMapping("/emp/empid")
    public ResponseEntity<Map<String, Object>> getEmp(@PathVariable String Emp) {
        Map<String, Object> response = (Map<String, Object>) EmployeeService.getEmp(Emp);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
