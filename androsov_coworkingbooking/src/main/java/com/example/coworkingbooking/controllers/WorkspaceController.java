package com.example.coworkingbooking.controllers;

import com.example.coworkingbooking.entities.Workspace;
import com.example.coworkingbooking.repositories.WorkspaceRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/workspaces")
public class WorkspaceController {

  private final WorkspaceRepository workspaceRepository;

  public WorkspaceController(WorkspaceRepository workspaceRepository) {
    this.workspaceRepository = workspaceRepository;
  }

  // Отримати всі коворкінги
  @GetMapping
  public List<Workspace> getAllWorkspaces() {
    return workspaceRepository.findAll();
  }

  // Отримати коворкінг за ID
  @GetMapping("/{id}")
  public Optional<Workspace> getWorkspaceById(@PathVariable Long id) {
    return workspaceRepository.findById(id);
  }

  // Створити новий коворкінг
  @PostMapping
  public Workspace createWorkspace(@RequestBody Workspace workspace) {
    return workspaceRepository.save(workspace);
  }

  // Оновити дані коворкінгу
  @PutMapping("/{id}")
  public Workspace updateWorkspace(@PathVariable Long id, @RequestBody Workspace updatedWorkspace) {
    Workspace workspace = workspaceRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Workspace not found"));

    workspace.setName(updatedWorkspace.getName());
    workspace.setLocation(updatedWorkspace.getLocation());
    workspace.setCapacity(updatedWorkspace.getCapacity());

    return workspaceRepository.save(workspace);
  }

  // Видалити коворкінг
  @DeleteMapping("/{id}")
  public void deleteWorkspace(@PathVariable Long id) {
    workspaceRepository.deleteById(id);
  }
}
