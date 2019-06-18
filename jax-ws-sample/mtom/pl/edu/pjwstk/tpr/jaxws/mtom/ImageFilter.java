package pl.edu.pjwstk.tpr.jaxws.mtom;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.soap.MTOM;

import pl.edu.pjwstk.tpr.jaxws.ports.WebServiceBase;

@MTOM
@WebService
public class ImageFilter extends WebServiceBase {
	private static List<MyImage> images = new ArrayList<>();

	@WebMethod
	public void uploadImage(MyImage image) {
		images.add(image);
	}
	@WebMethod
	public MyImage createMyImage(Image img, int size,String name, List<String> keys) {
		return new MyImage(img, name, size, keys);
	}
	@WebMethod
	public List<MyImage> getList(){
		return images;
	}
	@WebMethod
	public List<MyImage> filterList(List<String> keywords) {
		List<MyImage> filteredList = new ArrayList<>();
		for (MyImage image : images) {
			boolean hasKeyword = image.getKeywords().//
					stream().//
					filter(keyword -> keywords.contains(keyword)).//
					findAny().//
					isPresent();
			if (hasKeyword) {
				filteredList.add(image);
			}
		}
		return filteredList;
	}

	@WebMethod
	public MyImage download(String fileName) {
		return images.//
				stream().//
				filter(image -> image.getName().equals(fileName)).//
				findFirst().//
				get();
	}
}
