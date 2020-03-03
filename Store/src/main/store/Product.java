package store;

public class Product {

	/* The Name */
	public String nombre_producto;

	/* The UnitPrice */
	public float precio_producto;

	/* The Category */
	public ProductCategory categoria_producto;

	/* The Image */
	public ImageInfo image;

	/* The Category */
	public int unitsInStock;

	public Product(String nombre_producto, float precio_producto, ProductCategory categoria_producto, ImageInfo image) {
		this.nombre_producto = nombre_producto;
		this.precio_producto = precio_producto;
		this.categoria_producto = categoria_producto;
		this.image = image;
	}

	public String getName() {
		return nombre_producto;
	}

	public float getUnitPrice() {
		return precio_producto;
	}

	public ProductCategory getCategory() {
		return categoria_producto;
	}

	public ImageInfo getImage() {
		return image;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	public String toXml() {
		return "<product>" + "<name>" + nombre_producto + "</name>" + "<category>"
				+ categoria_producto + "</category>" + "</product>";
	}
}
