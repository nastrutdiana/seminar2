package ro.ase.cts.lab02;

import java.util.ArrayList;

    public class Main {

        public static void main(String[] args) {
            // write your code here
            OShop o = new OShop("Emag", "logo.jpg", new ArrayList<Product>());

            Product p1 = new Product(1, "cereale", 12, " ");
            Product p2 = new Product(2, "laptop", 3000," ");


            o.modifyProductsList(1,p1);
            o.modifyProductsList(1,p2);

            o.modifyProductsList(2, p1);
            System.out.println(p1.equals(p2));
        }
    }

    class OShop {
        private String onlineShopName;
        private String i;
        private ArrayList<Product> products;

        OShop(String name, String img, ArrayList<Product> products)
        {
            this.products = new ArrayList<Product>();
            this.i = img;
            this.onlineShopName = name;
        }

        public void modifyProductsList(int what, Product p)
        {
            if(what == 1)
            {
                this.products.add(p);
            }
            else
                this.products.remove(p);
        }

        public String getOnlineShopName() {
            return onlineShopName;
        }

        public void setOnlineShopName(String onlineShopName) {
            this.onlineShopName = onlineShopName;
        }

        public String getI() {
            return i;
        }

        public void setImg(String img) {
            this.i = img;
        }
    }

    class Product
    {
        private int Id;
        private String Name; // length >=5
        private double Price; // > 0
        private String description; // ex.: processor, memory, power, volume (for refrigerators etc) // permite " "

        public Product(int id, String name, double price, String description) {
            Id = id;
            Name = name;
            Price = price;
            this.description = description;
        }



        public boolean equals(Product product)
        {
            if (product.Id != this.Id || !product.Name.equals(this.Name) || product.Price != this.Price
                    || !product.description.equals(this.description))
                return false;
            return true;
        }


    }

    class User
    {
        private int id; //>= 1
        private String username; // >= 5
        private String name; //min 10
        private ArrayList<Order> orderHistory;
        private ArrayList<Cart> shoppingCart;

        public User(int id, String username, String name) {
            this.id = id;
            this.username = username;
            this.name = name;
        }

        public void addOrderToHistory(Order order){
            orderHistory.add(order);
        }

        public void addProductToCart(Product product){

        }


    }

    class Order
    {
        private ArrayList<Product> l;
        private String addr;

        public Order()
        {
            l = new ArrayList<Product>();
        }
        public void add(Product p)
        {
            if(l.size() > 99)
                return;

            l.add(p);
        }

        public void remove(Product p)
        {
            l.remove(p);
        }

        public String getAddr() {
            return addr;
        }

        public void setAddr(String addr) {
            this.addr = addr;
        }
    }

    class InventoryP
    {
        private Product p;
        private int q;


        public Product getP() {
            return p;
        }

        public void setP(Product p) {
            this.p = p;
        }

        public int getQ() {
            return q;
        }

        public void setQ(int q) {
            this.q = q;
        }
    }

