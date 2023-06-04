DROP TABLE  Users;
-- Create the Users table
CREATE TABLE Users (
  user_id VARCHAR(50) PRIMARY KEY,
  username VARCHAR(255),
  password VARCHAR(255),
  role VARCHAR(20)
);

DROP TABLE Tasks;
-- Create the Tasks table
CREATE TABLE Tasks (
  task_id VARCHAR(50) PRIMARY KEY,
  title VARCHAR(255),
  description VARCHAR(255),
  task_type VARCHAR(255),
  timeline_id VARCHAR(255),
  story_points INT,
  created_by VARCHAR(255),
  assigned_to VARCHAR(255),
  FOREIGN KEY (timeline_id) REFERENCES Timelines(timeline_id),
  FOREIGN KEY (created_by) REFERENCES Users(user_id),
  FOREIGN KEY (assigned_to) REFERENCES Users(user_id)
);

DROP TABLE Timelines;
-- Create the Timelines table
CREATE TABLE Timelines (
  timeline_id VARCHAR(255) PRIMARY KEY,
  timeline_name VARCHAR(255)
);

DROP TABLE Sprints;
-- Create the Sprints table
CREATE TABLE Sprints (
  sprint_id VARCHAR(255) PRIMARY KEY,
  sprint_name VARCHAR(255)
);

DROP TABLE Task_Sprints;
-- Create the Task_Sprints table
CREATE TABLE Task_Sprints (
  id VARCHAR(255) PRIMARY KEY,
  task_id VARCHAR(255),
  sprint_id VARCHAR(255),
  FOREIGN KEY (task_id) REFERENCES Tasks(task_id),
  FOREIGN KEY (sprint_id) REFERENCES Sprints(sprint_id)
);

DROP TABLE Tags;
-- Create the Tags table
CREATE TABLE Tags (
  tag_id VARCHAR(255) PRIMARY KEY,
  tag_name VARCHAR(50)
);

DROP TABLE Task_Tags;
-- Create the Task_Tags table
CREATE TABLE Task_Tags (
  id VARCHAR(255) PRIMARY KEY,
  task_id VARCHAR(255),
  tag_id VARCHAR(255),
  FOREIGN KEY (task_id) REFERENCES Tasks(task_id),
  FOREIGN KEY (tag_id) REFERENCES Tags(tag_id)
);
