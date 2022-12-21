package Product;

import Product.Product;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ProductList {
    private final Set<Product> products = new HashSet<>();

    public void addProduct(Product product) {                    //добавление продукта в список
        if (product == null) {
            return;
        }
        if (this.products.contains(product)) {
            throw new ProductAlreadyExistsException();         //исключение если есть такой продукт
        } else {
            this.products.add(product);
        }
    }

    public void checkProduct(String titl) {                   //покупка
        for (Product product : this.products) {
            if (product.getTitle().equals(titl)) {
                product.setChecked();
                break;
            }
        }
    }

    public void removeProdukt(String titl) {               //удаление
        Iterator<Product> productsIterator = this.products.iterator();
        while (productsIterator.hasNext()) {
            if (productsIterator.next().getTitle().equals(titl)) {
                productsIterator.remove();
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Продукты: " + products;
    }
}
