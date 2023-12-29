package net.epiloum.eats;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShopService {

    @Autowired
    private ShopRepository shopRepository;

    public List<Shop> getAllShops() {
        return shopRepository.findAll();
    }

    public Optional<Shop> getShopById(Long id) {
        return shopRepository.findById(id);
    }

    public Shop createShop(Shop shop) {
        return shopRepository.save(shop);
    }

    public Shop updateShop(Long id, Shop updatedShop) {
        if (shopRepository.existsById(id)) {
            updatedShop.setId(id);
            return shopRepository.save(updatedShop);
        }
        return null; // Handle not found case
    }

    public void deleteShop(Long id) {
        shopRepository.deleteById(id);
    }
}