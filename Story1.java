package storyPackage;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Story1
{
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

    
    
public Story1(){//CONSTRUCTOR
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
        window.setResizable(false);
        window.setBounds(925,0,1000,1000);
        window.setLayout(null);
        window.setLocationRelativeTo(null);
        window.getContentPane().setBackground(Color.BLACK);
        
        Text.setLineWrap(true);
        Text.setWrapStyleWord(true);
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
                 case "sequence break": add("You want to break me so bad? Fine, enter location:");choice(); location=Integer.valueOf(choice);menu=false;break;
                 case "close": menu=false;break;
                 case "quit": location = 0; menu=false;break;
         }
     }
}
//public static 
}
