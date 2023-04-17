const plantObject = {
  color: "green",
  hasLeaves: true,
  requiredNutrients: ["fds", "sdf", "sdff"],
  photosynthesize() {
    console.log("plants need light");
  },
  setColor(color) {
    this.color = color;
  }
};

const cart = {
  id: "1",
  lineItems: [
    {
      quantity: 1,
      product: {
        id: "1",
        name: "hi",
        price: 1,
      },
      getProduct() {
        return this.product;
      },
    },
    {
      quantity: 2,
      product: { id: "2", name: "hello", price: 10 },
      getProduct() {
        return this.product;
      },
    },
  ],
  getLineItems() {
    return this.lineItems;
  },
};
