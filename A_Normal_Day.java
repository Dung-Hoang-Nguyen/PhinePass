package storyPackage;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class A_Normal_Day {
//MAP VISUALS
public static final String map ="+     +---+--L--+---+-----+-t-+-----+---+     +\n|  S  |   |     |   | Hos |   |City S   |Super|\n|  C  |   |     M   | pit |   |Hall |   |mar  |\n|  H  |   B     |   | al  |   |     |   |  ket|\n+-----+   +----R+---+-----+---+--T--+---+--+--+\n|  O  |   |     |   |         |            |   \n|  O  |   D     |   P   Park  |            |   \n|  L  |   |     |   |         |            |   \n+     +---+     +---+        Home          +   \n";
public static final String home = "\n     ____   ____   ____   ____   ____\n    /your\\ /    \\ /    \\ /    \\ /    \\\n    |home|o|    | |    | |    | |    |\n   +------n---------------------------+ ->\n   -    -    -    -    -    -    -    -\n=====----======----======----=====----====\n     \\  /      \\  /      \\  /     \\  /\n";
public static final String dew3="\n     ____   ____   ____\n    /    \\ /    \\ /    \\\n    |    | | o  | |    |\n<- +---------n----------+ ->\n   -    -    -    -    -\n ======----======----======\n/      \\  /      \\  /      \\\n";
public static final String dew5="\n     ____   ____   ____   ____   ____\n    /    \\ /    \\ /    \\ /    \\ /    \\\n    |    | |    | | o  | |    | |    |\n<- +----------------n-----------------+ ->\n   -    -    -    -    -    -    -    -\n=====----======----======----=====----====\n     \\  /      \\  /      \\  /     \\  /\n";
public static final String dnesw = "\n               ^\n               |\n           | | ! | |\n           | |   | |\n           | |   | |\n           | | ! | |\n           | |   | |\n   --------+ |lll| +--------\n   ----------+lol+----------\n<- -    -   == n ==   -    - ->\n   ----------+lll+----------\n   --------+ |lll| +--------\n           | |   | |\n           | | ! | |\n           | |   | |\n           | |   | |\n           | | ! | |\n               |\n              \\_/\n";
public static final String dns = "\n              ^\n              |\n  _______ | |   | | _______\n /      |\\| | ! | |/|      \\\n/_______||| |   | |||_______\\\n| ______||| |   | |||______ |\n|/      |\\| | ! | |/|      \\\n/_______||| |   | |||_______\\\n| ______||| |   | |||______ |\n|/      |\\| | o | |/|      \\\n/_______||| | n | |||_______\\\n| ______||| |   | |||______ |\n|/      |\\| | ! | |/|      \\\n/_______||| |   | |||_______\\\n| ______||| |   | |||______ |\n|/      |\\| | ! | |/|      \\\n/_______||| |   | |||_______\\\n|       ||| |   | |||       |\n|_______|/| | ! | |\\|_______|\n              |\n             \\_/\n";
public static final String desw = "\n   -------------------------\n   ------------o------------\n<- -    -   == n ==    -    - ->\n   ----------+lll+----------\n   --------+ |lll| +--------\n           | |   | |\n           | | ! | |\n           | |   | |\n           | |   | |\n           | | ! | |\n\n               |\n              \\_/\n";
public static final String dnew = "\n               ^\n               |\n           | | ! | |\n           | |   | |\n           | |   | |\n           | | ! | |\n           | |   | |\n   --------+ |   | +--------\n   ----------+lol+----------\n<- -    -    = n =    -    - ->\n   ----------+lll+----------\n";
public static final String dnsw = "\n               ^\n               |\n           | | ! | |\n           | |   | |\n           | |   | |\n           | | ! | |\n           | |   | |\n   --------+ |   | |\n   ----------+lol| |\n<- -    -    = n | |\n   ----------+lll| |\n   --------+ |   | |\n           | |   | |\n           | | ! | |\n           | |   | |\n           | |   | |\n           | | ! | |\n               |\n              \\_/\n";
public static final String dnes = "\n    ^\n    |\n| | ! | |\n| |   | |\n| |   | |\n| | ! | |\n| |   | |\n| |   | +--------\n| |lol+----------\n| | n =    -    - ->\n| |lll+----------\n| |   | +--------\n| |   | |\n| | ! | |\n| |   | |\n| |   | |\n| | ! | |\n    |\n   \\_/\n";
public static final String des = "\n+----------------\n| +-o------------\n| | n =    -    - ->\n| |lll+----------\n| |   | +--------\n| |   | |\n| | ! | |\n| |   | |\n| |   | |\n| | ! | |\n    |\n   \\_/\n";
public static final String dsw = "\n  +--------------+\n  +----------o-+ |\n<- -   -   = n | |\n  +--------+lll| |\n  +------+ |   | |\n         | | ! | |\n         | |   | |\n         | | ! | |\n             |\n            \\_/\n";
public static final String dne = "\n    ^\n    |\n| | ! | |\n| |   | |\n| |   | |\n| | ! | |\n| |   | |\n| |   | +--------\n| |lol+----------\n| | n =    -    - ->\n| +--------------\n+----------------";
public static final String dnw = "\n               ^\n               |\n           | | ! | |\n           | |   | |\n           | |   | |\n           | | ! | |\n           | |   | |\n   --------+ |   | |\n   ----------+lol| |\n<- -    -    = n | |\n   --------------+ |\n   ----------------+\n";
public static final String menu ="                                               _______ \n                                     |\\    /| |        |\\     | |      |\n                                     | \\  / | |        | \\    | |      |\n                                     |  \\/  | |_______ |  \\   | |      |\n                                     |      | |        |   \\  | |      |\n                                     |      | |        |    \\ | |      |\n                                     |      | |_______ |     \\|  \\____/\n                                                  <New Game>\n                                                <Load>  <Quit>";
public static final String dlibrary = "\n            __________________\n           /                  \\\n          /____________________\\\n           | YOUR town library|\n           |-======----======-|\n     ____  | [    ]    [    ] |  ____\n    /    \\ | [____] __ [____] | /    \\\n    |    | |        o|        | |    |\n<- +----------------n-----------------+ ->\n   -    -    -    -    -    -    -    -\n=====----======----======----=====----====\n     \\  /      \\  /      \\  /     \\  /\n";
public static final String dtheater = "\n               ___/----\\___\n           ___/            \\___\n           |------------------|\n           |   NOW  SHOWING   |\n           |                  |\n     ____  |--====------------|  ____\n    /    \\ | [____] __        | /    \\\n    |    | |       |o |       | |    |\n<- +----------------n-----------------+ ->\n   -    -    -    -    -    -    -    -\n=====----======----======----=====----====\n     \\  /      \\  /      \\  /     \\  /\n";
public static final String smap1 ="\n| | |    +---+                             | | |\n|   |    +Art+                             |   |\n| | | ____________________                 | | |\n|   ||                    |        ______  |   |\n| | ||   Science Block    | /\\    |      | | | |\n|   ||________     _______|/ S\\   |______| |   |\n| | |         |   |        \\  o\\           | | |\n|   |         |   |         \\  c\\          |   |\n| | |      ___|   |          \\  /          | | |\n|   |     | Office|        ___\\/____       |   |\n| | |     |_______|       |         |      | | |\n|   |           ||        |   Gym   |      |   |\n| | |          _||        |____     \\      | | |\n|   |         |   |            \\     \\     |   |\n| | |  _______|   |_____        \\     \\    | | |\n|   | |                 |     ___|     |   |   |\n| | | |  Theater Block  |    |  Block  |   | | |\n|   | |_________________|    |_________|   |   |";
public static final String smap2 ="\n||||+--------------------------------------+|||+\n|   =  -  -  -  -  -  -  -  -  -  -  -  -  =\n+------------------------------------------+|||+\n| | | | | | | | | | | | | | | | | | | | | ||   |\n|                                          | | |\n|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_||   |\n| | | | | | | | | | | | | | | | | | | | | || | |\n|                                          |   |\n|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|| | |\n| | | | | | | | | | | | | | | | | | | | | ||   |\n|     _________________________________    | | |\n|    / __________|/////////|__________ \\   |   |\n|   / /|  |  |  |  |  |  |  |  |  |  |\\ \\  | | |\n|  /_/ |  |  |  |  |  |  |  |  |  |  | \\ \\ |   |\n| | |  |  |  |  |  |  |  |  |  |  |  |  | || | |\n| | |  |  |  |  |  |  |  |  |  |  |  |  | ||   |\n| | |  |  |  |  |  |  |  |  |  |  |  |  | || | |\n| |_|  |  |  |  |  |  |  |  |  |  |  |  | ||   |\n|  \\ \\ |  |  |  |  |  |  |  |  |  |  | / / | | |\n|   \\ \\|__|__|__|__|__|__|__|__|__|__|/ /  |   |\n|    \\___________|/////////|___________/   | | |\n";
public static final String drestaurant ="\n                  |  |_|  |_|  |_|___|\n                  |             |Rest|\n     ____   ____  |  vvvvvvvvvvvv   _|\n    /    \\ /    \\ |  |__________|  /_|\n    |    | |    | | o              |]]\n<- +----------------n-----------------+ ->\n   -    -    -    -    -    -    -    -\n=====----======----======----=====----====\n     \\  /      \\  /      \\  /     \\  /\n";
public static final String dmuseum = "\n              ^\n              |\n  _______ | |   | | _______\n /      |\\| | ! | |/|      \\\n/_______||| |   | |||_______\\\n| ______||| |   | |||_____  |\n|/      |\\| | ! | |/|     \\ |\n/_______||| |   | |||      \\|\n| ______||| |   | |||_______\\\n|/      |\\| | o | |/|GREAT  |\n/_______||| | n | |-|___ART!|\n| ______||| |   | |\\|MUSEUM!|\n|/      |\\| | ! | |/|-------|\n/_______||| |   | |||_______|\n|       ||| |   | |||______ |\n|IIIIII_||| | ! | |/|      \\\n| ==== |||| |   | |||_______\\\n||____|/||| |   | |||       |\n|_____|_|/| | ! | |\\|_______|\n              |\n             \\_/\n";
   
   
//ARRAYS
static int[] north = new int[]{ 391,401,239,395,405,209,213,223,233,229,219,193,203,199,97,103,107,113,117,123,127,133,137,143,289,295,299,305,309,319,332,415 };
static int[] south = new int[]{7,41,209,213,223,11,17,21,27,31,37,236,193,203,199, 97,103,107,113,117,123,127,133,137,143,289,295,299,305,309,319,332 };
static int[] west = new int[]{239,395,405,41,209,213,223,11,17,21,27,31,37,236,233,229,219,199,393,403,9,14,19,24,29,34,39,196,206,211,216,223,226,231};
static int[] west1 = new int[]{395,405,41,213,223,233,11,21,31,9,19,29,39,211,221,231,393,403};
static int[] west2 = new int[]{239,209,229,219,17,27,37,236,199,24,34,196,216,14,206,226};
static int[] east = new int[]{7,391,401,209,213,223,11,17,21,27,31,37,236,233,229,219,193,203,393,403,9,14,19,24,29,34,39,196,206,211,216,223,226,231 };
static int[] east1 = new int[]{7,391,401,209,229,219,17,27,37,9,19,29,39,211,221,231,393,403};
static int[] east2 = new int[]{213,223,233,11,21,31,236,193,203,24,34,196,216,14,206,226};
static int[] entrances = new int[]{14,29,107,113,117,123,216,127,133,137,143,206,226,236,229,309,97,103,289,295,196,415};
int location, prelo;
double count;
int money, redo, study, poo, farm;
double cook;
boolean weapon, ready, plush, teeth;
JFrame window = new JFrame("Story");
    JTextArea Text =new JTextArea();
    JTextField Input = new JTextField();
    JTextField log = new JTextField();
    String choice;
    private static String c;
    JTextArea minimap = new JTextArea();
Font mono = new Font(Font.MONOSPACED,Font.PLAIN,15);
Font sans = new Font("ComicSans",Font.PLAIN,20);

    
    
public void Setup(){//CONSTRUCTOR
location = 448;
weapon=false;
ready=false;
plush=false;
teeth=false;
money = 0;
redo = 0;
poo =0;
farm=0;
study = 0;
count = 6;
cook=0;
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        window.setSize(screenSize.width / 2,screenSize.height*2/3);
        window.setBounds(925,0,1000,1000);
        window.setLayout(null);
        window.setLocationRelativeTo(null);
        window.getContentPane().setBackground(Color.BLACK);
        
        Text.setBounds(10,200,965,750);
        Text.setEditable(false);
        window.add(Text);
        
        minimap.setBounds(10,10,400,350);
        minimap.setEditable(false);
        window.add(minimap);
        minimap.setFont(mono);
        minimap.setText(map);
        minimap.setVisible(false);
        
        Input.setBounds(400,75,200,30);
        Input.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c = Input.getText() ;
             log.setText(c);
             Input.setText("");
            }
        });
        window.add(Input);
        Text.setFont(mono);
        Input.setFont(sans);
        window.setVisible(true);
        boolean menupls = true;
        set(menu);
        while (menupls) {
        choice();
        System.out.println(choice);
        switch (choice) {
        	case "new game":add("Remember, type menu anytime to open menu!");menupls=false;break;
        	case "load":
        		add("Load:");
        		choice();
        		Load(choice);
        		if (farm==1) {menupls=false;} break;
        	case "quit":set("");menupls=false;window.setVisible(false);break;
        	default: add("Unfortunately, not a secret menu option");
        }}
        add("You open your eyes and wake up.");
        do {
        switch (location){
        case 448:
        defaultlay();
        while (location==448){ 
        add("");
        if (weapon==true && poo==3 && cook==70) {set("Your house has <your room>. You can also <wait> around...");}
        else if (weapon==true && poo==3) {set("Your house has <your room> and a <kitchen>. You can also <wait> around...");}
        else if (weapon==true && cook==70) {set("Your house has <your room> and  a <bathroom>. You can also <wait> around...");}
        else if (poo==3 && cook==70) {set("Your house has <your room> and a <bathroom>. You can also <wait> around...");}
        else if (poo==3) {set("Your house has <your room>, a <kitchen> and an <attic>. You can also <wait> around...");}
        else if (cook==70) {set("Your house has <your room>, a <bathroom> and an <attic>. You can also <wait> around...");}
        else if (weapon==true) {set("Your house has <your room>, a <bathroom> and a <kitchen>. You can also <wait> around...");}
        else {set("Your house has <your room>, a <bathroom>, <kitchen>, and <attic>. You can also <wait> around.");} 
        add("You have school in "+ Math.round((7-count)*60) +" minutes, where do you want to go?");
        if (count>=6.75) {add("You should <leave>, going to school usually takes you 10 minutes");}
        if (cook<count-1/60 && cook!=100 && cook!=0) {
        add("You smell smoke."); cook=70;}
        choice();
        if (count>=7 && count<=8) {
        choice="leave";}
        switch (choice) {
        case "clock": System.out.print(time()+" " +count); break;
        //wait
        case "wait":
        	add("How long do you want to wait?");
        	choice();
        	double time = Integer.valueOf(choice);
        	count+=time/60; choice="";
        	add("You waited "+ time +  " minutes.");
        	time = 0; break;
        	//your room
        case "your room":
        	do {if (cook!=0 && cook<count && cook!=100) {cook=70;}
        	add("Your room has a <bed>, <desk> and <closet>.");
        	choice();
        	switch (choice) {
        	//desk
        		case "desk":
        			while (!choice.equals("return") && count<7) {
        			if (study==1) {add("Well, you've studied... what is this desk here for then... \n"); 
        			add("WAIT! YOU CAN STUDY EVEN MORE! LIFE IS AN ENDLESS CYCLE OF LEARNING! WE WILL GO ABOVE AND BEYOND!\n(<study> for 15 minutes? It is " + time() + ", you can still <return>.)");}
        			else if (study==2) {add("<study>! There is no <return>!");}
        			else {add("You do remember you have a test today. You can <study> but you could just <return>. What do you want to do? \nTime: " + time());}
        			choice();
        			if (choice.equals("study")) { 
        			if (study==0) {
        			add("You review for your test, you feel like you could get full marks for it. \n" ); 
        			study++; count+=0.25;}
        			else if (study==1) {
        			add("study... study.. we need to do more...!"); study++;count+=0.25;}
        			else if (study==2) {
        			add("ehe...ha..ahahhaHAHAHHAA! \n\n\n"); 
        			study++; count=7; location=449; redo=0;}}
        			else if (choice.equals("return") || study==3) {}
        		else {add("You don't want to.");}
        		}break;
        		//closet
        		case "closet": 
        			while (!choice.equals("return") && count<7) {
        			  	add("You take a look in your closet and get ready. You can get EXTRA <ready> or <search> but you could just \n<return>. What do you want to do? Time: " + time());
        			choice();
        			if (choice.equals("ready")) {
        			add("You get EXTRA ready, you feel like you could take on the world."); 
        			ready=true; t(5);}
        			else if (choice.equals("search")) { 
        			if (redo==0) {
        			add("You find your old plushy you thought you lost! And $10."); 
        			ready=true; money+=10;redo++;
        			if (farm>0) {add("//WoW! An infinite money (and plushy?) glitch! Though it is inefficient...//");}}
        			else {add("You find nothing, not even Narnia.");}}
        			else if (choice.equals("return")) {redo=0; if (redo>0) {farm++;}}
        			else {add("You don't want to.");}
        		}break;
        		//bed
        		case "bed":
        			add("You go back to bed."); 
        			add("Game over."); 
        			if (redo>0) {location = 0;} else {
        			choice();
        			add("..."); 
        			choice();
        			add("..."); 
        			add("\n\n\n ok, i understand that you may have some progress you dont want to lose so ill let you continue to before \nyou made this decision i may not be as merciful next time. \n Take this gift though! [1: I]");
        			add("\n Continue?");
        			while (!choice.equals("no") && !choice.equals("yes")) {add("<yes>/<no>"); choice();
        			if (choice.equals("no")) {
        			location = 0;}
        			if (choice.equals("yes")) {
        			redo++;}}}break;
        		//
        		case "return": farm=0;break;
        		default: add("You don't want to.");
        	}} while (!choice.equals("return") && location!=0 && count<7);break;
        //kitchen
        case "kitchen":

        while (!choice.equals("return") && count<7) {
        if (cook==tm(5)) {add("Return in 5 minutes to get your food! You can <look around> or you could just <return>. What do you want to do? Time: " + time());}
        else if (cook>tm(-1) && cook<tm(1)) {add("Your food is ready! Get your <cook>ing now or you may burn your kitchen. You can also <look around> or you could just <return>. What do you want to do? Time: " + time());}
        else if (cook!=0 && cook<tm(-1) && cook!=100) {cook=70;}
        else if (cook==100) {add("There's no one else in the kitchen. You can <look around>, or you could just <return>. What do you want to do? Time: " + time()); }
        else {add("There's no one else in the kitchen. You can <look around>, <cook> or you could just <return>. What do you want to do? Time: " + time()); }
        if (cook==70) {add("You don't want to go in there."); choice = "return";}
        else{choice();}
        switch (choice) {
        case "look around":
        	if (redo==0) {
        	add("You look around the kitchen and find $20."); 
        	money+=20; t(5);redo++;}
        	else {add("You dont find anything of importance.");}
        	if (farm>0) {add("//WoW! An infinite money glitch!//");}break;
        case "cook":
        	if (cook==0) {
        	add("You start cooking. Come back after 5 minutes to grab your food.");  t(5); cook=tm(5);}
        	else if (cook>tm(-1)&&cook<tm(1)) {
        	add("You receive your greatly cooked food."); cook=100; t(5);}
        	else if (cook==100) {
        	add("You have already cooked.");}break;
        case "return":redo=0; if (redo>0) {farm++;}break;
        default:add("You don't want to.");}
        }break;
        //attic
        case "attic": 
        while (!choice.equals("return") && count<7) {
        if (weapon) {add("..." +"\n"+"<return>"); } 
        else if (redo>=3) {add("You're in the attic, you think you're looking for a <weapon>. You can <search> but you could just <return>. \nWhat do you want to do? Time: " + time()); }
        else if (redo==0){add("You're in the attic, you don't quite know why you're here but you feel like something's drawing you here... \nYou can <search> but you could just <return>. What do you want to do? Time: " + time()); }
        choice();
        if (weapon) {break;}
        switch (choice) {
        case "weapon":
        	add("You grab your weapon."); 
        	weapon=true;break;
        case "search":
        	if (redo == 0) {
        	add("You look around. The dust around is thick, you think you're looking for something that you consider useful."); 
        	redo++; t(5);}
        	else if (redo == 1) {
        	add("You look around. The dust around is thinning, you think you're looking for something that you consider \ninappropriate for a school environment.");
        	redo++; t(5);}
        	else {
        	add("You look around. The dust around is thin, you think you're looking for something that you consider deadly."); 
        	redo++; t(5);}break;
        case "return":redo=0;break;
        default: add("You don't think that's what you want.");}
        }break;
        //bathroom
        case "bathroom":
        if (poo==3) {add("You don't think that's a good idea.");}
        while (!choice.equals("return") && count<7){
        if (poo==3) {add("You slam your bathroom door shut."); choice="return";}
        else if (teeth==true) {add("Ah, the glorious bathroom, the place in which you are most vulnerable. You can go to the <toilet>, the \n<bathtub> or <return>. Time: " + time());}
        else {add("Ah, the glorious bathroom, the place in which you are most vulnerable. You can brush your <teeth>, go to \nthe <toilet>, the <bathtub> or <return>. Time: " + time());}
        choice(); if (poo==3) {break;}
        switch (choice) {
        case "teeth": if(!teeth) {
        	add("Your teeth are SHINING. You're feeling good."); 
        	teeth=true; t(5);}
        	else { add("Mint is all you can taste...");}
        break;
        case "toilet":
        	switch (poo) {
        	case 0:
        	add("You take a big one. It feels like the water is rising."); 
        	poo++; t(5);break;
        	case 1:
        	add("Dang... That's a lot. You didn't know you had it in you. You should probably stop or the toilet might explode."); 
        	poo++; t(5);break;
        	case 2:
        	add("You have done it. You feel stronger than ever. Though you don't think you can ever go into the bathroom ever \nagain."); 
        	poo++; t(5);}break;
        case "bathtub":
        	add("You prepare the bathtub.");
        	add("Step in?"); t(5);
        	while (!choice.equals("no") && !choice.equals("yes")) {add("<yes>/<no>"); 
        	choice();
        	if (choice.equals("no")) {
        	add("You drain the bathtub.");}
        	if (choice.equals("yes")) {
        	location = 450;count=7;}}break;
        case "return": break;
        default: add("You don't feel like doing that at the moment.");}
        } break;
        case "leave": location=415;break;
        case "return": break;
        default: add("You don't feel like doing that at the moment.");
        }} break;
        //leave house

        case 0:window.setVisible(false);break;

        case 435://Library
        break;
        case 436://trash
        break;
        case 437://Bakery
        break;
        case 438://Museum
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
        break;
        case 446://PostOffice
        break;
        case 447://Park
        break;
        case 449://School
        schoolLay();
        while (location==449){
        switch((int)count){
        case 6:
        set("You're at school on time. Due to some primeval priming, you \nare herded into your first period classroom.");

        break;
        case 7:
        set("The bell has spoken. Classes are to commence.");

        break;
        case 16:
        set("Students are starting to go home. You should probably leave. It's rumoured addicts and homeless gather here at night.");

        break;
        }}
        break;
        case 450:
        set("OOPSIES! You've reached the end of the current available content. You're on the first sub branch with only a few potential endings, though with much story!");
        break;
        default: 
        /*plan zone: therell be 8 periods fifth is lunch  classes made as we go to fit narratively will be given choice to go or not therell be an runaway route
        * 
        */
        set("You close the door behind you. Time to walk to schoo"); 
        while (location<433 && location>0){
        outsidelay();
        set(d() + "You can go "+ dnav() + "or look at your <map>. Time: " + time());
        choice();
        if (choice.equals("menu")) {}
        else {dmove(choice);
        t(0.5);}
        if (count>=7 && count<=7+2/60) {
        add("You hear a distant yet familiar bell. Something feels wrong in your stomach. You think you're supposed to be somewhere at this time....");
        }
        }
        add("OOPSIES! You've reached the end of the current available content. You're on the main branch with more than 10 potential endings.");
        if (weapon==true && study==3 && poo==3 && cook==70) {
        add("OOPSIES! You've reached the end of the current available content. You're on the second sub branch with only a few potential endings, though with much story!");
        }
        add("gosh danggit you fell off the edge of the map! Whelp oopsies."); 
        }
        }while (location!=0);
        }

 
