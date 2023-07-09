package Assignment1

class  ProductManager{
    private val products: MutableList<Products> = mutableListOf()

    fun addProduct(product: Products) {
        products.add(product)
    }

    fun getProducts(): List<Products> {
        return products
    }
}