package org.example.reviews.services.interfaces;

import org.example.reviews.models.Restaurant;

/**
 * @author Manuel Aguilera / @aguileradev
 */
public interface IRestaurant {
    Restaurant createRestaurant(Restaurant restaurant);
    void findAllRestaurants();
    void updateRestaurant(Restaurant restaurant);
    void removeRestaurant(Integer id);
}