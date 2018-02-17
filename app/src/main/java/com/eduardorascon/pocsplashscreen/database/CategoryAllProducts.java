public class CategoryAllProducts {
	@Embedded
	private Category category;

	@Relation(parentColumn = "category_id", entityColumn = "category_id", entity = Product.class)
	private List<Product> products;
}