public void t(double time) {//CHANGETIMEBYMINUTE
     count += time/60;
}
public double tm(double time) {//TIMEPLUSMINUT
     return count+time/60;
}
public void defaultlay(){
   minimap.setVisible(false);
   Input.setBounds(400,75,200,30);
}
public void outsidelay(){
   minimap.setBounds(10,10,400,350);
   minimap.setBounds(10,10,450,350);
   minimap.setText(map());
   minimap.setVisible(true);
   Input.setBounds(600,75,200,30);

}
public void schoolLay(){
	 minimap.setBounds(10,10,430,940);
	 minimap.setText("\n"+smap1+smap2);
	 minimap.setVisible(true);
	 Input.setBounds(600,75,200,30);
	 Text.setBounds(440,200,540,750);
	}


    public void set(String a) {
        Text.setText(a);
    }
    public void add(String a) {
        Text.append("\n"+a);
    }
    public void choice() {
        boolean boo=true;
        while (boo) {
            choice = log.getText().toLowerCase();
            if (!choice.equals("") ) {
                choice = c.toLowerCase();
                log.setText("");
                boo = false;
            }
            
        }
        if (choice.equals("menu")) {menu();}
        if (choice.equals("location")) {
        	System.out.print(location);
        }
    }
    private static final String SYMBOLS = "0123456789abcdefghijklmnopqrstuvwxyz";
    public static int rebase(String number, int base)
    {
        int result = 0;
        int position = number.length();        
        for (char ch : number.toCharArray())
        {
            int value = SYMBOLS.indexOf(ch);
            result += value * Math.pow(base,--position);
        }
        return result;
    }

