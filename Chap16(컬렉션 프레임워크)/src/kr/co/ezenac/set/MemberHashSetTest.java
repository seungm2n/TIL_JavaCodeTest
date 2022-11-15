package kr.co.ezenac.set;


public class MemberHashSetTest {

	public static void main(String[] args) {
		
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberL = new Member(2022, "이순신");
		Member memberW = new Member(2023, "원균");
		Member memberR = new Member(2024, "나대용");
		Member memberS = new Member(2025, "류성룡");
		
		memberHashSet.addMember(memberL);
		memberHashSet.addMember(memberW);
		memberHashSet.addMember(memberR);
		memberHashSet.addMember(memberS);
		memberHashSet.showAllMember();
		

		Member memberL2 = new Member(2025, "이도");
		memberHashSet.addMember(memberL2);
		memberHashSet.showAllMember();
	}

}
