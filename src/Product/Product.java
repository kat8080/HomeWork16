package Product;

import java.util.Objects;

public class Product {
    private final String title;
    private final float price;           //цена
    private final int quantity;          //количество в кг
    private boolean checked;            //проверка на покупку

    public Product(String title, float price, int quantity) {
        if (title == null || title.isBlank() || price < 0 || quantity < 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью.");
        }
        this.title = title;
        this.price = price;
        this.quantity = quantity;
        this.checked = false;
    }

    public String getTitle() {
        return title;
    }

    public float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setChecked() {
        this.checked = true;
    }

    public boolean isChecked() {
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(title, product.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    @Override
    public String toString() {
        String checkedString = this.isChecked() ? "да" : "нет";
        return title + ", цена: " + price + ", количество: " + quantity+" кг." + ", куплен: " + checkedString;
    }
}
