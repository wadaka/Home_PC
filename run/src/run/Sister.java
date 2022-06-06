package run;

import java.util.ArrayList;
import java.util.List;

public class Sister {

	boolean isCamp_1 = false;
	boolean isCamp_2 = true;
	boolean isOintment = false;
	boolean isGun = false;
	boolean isSmoke = false;
	boolean isLitter = false;
	List<Integer> Ointment = new ArrayList<>();
	List<Integer> Gun = new ArrayList<>();
	List<Integer> Smoke = new ArrayList<>();
	List<Integer> Litter = new ArrayList<>();
	List<Integer> Conversation = new ArrayList<>();

	public Sister() {
		setConversation(Ointment,2);
		setConversation(Gun,2);
		setConversation(Smoke,2);
		setConversation(Litter,2);
		setConversation(Conversation,6);
	}

	public void setConversation(List<Integer> type_conversation,int num) {
		for(int i=0;i<num;i++) {
			type_conversation.add(i);
		}
	}
}
