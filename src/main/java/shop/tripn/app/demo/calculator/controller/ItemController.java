package shop.tripn.app.demo.calculator.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import shop.tripn.app.demo.calculator.service.ItemService;

@RestController @RequiredArgsConstructor
public class ItemController {
    private final ItemService itemService;
}
