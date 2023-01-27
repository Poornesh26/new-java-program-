class shop{
string product_name;
int product_price,discount;
public static void main (string[] arg){
shop product1= new shop("biscuit",25);
shop product2= new shop("biscuit",50);
shop product3= new shop("bread",40,10);
product1.sell();
product2.pack();
product3.pack();

}
void sell()
{
system.out.println(product_name);
}
void pack()
{
system.out.println(product_price);
}
shop(string product_name,int product_price)
{
this.product_name=product_name;
this.product_name=product_price;
}
shop(string product_name,int product_price,int discount)
{
this.product_name=product_name;
this.product_name=product_price;
this.discount=discount;
}
}
