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

public class mediumlevel implements MouseListener{
    int casecount;
    int score = 0;
    String scorevalue = "";
    
    ImageIcon presspaper;
    JFrame frame;
    //ImageIcon chatBoxIcon;
    //JLabel chatBox;
    JTextArea chatArea;
    ImageIcon imageicon;
    //JTextField character;
    
    JLabel scoreboard;
    
    JLabel proceed;
    JLabel mainmenu;
    
    JLabel holdit;
    JLabel gotcha;
    
    JLabel adhominemb;
    JLabel adhominemr;
    
    JLabel slipperyslopeb;
    JLabel slipperysloper;
    
    JLabel dilemmab;
    JLabel dilemmar;
    
    JLabel bandwagonb;
    JLabel bandwagonr;
    
    JLabel authorityb;
    JLabel authorityr;
    
    JLabel strawmanb;
    JLabel strawmanr;
    
    JLabel generalizationb;
    JLabel generalizationr;
    
    JLabel redherringb;
    JLabel redherringr;
    
    JLabel ignoranceb;
    JLabel ignorancer;
    
    JLabel pityb;
    JLabel pityr;
    
    JLabel equivocationb;
    JLabel equivocationr;
    
    JLabel medc1ques;
    JLabel medc1choice;
    JLabel medc1right;
    JLabel medc1wrong;
    
    JLabel medc2ques;
    JLabel medc2choice;
    JLabel medc2right;
    JLabel medc2wrong;
    
    JLabel medc3ques;
    JLabel medc3choice;
    JLabel medc3right;
    JLabel medc3wrong;
    
    JLabel medc4ques;
    JLabel medc4choice;
    JLabel medc4right;
    JLabel medc4wrong;
    
    JLabel medc5ques;
    JLabel medc5right;
    JLabel medc5wrong;
    
    ImageIcon img;
    String chat;
    JLabel nextbutton;
    
    PlaySound newgameBG;
    PlaySound click;
    int soundMode;
    
    MyStyle ms;
    
