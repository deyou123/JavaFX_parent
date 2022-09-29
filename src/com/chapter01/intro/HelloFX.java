package com.chapter01.intro;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * @author DeYou
 * @date 2022/9/29
 */
public class HelloFX extends Application {

    public static void main(String[] args) {
        Application.launch( args );
    }
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle( "Hello world" );
        stage.show();
    }
}