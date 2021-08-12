package shop.tripn.app.demo.calculator.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shop.tripn.app.demo.calculator.repository.ItemRepository;

@Service @RequiredArgsConstructor
public class ItemServiceImpl implements ItemService{
    private final ItemRepository itemRepository;
}