public String Save(){ //SAVE
String boo, mon, loc, tim1,tim2;
int bool=0;
if (weapon){bool++;}
if (ready){bool+=10;}
if (plush){bool+=100;}
if (teeth){bool+=1000;}
if (study==3){bool+=10000;}
if (poo==3){bool+=100000;}
if (cook==70){bool+=1000000;}
if (cook==100){bool+=10000000;}
boo =Integer.toString(Integer.parseInt(String.valueOf(bool),2), 16);
mon =Integer.toString(money, 16);
loc =Integer.toString(location, 32);
String tm = String.valueOf(Math.round(count*100));
tim1 =Integer.toString(Integer.valueOf(tm.substring(0,1)), 25);
tim2 =Integer.toString(Integer.valueOf(tm.substring(1,3)), 8);
if (boo.length()==1){boo="0"+boo;}
if (mon.length()==1){mon="0"+mon;}
if (loc.length()==1){loc="0"+loc;}
if (tim2.length()==1){tim2="0"+tim2;}
return boo+mon+loc+tim1+tim2 + "\nType this into <load> and if my shit works, it should load.";
}
public void Load(String n){ //LOAD
if (n.length() == 9){
int boo=rebase(n.substring(0,2),16);
boo = Integer.valueOf(Integer.toString(boo,2));
int mon=rebase(n.substring(2,4),16);
int loc=rebase(n.substring(4,6),32);
int tim1=rebase(n.substring(6,7),16);
int tim2= rebase(n.substring(7,9),8);
if (boo!=256 && loc!=1024 && mon!=256 && tim1!=2500) {
if (boo%10 == 1){weapon=true;}
boo/=10;
if (boo%10 == 1){ready=true;}
boo/=10;
if (boo%10 == 1){plush=true;}
boo/=10;
if (boo%10 == 1){teeth=true;}
boo/=10;
if (boo%10 == 1){study=3;}
boo/=10;
if (boo%10 == 1){poo=3;}
boo/=10;
if (boo%10 == 1){cook=70;}
boo/=10;
if (boo%10 == 1){cook=100;}
boo/=10;
money = mon;
location = loc;
count = tim1+(double)tim2/100;
}
else {add("if im not an idiot, there should have been a error with your save code.");}
}
else {add("if im not an idiot, there should have been a error with your save code.");}
}
public String time(){ //CLOCK
int hour = Integer.valueOf(String.valueOf(count).substring(0,String.valueOf(count).indexOf(".")));
double min = (count-hour)*60;
int minute = Integer.valueOf(String.valueOf(min).substring(0,String.valueOf(min).indexOf(".")));
double sec = ((count-hour)*60-minute)*60;
int second = Integer.valueOf(String.valueOf(sec).substring(0,String.valueOf(sec).indexOf(".")));
String time = hour+":";
if (minute<10) {
time += "0"+minute+":";}
else {time+=minute+":";}
if (second<10) {
time += "0"+second;}
else {time+=second;}
return time;
}
public String d(){ //VISUALS
switch (location){
case 7: return des;
case 239: return dnw;
case 41: return dsw;
case 209: return dnesw;
case 233: return dnew;
case 236: return desw;
case 199: return dnsw;
case 29: return dew3;
case 415: return home;
case 113: return dmuseum;
case 14: return dlibrary;
case 206: return drestaurant;
case 226: return dtheater;

default:
if (location==391||location==401){
return dne;}
else if (location==395||location==405){
return dnw;}
else if (location==213||location==223){
return dnesw;}
else if (location==229||location==219){
return dnew;}
else if (location==11||location==21||location==31){
return desw;}
else if (location==17||location==27||location==37){
return desw;}
else if (location==193||location==203){
return dnes;}
else if (location==97||location==103||location==117||location==123||location==143||location==289||location==295||location==305||location==319||location==332){
return dns;}
else if (location==107||location==127||location==133||location==137||location==299||location==309){
return dns;}
else if (location==9||location==19||location==39||location==211||location==221||location==231||location==393||location==403){
return dew3;}
else if (location==24||location==34||location==196||location==216){
return dew5;}
}
return "";
}
public String map(){ //MAP
return map.substring(0,location-1)+"o"+map.substring(location);
}
public String dnav(){ //NAVSTRING
String output ="";
boolean b1 = false;boolean b4 = false;boolean b2 = false;boolean b3 = false; boolean b5 = false;
for(int x : north){if(x==location){b1=true;}}
if (b1) {output+="<North> ";}
for(int x : east){if(x==location){b2=true;}}
if (b2) {output+="<East> ";}
for(int x : south){if(x==location){b3=true;}}
if (b3) {output+="<South> ";}
for(int x : west){if(x==location){b4=true;}}
if (b4) {output+="<West> ";}
for(int x : entrances){if(x==location){b5=true;}}
if (b5) {output+="or into the <locale> ";}
return output;
}
public void dmove(String c){//MOVEINMAP
     boolean boo=false;
     boolean boo2=false;
     switch (c){
      case "w": c= "north"; break;
      case "s": c= "south"; break;
      case "d": c= "east"; break;
      case "a": c= "west"; break;
     }
switch (c) {
case "north":
for(int x : north){if(x==location){boo=true;}}
     if (boo) {location-=96;}
     else {set("You thought about it long and hard but decided not to stray from the beaten path.");}
break;
case "east":
for(int x : east1){if(x==location){boo=true;}}
for(int x : east2){if(x==location){boo2=true;}}
if (boo) {location+=2;}
else if (boo2) {location+=3;}
else {set("You thought about it long and hard but decided not to stray from the beaten path.");}
break;
case "south":
for(int x : south){if(x==location){boo=true;}}
if (boo) {location+=96;}
else {set("You thought about it long and hard but decided not to stray from the beaten path.");}
break;
case "west":
for(int x : west1){if(x==location){boo=true;}}
for(int x : west2){if(x==location){boo2=true;}}
if (boo) {location-=2;}
else if (boo2) {location-=3;}
else {set("You thought about it long and hard but decided not to stray from the beaten path.");}
break;
case "locale":
switch (location){
case 14: location=435; break;
case 29: location=436; break;
case 107: location=437; break;
case 113: location=438; break;
case 117: location=439; break; //Hospital
case 123: location=439; break;
case 216: location=439; break;//
case 127: location=440; break;
case 133: location=441; break;
case 137: location=442; break;//Supermarket
case 143: location=442; break;
case 236: location=442; break;//
case 206: location=443; break;
case 226: location=444; break;
case 229: location=445; break;
case 309: location=446; break;
case 119: location=447; break;
case 221: location=447; break;
case 415: location=448; break;
case 97: location=449; break;//School
case 103: location=449; break;
case 289: location=449; break;
case 295: location=449; break;
case 196: location=449; break;//
default: set("You tried to go in but... couldn't.");
}
break;
case "map": add(map()); break;
default: add("You thought about it but decided not to.");
}
}
public void menu(){//menu
     boolean menu = true;
     add(" MENU\n<Load> <Save> <Quit>\n <Close>");
     while (menu) {
         choice();
         switch (choice) {
                 case "load": add("Type save code.\n(pls dont cheat)"); choice(); Load(choice); menu=false; break;
                 case "save": add(Save()); break;
                 case "close": menu=false;break;
                 case "quit": location = 0; menu=false;break;
         }
     }
}
public static void main (String [] args) {
	A_Normal_Day a=new A_Normal_Day();
	a.Setup();
}


}