package kr.co.ezenac.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import kr.co.ezenac.stream.model.User;

public class TestStream02 {

	public static void main(String[] args) {
		
		Stream<Integer> numberStream = Stream.of(3, -5, 7, 10, -3);
		Stream<Integer> filteredNumberStream = numberStream.filter(x -> x > 0);
		List<Integer> filteredNumber = filteredNumberStream.collect(Collectors.toList());
		System.out.println(filteredNumber);
		
		List<Integer> numberStream2 = Stream.of(3, -5, 7, 10, -3)
				.filter(x -> x >0)
				.collect(Collectors.toList());
		System.out.println(numberStream2);
		
		
		User user1 = new User()
				.setId(101)
				.setName("Michael")
				.setVerified(true)
				.setEmailAddress("Michael@gmail.com");
		
		User user2 = new User()
				.setId(102)
				.setName("Juliana")
				.setVerified(false)
				.setEmailAddress("Juliana@gmail.com");
		
		User user3 = new User()
				.setId(103)
				.setName("Tom")
				.setVerified(true)
				.setEmailAddress("Tom@gmail.com");
		
		List<User> users = Arrays.asList(user1, user2, user3);
		List<User> verifiedUsers = users.stream()
			.filter(user -> user.isVerified())
			.collect(Collectors.toList());
		System.out.println(verifiedUsers);
		
		List<User> unVerifiedUsers = users.stream()
				.filter(user -> !user.isVerified())
				.collect(Collectors.toList());
			System.out.println(unVerifiedUsers);		
	}
}


















