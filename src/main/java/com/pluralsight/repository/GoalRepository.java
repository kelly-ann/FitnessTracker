package com.pluralsight.repository;

import java.util.List;

import com.pluralsight.model.Goal;
import com.pluralsight.model.GoalReport;

public interface GoalRepository {
	
	// interface methods are public by default
	Goal save(Goal goal);

	List<Goal> loadAll();

	List<GoalReport> findAllGoalReports();

}
