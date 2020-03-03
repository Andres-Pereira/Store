package store;

public class Product {

	public String nombre_producto;
	public float precio_producto;
	public ProductCategory categoria_producto;
	public ImageInfo foto_producto;
	public int stock_producto;
	

	public Product(String nombre_producto, float precio_producto, ProductCategory categoria_producto, ImageInfo foto_producto) {
		this.nombre_producto = nombre_producto;
		this.precio_producto = precio_producto;
		this.categoria_producto = categoria_producto;
		this.foto_producto = foto_producto;
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
		return foto_producto;
	}

	public int getUnitsInStock() {
		return stock_producto;
	}

	public void setUnitsInStock(int stock_producto) {
		this.stock_producto = stock_producto;
	}

	public String toXml() {
		return "<product>" + "<name>" + nombre_producto + "</name>" + "<category>"
				+ categoria_producto + "</category>" + "</product>";
	}
}
