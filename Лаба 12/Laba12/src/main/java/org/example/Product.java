package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Product {
    private String id;
    private String name;
    private String category;
    private double rating;
    private List<Integer> customerReviews;

    public Product(String id, String name, String category, double rating, List<Integer> customerReviews) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.rating = rating;
        this.customerReviews = customerReviews;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getCategory() { return category; }

    public double getRating() { return rating; }
    public void setRating(double rating) { this.rating = rating; }

    public List<Integer> getCustomerReviews() { return customerReviews; }

    public double getAverageRating() {
        if (customerReviews == null || customerReviews.isEmpty()) {
            return rating;
        }
        double sum = 0;
        for (int review : customerReviews) {
            sum += review;
        }
        return sum / customerReviews.size();
    }

    @Override
    public String toString() {
        return String.format("Product{id='%s', name='%s', category='%s', avgRating=%.2f}",
                id, name, category, getAverageRating());
    }

}
