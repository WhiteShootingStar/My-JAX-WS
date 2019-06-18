package pl.edu.pjwstk.tpr.jaxws.mtom;

import java.awt.Image;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import com.sun.xml.internal.txw2.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlAccessorType(XmlAccessType.PROPERTY)
public class MyImage {

	private Image image;
	@XmlTransient
	private String Name;
	@XmlTransient
	private int size;

	private List<String> keywords;

	public MyImage() {

	}

	public MyImage(Image image, String name, int size, List<String> keywords) {
		this.image = image;
		Name = name;
		this.size = size;
		this.keywords = keywords;
	}

	@XmlElement
	public Image getImage() {
		return image;
	}

	@XmlElement
	public void setImage(Image image) {
		this.image = image;
	}

	@XmlElement
	public String getName() {
		return Name;
	}

	@XmlElement
	public void setName(String name) {
		Name = name;
	}

	@XmlElement
	public int getSize() {
		return size;
	}

	@XmlElement
	public void setSize(int size) {
		this.size = size;
	}

	@XmlElement
	public List<String> getKeywords() {
		return keywords;
	}

	@XmlElement
	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}
}
