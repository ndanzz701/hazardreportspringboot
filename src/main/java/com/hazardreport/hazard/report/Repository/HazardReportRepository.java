package com.hazardreport.hazard.report.Repository;

import com.hazardreport.hazard.report.Entity.HazardReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HazardReportRepository extends JpaRepository<HazardReport,Long> {
    List<HazardReport> findByRisk(String risk);
    List<HazardReport> findByTitle(String title);
}
