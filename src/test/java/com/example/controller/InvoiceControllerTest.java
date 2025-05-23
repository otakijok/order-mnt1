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
public class InvoiceControllerTest {

    @InjectMocks
    private InvoiceController invoiceController;

    @Mock
    private Model model;

    @Test
    public void testViewInvoices() {
        // Call the method to be tested
        String viewName = invoiceController.viewInvoices(model);

        // Verify the view name
        assertEquals("invoice/view", viewName);

        // Verify that the "message" attribute was added to the model
        verify(model).addAttribute("message", "請求書一覧を表示します。");
    }
}
