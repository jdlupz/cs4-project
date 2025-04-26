/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs10pd;

/**
 *
 * @author Jade Anne
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class backstory implements MouseListener{
    ImageIcon storybg;
    JFrame frame;
    //ImageIcon chatBoxIcon;
    //JLabel chatBox;
    JTextArea chatArea;
    ImageIcon imageicon;
    //JTextField character;
    JLabel storybg2;
    JLabel storybg3;
    JLabel storybg4;
    JLabel storybg5;
    JLabel storybg6;
    JLabel storybg7;
    
    ImageIcon img;
    String chat[];
    String charname[];
    int chatIndex;
    JLabel nextButtonL;
    
    PlaySound newgameBG;
    PlaySound click;
    int soundMode;
    
    MyStyle ms;
    
    public backstory(){
        soundMode=0;
        click=new PlaySound();
        newgameBG=new PlaySound();
        
        chatIndex=0;
        chat=new String[]{
            "My name is APOLLO JUSTICE and this is my Story!",
            "I grew up in the vallies of China, with my sister and my Dad.",
            "Our place was small, but nonetheless, we were always under threat of evil contractors and loansharks, just waiting to jump at the opportunity of stealing our land.",
            "One day, the loansharks would ask for two times the amount  they usually ask for, two times too many for my father to afford.",
            "In cruel fashion, he would leave us to work for the sharks, leaving me and my sister to live in the city. Promising that one day, we would meet again.",
            "Watching the powerful trample the innocent, I realized the true cost of apathy. Justice isn't just a word; it's a weapon against the weak, and I've chosen to wield it.",
            "This is my story and JUSTICE will be served!"
        };
        
        //charname= new String[]{
        //    "AJ"
        //};
        
        //frame=new JFrame("New Game");
        //gameBGIcon=new ImageIcon("Images/newgameBG.png");
        //frame.setContentPane(new JLabel(gameBGIcon));
        //setFrameBG("Images/newgameBG.png");
        
        storybg=new ImageIcon("images/storybg1.png");
        img=new ImageIcon(storybg.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        frame=new JFrame("New Game");
        frame.setContentPane(new JLabel(img));
        
        imageicon=new ImageIcon("images/storybg2.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        storybg2=new JLabel(img);
        
        imageicon=new ImageIcon("images/storybg3.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        storybg3=new JLabel(img);
        
        imageicon=new ImageIcon("images/storybg4.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        storybg4=new JLabel(img);
        
        imageicon=new ImageIcon("images/storybg5.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        storybg5=new JLabel(img);
        
        imageicon=new ImageIcon("images/storybg6.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        storybg6=new JLabel(img);
        
        imageicon=new ImageIcon("images/storybg7.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        storybg7=new JLabel(img);
        
        imageicon=new ImageIcon("images/nextbutton.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1200, 700, Image.SCALE_DEFAULT));
        nextButtonL=new JLabel(img);
        
        //imageicon=new ImageIcon("Images/ruinedcastle.png");
        //img=new ImageIcon(imageicon.getImage().getScaledInstance(360, 450, Image.SCALE_DEFAULT));
        //ruinedCastleL2=new JLabel(img);
        
        //chatBoxIcon=new ImageIcon("images/dialoguebox.png");
        //img=new ImageIcon(chatBoxIcon.getImage().getScaledInstance(1000, 500, Image.SCALE_DEFAULT));
        //chatBox=new JLabel(img);
        chatArea=new JTextArea(chat[chatIndex]);
        
        //character = new JTextField(charname[0]);
        
        ms=new MyStyle();
    }
    
    public void setFrame(){
        frame.setLayout(new GraphPaperLayout(new Dimension(20,30)));
        
        frame.add(nextButtonL, new Rectangle(15,25,8,4));
        //frame.add(chatBox, new Rectangle(0,23,20,6));
        frame.add(chatArea, new Rectangle(2,22,16,6));
        //frame.add(character, new Rectangle(2,23,3,3));
        
        frame.add(storybg2, new Rectangle (0,0,20,30));
        frame.add(storybg3, new Rectangle (0,0,20,30));
        frame.add(storybg4, new Rectangle (0,0,20,30));
        frame.add(storybg5, new Rectangle (0,0,20,30));
        frame.add(storybg6, new Rectangle (0,0,20,30));
        frame.add(storybg7, new Rectangle (0,0,20,30));
        
        frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
        frame.setSize(1100,800);
        frame.setVisible(true);
        frame.setLocation(100,100);
        frame.setResizable(false);
        
        this.componentSettings();
        addListeners();
        
        newgameBG.playEffect("Audio/backstorybg.wav");
    }
    
    public static void main(String[] args){
        backstory bg = new backstory();
        bg.setFrame();
    }
    
    /*public void setFrameBG(String im){
        gameBGIcon=new ImageIcon(im);
        frame.setContentPane(new JLabel(gameBGIcon));
    }*/
    
    public void hideAll(){
        
    }
    
    public void componentSettings(){
        ms.changeFontRecursive(frame, new Font("Courier New", Font.PLAIN, 30));
        //character.setEditable(false);
        chatArea.setEditable(false);
        chatArea.setLineWrap(true);
        chatArea.setWrapStyleWord(true);
        chatArea.setOpaque(false);
        chatArea.setForeground(Color.white);
        storybg2.setVisible(false);
        storybg3.setVisible(false);
        storybg4.setVisible(false);
        storybg5.setVisible(false);
        storybg6.setVisible(false);
        storybg7.setVisible(false);
        //ruinedCastleL2.setVisible(false);
        //frame.getContentPane().setBackground(new Color(150,225,207));
    }
    
    public void addListeners(){
        nextButtonL.addMouseListener(this);
    }
    
    public void setElements(){
        //hideAll();
        if(chatIndex==0){
            storybg2.setVisible(false);
            storybg3.setVisible(false);
            storybg4.setVisible(false);
            storybg5.setVisible(false);
            storybg6.setVisible(false);
            storybg7.setVisible(false);
        }
        else if(chatIndex==1){
            storybg2.setVisible(true);
        }
        else if(chatIndex==2){
            storybg2.setVisible(false);
            storybg3.setVisible(true);
            //if(soundMode==1){
                //newgameBG.clip.stop();
                //newgameBG.playEffect("Audio/pokemonbg.wav");
                //soundMode=0;
            //}
        }
        else if(chatIndex==3){
            storybg3.setVisible(false);
            storybg4.setVisible(true);
            //newgameBG.clip.stop();
            //newgameBG.playEffect("Audio/monstersummon.wav");
            //soundMode=1;
        }
        else if(chatIndex==4){
            storybg4.setVisible(false);
            storybg5.setVisible(true);
        }
        else if(chatIndex==5){
            storybg5.setVisible(false);
            storybg6.setVisible(true);
        }
        else if(chatIndex==6){
            storybg6.setVisible(false);
            storybg7.setVisible(true);
        }
    }
    
    /*public void checkMonsterScene(){
        
    }*/

    @Override
    public void mouseClicked(MouseEvent e) {
        click.playEffect("Audio/dialogue1.wav");
        if(e.getSource()==nextButtonL){
            if(chatIndex+1<chat.length){
                chatIndex++;
                chatArea.setText(chat[chatIndex]);
            }
            else{
                newgameBG.clip.stop();
                newgameloadingpage ng=new newgameloadingpage();
                Point p=frame.getLocation();
                ng.setFrame();
                ng.frame.setLocation(p);
                frame.dispose();
            //newgameBG.clip.stop();
            }
            setElements();
        }
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
}