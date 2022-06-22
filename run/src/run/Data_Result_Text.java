package run;

public class Data_Result_Text {
	public static String result_text_creator(int turn,String summary) {
		String text ="";
		if(turn<10) {
			text+= "第  "+turn+" 歩で ";
		}else if(turn<29){
			text+= "第 "+turn+" 歩で ";
		}
		switch(summary) {
		case "poisonous_insect":
			text+= "毒虫に襲われ 力尽きた。                      ";
			break;
		case "rogue":
			text+= "ならず者に襲われ 力尽きた。                  ";
			break;
		case "maneater":
			text+= "食人植物に襲われ 力尽きた。                  ";
			break;
		case "barbarian":
			text+= "蛮族に襲われ 力尽きた。                      ";
			break;
		case "swarm_of_insects":
			text+= "毒虫の大群に襲われ 力尽きた。                ";
			break;
		case "giant_snake":
			text+= "大蛇に襲われ 力尽きた。                      ";
			break;
		case "mercenary":
			text+= "傭兵に襲われ 力尽きた。                      ";
			break;
		case "tiger":
			text+= "タイガーに襲われ 力尽きた。                  ";
			break;
		case "booby_trap":
			text+= "ブービートラップによって 爆散した。          ";
			break;
		case "squall":
			text+= "スコールで体力を奪われ 力尽きた。            ";
			break;
		case "leeches":
			text+= "吸血虫に全身の血を吸い尽くされた。           ";
			break;
		case "snake":
			text+= "ヘビに噛まれ、全身に毒がまわり 命を落とした。";
			break;
		case "river":
			text+= "渡河の最中、濁流にのまれ 力尽きた。          ";
			break;
		case "remain_of_natives":
			text+= "遺跡散策中、原住民に捕まり 命を落とした。    ";
			break;
		case "remain_of_rock":
			text+= "遺跡散策中、転がる大岩の下敷きとなり 潰れた。";
			break;
		case "claar_bad":
			text+= "無事、秘境を脱出したが、借金のカタとして売り飛ばされた。";
			break;
		case "claar_good":
			text+= "無事、秘境を脱出し、借金も返済した。                    ";
			break;
		case "claar_best":
			text+= "無事、秘境を脱出し、借金を返済し、さらに妹の足も治した。";
			break;
			default:
		}
		return text;
	}
}
