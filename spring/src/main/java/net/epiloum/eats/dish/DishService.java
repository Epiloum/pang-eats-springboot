package net.epiloum.eats;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DishService {
    @Autowired
    private DishRepository dishRepository;

    public List<Dish> getAllDishes() {
        return dishRepository.findAll();
    }

    public Optional<Dish> getDishById(Long id) {
        return dishRepository.findById(id);
    }

    public Dish createDish(Dish dish) {
        return dishRepository.save(dish);
    }

    public Dish updateDish(Long id, Dish updatedDish) {
        if (dishRepository.existsById(id)) {
            updatedDish.setId(id);
            return dishRepository.save(updatedDish);
        }
        return null; // Handle not found case
    }

    public void deleteDish(Long id) {
        dishRepository.deleteById(id);
    }
}