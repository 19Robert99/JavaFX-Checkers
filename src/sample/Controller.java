package sample;

import CheckersData.CheckerParam;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.*;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    Pane pane;

    @FXML GridPane board;


    CheckerParam ch;

    ArrayList<Node> list = new ArrayList<>();
    Node [][] pol = new Node[8][8];

    int recLocki,recLockj;
    Ellipse moved;




    @FXML
    private void handleButtonAction(ActionEvent event) {


    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        EventHandler<MouseEvent> checkRectangle = e -> {
            if (moved!=null) {
                Rectangle nd = (Rectangle) e.getSource();
                moved.setCenterX(nd.getX()+40);
                moved.setCenterY(nd.getY()+40);
                moved.setFill(Color.WHITE);
            }

        };


        for (int y=0,z=0;y<640;y+=160,z+=2) {
        for (int x=0,x1=80,t=0;x<640;x+=160,x1+=160,t+=2) {
            Rectangle recWhite = new Rectangle(x,y,80,80);
            Rectangle recBlack = new Rectangle(x1,y,80,80);
            recWhite.setFill(Color.PAPAYAWHIP);
            recBlack.setFill(Color.CHOCOLATE);
            recBlack.addEventHandler(MouseEvent.MOUSE_CLICKED,checkRectangle);
            recWhite.addEventHandler(MouseEvent.MOUSE_CLICKED,checkRectangle);
            pol[z][t]=recWhite;
            pol[z][t+1]=recBlack;
            pane.getChildren().add(pol[z][t]);
            pane.getChildren().add(pol[z][t+1]);
        }}

        for (int y=80,z=1;y<640;y+=160,z+=2) {
            for (int x=0,x1=80,t=0;x<640;x+=160,x1+=160,t+=2) {
                Rectangle recBlack = new Rectangle(x,y,80,80);
                Rectangle recWhite = new Rectangle(x1,y,80,80);
                recBlack.setFill(Color.CHOCOLATE);
                recWhite.setFill(Color.PAPAYAWHIP);
                recBlack.addEventHandler(MouseEvent.MOUSE_CLICKED,checkRectangle);
                recWhite.addEventHandler(MouseEvent.MOUSE_CLICKED,checkRectangle);
                pol[z][t]=recBlack;
                pol[z][t+1]=recWhite;
                pane.getChildren().add(pol[z][t]);
                pane.getChildren().add(pol[z][t+1]);
            }}


        /*for (int i = 0; i < pol.length; i++) {
            for (int j = 0; j < pol[i].length; j++) {
                System.out.print(pol[i][j] + "\t");
            }
            System.out.println();
        }*/


        Ellipse white1 = new Ellipse(120,40,35,35);
        Ellipse white2 = new Ellipse(280,40,35,35);
        Ellipse white3 = new Ellipse(440,40,35,35);//164
        Ellipse white4 = new Ellipse(600,40,35,35);
        white1.setFill(Color.WHITE);
        white2.setFill(Color.WHITE);
        white3.setFill(Color.WHITE);
        white4.setFill(Color.WHITE);


        Ellipse white5 = new Ellipse(40,120,35,35);
        Ellipse white6 = new Ellipse(200,120,35,35);
        Ellipse white7 = new Ellipse(360,120,35,35);
        Ellipse white8 = new Ellipse(520,120,35,35);
        white5.setFill(Color.WHITE);
        white6.setFill(Color.WHITE);
        white7.setFill(Color.WHITE);
        white8.setFill(Color.WHITE);

        Ellipse white9 = new Ellipse(120,200,35,35);
        Ellipse white10 = new Ellipse(280,200,35,35);
        Ellipse white11 = new Ellipse(440,200,35,35);
        Ellipse white12 = new Ellipse(600,200,35,35);
        white9.setFill(Color.WHITE);
        white10.setFill(Color.WHITE);
        white11.setFill(Color.WHITE);
        white12.setFill(Color.WHITE);


        Ellipse black1 = new Ellipse(40,440,35,35);
        Ellipse black2 = new Ellipse(200,440,35,35);
        Ellipse black3 = new Ellipse(360,440,35,35);//164
        Ellipse black4 = new Ellipse(520,440,35,35);
        black1.setFill(Color.BLACK);
        black2.setFill(Color.BLACK);
        black3.setFill(Color.BLACK);
        black4.setFill(Color.BLACK);

        Ellipse black5 = new Ellipse(120,520,35,35);
        Ellipse black6 = new Ellipse(280,520,35,35);
        Ellipse black7 = new Ellipse(440,520,35,35);
        Ellipse black8 = new Ellipse(600,520,35,35);
        black5.setFill(Color.BLACK);
        black6.setFill(Color.BLACK);
        black7.setFill(Color.BLACK);
        black8.setFill(Color.BLACK);

        Ellipse black9 = new Ellipse(40,600,35,35);
        Ellipse black10 = new Ellipse(200,600,35,35);
        Ellipse black11 = new Ellipse(360,600,35,35);
        Ellipse black12 = new Ellipse(520,600,35,35);
        black9.setFill(Color.BLACK);
        black10.setFill(Color.BLACK);
        black11.setFill(Color.BLACK);
        black12.setFill(Color.BLACK);


        Node [][] elip ={
                {null,white1,null,white2,null,white3,null,white4},
                {white5,null,white6,null,white7,null,white8,null},
                {null,white9,null,white10,null,white11,null,white12},
                {null,null,null,null,null,null,null,null},
                {null,null,null,null,null,null,null,null},
                {black1,null,black2,null,black3,null,black4,null},
                {null,black5,null,black6,null,black7,null,black8},
                {black9,null,black10,null,black11,null,black12,null},
        };
        pane.getChildren().addAll(white1,white2,white3,white4,white5,white6,white7,white8,white9,white10,white11,white12,
                                  black1,black2,black3,black4,black5,black6,black7,black8,black9,black10,black11,black12);


        EventHandler<MouseEvent> selectChecker = e -> {
            for (int j = 0; j < 8; j++) {
                for (int i=0; i<8;i++){
                    if (elip[i][j]== e.getSource()){
                        Ellipse nd = (Ellipse)elip[i][j];
                        nd.setFill(Color.RED);
                        recLocki = i;
                        recLockj = j;
                    }
                }
            }
            for (int j = recLockj,i=recLocki; i<8; j++,i++) {
                //if (elip[recLocki][recLockj]==null) {
                    if (elip[i][j] == null) {
                        Rectangle rec = (Rectangle) pol[i][j];
                        rec.setFill(Color.RED);

                    //}
                }
            }

        };


        EventHandler<MouseEvent> whiteChecker = e -> {
            for (int j = 0; j < 8; j++) {
                for (int i=0; i<8;i++){
                    if (elip[i][j]== e.getSource()){
                        Ellipse nd = (Ellipse)elip[i][j];
                        nd.setFill(Color.WHITE);
                    }
                }
            }
            for (int j = recLockj,i=recLocki; i<8; j++,i++) {
                //  if (elip[recLocki+1][recLockj+1]==null) {
                if (elip[i][j]==null) {
                    Rectangle rec = (Rectangle) pol[i][j];
                    rec.setFill(Color.CHOCOLATE);

                }
                // }

            }

        };
        EventHandler<MouseEvent> move = e -> {
            moved = null;
            moved = (Ellipse) e.getSource();
            moved.setFill(Color.BLUE);


        };
        white9.addEventHandler(MouseEvent.MOUSE_CLICKED,move);

        /*white5.addEventHandler(MouseEvent.MOUSE_MOVED,selectChecker);
        white5.addEventHandler(MouseEvent.MOUSE_EXITED,whiteChecker);
        white8.addEventHandler(MouseEvent.MOUSE_MOVED,selectChecker);
        white8.addEventHandler(MouseEvent.MOUSE_EXITED,whiteChecker);
        white9.addEventHandler(MouseEvent.MOUSE_MOVED,selectChecker);
        white9.addEventHandler(MouseEvent.MOUSE_EXITED,whiteChecker);
        white10.addEventHandler(MouseEvent.MOUSE_MOVED,selectChecker);
        white10.addEventHandler(MouseEvent.MOUSE_EXITED,whiteChecker);
        white11.addEventHandler(MouseEvent.MOUSE_MOVED,selectChecker);
        white11.addEventHandler(MouseEvent.MOUSE_EXITED,whiteChecker);*/
    }

}
