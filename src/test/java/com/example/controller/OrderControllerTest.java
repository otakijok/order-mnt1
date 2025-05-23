package com.example.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class OrderControllerTest {

    @InjectMocks
    private OrderController orderController;

    @Mock
    private Model model;

    @Test
    public void testViewOrders() {
        // Call the method to be tested
        String viewName = orderController.viewOrders(model);

        // Verify the view name
        assertEquals("order/view", viewName);

        // Verify that the "message" attribute was added to the model
        verify(model).addAttribute("message", "注文書一覧を表示します。");
    }
}
