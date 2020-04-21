package com.hazardreport.hazard.report.Repository;

import com.hazardreport.hazard.report.Entity.HazardReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class HazardReportImpl implements HazardReportRepository{

    @Autowired HazardReportRepository hazardReportRepository;

    @Override
    public List<HazardReport> findByRisk(String risk) {
        return null;
    }

    @Override
    public List<HazardReport> findByTitle(String title) {
        return null;
    }

    @Override
    public List<HazardReport> findAll() {
        return (List<HazardReport>) hazardReportRepository.findAll();
    }

    @Override
    public List<HazardReport> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<HazardReport> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<HazardReport> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(HazardReport hazardReport) {

    }

    @Override
    public void deleteAll(Iterable<? extends HazardReport> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends HazardReport> S save(S s) {
        return null;
    }

    @Override
    public <S extends HazardReport> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<HazardReport> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends HazardReport> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<HazardReport> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public HazardReport getOne(Long aLong) {
        return null;
    }

    @Override
    public <S extends HazardReport> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends HazardReport> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends HazardReport> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends HazardReport> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends HazardReport> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends HazardReport> boolean exists(Example<S> example) {
        return false;
    }
}
