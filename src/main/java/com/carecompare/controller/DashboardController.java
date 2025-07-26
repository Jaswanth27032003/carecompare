package com.carecompare.controller;

import com.carecompare.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/dashboard")
public class DashboardController {
    @Autowired
    private DashboardService dashboardService;

    @GetMapping("/plans/{userId}")
    public ResponseEntity<List<Map<String, Object>>> getUserPlans(@PathVariable Long userId) {
        try {
            List<Map<String, Object>> plans = dashboardService.getUserPlans(userId)
                    .stream()
                    .map(plan -> {
                        return new java.util.HashMap<String, Object>() {{
                            put("id", plan.getId());
                            put("name", plan.getName());
                            put("provider", plan.getProvider());
                            put("coverage", plan.getCoverage());
                        }};
                    })
                    .collect(Collectors.toList());
            return ResponseEntity.ok(plans);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(null);
        }
    }

    @PostMapping("/compare/{userId}")
    public ResponseEntity<List<Map<String, Object>>> comparePlans(
            @PathVariable Long userId,
            @RequestBody List<Long> planIds) {
        try {
            List<Map<String, Object>> comparedPlans = dashboardService.comparePlans(userId, planIds);
            return ResponseEntity.ok(comparedPlans);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(null);
        }
    }
}