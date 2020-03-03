package store;

public class ImageInfo {

	public String ruta_imagen;
	
	public ImageInfo(String ruta_imagen) {
		this.ruta_imagen = ruta_imagen;
	}

	public String getPath() {
		return ruta_imagen;
	}

	public String getImageType() {
		return ruta_imagen.substring(path.indexOf(".") + 1);

	}
}
