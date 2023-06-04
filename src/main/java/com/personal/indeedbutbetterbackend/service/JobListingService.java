package com.personal.indeedbutbetterbackend.service;

import com.personal.indeedbutbetterbackend.entity.JobListing;
import com.personal.indeedbutbetterbackend.repository.JobListingDao;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
@NoArgsConstructor
public class JobListingService {

    @Autowired
    public JobListingDao jobListingDao;

    public List<JobListing> getAll(){
        return this.jobListingDao.findAll();
    }

    public JobListing getJobListingById(int id) {return this.jobListingDao.findJobListingByJobListingId(id);}

    public void insert(JobListing jobListing) {
        jobListingDao.save(jobListing);
    }

    public List<JobListing> getJobListingsByCompanyId(int companyId) { return this.jobListingDao.findJobListingsByCompanyId(companyId); }
    public List<JobListing> getJobListingsByUserId(int userId) { return this.jobListingDao.findJobListingsByUserUserId(userId); }

}
