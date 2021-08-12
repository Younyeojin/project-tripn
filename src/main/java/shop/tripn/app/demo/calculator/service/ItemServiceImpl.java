package shop.tripn.app.demo.calculator.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shop.tripn.app.demo.calculator.entity.Item;
import shop.tripn.app.demo.calculator.entity.User;
import shop.tripn.app.demo.calculator.repository.ItemRepository;

import java.util.List;
import java.util.Optional;

@Service @RequiredArgsConstructor
public class ItemServiceImpl implements ItemService{
    private final ItemRepository itemRepository;
    @Override public List<Item> findAll(){
        return itemRepository.findAll();
    }
    @Override public List<Item> findAllByItemName(String ItemName){
        return itemRepository.findAllByItemName(ItemName);
    }
    @Override public Optional<Item> findById(long id){
        return itemRepository.findById(id);
    }
}
