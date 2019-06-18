package pl.edu.pjwstk.tpr.jaxws.client.mtom.proxy;

import java.util.List;

import com.sun.xml.ws.developer.WSBindingProvider;

import pl.edu.pjwstk.tpr.jaxws.client.common.ProxyBase;
import pl.edu.pjwstk.tpr.jaxws.client.mtom.BigDataStandard;
import pl.edu.pjwstk.tpr.jaxws.client.mtom.BigDataStandardService;
import pl.edu.pjwstk.tpr.jaxws.client.mtom.ImageFilter;
import pl.edu.pjwstk.tpr.jaxws.client.mtom.ImageFilterService;
import pl.edu.pjwstk.tpr.jaxws.client.mtom.MyImage;
/**
 * @author Artsiom Paliashchuk <Artsiom@paliashchuk.by>
 */
public class ImageFilterProxy extends ProxyBase implements ImageFilter {
	private ImageFilterService service;
	private ImageFilter port;
	@Override
	public List<MyImage> filterList(List<String> arg0) {
		// TODO Auto-generated method stub
		return getPort().filterList(arg0);
	}

	@Override
	public void uploadImage(MyImage arg0) {
		getPort().uploadImage(arg0);
		
	}

	@Override
	public MyImage download(String arg0) {
		// TODO Auto-generated method stub
		return getPort().download(arg0);
	}

	@Override
	protected WSBindingProvider getBindingProvider() {
		// TODO Auto-generated method stub
		return (WSBindingProvider) getPort();
	}

	private ImageFilter getPort() {
		if (service == null) {
			service = new ImageFilterService();
		}
		if (port == null) {
			port = service.getImageFilterPort();
		}
		return port;
	}

	@Override
	public List<MyImage> getList() {
		// TODO Auto-generated method stub
		return getPort().getList();
	}

	@Override
	public MyImage createMyImage(byte[] arg0, int arg1, String arg2, List<String> arg3) {
		// TODO Auto-generated method stub
		return getPort().createMyImage(arg0, arg1, arg2, arg3);
	}

}
