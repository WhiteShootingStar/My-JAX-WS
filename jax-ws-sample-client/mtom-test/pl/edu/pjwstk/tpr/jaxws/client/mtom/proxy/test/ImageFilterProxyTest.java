package pl.edu.pjwstk.tpr.jaxws.client.mtom.proxy.test;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.imageio.ImageIO;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import pl.edu.pjwstk.tpr.jaxws.client.mtom.ImageFilter;
import pl.edu.pjwstk.tpr.jaxws.client.mtom.ImageFilterService;
import pl.edu.pjwstk.tpr.jaxws.client.mtom.MyImage;
import pl.edu.pjwstk.tpr.jaxws.client.mtom.proxy.ImageFilterProxy;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ImageFilterProxyTest {

	private ImageFilter filter;
	private List<String> keywords = Arrays.asList("ANIME", "JOJO");
	private List<String> keywords1 = Arrays.asList("X", "Y", "Z");
	private MyImage image, image1;

	@Before
	public void before() throws IOException {
		filter = new ImageFilterProxy();
		byte[] img = Files.readAllBytes(Paths.get("pol.png"));
		byte[] img1 = Files.readAllBytes(Paths.get("pog.png"));
		image = filter.createMyImage(img, img.length, "POLNAREFF", keywords);
		image1 = filter.createMyImage(img1, img1.length, "POGCHAMP", keywords1);
	}

	@Test
	public void AUploadImage() {

		filter.uploadImage(image);
		filter.uploadImage(image1);
		Assert.assertEquals(2, filter.getList().size());
	}

	@Test
	public void BDownloadImage() {
		MyImage downloaded = filter.download("POLNAREFF");
		Assert.assertEquals(downloaded.getKeywords(), keywords);
		Assert.assertEquals(downloaded.getName(), "POLNAREFF");

	}

	@Test
	public void CFilter() {
		Assert.assertEquals(2, filter.getList().size());
		List<String> keywords1 = Arrays.asList("Z");

		Assert.assertEquals(1, filter.filterList(keywords1).size());
	}
}
