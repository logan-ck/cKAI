package ck;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

/*
 * Copyright (c) 1995, 2008
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
 
 
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.SwingUtilities;

@SuppressWarnings("serial")
public class cKAI extends JPanel {
    public cKAI() {
    	
        super(new GridLayout(8,8));  //3 rows, 1 column
        JTextArea talk;
		JLabel title;
        talk = new JTextArea(15, 31);
        JTextArea card = new JTextArea(15, 31);
        JButton btnNewButton, aboutBtn;
        btnNewButton = new JButton("Submit!");
        aboutBtn = new JButton("About me");
        setLayout(new BorderLayout());
        
        title = new JLabel("cKAI v1.0");
        title.setFont(new Font("Sans Serif", Font.BOLD, 22));
        title.setHorizontalAlignment( SwingConstants.CENTER );
        title.setBackground(Color.white);
        
		
        aboutBtn.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	     
        	     
        	}
        });
        
        
        
        //talk = new JLabel("Hello, my name is cKAI. How are you today?", JLabel.LEFT);
        //talk.setVerticalAlignment(SwingConstants.TOP);
        talk.setFont(new Font("Courier New", Font.BOLD, 11));
        talk.setForeground(Color.red);
        talk.setText("Hello, my name is cKAI. How are you?");
        
        card.setBackground(Color.gray);
        card.setForeground(Color.white);
        
        add(title, JLabel.RIGHT);
        add(aboutBtn, JButton.LEFT);
        add(new JScrollPane(talk));
        
        add(new JScrollPane(card), BorderLayout.AFTER_LINE_ENDS);
        add(btnNewButton, BorderLayout.PAGE_END);
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	     if(card.getText().equals("hey")){
        	          talk.setText("How are you?");
        	     }
        	     
        	}
        });
        
    }
 
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event dispatch thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("cKAI v1.0");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(700, 400));
       
        //Add content to the window.
        frame.add(new cKAI());
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
        //Turn off metal's use of bold fonts
            UIManager.put("swing.boldMetal", Boolean.FALSE);
            
            
            createAndShowGUI();
            }
        });
    }
}

