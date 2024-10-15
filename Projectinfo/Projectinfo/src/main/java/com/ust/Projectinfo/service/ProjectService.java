package com.ust.Projectinfo.service;

import com.ust.Projectinfo.dto.Projectdto;
import com.ust.Projectinfo.model.Project;
import com.ust.Projectinfo.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
     @Autowired
    private ProjectRepository projectRepository;

    public Project addproject(Projectdto project) {
        Project project1 = new Project();
        project1.setProjectId(project.getProjectId());
        project1.setProjectName(project.getProjectName());
        project1.setProjectDescription(project.getProjectDescription());
        project1.setProjectManager(project.getProjectManager());
        project1.setTeamMembers(project.getTeamMembers());
        project1.setProjectStatus(project.getProjectStatus());
        project1.setProjectStartDate(project.getProjectStartDate());
        project1.setProjectEndDate(project.getProjectEndDate());
        project1.setProjectBudget(project.getProjectBudget());
        project1.setCompanyName(project.getCompanyName());
        project1.setCcode(project.getCcode());
        return projectRepository.save(project1);

    }

    public Project getProjectByCcode(Long ccode) {
        return projectRepository.findByCcode(ccode);
    }
}
