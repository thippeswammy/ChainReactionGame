import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class MyWorld extends World
{
    boolean isTwoPlayerStarted=false;
    private int delta=70,chance=1;
    private int numberofball[][]=new int[10][6];
    private int whichplyer[][]=new int[10][6];
    private int NumberOfTimes[][]=new int[10][6];
    private int cellsize = 70;
    private int ver[]={23,90,155,225,295,getHeight(),415,485,555,625,687};
    private int hor[]={22,83,152,getWidth(),277,345,407};
    private int cha[]={4,3  ,3  ,3  ,3  ,4  ,3  ,3  ,3   ,3  ,3  ,3  ,3  ,4  ,3  ,3  ,3, 3,3  ,3  ,3  ,3  ,3  ,4  ,3  ,3  ,3};
    private int X[]=  {15 ,81 ,150,283,351,416,15 ,15 ,15  ,15 ,15 ,15 ,13 ,15 ,415,415,415,415,417,417,417,417,417,80 ,150,280,350};
    private int Y[]=  {13 ,15 ,15 ,14 ,14 ,14 ,82 ,151,220 ,290,417,488,629,693,83 ,150,220  ,290,419,488,558,628,695,696,696,696,696};
    private int rot[]={225,225,225,290,294,313,215,210,210 ,210,160,157,153,135,140,150,150  ,155,207,206,206,206,45 ,295,295,65 ,68};
    Player1 Player1 = new Player1();
    Player1 Player2 = new Player1();
    Player1 Player3 = new Player1();
    Player1 Player4 = new Player1();
    private int NUMBER5=5;
    public MyWorld()
    {    
        super(6*70+10,10*70+10, 1); 
        prearat();
        for(int i=0;i<getHeight()/cellsize;i++)
            for(int n=0;n<getWidth()/cellsize;n++){

                numberofball[i][n]=0;

                whichplyer[i][n]=0;

                NumberOfTimes[i][n]=0;
            }
        times=0;
    }
    static int tr1=5,tr2=2,numm=1;
    public void act()
    {
        placetoadd();
        if(NUMBER5==5)
            showing();
        else
            chicking();
        if(numm==15&&NUMBER5!=5)
        {
            NUMBER5=5;   
        }
        if(NUMBER5!=5)
            numm++;
    }

    public void addnn1(int x,int y)
    {
        OneBlueBall OneBlueBall = new OneBlueBall();
        addObject(OneBlueBall,x,y);   
    }

    public void addnn(int x,int y)
    {   ////System.out.println("");
        Player1 Player1 = new Player1();
        addObject(Player1,x,y-10);
        Player1 Player2 = new Player1();
        addObject(Player2,x-10,y);
        Player1 Player3 = new Player1();
        addObject(Player3,x+10,y);
        Player1 Player4 = new Player1();
        addObject(Player4,x,y+10);
        Player1.setRotation(270);
        Player2.setRotation(180);
        Player3.setRotation(0);
        Player4.setRotation(90);
        numm=1;
        NUMBER5=-2;
    }

    public void prearat()
    {
        for(int i=0;i<getWidth();i=i+70){
            Line1 line1 =new Line1();
            line1.Change(1);
            addObject(line1,5+i,getHeight()/2);
            line1.setRotation(90);
        }
        for(int i=0;i<getHeight();i=i+70){
            Line1 Line1 =new Line1();
            Line1.Change(2);
            addObject(Line1,getWidth()/2,5+i);
            Line1.setRotation(0);
        }
        for(int i=0;i<ver.length;i++)
        {
            Line1 Line1 = new Line1();
            Line1.Change(21);
            addObject(Line1,getWidth()/2,ver[i]);
        }
        for(int i=0;i<hor.length;i++)
        {
            Line1 Line1 = new Line1();
            Line1.Change(12);
            addObject(Line1,hor[i],getHeight()/2);
            Line1.setRotation(90);
        }
        for(int i=0;i<X.length;i++)
        {
            Line1 Line1 = new Line1();
            Line1.Change(cha[i]);
            addObject(Line1,X[i],Y[i]);
            Line1.setRotation(rot[i]);
        }
    }

    public void addBox(int a,int px,int py)
    {
        int A=a;
        if(A==1){
            for(int i=0;i<getWidth();i=i+70){
                Lines lines =new Lines();
                lines.Change(1);
                addObject(lines,5+i,getHeight()/2);
                lines.setRotation(90);
            }
            for(int i=0;i<getHeight();i=i+70){
                Lines Lines =new Lines();
                Lines.Change(2);
                addObject(Lines,getWidth()/2,5+i);
                Lines.setRotation(0);
            }
            for(int i=0;i<ver.length;i++)
            {
                Lines Lines = new Lines();
                Lines.Change(21);
                addObject(Lines,getWidth()/2,ver[i]);
                Lines.setRotation(0);
            }
            for(int i=0;i<hor.length;i++)
            {
                Lines Lines = new Lines();
                Lines.Change(12);
                addObject(Lines,hor[i],getHeight()/2);
                Lines.setRotation(90);
            }
            for(int i=0;i<X.length;i++)
            {
                Lines Lines = new Lines();
                Lines.Change(cha[i]);
                addObject(Lines,X[i],Y[i]);
                Lines.setRotation(rot[i]);
            }
        } 
        else if(A==2)
        {
            for(int i=0;i<getWidth();i=i+70){
                Line1 line1 =new Line1();
                line1.Change(1);
                addObject(line1,5+i,getHeight()/2);
                line1.setRotation(90);
            }
            for(int i=0;i<getHeight();i=i+70){
                Line1 Line1 =new Line1();
                Line1.Change(2);
                addObject(Line1,getWidth()/2,5+i);
                Line1.setRotation(0);
            }
            for(int i=0;i<ver.length;i++)
            {
                Line1 Line1 = new Line1();
                Line1.Change(21);
                addObject(Line1,getWidth()/2,ver[i]);
            }
            for(int i=0;i<hor.length;i++)
            {
                Line1 Line1 = new Line1();
                Line1.Change(12);
                addObject(Line1,hor[i],getHeight()/2);
                Line1.setRotation(90);
            }
            for(int i=0;i<X.length;i++)
            {
                Line1 Line1 = new Line1();
                Line1.Change(cha[i]);
                addObject(Line1,X[i],Y[i]);
                Line1.setRotation(rot[i]);
            }
        }
    }
    static int times=0;
    public void placetoadd()
    {
        if(Greenfoot.mouseClicked(null))
        {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            int io=(int)(mouse.getY()/cellsize);
            int jo=(int)(mouse.getX()/cellsize);
            if(chance==1&&(whichplyer[io][jo]==1||whichplyer[io][jo]==0))
            {
                whichplyer[io][jo]=1; 
                addBox(chance,jo*cellsize+37,io*cellsize+37);
                chance=2;
                NumberOfTimes[io][jo]=5;
                numberofball[io][jo]=numberofball[io][jo]+1;
                showing();
            }
            else if(chance==2&&(whichplyer[io][jo]==2||whichplyer[io][jo]==0))
            {
                whichplyer[io][jo]=2; 
                addBox(chance,jo*cellsize+37,io*cellsize+37);
                chance=1;
                NumberOfTimes[io][jo]=5;
                numberofball[io][jo]=numberofball[io][jo]+1;
                showing();
                isTwoPlayerStarted=true;
            }
        }
    }

    public void single(int I,int N)
    {

        for(int i=I;i==I&&i>=0&&i<getHeight()/cellsize;i++)
            for(int  n=N;n==N&&n>=0&&n<getWidth()/cellsize;n++){
                int sizeX=43;
                int sizeY=43;
                if(i*70+5>getHeight()/2){
                    sizeY=33;
                }
                if(n*70+5>getWidth()/2){
                    sizeX=23;
                }
                if(numberofball[i][n]==1&&NumberOfTimes[i][n]==5&&NUMBER5==5)
                {
                    if(whichplyer[i][n]==1)
                    {                        
                        OneBlueBall OneBlueBall = new OneBlueBall();
                        addObject(OneBlueBall,n*cellsize+sizeX,i*cellsize+sizeY);       
                    }
                    else
                    {
                        OneRedBall OneRedBall = new OneRedBall();
                        addObject(OneRedBall,n*cellsize+sizeX,i*cellsize+sizeY);
                    }
                    NumberOfTimes[i][n]=1;
                    tr1=100;
                }
            }
    }

    public void two(int I,int N)
    {
        for(int i=I;i==I&&i>=0&&i<getHeight()/cellsize;i++)
            for(int  n=N;n==N&&n>=0&&n<getWidth()/cellsize;n++){
                int sizeX=43;
                int sizeY=43;
                if(i*70+5>getHeight()/2){
                    sizeY=33;
                }
                if(n*70+5>getWidth()/2){
                    sizeX=23;
                }
                if(numberofball[i][n]==2&&NumberOfTimes[i][n]==5&&NUMBER5==5)
                {
                    if(whichplyer[i][n]==1)
                    {                        
                        TwoBlueBall TwoBlueBall=new TwoBlueBall();
                        addObject(TwoBlueBall,n*cellsize+sizeX,i*cellsize+sizeY);
                    }
                    else
                    {
                        TwoRedBall TwoRedBall=new TwoRedBall();
                        addObject(TwoRedBall,n*cellsize+sizeX,i*cellsize+sizeY);  
                    }
                    NumberOfTimes[i][n]=1;
                    tr1=100;
                }
            }
    }

    public void three(int I,int N)
    {
        for(int i=I;i==I&&i>=0&&i<getHeight()/cellsize;i++)
            for(int  n=N;n==N&&n>=0&&n<getWidth()/cellsize;n++){
                int sizeX=43;
                int sizeY=43;
                if(i*70+5>getHeight()/2){
                    sizeY=33;
                }
                if(n*70+5>getWidth()/2){
                    sizeX=23;
                }
                if(numberofball[i][n]==3&&NumberOfTimes[i][n]==5&&NUMBER5==5)
                {
                    if(whichplyer[i][n]==1)
                    {                        
                        ThreeBlueBall ThreeBlueBall =new ThreeBlueBall();
                        addObject(ThreeBlueBall,n*cellsize+sizeX,i*cellsize+sizeY); 
                    }
                    else
                    {
                        ThreeRedBall ThreeRedBall =new ThreeRedBall();
                        addObject(ThreeRedBall,n*cellsize+sizeX,i*cellsize+sizeY);    
                    }
                    NumberOfTimes[i][n]=1;
                    tr1=100;
                }
            }
    }

    public void showing()
    {
        for(int i=0;i<getHeight()/cellsize;i++)
            for(int n=0;n<getWidth()/cellsize;n++){
                int sizeX=43;
                int sizeY=43;
                for(int ii=0;ii<getHeight()/cellsize;ii++)
                    for(int nn=0;nn<getWidth()/cellsize;nn++){
                        sizeX=43;
                        sizeY=43;
                        if(ii*70+5>getHeight()/2){
                            sizeY=33;
                        }
                        if(nn*70+5>getWidth()/2){
                            sizeX=23;
                        }
                        if(numberofball[ii][nn]==1&&NumberOfTimes[ii][nn]==5&&NUMBER5==5)
                        {
                            if(whichplyer[ii][nn]==1)
                            {                        
                                OneBlueBall OneBlueBall = new OneBlueBall();
                                addObject(OneBlueBall,nn*cellsize+sizeX,ii*cellsize+sizeY);       
                            }
                            else
                            {
                                OneRedBall OneRedBall = new OneRedBall();
                                addObject(OneRedBall,nn*cellsize+sizeX,ii*cellsize+sizeY);
                            }
                            NumberOfTimes[ii][nn]=1;
                            tr1=100;
                        }

                        if(numberofball[ii][nn]==2&&NumberOfTimes[ii][nn]==5&&NUMBER5==5)
                        {
                            if(whichplyer[ii][nn]==1)
                            {       
                                OneBlueBall OneBlueBall = new OneBlueBall();
                                TwoBlueBall TwoBlueBall=new TwoBlueBall();
                                addObject(TwoBlueBall,nn*cellsize+sizeX,ii*cellsize+sizeY);
                            }
                            else
                            {
                                OneRedBall OneRedBall = new OneRedBall();
                                TwoRedBall TwoRedBall=new TwoRedBall();
                                addObject(TwoRedBall,nn*cellsize+sizeX,ii*cellsize+sizeY); 
                            }
                            NumberOfTimes[ii][nn]=1;
                            tr1=100;
                        }

                        if(numberofball[ii][nn]==3&&NumberOfTimes[ii][nn]==5&&NUMBER5==5)
                        {
                            if(whichplyer[ii][nn]==1)
                            {                        
                                ThreeBlueBall ThreeBlueBall =new ThreeBlueBall();
                                TwoBlueBall TwoBlueBall =new TwoBlueBall();
                                addObject(ThreeBlueBall,nn*cellsize+sizeX,ii*cellsize+sizeY);
                            }
                            else
                            {
                                ThreeRedBall ThreeRedBall =new ThreeRedBall();
                                addObject(ThreeRedBall,nn*cellsize+sizeX,ii*cellsize+sizeY);    
                            }
                            NumberOfTimes[ii][nn]=1;
                            tr1=100;
                        }
                    }
                sizeX=43;
                sizeY=43;
                if(i*70+5>getHeight()/2){
                    sizeY=33;
                }
                if(n*70+5>getWidth()/2){
                    sizeX=23;
                }

                if((numberofball[i][n]==4||numberofball[i][n]==5)&&(i>=1&&n>=1&&i<((getHeight()/cellsize)-1)&&n<((getWidth()/cellsize)-1))&&NUMBER5==5)
                {
                    tr1=95;
                    if(whichplyer[i][n]==1)
                    {      
                        sound sound = new sound(); sound.PlaySound();
                        Space Space = new Space();
                        addObject(Space,n*cellsize+sizeX,i*cellsize+sizeY); 
                        numberofball[i][n]=0;
                        numberofball[i+1][n]=numberofball[i+1][n]+1;
                        numberofball[i-1][n]=numberofball[i-1][n]+1;
                        numberofball[i][n+1]=numberofball[i][n+1]+1;
                        numberofball[i][n-1]=numberofball[i][n-1]+1;
                        whichplyer[i+1][n]=1;
                        whichplyer[i-1][n]=1;
                        whichplyer[i][n+1]=1;
                        whichplyer[i][n-1]=1;
                        Player1 Player1 = new Player1();
                        addObject(Player1,n*cellsize+sizeX,i*cellsize+sizeY-10);
                        Player1 Player2 = new Player1();
                        addObject(Player2,n*cellsize+sizeX-10,i*cellsize+sizeY);
                        Player1 Player3 = new Player1();
                        addObject(Player3,n*cellsize+sizeX+10,i*cellsize+sizeY);
                        Player1 Player4 = new Player1();
                        addObject(Player4,n*cellsize+sizeX,i*cellsize+sizeY+10);
                        Player1.setRotation(270);
                        Player2.setRotation(180);
                        Player3.setRotation(0);
                        Player4.setRotation(90);
                        numm=1;
                        NUMBER5=-2;
                    }
                    else
                    {
                        sound sound = new sound(); sound.PlaySound();
                        Space Space = new Space();
                        addObject(Space,n*cellsize+sizeX,i*cellsize+sizeY); 
                        numberofball[i][n]=0;
                        numberofball[i+1][n]=numberofball[i+1][n]+1;
                        numberofball[i-1][n]=numberofball[i-1][n]+1;
                        numberofball[i][n+1]=numberofball[i][n+1]+1;
                        numberofball[i][n-1]=numberofball[i][n-1]+1;
                        whichplyer[i+1][n]=2;
                        whichplyer[i-1][n]=2;
                        whichplyer[i][n+1]=2;
                        whichplyer[i][n-1]=2;   
                    }
                    NumberOfTimes[i][n]=0;
                    NumberOfTimes[i+1][n]=5;
                    NumberOfTimes[i-1][n]=5;
                    NumberOfTimes[i][n+1]=5;
                    NumberOfTimes[i][n-1]=5;
                    whichplyer[i][n]=2;
                    for(int a=1;a<=4;a++){
                        if(a==1)
                        {
                            single(i+1,n+1);
                            two(i+1,n+1);
                            three(i+1,n+1);
                        }
                        if(a==2)
                        {
                            single(i+1,n-1);
                            two(i+1,n-1);
                            three(i+1,n-1);
                        }
                        if(a==3)
                        {
                            single(i-1,n+1);
                            two(i-1,n+1);
                            three(i-1,n+1);
                        }
                        if(a==4)
                        {
                            single(i-1,n-1);
                            two(i-1,n-1);
                            three(i-1,n-1);
                        }
                    }
                }

                if((numberofball[i][n]==3||numberofball[i][n]==4)&&(i==0||n==0||i==((getHeight()/cellsize)-1)||n==((getWidth()/cellsize)-1)))
                {
                    tr1=95;
                    if(whichplyer[i][n]==1)
                    {       
                        sound sound = new sound(); 
                        sound.PlaySound();
                        Space Space = new Space();
                        addObject(Space,n*cellsize+sizeX,i*cellsize+sizeY); 
                        numberofball[i][n]=0;
                        ////System.out.println("            "+(getHeight()/cellsize-1));
                        if(i==0&&(n>=1&&n<(getWidth()/cellsize)))
                        {
                            numberofball[i+1][n]=numberofball[i+1][n]+1;
                            numberofball[i][n+1]=numberofball[i][n+1]+1;
                            numberofball[i][n-1]=numberofball[i][n-1]+1;
                            whichplyer[i+1][n]=1;
                            whichplyer[i][n+1]=1;
                            whichplyer[i][n-1]=1;
                            NumberOfTimes[i+1][n]=5;
                            NumberOfTimes[i][n+1]=5;
                            NumberOfTimes[i][n-1]=5;
                        }
                        if(n==0&&(i>=1&&i<=(getHeight()/cellsize)))
                        {
                            numberofball[i+1][n]=numberofball[i+1][n]+1;
                            numberofball[i-1][n]=numberofball[i-1][n]+1;
                            numberofball[i][n+1]=numberofball[i][n+1]+1;
                            whichplyer[i+1][n]=1;
                            whichplyer[i-1][n]=1;
                            whichplyer[i][n+1]=1;
                            NumberOfTimes[i+1][n]=5;
                            NumberOfTimes[i-1][n]=5;
                            NumberOfTimes[i][n+1]=5;
                        }
                        if(i==(getHeight()/cellsize-1)&&(n>=1&&n<=(getWidth()/cellsize)))
                        {
                            numberofball[i-1][n]=numberofball[i-1][n]+1;
                            numberofball[i][n+1]=numberofball[i][n+1]+1;
                            numberofball[i][n-1]=numberofball[i][n-1]+1;
                            whichplyer[i-1][n]=1;
                            whichplyer[i][n+1]=1;
                            whichplyer[i][n-1]=1;
                            NumberOfTimes[i-1][n]=5;
                            NumberOfTimes[i][n+1]=5;
                            NumberOfTimes[i][n-1]=5;
                        }
                        if(n==(getWidth()/cellsize-1)&&(i>=1&&i<=(getHeight()/cellsize)))
                        {
                            numberofball[i+1][n]=numberofball[i+1][n]+1;
                            numberofball[i-1][n]=numberofball[i-1][n]+1;
                            numberofball[i][n-1]=numberofball[i][n-1]+1;
                            whichplyer[i+1][n]=1;
                            whichplyer[i-1][n]=1;
                            whichplyer[i][n-1]=1;
                            NumberOfTimes[i+1][n]=5;
                            NumberOfTimes[i-1][n]=5;
                            NumberOfTimes[i][n-1]=5;
                        }
                    }
                    else
                    {
                        sound sound = new sound(); sound.PlaySound();
                        Space Space = new Space();
                        addObject(Space,n*cellsize+sizeX,i*cellsize+sizeY); 
                        numberofball[i][n]=0;
                        if(i==0&&(n>=1&&n<=(getWidth()/cellsize)))
                        {
                            numberofball[i+1][n]=numberofball[i+1][n]+1;
                            numberofball[i][n+1]=numberofball[i][n+1]+1;
                            numberofball[i][n-1]=numberofball[i][n-1]+1;
                            whichplyer[i+1][n]=2;
                            whichplyer[i][n+1]=2;
                            whichplyer[i][n-1]=2;
                            NumberOfTimes[i+1][n]=5;
                            NumberOfTimes[i][n+1]=5;
                            NumberOfTimes[i][n-1]=5;
                        }
                        if(n==0&&(i>=1&&i<=(getHeight()/cellsize)))
                        {
                            numberofball[i+1][n]=numberofball[i+1][n]+1;
                            numberofball[i-1][n]=numberofball[i-1][n]+1;
                            numberofball[i][n+1]=numberofball[i][n+1]+1;
                            whichplyer[i+1][n]=2;
                            whichplyer[i-1][n]=2;
                            whichplyer[i][n+1]=2;
                            NumberOfTimes[i+1][n]=5;
                            NumberOfTimes[i-1][n]=5;
                            NumberOfTimes[i][n+1]=5;
                        }
                        if(i==(getHeight()/cellsize-1)&&(n>=1&&n<=(getWidth()/cellsize)))
                        {
                            numberofball[i-1][n]=numberofball[i-1][n]+1;
                            numberofball[i][n+1]=numberofball[i][n+1]+1;
                            numberofball[i][n-1]=numberofball[i][n-1]+1;
                            whichplyer[i-1][n]=2;
                            whichplyer[i][n+1]=2;
                            whichplyer[i][n-1]=2;
                            NumberOfTimes[i-1][n]=5;
                            NumberOfTimes[i][n+1]=5;
                            NumberOfTimes[i][n-1]=5;
                        }
                        if(n==(getWidth()/cellsize-1)&&(i>=1&&i<=(getHeight()/cellsize)))
                        {
                            numberofball[i+1][n]=numberofball[i+1][n]+1;
                            numberofball[i-1][n]=numberofball[i-1][n]+1;
                            numberofball[i][n-1]=numberofball[i][n-1]+1;
                            whichplyer[i+1][n]=2;
                            whichplyer[i-1][n]=2;
                            whichplyer[i][n-1]=2;
                            NumberOfTimes[i+1][n]=5;
                            NumberOfTimes[i-1][n]=5;
                            NumberOfTimes[i][n-1]=5;
                        }
                    }
                    NumberOfTimes[i][n]=0;
                    whichplyer[i][n]=0;
                    for(int a=1;a<=4;a++){
                        if(a==1)
                        {
                            single(i+1,n+1);
                            two(i+1,n+1);
                            three(i+1,n+1);
                        }
                        if(a==2)
                        {
                            single(i+1,n-1);
                            two(i+1,n-1);
                            three(i+1,n-1);
                        }
                        if(a==3)
                        {
                            single(i-1,n+1);
                            two(i-1,n+1);
                            three(i-1,n+1);
                        }
                        if(a==4)
                        {
                            single(i-1,n-1);
                            two(i-1,n-1);
                            three(i-1,n-1);
                        }
                    }
                }

                if((numberofball[i][n]==2||numberofball[i][n]==3)&&((i==0&&n==0)||(i==(getHeight()/cellsize-1)&&n==0)||(n==(getWidth()/cellsize-1)&&i==0)||(i==(getHeight()/cellsize-1)&&n==(getWidth()/cellsize-1))))
                {
                    tr1=95;
                    if(whichplyer[i][n]==1)
                    {       
                        sound sound = new sound(); sound.PlaySound();
                        Space Space = new Space();
                        addObject(Space,n*cellsize+sizeX,i*cellsize+sizeY); 
                        numberofball[i][n]=0;
                        if(i==0&&n==0)
                        {
                            numberofball[i+1][n]=numberofball[i+1][n]+1;
                            numberofball[i][n+1]=numberofball[i][n+1]+1;
                            whichplyer[i+1][n]=1;
                            whichplyer[i][n+1]=1;
                            NumberOfTimes[i+1][n]=5;
                            NumberOfTimes[i][n+1]=5;
                        }
                        if(i==(getHeight()/cellsize-1)&&n==0)
                        {
                            numberofball[i-1][n]=numberofball[i-1][n]+1;
                            numberofball[i][n+1]=numberofball[i][n+1]+1;
                            whichplyer[i-1][n]=1;
                            whichplyer[i][n+1]=1;
                            NumberOfTimes[i-1][n]=5;
                            NumberOfTimes[i][n+1]=5;
                        }
                        if(n==(getWidth()/cellsize-1)&&i==0)
                        {
                            numberofball[i+1][n]=numberofball[i+1][n]+1;
                            numberofball[i][n-1]=numberofball[i][n-1]+1;
                            whichplyer[i+1][n]=1;
                            whichplyer[i][n-1]=1;
                            NumberOfTimes[i+1][n]=5;
                            NumberOfTimes[i][n-1]=5;
                        }
                        if(i==(getHeight()/cellsize-1)&&n==(getWidth()/cellsize-1))
                        {
                            numberofball[i-1][n]=numberofball[i-1][n]+1;
                            numberofball[i][n-1]=numberofball[i][n-1]+1;
                            whichplyer[i-1][n]=1;
                            whichplyer[i][n-1]=1;
                            NumberOfTimes[i-1][n]=5;
                            NumberOfTimes[i][n-1]=5;
                        }

                    }
                    else
                    {
                        sound sound = new sound(); sound.PlaySound();
                        Space Space = new Space();
                        addObject(Space,n*cellsize+sizeX,i*cellsize+sizeY); 
                        numberofball[i][n]=0;
                        if(i==0&&n==0)
                        {
                            numberofball[i+1][n]=numberofball[i+1][n]+1;
                            numberofball[i][n+1]=numberofball[i][n+1]+1;
                            whichplyer[i+1][n]=2;
                            whichplyer[i][n+1]=2;
                            NumberOfTimes[i+1][n]=5;
                            NumberOfTimes[i][n+1]=5;
                        }
                        if(i==(getHeight()/cellsize-1)&&n==0)
                        {
                            numberofball[i-1][n]=numberofball[i-1][n]+1;
                            numberofball[i][n+1]=numberofball[i][n+1]+1;
                            whichplyer[i-1][n]=2;
                            whichplyer[i][n+1]=2;
                            NumberOfTimes[i-1][n]=5;
                            NumberOfTimes[i][n+1]=5;
                        }
                        if(n==(getWidth()/cellsize-1)&&i==0)
                        {
                            numberofball[i+1][n]=numberofball[i+1][n]+1;
                            numberofball[i][n-1]=numberofball[i][n-1]+1;
                            whichplyer[i+1][n]=2;
                            whichplyer[i][n-1]=2;
                            NumberOfTimes[i+1][n]=5;
                            NumberOfTimes[i][n-1]=5;
                        }
                        if(i==(getHeight()/cellsize-1)&&n==(getWidth()/cellsize-1))
                        {
                            numberofball[i-1][n]=numberofball[i-1][n]+1;
                            numberofball[i][n-1]=numberofball[i][n-1]+1;
                            whichplyer[i-1][n]=2;
                            whichplyer[i][n-1]=2;
                            NumberOfTimes[i-1][n]=5;
                            NumberOfTimes[i][n-1]=5;
                        }
                    }
                    NumberOfTimes[i][n]=0;
                    whichplyer[i][n]=0;
                    for(int a=1;a<=4;a++){
                        if(a==1)
                        {
                            single(i+1,n+1);
                            two(i+1,n+1);
                            three(i+1,n+1);
                        }
                        if(a==2)
                        {
                            single(i+1,n-1);
                            two(i+1,n-1);
                            three(i+1,n-1);
                        }
                        if(a==3)
                        {
                            single(i-1,n+1);
                            two(i-1,n+1);
                            three(i-1,n+1);
                        }
                        if(a==4)
                        {
                            single(i-1,n-1);
                            two(i-1,n-1);
                            three(i-1,n-1);
                        }
                    }
                }
            }
        chicking();
    }

    static int count1=0,count2=0;
    public void chicking()
    {
        for(int i=0;i<getHeight()/cellsize;i++)
            for(int n=0;n<getWidth()/cellsize;n++)
            {
                if(whichplyer[i][n]==1)
                {
                    count1++;
                }
                if(whichplyer[i][n]!=0&&whichplyer[i][n]!=1)
                {
                    count2++;
                }
            }

        if(count2==0&&isTwoPlayerStarted)
        {
            showText("player 1 is won"  ,getWidth()/2,getHeight()/2+65);
            WinImage WinImage = new WinImage();
            addObject(WinImage,getWidth()/2,getHeight()/2); 
            Greenfoot.delay(200);
            Greenfoot.stop();
        }

        if(count1==0&&isTwoPlayerStarted)
        {
            showText("player 2 is won",getWidth()/2,getHeight()/2+65);Looseimage Looseimage = new Looseimage();
            addObject(Looseimage,getWidth()/2,getHeight()/2); 
            Greenfoot.delay(200);
            Greenfoot.stop();
        }
        count1=0;
        count2=0;
    }
}