    public mediumlevel(){
        casecount = 0;
        
        soundMode=0;
        click=new PlaySound();
        newgameBG=new PlaySound();
        
        scorevalue = String.valueOf(score);
        chat = scorevalue + " / 5";
        
        presspaper=new ImageIcon("images/presspaper.png");
        img=new ImageIcon(presspaper.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        frame=new JFrame("New Game");
        frame.setContentPane(new JLabel(img));
        
        imageicon=new ImageIcon("images/adhominemb.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(950, 700, Image.SCALE_DEFAULT));
        adhominemb=new JLabel(img);
        
        imageicon=new ImageIcon("images/adhominemr.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(950, 700, Image.SCALE_DEFAULT));
        adhominemr=new JLabel(img);
        
        imageicon=new ImageIcon("images/slipperyslopeb.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(950, 700, Image.SCALE_DEFAULT));
        slipperyslopeb=new JLabel(img);
        
        imageicon=new ImageIcon("images/slipperysloper.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(950, 700, Image.SCALE_DEFAULT));
        slipperysloper=new JLabel(img);
        
        imageicon=new ImageIcon("images/dilemmab.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(950, 700, Image.SCALE_DEFAULT));
        dilemmab=new JLabel(img);
        
        imageicon=new ImageIcon("images/dilemmar.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(950, 700, Image.SCALE_DEFAULT));
        dilemmar=new JLabel(img);
        
        imageicon=new ImageIcon("images/bandwagonb.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(950, 700, Image.SCALE_DEFAULT));
        bandwagonb=new JLabel(img);
        
        imageicon=new ImageIcon("images/bandwagonr.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(950, 700, Image.SCALE_DEFAULT));
        bandwagonr=new JLabel(img);
        
        imageicon=new ImageIcon("images/authorityb.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(950, 700, Image.SCALE_DEFAULT));
        authorityb=new JLabel(img);
        
        imageicon=new ImageIcon("images/authorityr.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(950, 700, Image.SCALE_DEFAULT));
        authorityr=new JLabel(img);
        
        imageicon=new ImageIcon("images/strawmanb.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(950, 700, Image.SCALE_DEFAULT));
        strawmanb=new JLabel(img);
        
        imageicon=new ImageIcon("images/strawmanr.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(950, 700, Image.SCALE_DEFAULT));
        strawmanr=new JLabel(img);
        
        imageicon=new ImageIcon("images/generalizationb.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(950, 700, Image.SCALE_DEFAULT));
        generalizationb=new JLabel(img);
        
        imageicon=new ImageIcon("images/generalizationr.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(950, 700, Image.SCALE_DEFAULT));
        generalizationr=new JLabel(img);
        
        imageicon=new ImageIcon("images/redherringb.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(950, 700, Image.SCALE_DEFAULT));
        redherringb=new JLabel(img);
        
        imageicon=new ImageIcon("images/redherringr.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(950, 700, Image.SCALE_DEFAULT));
        redherringr=new JLabel(img);
        
        imageicon=new ImageIcon("images/ignoranceb.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(950, 700, Image.SCALE_DEFAULT));
        ignoranceb=new JLabel(img);
        
        imageicon=new ImageIcon("images/ignorancer.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(950, 700, Image.SCALE_DEFAULT));
        ignorancer=new JLabel(img);
        
        imageicon=new ImageIcon("images/pityb.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(950, 700, Image.SCALE_DEFAULT));
        pityb=new JLabel(img);
        
        imageicon=new ImageIcon("images/pityr.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(950, 700, Image.SCALE_DEFAULT));
        pityr=new JLabel(img);
        
        imageicon=new ImageIcon("images/equivocationb.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(950, 700, Image.SCALE_DEFAULT));
        equivocationb=new JLabel(img);
        
        imageicon=new ImageIcon("images/equivocationr.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(950, 700, Image.SCALE_DEFAULT));
        equivocationr=new JLabel(img);
        
        imageicon=new ImageIcon("images/notfallacybutton.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1100, 600, Image.SCALE_DEFAULT));
        gotcha=new JLabel(img);
        
        imageicon=new ImageIcon("images/fallacybutton.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1100, 600, Image.SCALE_DEFAULT));
        holdit=new JLabel(img);
        
        imageicon=new ImageIcon("images/mainmenubutton.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(850, 500, Image.SCALE_DEFAULT));
        mainmenu=new JLabel(img);
        
        imageicon=new ImageIcon("images/proceedbutton.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(850, 500, Image.SCALE_DEFAULT));
        proceed=new JLabel(img);
        
        imageicon=new ImageIcon("images/scoreboard.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        scoreboard=new JLabel(img);
        
        imageicon=new ImageIcon("images/medc1ques.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        medc1ques=new JLabel(img);

        imageicon=new ImageIcon("images/medc1choice.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        medc1choice=new JLabel(img);
        
        imageicon=new ImageIcon("images/medc1right.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        medc1right=new JLabel(img);
        
        imageicon=new ImageIcon("images/medc1wrong.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        medc1wrong=new JLabel(img);
        
        imageicon=new ImageIcon("images/medc2ques.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        medc2ques=new JLabel(img);
        
        imageicon=new ImageIcon("images/medc2choice.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        medc2choice=new JLabel(img);
        
        imageicon=new ImageIcon("images/medc2right.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        medc2right=new JLabel(img);
        
        imageicon=new ImageIcon("images/medc2wrong.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        medc2wrong=new JLabel(img);
        
        imageicon=new ImageIcon("images/medc3ques.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        medc3ques=new JLabel(img);
        
        imageicon=new ImageIcon("images/medc3choice.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        medc3choice=new JLabel(img);
        
        imageicon=new ImageIcon("images/medc3right.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        medc3right=new JLabel(img);
        
        imageicon=new ImageIcon("images/medc3wrong.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        medc3wrong=new JLabel(img);
        
        imageicon=new ImageIcon("images/medc4ques.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        medc4ques=new JLabel(img);
        
        imageicon=new ImageIcon("images/medc4choice.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        medc4choice=new JLabel(img);
        
        imageicon=new ImageIcon("images/medc4right.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        medc4right=new JLabel(img);
        
        imageicon=new ImageIcon("images/medc4wrong.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        medc4wrong=new JLabel(img);
        
        imageicon=new ImageIcon("images/medc5ques.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        medc5ques=new JLabel(img);
        
        imageicon=new ImageIcon("images/medc5right.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        medc5right=new JLabel(img);
        
        imageicon=new ImageIcon("images/medc5wrong.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1100, 800, Image.SCALE_DEFAULT));
        medc5wrong=new JLabel(img);
        
        
        
        
        imageicon=new ImageIcon("images/nextbutton.png");
        img=new ImageIcon(imageicon.getImage().getScaledInstance(1200, 700, Image.SCALE_DEFAULT));
        nextbutton=new JLabel(img);
        
        //imageicon=new ImageIcon("Images/ruinedcastle.png");
        //img=new ImageIcon(imageicon.getImage().getScaledInstance(360, 450, Image.SCALE_DEFAULT));
        //ruinedCastleL2=new JLabel(img);
        
        //chatBoxIcon=new ImageIcon("images/dialoguebox.png");
        //img=new ImageIcon(chatBoxIcon.getImage().getScaledInstance(1000, 500, Image.SCALE_DEFAULT));
        //chatBox=new JLabel(img);
        chatArea=new JTextArea(chat);
        
        //character = new JTextField(charname[0]);
        
        ms=new MyStyle();
    }
    
    public void setFrame(){
        frame.setLayout(new GraphPaperLayout(new Dimension(20,30)));
        
        frame.add(nextbutton, new Rectangle(15,25,8,4));
        
        frame.add(holdit, new Rectangle(3,25,4,4));
        frame.add(gotcha, new Rectangle(7,25,4,4));
        
        frame.add(adhominemb, new Rectangle(6,24,3,2));
        frame.add(adhominemr, new Rectangle(6,27,3,2));
        
        frame.add(slipperyslopeb, new Rectangle(6,24,3,2));
        frame.add(slipperysloper, new Rectangle(6,27,3,2));
        
        frame.add(dilemmab, new Rectangle(6,24,3,2));
        frame.add(dilemmar, new Rectangle(6,27,3,2));
        
        frame.add(bandwagonb, new Rectangle(6,24,3,2));
        frame.add(bandwagonr, new Rectangle(6,27,3,2));
        
        frame.add(authorityb, new Rectangle(6,24,3,2));
        frame.add(authorityr, new Rectangle(6,27,3,2));
        
        frame.add(strawmanb, new Rectangle(6,24,3,2));
        frame.add(strawmanr, new Rectangle(6,27,3,2));
        
        frame.add(generalizationb, new Rectangle(6,24,3,2));
        frame.add(generalizationr, new Rectangle(6,27,3,2));
        
        frame.add(redherringb, new Rectangle(6,24,3,2));
        frame.add(redherringr, new Rectangle(6,27,3,2));
        
        frame.add(ignoranceb, new Rectangle(6,24,3,2));
        frame.add(ignorancer, new Rectangle(6,27,3,2));
        
        frame.add(pityb, new Rectangle(6,24,3,2));
        frame.add(pityr, new Rectangle(6,27,3,2));
        
        frame.add(equivocationb, new Rectangle(6,24,3,2));
        frame.add(equivocationr, new Rectangle(6,27,3,2));
        
        frame.add(mainmenu, new Rectangle(10,18,4,2));
        frame.add(proceed, new Rectangle(10,14,4,2));
        
        //frame.add(chatBox, new Rectangle(0,23,20,6));
        frame.add(chatArea, new Rectangle(11,7,10,4));
        //frame.add(character, new Rectangle(2,23,3,3));
        
        frame.add(scoreboard, new Rectangle (0,0,20,30));
        
        frame.add(medc1ques, new Rectangle (0,0,20,30));
        frame.add(medc1choice, new Rectangle (0,0,20,30));
        frame.add(medc1right, new Rectangle (0,0,20,30));
        frame.add(medc1wrong, new Rectangle (0,0,20,30));
        
        frame.add(medc2ques, new Rectangle (0,0,20,30));
        frame.add(medc2choice, new Rectangle (0,0,20,30));
        frame.add(medc2right, new Rectangle (0,0,20,30));
        frame.add(medc2wrong, new Rectangle (0,0,20,30));
        
        frame.add(medc3ques, new Rectangle (0,0,20,30));
        frame.add(medc3choice, new Rectangle (0,0,20,30));
        frame.add(medc3right, new Rectangle (0,0,20,30));
        frame.add(medc3wrong, new Rectangle (0,0,20,30));
        
        frame.add(medc4ques, new Rectangle (0,0,20,30));
        frame.add(medc4choice, new Rectangle (0,0,20,30));
        frame.add(medc4right, new Rectangle (0,0,20,30));
        frame.add(medc4wrong, new Rectangle (0,0,20,30));
        
        frame.add(medc5ques, new Rectangle (0,0,20,30));
        frame.add(medc5right, new Rectangle (0,0,20,30));
        frame.add(medc5wrong, new Rectangle (0,0,20,30));
        
        
        
        frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
        frame.setSize(1100,800);
        frame.setVisible(true);
        frame.setLocation(100,100);
        frame.setResizable(false);
        
        this.componentSettings();
        addListeners();
        
        newgameBG.playEffect("audio/gamebg.wav");
    }
    
    public static void main(String[] args){
        mediumlevel bg = new mediumlevel();
        bg.setFrame();
    }
    
    /*public void setFrameBG(String im){
        gameBGIcon=new ImageIcon(im);
        frame.setContentPane(new JLabel(gameBGIcon));
    }*/
    
    public void hideAll(){
        
    }
    
    public void componentSettings(){
        ms.changeFontRecursive(frame, new Font("Courier New", Font.PLAIN, 80));
        //character.setEditable(false);
        chatArea.setEditable(false);
        chatArea.setLineWrap(true);
        chatArea.setWrapStyleWord(true);
        chatArea.setOpaque(false);
        chatArea.setForeground(Color.white);
        chatArea.setVisible(false);
        
        scoreboard.setVisible(false);
        
        medc1ques.setVisible(false);
        medc1choice.setVisible(false);
        medc1right.setVisible(false);
        medc1wrong.setVisible(false);
        
        medc2ques.setVisible(false);
        medc2choice.setVisible(false);
        medc2right.setVisible(false);
        medc2wrong.setVisible(false);
        
        medc3ques.setVisible(false);
        medc3choice.setVisible(false);
        medc3right.setVisible(false);
        medc3wrong.setVisible(false);
        
        medc4ques.setVisible(false);
        medc4choice.setVisible(false);
        medc4right.setVisible(false);
        medc4wrong.setVisible(false);
        
        medc5ques.setVisible(false);
        medc5right.setVisible(false);
        medc5wrong.setVisible(false);
        
        adhominemb.setVisible(false);
        adhominemr.setVisible(false);
        
        slipperyslopeb.setVisible(false);
        slipperysloper.setVisible(false);
        
        dilemmab.setVisible(false);
        dilemmar.setVisible(false);
        
        bandwagonb.setVisible(false);
        bandwagonr.setVisible(false);
        
        authorityb.setVisible(false);
        authorityr.setVisible(false);
        
        strawmanb.setVisible(false);
        strawmanr.setVisible(false);
        
        generalizationb.setVisible(false);
        generalizationr.setVisible(false);
        
        redherringb.setVisible(false);
        redherringr.setVisible(false);
        
        ignoranceb.setVisible(false);
        ignorancer.setVisible(false);
        
        pityb.setVisible(false);
        pityr.setVisible(false);
        
        equivocationb.setVisible(false);
        equivocationr.setVisible(false);
        
        holdit.setVisible(false);
        gotcha.setVisible(false);
        
        mainmenu.setVisible(false);
        proceed.setVisible(false);
        
        nextbutton.setVisible(true);

        //ruinedCastleL2.setVisible(false);
        //frame.getContentPane().setBackground(new Color(150,225,207));
    }
    
    public void addListeners(){
        nextbutton.addMouseListener(this);
        
        holdit.addMouseListener(this);
        gotcha.addMouseListener(this);
        
        mainmenu.addMouseListener(this);
        proceed.addMouseListener(this);
        
        adhominemb.addMouseListener(this);
        adhominemr.addMouseListener(this);
        slipperyslopeb.addMouseListener(this);
        slipperysloper.addMouseListener(this);
        dilemmab.addMouseListener(this);
        dilemmar.addMouseListener(this);
        bandwagonb.addMouseListener(this);
        bandwagonr.addMouseListener(this);
        authorityb.addMouseListener(this);
        authorityr.addMouseListener(this);
        strawmanb.addMouseListener(this);
        strawmanr.addMouseListener(this);
        generalizationb.addMouseListener(this);
        generalizationr.addMouseListener(this);
        redherringb.addMouseListener(this);
        redherringr.addMouseListener(this);
        ignoranceb.addMouseListener(this);
        ignorancer.addMouseListener(this);
        pityb.addMouseListener(this);
        pityr.addMouseListener(this);
        equivocationb.addMouseListener(this);
        equivocationr.addMouseListener(this);
    }
    
    /*public void checkMonsterScene(){
        
    }*/

    @Override
    public void mouseClicked(MouseEvent e) {
        click.playEffect("audio/select.wav");
        if(e.getSource()==nextbutton){
            if(casecount==0){
                holdit.setVisible(true);
                gotcha.setVisible(true);
                nextbutton.setVisible(false);
                medc1ques.setVisible(true);
            }
            else if(casecount==1){
                holdit.setVisible(true);
                gotcha.setVisible(true);
                nextbutton.setVisible(false);
                medc1wrong.setVisible(false);
                medc1right.setVisible(false);
                medc2ques.setVisible(true);
            }
            else if(casecount==2){
                holdit.setVisible(true);
                gotcha.setVisible(true);
                nextbutton.setVisible(false);
                medc2wrong.setVisible(false);
                medc2right.setVisible(false);
                medc3ques.setVisible(true);
            }
            else if(casecount==3){
                holdit.setVisible(true);
                gotcha.setVisible(true);
                nextbutton.setVisible(false);
                medc3wrong.setVisible(false);
                medc3right.setVisible(false);
                medc4ques.setVisible(true);
            }
            else if(casecount==4){
                holdit.setVisible(true);
                gotcha.setVisible(true);
                nextbutton.setVisible(false);
                medc4wrong.setVisible(false);
                medc4right.setVisible(false);
                medc5ques.setVisible(true);
            }
            else{
                newgameBG.clip.stop();
                newgameBG.playEffect("audio/applause.wav");
                mainmenu.setVisible(true);
                proceed.setVisible(true);
                medc5wrong.setVisible(false);
                medc5right.setVisible(false);
                scoreboard.setVisible(true);
                chatArea.setVisible(true);
                scorevalue = String.valueOf(score);
                chat = scorevalue + " / 5";
                chatArea.setText(chat);
            }
        }
        else if(e.getSource()==holdit){
            if(casecount==0){
                medc1ques.setVisible(false);
                medc1choice.setVisible(true);
                holdit.setVisible(false);
                gotcha.setVisible(false);
                strawmanb.setVisible(true);
                equivocationr.setVisible(true);
            }
            else if(casecount==1){
                medc2ques.setVisible(false);
                medc2choice.setVisible(true);
                holdit.setVisible(false);
                gotcha.setVisible(false);
                generalizationb.setVisible(true);
                bandwagonr.setVisible(true);
            }
            else if(casecount==2){
                medc3ques.setVisible(false);
                medc3choice.setVisible(true);
                holdit.setVisible(false);
                gotcha.setVisible(false);
                pityb.setVisible(true);
                redherringr.setVisible(true);
            }
            else if(casecount==3){
                medc4ques.setVisible(false);
                medc4choice.setVisible(true);
                holdit.setVisible(false);
                gotcha.setVisible(false);
                ignoranceb.setVisible(true);
                adhominemr.setVisible(true);
            }
            else if(casecount==4){
                medc5ques.setVisible(false);
                medc5wrong.setVisible(true);
                holdit.setVisible(false);
                gotcha.setVisible(false);
                nextbutton.setVisible(true);
                casecount++;
            }
        }
        else if(e.getSource()==gotcha){
            if(casecount==4){
                medc5ques.setVisible(false);
                medc5right.setVisible(true);
                holdit.setVisible(false);
                gotcha.setVisible(false);
                nextbutton.setVisible(true);
                score++;
                casecount++;
            }
            else{
                if(casecount==0){
                    holdit.setVisible(false);
                    gotcha.setVisible(false);
                    nextbutton.setVisible(true);
                    medc1ques.setVisible(false);
                    medc1wrong.setVisible(true);
                    casecount++;
                }
                else if(casecount==1){
                    holdit.setVisible(false);
                    gotcha.setVisible(false);
                    nextbutton.setVisible(true);
                    medc2ques.setVisible(false);
                    medc2wrong.setVisible(true);
                    casecount++;
                }
                else if(casecount==2){
                    holdit.setVisible(false);
                    gotcha.setVisible(false);
                    nextbutton.setVisible(true);
                    medc3ques.setVisible(false);
                    medc3wrong.setVisible(true);
                    casecount++;
                }
                else if(casecount==3){
                    holdit.setVisible(false);
                    gotcha.setVisible(false);
                    nextbutton.setVisible(true);
                    medc4ques.setVisible(false);
                    medc4wrong.setVisible(true);
                    casecount++;
                }
            }
        }
        else if(e.getSource()==adhominemb){
            
        }
        else if(e.getSource()==adhominemr){
            if(casecount==3){
                medc4wrong.setVisible(true);
                medc4choice.setVisible(false);
                ignoranceb.setVisible(false);
                adhominemr.setVisible(false);
                nextbutton.setVisible(true);
                casecount++;
            }
        }
        else if(e.getSource()==slipperyslopeb){
            
        }
        else if(e.getSource()==slipperysloper){
            
            
        }
        else if(e.getSource()==dilemmab){
            
        }
        else if(e.getSource()==dilemmar){
            
        }
        else if(e.getSource()==bandwagonb){
            
        }
        else if(e.getSource()==bandwagonr){
            if(casecount==1){
                medc2wrong.setVisible(true);
                medc2choice.setVisible(false);
                generalizationb.setVisible(false);
                bandwagonr.setVisible(false);
                nextbutton.setVisible(true);
                casecount++;
            }
        }
        else if(e.getSource()==authorityb){
            
        }
        else if(e.getSource()==authorityr){
            
        }
        else if(e.getSource()==strawmanb){
            if(casecount==0){
                medc1right.setVisible(true);
                medc1choice.setVisible(false);
                strawmanb.setVisible(false);
                equivocationr.setVisible(false);
                nextbutton.setVisible(true);
                score++;
                casecount++;
            }
        }
        else if(e.getSource()==strawmanr){
            
        }
        else if(e.getSource()==generalizationb){
            if(casecount==1){
                medc2right.setVisible(true);
                medc2choice.setVisible(false);
                generalizationb.setVisible(false);
                bandwagonr.setVisible(false);
                nextbutton.setVisible(true);
                score++;
                casecount++;
            }
        }
        else if(e.getSource()==generalizationr){
            
        }
        else if(e.getSource()==redherringb){
            
        }
        else if(e.getSource()==redherringr){
            if(casecount==2){
                medc3right.setVisible(true);
                medc3choice.setVisible(false);
                pityb.setVisible(false);
                redherringr.setVisible(false);
                nextbutton.setVisible(true);
                score++;
                casecount++;
            }
        }
        else if(e.getSource()==ignoranceb){
            if(casecount==3){
                medc4right.setVisible(true);
                medc4choice.setVisible(false);
                ignoranceb.setVisible(false);
                adhominemr.setVisible(false);
                nextbutton.setVisible(true);
                score++;
                casecount++;
            }
        }
        else if(e.getSource()==ignorancer){
            
        }
        else if(e.getSource()==pityb){
            if(casecount==2){
                medc3wrong.setVisible(true);
                medc3choice.setVisible(false);
                pityb.setVisible(false);
                redherringr.setVisible(false);
                nextbutton.setVisible(true);
                casecount++;
            }
        }
        else if(e.getSource()==pityr){
            
        }
        else if(e.getSource()==equivocationb){
            
        }
        else if(e.getSource()==equivocationr){
            if(casecount==0){
                medc1wrong.setVisible(true);
                medc1choice.setVisible(false);
                strawmanb.setVisible(false);
                equivocationr.setVisible(false);
                nextbutton.setVisible(true);
                casecount++;
            }
        }
        else if(e.getSource()==mainmenu){
            main ng=new main();
            Point p=frame.getLocation();
            ng.setFrame();
            ng.frame.setLocation(p);
            frame.dispose();
        }
        else if(e.getSource()==proceed){
            hardleveltitlepage ng=new hardleveltitlepage();
            Point p=frame.getLocation();
            ng.setFrame();
            ng.frame.setLocation(p);
            frame.dispose();
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