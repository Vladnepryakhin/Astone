class Product1 {
    Product1() {
    }

    public static void main(String[] args) {
        Product[] productsArray = new Product[]{new Product("Samsung s25 Ultra", "1.03.2143", "Samsung Corp.", "Korea", (double)1999.0F, "true"), new Product("Samsung s27 Ultra", "12.03.2145", "Samsung Corp.", "Korea", (double)1999.0F, "true"), new Product("Samsung s29 Ultra", "27.05.2150", "Samsung Corp.", "Korea", (double)1999.0F, "true"), new Product("Samsung s31 Ultra", "7.02.2163", "Samsung Corp.", "Korea", (double)1999.0F, "true"), new Product("Samsung s31", "5.02.2164", "Samsung Corp.", "Korea", (double)1999.0F, "true")};

        for(Product product : productsArray) {
            System.out.println(product);
        }

    }
}
