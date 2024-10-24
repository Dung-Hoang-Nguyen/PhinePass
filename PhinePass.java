package storyPackage;
public class PhinePass {
	
public static void main (String [] args) {
Story1 i = new Story1();
boolean menu = true;
i.set(Story1.menu);
while (menu) {
	i.choice();
	System.out.println(i.choice);
	switch (i.choice) {
		case "new game":i.add("Remember, type menu anytime to open menu!");menu=false;break;
		case "load":
			i.add("Load:");
			i.choice();
			i.Load(i.choice);
			if (i.farm==1) {menu=false;} break;
		case "quit":i.set("");menu=false;i.window.setVisible(false);break;
		case "sequence break": i.add("You want to break me so bad? Fine, enter location:");i.choice(); i.location=Integer.valueOf(i.choice);menu=false;break;
		default: i.add("Unfortunately, not a secret menu option");
}}
i.set("You open your eyes and wake up.");
i.add("Try doing <something>.");
while(!i.choice.equals("something")) {
i.choice();
switch(i.choice) {
case "stretch": i.add("You stretch a little");
case "sleep": i.add("SLEEP? Do that later.");break;
case "nothing": i.add("I do think that is the exact opposite of <something>.");break;
case "close eyes":i.add("A sense of responsibility and willingness to play the game makes you open your eyes again.");break;
case "dance": i.add("You dance a little but, as your parents said, dancing brings you nowhere.");break;
case "draw": i.add("You draw a nice picture but, as your parents said, art has no future.");break;
case "something":
while(true) {
	switch (i.location){
	case 448:
i.defaultlay();
while (i.location==448){ 
i.add("");
if (i.weapon==true && i.poo==3 && i.cook==70) {i.set("Your house has <your room>. You can also <wait> around...");}
else if (i.weapon==true && i.poo==3) {i.set("Your house has <your room> and a <kitchen>. You can also <wait> around...");}
else if (i.weapon==true && i.cook==70) {i.set("Your house has <your room> and  a <bathroom>. You can also <wait> around...");}
else if (i.poo==3 && i.cook==70) {i.set("Your house has <your room> and a <bathroom>. You can also <wait> around...");}
else if (i.poo==3) {i.set("Your house has <your room>, a <kitchen> and an <attic>. You can also <wait> around...");}
else if (i.cook==70) {i.set("Your house has <your room>, a <bathroom> and an <attic>. You can also <wait> around...");}
else if (i.weapon==true) {i.set("Your house has <your room>, a <bathroom> and a <kitchen>. You can also <wait> around...");}
else {i.set("Your house has <your room>, a <bathroom>, <kitchen>, and <attic>. You can also <wait> around.");} 
i.add("You have school in "+ Math.round((7-i.count)*60) +" minutes, where do you want to go?");
if (i.count>=6.75) {i.add("You should <leave>, going to school usually takes you 10 minutes");}
if (i.cook<i.count-1/60 && i.cook!=100 && i.cook!=0) {
i.add("You smell smoke."); i.cook=70;}
i.choice();
if (i.count>=7 && i.count<=8) {
i.choice="leave";}
switch (i.choice) {
	case "clock": System.out.print(i.time()+" " +i.count); break;
	//wait
	case "wait":
		i.add("How long do you want to wait?");
		i.choice();
		double time = Integer.valueOf(i.choice);
		i.count+=time/60; i.choice="";
		i.add("You waited "+ time +  " minutes.");
		time = 0; break;
		//your room
	case "your room":
		do {if (i.cook!=0 && i.cook<i.count && i.cook!=100) {i.cook=70;}
		i.add("Your room has a <bed>, <desk> and <closet>.");
		i.choice();
		switch (i.choice) {
		//desk
			case "desk":
				while (!i.choice.equals("return") && i.count<7) {
				if (i.study==1) {i.add("Well, you've studied... what is this desk here for then... "); 
				i.add("WAIT! YOU CAN STUDY EVEN MORE! LIFE IS AN ENDLESS CYCLE OF LEARNING! WE WILL GO ABOVE AND BEYOND!(<study> for 15 minutes? It is " + i.time() + ", you can still <return>.)");}
				else if (i.study==2) {i.add("<study>! There is no <return>!");}
				else {i.add("You do remember you have a test today. You can <study> but you could just <return>. What do you want to do? Time: " + i.time());}
				i.choice();
				if (i.choice.equals("study")) { 
				if (i.study==0) {
				i.add("You review for your test, you feel like you could get full marks for it. " ); 
				i.study++; i.count+=0.25;}
				else if (i.study==1) {
				i.add("study... study.. we need to do more...!"); i.study++;i.count+=0.25;}
				else if (i.study==2) {
				i.add("ehe...ha..ahahhaHAHAHHAA! \n\n"); 
				i.study++; i.count=7; i.location=449; i.redo=0;}}
				else if (i.choice.equals("return") || i.study==3) {}
			else {i.add("You don't want to.");}
			}break;
			//closet
			case "closet": 
			  	i.add("You take a look in your closet and get ready. You can get EXTRA <ready> or <search> but you could just <return>. What do you want to do? Time: " + i.time());
				while (!i.choice.equals("return") && i.count<7) {
				i.choice();
				if (i.choice.equals("ready")) {
				if (i.ready) {i.add("You get EXTRA ready, you feel like you could take on the world."); 
				i.ready=true; i.t(5);}
				else {i.add("WOAH THERE. No one is allowed to be THAT ready. Step back there, bucko.");}
				}
				else if (i.choice.equals("search")) { 
				if (i.redo==0) {
				i.add("You find your old plushy you thought you lost! And $10."); 
				i.ready=true; i.money+=10;i.redo++;
				if (i.farm>0) {i.add("//WoW! An infinite money (and plushy?) glitch! Though it is inefficient...//");}}
				else {i.add("You find nothing, not even Narnia.");}}
				else if (i.choice.equals("return")) {i.redo=0; if (i.redo>0) {i.farm++;}}
				else {i.add("You don't want to.");}
			}break;
			//bed
			case "bed":
				i.add("You go back to bed."); 
				i.add("Game over."); 
				if (i.redo>0) {i.location = 0;} else {
				i.choice();
				i.add("..."); 
				i.choice();
				i.add("..."); 
				i.add(" ok, i understand that you may have some progress you dont want to lose so ill let you continue to before you made this decision i may not be as merciful next time.  Take this gift though! [1: I]");
				i.add(" Continue?");
				while (!i.choice.equals("no") && !i.choice.equals("yes")) {i.add("<yes>/<no>"); i.choice();
				if (i.choice.equals("no")) {
				i.location = 0;}
				if (i.choice.equals("yes")) {
				i.redo++;}}}break;
			//
			case "return": i.farm=0;break;
			default: i.add("You don't want to.");
		}} while (!i.choice.equals("return") && i.location!=0 && i.count<7);break;
	//kitchen
	case "kitchen":
	if (i.cook==i.tm(5)) {i.add("Return in 5 minutes to get your food! You can <look around> or you could just <return>. What do you want to do? Time: " + i.time());}
	else if (i.cook>i.tm(-1) && i.cook<i.tm(1)) {i.add("Your food is ready! Get your <cook>ing now or you may burn your kitchen. You can also <look around> or you could just <return>. What do you want to do? Time: " + i.time());}
	else if (i.cook!=0 && i.cook<i.tm(-1) && i.cook!=100) {i.cook=70;}
	else if (i.cook==100) {i.add("There's no one else in the kitchen. You can <look around>, or you could just <return>. What do you want to do? Time: " + i.time()); }
	else {i.add("There's no one else in the kitchen. You can <look around>, <cook> or you could just <return>. What do you want to do? Time: " + i.time()); }
	while (!i.choice.equals("return") && i.count<7) {
	if (i.cook>i.tm(-1) && i.cook<i.tm(1)) {i.add("Your food is ready! Get your <cook>ing now or you may burn your kitchen. You can also <look around> or you could just <return>. What do you want to do? Time: " + i.time());}
	if (i.cook==70) {i.add("You don't want to go in there."); i.choice = "return";}
	else{i.choice();}
	switch (i.choice) {
	case "look around":
		if (i.redo==0) {
		i.add("You look around the kitchen and find $20."); 
		i.money+=20; i.t(5);i.redo++;}
		else {i.add("You dont find anything of importance.");}
		if (i.farm>0) {i.add("//WoW! An infinite money glitch!//");}break;
	case "cook":
		if (i.cook==0) {
		i.add("You start cooking. Come back after 5 minutes to grab your food.");  i.t(5); i.cook=i.tm(5);i.add("Time: " + i.time());}
		else if (i.cook>i.tm(-1)&&i.cook<i.tm(1)) {
		i.add("You receive your greatly cooked food."); i.cook=100; i.t(5);}
		else if (i.cook==100) {
		i.add("You have already cooked.");}break;
	case "return":i.redo=0; if (i.redo>0) {i.farm++;}break;
	default:i.add("You don't want to.");}
	}break;
	//attic
	case "attic": 
	while (!i.choice.equals("return") && i.count<7) {
	if (i.weapon) {i.add("...<return>"); } 
	else if (i.redo>=3) {i.add("You're in the attic, you think you're looking for a <weapon>. You can <search> but you could just <return>. What do you want to do? Time: " + i.time()); }
	else if (i.redo==0){i.add("You're in the attic, you don't quite know why you're here but you feel like something's drawing you here... You can <search> but you could just <return>. What do you want to do? Time: " + i.time()); }
	i.choice();
	if (i.weapon) {break;}
	switch (i.choice) {
	case "knife":
		i.add("You grab your parents' old hunting knife."); 
		i.weapon=true;break;
	case "search":
		if (i.redo == 0) {
		i.add("You look around. The dust around is thick, you think you're looking for something that you consider useful."); 
		i.redo++; i.t(5);}
		else if (i.redo == 1) {
		i.add("You look around. The dust around is thinning, you think you're looking for something that you consider inappropriate for a school environment.");
		i.redo++; i.t(5);}
		else {
		i.add("You look around. The dust around is thin, you think you're looking for something that you consider deadly."); 
		i.redo++; i.t(5);}break;
	case "return":i.redo=0;break;
	default: i.add("You don't think that's what you want.");}
	}break;
	//bathroom
	case "bathroom":
	if (i.poo==3) {i.add("You don't think that's a good idea.");}
	else if (i.teeth==true) {i.add("Ah, the glorious bathroom, the place in which you are most vulnerable. You can go to the <toilet>, the <bathtub> or <return>. Time: " + i.time());}
	else {i.add("Ah, the glorious bathroom, the place in which you are most vulnerable. You can brush your <teeth>, go to the <toilet>, the <bathtub> or <return>. Time: " + i.time());}
	while (!i.choice.equals("return") && i.count<7){
	if (i.poo==3) {i.add("You slam your bathroom door shut."); i.choice="return";}
	i.choice(); if (i.poo==3) {break;}
	switch (i.choice) {
	case "teeth": if(!i.teeth) {
		i.add("Your teeth are SHINING. You're feeling good."); 
		i.teeth=true; i.t(5);}
		else { i.add("Mint is all you can taste...");}
	break;
	case "toilet":
		switch (i.poo) {
		case 0:
		i.add("You take a big one. It feels like the water is rising."); 
		i.poo++; i.t(5);break;
		case 1:
		i.add("Dang... That's a lot. You didn't know you had it in you. You should probably stop or the toilet might explode."); 
		i.poo++; i.t(5);break;
		case 2:
		i.add("You have done it. You feel stronger than ever. Though you don't think you can ever go into the bathroom ever again."); 
		i.poo++; i.t(5);}break;
	case "bathtub":
		i.add("You prepare the bathtub.");
		i.add("Step in?"); i.t(5);
		while (!i.choice.equals("no") && !i.choice.equals("yes")) {i.add("<yes>/<no>"); 
		i.choice();
		if (i.choice.equals("no")) {
		i.add("You drain the bathtub.");}
		if (i.choice.equals("yes")) {
		i.location = 450;i.count=7;}}break;
	case "return": break;
	default: i.add("You don't feel like doing that at the moment.");}
	} break;
	case "leave": i.location=415;break;
	case "return": break;
	default: i.add("You don't feel like doing that at the moment.");
}} break;
//leave house

	case 0:i.window.setVisible(false);System.exit(0);break;
	
	case 435://Library
	break;
	case 436://trash
		i.defaultlay();
		i.set("You see <something>... sparkly in the trash?");
		while (!i.choice.equals("something")||!i.choice.equals("leave")) {
		i.choice();
		}
	break;
	case 437://Bakery
	break;
	case 438://Museum
	while (i.location==438) {
		i.defaultlay();
		i.set("The Museum isn't too full today, it seems to be the final day of an exhibit of jewelry. It's famed jewel is a big crafted <sapphire>. There are also <necklace 1-4> and <ring 1-4>");
		while (!i.choice.equals("sapphire")||!i.choice.equals("leave")) {
		i.choice();
		switch (i.choice) {
		case "sapphire": i.add("The sapphire glimmers in the sunlight, dazzling you and almost blinding you at the same time. Its color is bright blue yet somehow sparkles all colors of the rainbow, leaving a looming shadow on the back wall of the exhibit.");

		break;
		case "necklace 1":i.add("");break;
		case "necklace 2":i.add("");break;
		case "necklace 3":i.add("");break;
		case "necklace 4":i.add("");break;
		default: i.add("This museum didn't have enough money to get that exhibit");
		}}
	}
	break;
	case 439://Hospital
	break;
	case 440://CityHall
	break;
	case 441://Salon
	break;
	case 442://Supermarket
	break;
	case 443://Restaurant
	break;
	case 444://Theater
	break;
	case 445://Departmentstore
		i.defaultlay();
		i.set("What do ya' want?");
		i.choice();
		
	break;
	case 446://PostOffice
	break;
	case 447://Park
	break;
	case 449://School
i.schoolLay();
while (i.location==449){
switch((int)i.count){
case 6:
	i.set("You're at school on time. Due to some primeval priming, you are herded into your first period classroom.");
	i.add("Small clusters of early birds are scattered around the class. You don't think there is a test today.");
	
	
	
break;
case 7:
	i.set("The bell has spoken. Classes are to commence.");
	
break;
case 16:
	i.set("Students are starting to go home. You should probably leave. It's rumoured addicts and homeless gather here at night.");
	
break;
}}
break;
	case 450:
i.set("OOPSIES! You've reached the end of the current available content. You're on the first sub branch with only a few potential endings, though with much story!");
break;
	default: 
/*plan zone: therell be 8 periods fifth is lunch  classes made as we go to fit narratively will be given choice to go or not therell be an runaway route
 * 
 */
i.set("You close the door behind you. Time to walk to schooi."); 
while (i.location<433 && i.location>0){
i.outsidelay();
i.set(i.d() + "You can go "+ i.dnav() + "or look at your <map>. Time: " + i.time());
i.choice();
if (i.choice.equals("menu")) {i.menu();}
else {i.dmove(i.choice);
i.t(0.5);}
if (i.count>=7 && i.count<=7+2/60) {
i.add("You hear a distant yet familiar bell. Something feels wrong in your stomach. You think you're supposed to be somewhere at this time....");
}
}
i.add("OOPSIES! You've reached the end of the current available content. You're on the main branch with more than 10 potential endings.");
if (i.weapon==true && i.study==3 && i.poo==3 && i.cook==70) {
i.add("OOPSIES! You've reached the end of the current available content. You're on the second sub branch with only a few potential endings, though with much story!");
}
i.add("gosh danggit you fell off the edge of the map! Whelp oopsies."); 
}
}
default: i.add("That's not <something>.");
}}
}}
