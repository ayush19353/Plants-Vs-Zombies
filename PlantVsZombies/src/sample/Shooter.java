package sample;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class Shooter extends Plant {
    public Shooter(int x, int y, String path, Pane pane, int hp, int width, int height, int z, GridPane grid){
        super(x,y,path,pane,hp,width,height,z,grid);

    }
    @Override
    public void attack(){
        //throwpea
    }
}
