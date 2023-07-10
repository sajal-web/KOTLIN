package Assignment1

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit

fun main() {
    addProduct()

}

fun addProduct() {
    val productManager = ProductManager()
    // Here i set values for 10 products

    productManager.addProduct(Products(1, "Clothe", "Red Shirt", 599.00, 10.00, "2023-06-12"))
    productManager.addProduct(Products(2, "P2", "B2", 599.00, 10.00, "2023-07-06"))
    productManager.addProduct(Products(3, "P3", "B3", 499.00, 10.00, "2020-06-12"))
    productManager.addProduct(Products(4, "P4", "B4", 599.00, 10.00, "2023-07-03"))
    productManager.addProduct(Products(5, "P5", "B5", 599.00, 10.00, "2023-06-12"))
    productManager.addProduct(Products(6, "P6", "B6", 699.00, 10.00, "2023-06-12"))
    productManager.addProduct(Products(7, "P7", "Shirt", 899.00, 10.00, "2023-07-06"))
    productManager.addProduct(Products(8, "P8", "B7", 399.00, 10.00, "2023-06-12"))
    productManager.addProduct(Products(9, "P9", "B8", 299.00, 10.00, "2023-06-12"))
    productManager.addProduct(Products(10, "P10", "B9", 99.00, 0.00, "2023-07-07"))

    // Get the list of products
    val products = productManager.getProducts()

//    println(displayResultForShirts(products))
//    println()
//    println(discountedProducts(products))
    println(displayMfgDiffFive(products))
//    displayProducts(products)

}

// Function to display results of shirts
fun displayResultForShirts(products: List<Products>): List<Products> {


    println("Here is the products which contains shirts: ")

//    for (product in products) {
//        if (product.pName == keyward) {
//            println("Product Id : ${product.id}")
//        }
//    }
//    println()

    // Optimized code
    return products.filter { it.brandName.toString().contains("Shirt", ignoreCase = true) }

}

// Function to display products which product price is 10% discount below 500
fun discountedProducts(products: List<Products>): List<Products> {
    println("Here is the products which contains 10% discount and whose price is below 500")
    // optimized code
    return products.filter { it.price < 500 && it.discount == 10.00 }
    //    for (product in products) {
    //        if (product.price < 500 && product.discount == 10.00) {
    //            println("Product Id : ${product.id}")
    //        }
    //    }
    //    println()
}
    // val s1="abcs"

fun displayMfgDiffFive(products: List<Products>): List<Products> {

    //    val st = "st1"
    //    val formatter = DateTimeFormatter.ISO_DATE
    //    val localDate = LocalDate.now()
    //    println(localDate)
    println("Here is the products which products MFD  less then 5 days")
    //    for (product in products) {
    //        val date2 = product.mfg
    //        val mfgDate = LocalDate.parse(date2, formatter)
    //        val daysDifference = ChronoUnit.DAYS.between(mfgDate, localDate)
    //        if (daysDifference <= 5) {
    //            println("Product Id : ${product.id} and the MFD difference is $daysDifference")
    //        }
    //    }
    //    println()

    // Optimize code
    //    val cur = LocalDate.now()

    return products.filter { it.mfg.getDaysDiff() in 1..5 }

}

fun displayProducts(products: List<Products>) {
    println("Here is the Products : ")
    for (product in products) {
        println("Product ID: ${product?.id}")
        println("Name: ${product?.pName}")
        println("Brand: ${product?.brandName}")
        println("Price: ${product?.price}")
        println("Discount: ${product?.discount}")
        println("Manufacturing: ${product?.mfg}")
        println()
    }
}

