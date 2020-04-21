package com.hazardreport.hazard.report.Controller;

import com.hazardreport.hazard.report.Entity.HazardReport;
import com.hazardreport.hazard.report.Repository.HazardReportImpl;
import com.hazardreport.hazard.report.Repository.HazardReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/hazard")
public class hazardReportController {
    @Autowired
    HazardReportImpl hazardReport;
    @Autowired
    HazardReportRepository hazardReportRepository;

    @GetMapping
    public List<HazardReport> getAll(){
        return hazardReportRepository.findAll();
    }

    @PostMapping
    public HazardReport add(@Valid @RequestBody HazardReport hazardReport){
        return hazardReportRepository.save(hazardReport);
//        return hazardReport;
    }

    @GetMapping("/{id}")
    public ResponseEntity<HazardReport> getById(@PathVariable(value = "id") Long id){
        HazardReport hazardReport = hazardReportRepository.findById(id).orElse(null);

        if(hazardReport == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(hazardReport);
    }
}
