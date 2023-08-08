package com.workintech.models.SetChallange;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

enum Priority {
    HIGH, MED, LOW
}

enum Status {
    IN_QUEUE, ASSIGNED, IN_PROGRESS
}
public class Task {

    private String project;
    private String description;
    private Set<String> assignees;

    Priority priority;
    Status status;

    public Task(String project, String description, Priority priority, Status status) {
        this.project = project;
        this.description = description;
        this.priority = priority;
        this.status = status;
        this.assignees = new HashSet<>();
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<String> getAssignees() {
        return assignees;
    }

    public void addAssignee(String assignee) {
        assignees.add(assignee);
    }

    public void removeAssignee(String assignee) {
        assignees.remove(assignee);
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(project, task.project) && Objects.equals(description, task.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(project, description);
    }

    @Override
    public String toString() {
        return "Task{" +
                "project='" + project + '\'' +
                ", description='" + description + '\'' +
                ", assignees=" + assignees +
                ", priority=" + priority +
                ", status=" + status +
                '}';
    }
    }


