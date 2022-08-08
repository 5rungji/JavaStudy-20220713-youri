package j19_익명클래스.role;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class PrincipalDetailse {
	
	@NonNull
	private User user;
	
	//인터페이스라도 extends라고 써야함
	// 인터페이스를 구현하는 ?
	public Collection<? extends GrantedAuthority> getAuthorities() {
		Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		
		/*
		아래 람다식을 풀어 쓴 것
		List<String> roleList = user.getRoleList();
		for(String role : roleList) {
			GrantedAuthority grantedAuthority = new GrantedAuthority() { //익명생성				
				@Override //추상메소드니까 오버라이드
				public String getAuthority() {
					return role;
				}
			};
			authorities.add(grantedAuthority);
		}
		String role = ((List<GrantedAuthority>)authorities).get(0).getAuthority();
		 */
		
		//람다식. 익명클래스의 익명 메소드를 호출하는 것까지 포함하고있음.
		user.getRoleList().forEach(r -> {
			authorities.add(() -> r);
		});
		
		return authorities;

		
	}
	
	public String getUsername() {
		return user.getUsername();
	}
	
	public String getPassword() {
		return user.getPassword();
	}
	
	
//	public static void main(String[] args) {	
//		
//		String strRoles = "USER_ROLE  ,    ADMIN_ROLE   ,MANAGER_ROLE";
//		
//		/*
//		while(strRoles.indexOf(" ") != -1) {
//			strRoles = strRoles.replace(" ", "");
//		}
//		
//		List<String> roles = Arrays.asList(strRoles.split(","));
//		System.out.println(roles);
//		*/
//		
//		//공백을 제거+쉼표로 자르기
//		String[] roleArray = strRoles.replaceAll(" ", "").split(",");
//		
//		//배열로 바꾸기
//		List<String> roles = new ArrayList<String>();
//		roles.addAll(Arrays.asList(roleArray));
//		
//		System.out.println(roles);
//
//		Collection<String> roleDatas = new GrantedAuthority() {
//			
//			@Override
//			public Collection<String> getRoles(List<String> roles) {
//				List<String> roleList = new ArrayList<String>();
//				roleList.addAll(roles);
//				return roleList;
//			}
//		}.getRoles(roles);
//		
//		System.out.println(roles);
//		
//	}

}
