public class Test17 {
    //table Order
    //OrderId    CustomerId      EmployeeId     OrderDate       Shipper
    //10308         2               7           2001-16-10          3
    //10309         37              3           2001-26-10          1
    //10310         77              8           2001-06-10          2

    //table Customer
    //CustomerId   CustomerName
    //1             Anna Li
    //2             John Petrol
    //3             Liza Dante

//    SELECT Order.OrderId, Customer.CustomerName FROM Order INNER JOIN Customer ON Order.CustomerId = Customer.CustomerId;

    //OrderId    CustomerId      CustomerName
    //10308         2           John Petrol
}