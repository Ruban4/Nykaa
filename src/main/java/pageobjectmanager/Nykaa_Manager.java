package pageobjectmanager;

import org.openqa.selenium.support.PageFactory;

import com.Base.Base_class;
import com.pom.AddToCart;
import com.pom.AddressPage;
import com.pom.BagFrame;
import com.pom.Logout;
import com.pom.PaymentPage;
import com.pom.ProductSearch;
import com.pom.login;

public class Nykaa_Manager extends Base_class{
	

	public Nykaa_Manager() {
		PageFactory.initElements(driver, this);
	}

private login logm;
	
	private ProductSearch ProductSearchm;
	
	private AddToCart AddToCartm;
	
	private BagFrame BagFramem;
	
	private AddressPage AddressPagem;
	
	private PaymentPage PaymentPagem;
	
	private Logout Logoutm;

	public login getLogm() {
		if (logm==null) {
			logm = new login();
		}
		return logm;
	}

	public ProductSearch getProductSearchm() {
		if (ProductSearchm==null) {
			ProductSearchm = new ProductSearch();
		}
		return ProductSearchm;
	}

	public AddToCart getAddToCartm() {
		if (AddToCartm==null) {
			AddToCartm = new AddToCart();
		}
		return AddToCartm;
	}

	public BagFrame getBagFramem() {
		if(BagFramem==null) {
			BagFramem = new BagFrame();
		}
		
		return BagFramem;
	}

	public AddressPage getAddressPagem() {
		if (AddressPagem==null) {
			AddressPagem = new AddressPage();
		}
		return AddressPagem;
	}

	public PaymentPage getPaymentPagem() {
		if (PaymentPagem==null) {
			PaymentPagem = new PaymentPage();
		}
		return PaymentPagem;
	}

	public Logout getLogoutm() {
		if (Logoutm==null) {
			Logoutm = new Logout();
		}
		return Logoutm;
	}
	
	
	
}
