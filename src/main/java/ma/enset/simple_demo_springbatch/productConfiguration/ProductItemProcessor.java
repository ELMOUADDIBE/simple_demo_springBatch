package ma.enset.simple_demo_springbatch.productConfiguration;

import org.springframework.batch.item.ItemProcessor;

public class ProductItemProcessor implements ItemProcessor<Product, Product> {
    @Override
    public Product process(Product product) throws Exception {
        return new Product(product.name().toUpperCase(), product.price() * 0.2);
    }

}
