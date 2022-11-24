package kr.co.ezenac.builder02;

/*
 *   칼조네 피자 
 *   	- ConcreteBuilder (Builder에 선언된 메서드를 구현한 클래스)
 *   	- sauceInside라는 부울 값을 통해 소스를 넣을지 말지 선택함.
 */
public class Calzone extends Pizza {
	private final boolean sauceInside;

	public Calzone(Builder builder) {
		super(builder);	
		this.sauceInside = builder.sauceInside;
	}
	
	public static class Builder extends Pizza.Builder {
		private boolean sauceInside = false;

		public Builder sauceInside() {
			sauceInside = true;
			return this;
		}
		
		@Override
		protected Builder self() {

			return this;
		}

		@Override
		Pizza build() {
			return new Calzone(this);
		}
		
	}
	
	@Override
	public String toString() {

		return toppings.toString() + " sauceInside : " + sauceInside;
	}

}











