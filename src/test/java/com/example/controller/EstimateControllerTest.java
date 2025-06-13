package com.example.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.ui.Model;

@ExtendWith(MockitoExtension.class)
public class EstimateControllerTest {

    @InjectMocks
    private EstimateController estimateController;

    @Mock
    private Model model;

    @Test
    public void testViewEstimates() {
        // Call the method to be tested
//        String viewName = estimateController.viewEstimates(model);
//
//        // Verify the view name
//        assertEquals("estimate/view", viewName);
//
//        // Verify that the "message" attribute was added to the model
//        verify(model).addAttribute("message", "見積書一覧を表示します。");
    }
}
