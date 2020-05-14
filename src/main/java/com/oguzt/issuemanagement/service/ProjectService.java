package com.oguzt.issuemanagement.service;

import com.oguzt.issuemanagement.entity.IssueHistory;
import com.oguzt.issuemanagement.entity.Project;
import com.oguzt.issuemanagement.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProjectService {

    Project save(Project project);

    Project getById(Long id);

    List<Project> getByProjectCode(String projectCode);

    List<Project> getByProjectCodeContains(String projectCode);

    Page<Project> getAllPageable(Pageable pageable);

    Boolean delete(Project project);

}
