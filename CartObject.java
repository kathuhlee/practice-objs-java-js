Cart cart = Cart.getInstance("1");

cart.getId();
cart.useGetId();

Gson gson = new Gson();

System.out.println(gson.toJson(cart));

private final String id;

private final Product product;

private Cart(String id, Product product) {
    this.id = id;
    this.product = product;
}

public static getInstance(String id) {
    return new Cart(id);
}

function getTotal(getTax()) {
    total = getTax() + quantity * price;
}

function getTax() {
    tax = 7.25*state;
}

public String getId() {
    return this.id;
}

public String useGetId() {
    this.getId();
}

@Override
public String toString() {
    return new Gson().toJson(this);
}




name of your class 
    Dog                     Thomas

some fields that describe your class
    frame, breed, color, bark

constructor that creates your class
    if you call Dog, then you can have access to any information about the dog or any logic

creationary method - builder pattern
    getInstance()

some methods for logic
    boolean canBark 
    List colors



    _______________________________________________

    Dog fido = new Dog();           or  Dog fido = Dog.getInstance();

    fido.canBark()















