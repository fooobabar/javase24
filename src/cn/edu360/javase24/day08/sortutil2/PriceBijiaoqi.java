package cn.edu360.javase24.day08.sortutil2;

public class PriceBijiaoqi implements BijiaoQi<Product> {

	@Override
	public boolean bijiao(Product o1, Product o2) {
		if(o1.getPrice() > o2.getPrice()){
			return true;
		}
		return false;
	}

}
