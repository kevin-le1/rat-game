/* This is the largest chunk of our code that runs the entirety of the game.
From switching screens to creating buttons, this code has all of the intricate
code of our game. To give a basic summary of this code, it uses
RatHealthAndCheese and creates it as an object to keep check of the health.
Along with this, the coordinates are being checked as well, these two are our
two test cases. Lastly, this code consistently draws the intended output,
background, and ending screens. */

import java.awt.Color;
import java.awt.Font;

public class Implementation {

    // two instance variables, fonts to not make it repetitively stated
    private Font font = new Font("Times New Roman", Font.BOLD, 60);
    private Font font2 = new Font("Times New Roman", Font.BOLD, 30);
    // instance object to keep the health and cheese updated throughout
    private RatHealthAndCheese update = new RatHealthAndCheese();
    // instance variable to keep count if it hits 0, all the ingredients
    // are found
    private int count = 3;

    // constructor for the health and cheese, to keep check of each instance
    public Implementation() {
        update.health = 5;
        update.cheese = 5;
    }

    // first method creates and sets the dimensions and is the contract
    public void contract() {
        StdDraw.setCanvasSize(1920, 980);
        StdDraw.setYscale(-980, 980);
        StdDraw.setXscale(-1920, 1920);
        StdDraw.picture(0, 0, "contract.png");
        StdDraw.setPenColor(Color.darkGray);
        StdDraw.line(-736.0, -668.0, 770.0, -450.0);
        StdDraw.line(770.0, -450.0, 732.0, -300.0);
        StdDraw.line(732.0, -300.0, -770.0, -530.0);
        StdDraw.line(-770.0, -530.0, -736.0, -668.0);
        StdDraw.setPenColor(Color.LIGHT_GRAY);
        StdDraw.setFont(font);
        while (true) {
            // mouse location
            double x = StdDraw.mouseX();
            double y = StdDraw.mouseY();
            // mouse click
            if (x < 776.0 && x > -766.0 && y < -400.0 && y > -580.0) {
                StdDraw.enableDoubleBuffering();
                StdDraw.setPenColor(Color.pink);
                StdDraw.text(-10, -500, "Sign here!", 9);
                StdDraw.line(-736.0, -668.0, 770.0, -450.0);
                StdDraw.line(770.0, -450.0, 732.0, -300.0);
                StdDraw.line(732.0, -300.0, -770.0, -530.0);
                StdDraw.line(-770.0, -530.0, -736.0, -668.0);
                StdDraw.show();
            }
            else {
                StdDraw.enableDoubleBuffering();
                StdDraw.setPenColor(Color.LIGHT_GRAY);
                StdDraw.text(-10, -500, "Sign here!", 9);
                StdDraw.setPenColor(Color.darkGray);
                StdDraw.line(-736.0, -668.0, 770.0, -450.0);
                StdDraw.line(770.0, -450.0, 732.0, -300.0);
                StdDraw.line(732.0, -300.0, -770.0, -530.0);
                StdDraw.line(-770.0, -530.0, -736.0, -668.0);
                StdDraw.show();
            }
            if (StdDraw.isMousePressed()) {
                // first test case coordinates
                StdOut.println(x + " , " + y);
                if (x < 732 && x > -770 && y < -430 && y > -580) {
                    start();
                }
            }
            StdDraw.pause(100);
        }
    }

    // This is the start page, after the contract, the previous method calls
    // this method.
    public void start() {
        StdDraw.clear();
        StdDraw.picture(0, 0, "start.png");
        StdDraw.setFont(font);
        StdDraw.setPenRadius(0.3);
        StdDraw.setPenColor(Color.pink);
        StdDraw.line(-1680.0, -302.0, -446.0, -302);
        StdDraw.setPenColor(Color.white);
        StdDraw.text(-1063, -302, "Start!");
        while (true) {
            double x = StdDraw.mouseX();
            double y = StdDraw.mouseY();
            if (x < -446 && x > -1680 && y < -170.0 && y > -430.0) {
                StdDraw.enableDoubleBuffering();
                StdDraw.setPenColor(Color.red);
                StdDraw.line(-1680.0, -302.0, -446.0, -302);
                StdDraw.setPenColor(Color.white);
                StdDraw.text(-1063, -302, "Start!");
                StdDraw.show();
            }
            else {
                StdDraw.enableDoubleBuffering();
                StdDraw.setPenColor(Color.pink);
                StdDraw.line(-1680.0, -302.0, -446.0, -302);
                StdDraw.setPenColor(Color.white);
                StdDraw.text(-1063, -302, "Start!");
                StdDraw.show();
            }
            if (StdDraw.isMousePressed()) {
                // second test case
                StdOut.println(x + " , " + y);
                if (x < -446 && x > -1680 && y < -170.0 && y > -430.0) {
                    instructions();
                }
            }
            StdDraw.pause(100);
        }
    }

    // After the start method conditional has been completed, instructions
    // method is ran.
    public void instructions() {
        StdDraw.clear();
        StdDraw.picture(0, 0, "instruction.png");
        StdDraw.setFont(font);
        StdDraw.setPenRadius(0.3);
        StdDraw.setPenColor(Color.black);
        StdDraw.line(-500, -600, 500, -600);
        StdDraw.setPenColor(Color.white);
        StdDraw.text(0, -600, "Next!");
        while (true) {
            double x = StdDraw.mouseX();
            double y = StdDraw.mouseY();
            if (x < 500 && x > -500 && y < -400 && y > -800) {
                StdDraw.enableDoubleBuffering();
                StdDraw.setPenColor(Color.black);
                StdDraw.line(-500, -600, 500, -600);
                StdDraw.setPenColor(Color.white);
                StdDraw.text(0, -600, "Next!");
                StdDraw.show();
            }
            else {
                StdDraw.enableDoubleBuffering();
                StdDraw.setPenColor(Color.white);
                StdDraw.line(-500, -600, 500, -600);
                StdDraw.setPenColor(Color.black);
                StdDraw.text(0, -600, "Next!");
                StdDraw.show();
            }
            if (StdDraw.isMousePressed()) {
                // Third test case
                StdOut.println(x + " , " + y);
                if (x < 500 && x > -500 && y < -400 && y > -800) {
                    update();
                }
            }
            StdDraw.pause(100);
        }
    }

    // method to draw background
    public void background() {
        StdDraw.picture(-1, 170, "kitchenwithtrash.png", 3838, 1680);
    }

    // method to draw rat
    public void drawRat() {
        StdDraw.picture(-1600, 0, "rat.png", 500, 500);
    }

    // method to draw border
    public void border() {
        StdDraw.setPenColor(Color.DARK_GRAY);
        StdDraw.filledRectangle(0, -980, 2000, 26);
        StdDraw.filledRectangle(0, -680, 2000, 13);
        StdDraw.filledRectangle(-1910, -823, 15, 131);
        StdDraw.filledRectangle(1890, -823, 15, 131);
        StdDraw.filledRectangle(-1000, -823, 15, 131);
    }

    // method to draw hearts
    public void happiness() {
        for (int i = 0; i < update.getHealth(); i++) {
            StdDraw.picture(-1760 + (150 * i), -765, "heart.png", 125, 125);
        }
    }

    // method to draw cheese
    public void hunger() {
        for (int i = 0; i < update.getCheese(); i++) {
            StdDraw.picture(-1760 + (150 * i), -885, "cheese.png", 125, 125);
        }
    }

    // method to show all previous methods allows for simplicity throughout
    public void show() {
        drawRat();
        border();
        happiness();
        hunger();
    }

    // After the instructions method conditional has been completed, update
    // method is ran.
    public void update() {
        StdDraw.clear();
        background();
        show();
        StdDraw.setFont(font2);
        StdDraw.setPenColor(Color.black);
        StdDraw.text(-200, -830, "your first task as a chef is to clean the kitchen.");
        StdDraw.setPenRadius(0.09);
        StdDraw.setPenColor(Color.pink);
        StdDraw.line(620, -822, 688, -822);
        StdDraw.setPenColor(Color.black);
        StdDraw.text(658, -822, "Next!");
        StdDraw.show();

        while (true) {
            StdDraw.enableDoubleBuffering();
            double x = StdDraw.mouseX();
            double y = StdDraw.mouseY();
            StdDraw.pause(100);
            if (x < 688 && x > 620 && y < -790 && y > -850) {
                StdDraw.enableDoubleBuffering();
                StdDraw.setPenColor(Color.red);
                StdDraw.line(620, -822, 688, -822);
                StdDraw.setPenColor(Color.black);
                StdDraw.text(658, -822, "Next!");
                StdDraw.show();
            }
            else {
                StdDraw.enableDoubleBuffering();
                StdDraw.setPenColor(Color.pink);
                StdDraw.line(620, -822, 688, -822);
                StdDraw.setPenColor(Color.black);
                StdDraw.text(658, -822, "Next!");
                StdDraw.show();
            }

            if (StdDraw.isMousePressed()) {
                // forth test case
                StdOut.println(x + "," + y);
                if (x < 688 && x > 620 && y < -790 && y > -850) {
                    update.decrementHP();
                    // health test case
                    StdOut.println(update.health);
                    afterCleaning();
                }
            }
            StdDraw.pause(100);
        }
    }

    // After the update method conditional has been completed, afterCleaning
    // method is ran.
    public void afterCleaning() {
        StdDraw.clear();
        StdDraw.picture(-1, 170, "background.png", 3838, 1680);
        show();
        StdDraw.setFont(font2);
        StdDraw.setPenColor(Color.black);
        StdDraw.text(-200, -795, "that was hard! take a short break");
        StdDraw.text(-200, -860, "and chat with your coworkers.");
        StdDraw.setPenRadius(0.09);
        StdDraw.setPenColor(Color.pink);
        StdDraw.line(620, -822, 688, -822);
        StdDraw.setPenColor(Color.black);
        StdDraw.text(658, -822, "Next!");
        StdDraw.show();
        while (true) {
            StdDraw.enableDoubleBuffering();
            StdDraw.pause(200);
            double x = StdDraw.mouseX();
            double y = StdDraw.mouseY();
            if (x < 688 && x > 620 && y < -790 && y > -850) {
                StdDraw.enableDoubleBuffering();
                StdDraw.setPenColor(Color.red);
                StdDraw.line(620, -822, 688, -822);
                StdDraw.setPenColor(Color.black);
                StdDraw.text(658, -822, "Next!");
                StdDraw.show();
            }
            else {
                StdDraw.enableDoubleBuffering();
                StdDraw.setPenColor(Color.pink);
                StdDraw.line(620, -822, 688, -822);
                StdDraw.setPenColor(Color.black);
                StdDraw.text(658, -822, "Next!");
                StdDraw.show();
            }

            if (StdDraw.isMousePressed()) {
                // fifth test case
                StdOut.println(x + "," + y);
                if (x < 688 && x > 620 && y < -790 && y > -850) {
                    update.incrementHP();
                    // health test case
                    StdOut.println(update.health);
                    afterResting();
                }
            }
        }
    }

    // After the afterCleaning method conditional has been completed,
    // afterResting method is ran.
    public void afterResting() {
        StdDraw.clear();
        StdDraw.picture(-1, 170, "background.png", 3838, 1680);
        show();
        StdDraw.setFont(font2);
        StdDraw.setPenColor(Color.black);
        StdDraw.text(-200, -795, "it’s time to take out the trash!");
        StdDraw.text(-200, -860, "go outside of the restaurant.");
        StdDraw.setPenRadius(0.09);
        StdDraw.setPenColor(Color.pink);
        StdDraw.line(620, -822, 688, -822);
        StdDraw.setPenColor(Color.black);
        StdDraw.text(658, -822, "Next!");
        StdDraw.show();
        while (true) {
            StdDraw.enableDoubleBuffering();
            StdDraw.pause(200);
            double x = StdDraw.mouseX();
            double y = StdDraw.mouseY();
            if (x < 688 && x > 620 && y < -790 && y > -850) {
                StdDraw.enableDoubleBuffering();
                StdDraw.setPenColor(Color.red);
                StdDraw.line(620, -822, 688, -822);
                StdDraw.setPenColor(Color.black);
                StdDraw.text(658, -822, "Next!");
                StdDraw.show();
            }
            else {
                StdDraw.enableDoubleBuffering();
                StdDraw.setPenColor(Color.pink);
                StdDraw.line(620, -822, 688, -822);
                StdDraw.setPenColor(Color.black);
                StdDraw.text(658, -822, "Next!");
                StdDraw.show();
            }

            if (StdDraw.isMousePressed()) {
                // sixth test case for coordinates
                StdOut.println(x + "," + y);
                if (x < 688 && x > 620 && y < -790 && y > -850) {
                    update.decrementHP();
                    // health test case
                    StdOut.println(update.health);
                    outside();
                }
            }
        }
    }

    // After the after resting method conditional has been completed, outside
    // method is ran.
    public void outside() {
        StdDraw.clear();
        StdDraw.setCanvasSize(1920, 980);
        StdDraw.setYscale(-980, 980);
        StdDraw.setXscale(-1920, 1920);
        StdDraw.picture(-1, 170, "outside.png", 3838, 1680);
        show();
        StdDraw.setFont(font2);
        StdDraw.setPenColor(Color.black);
        StdDraw.text(-200, -830, "is someone hiding in the pile of leaves?");
        StdDraw.setPenRadius(0.09);
        StdDraw.setPenColor(Color.pink);
        StdDraw.line(460, -822, 740, -822);
        StdDraw.line(900, -822, 1000, -822);
        StdDraw.setPenColor(Color.black);
        StdDraw.text(600, -822, "go say hello!");
        StdDraw.text(950, -822, "ignore!");

        StdDraw.show();
        StdDraw.pause(100);
        while (true) {
            StdDraw.enableDoubleBuffering();
            StdDraw.pause(200);
            double x = StdDraw.mouseX();
            double y = StdDraw.mouseY();
            if (x < 740 && x > 460 && y < -790 && y > -850) {
                StdDraw.enableDoubleBuffering();
                StdDraw.setPenColor(Color.red);
                StdDraw.line(460, -822, 740, -822);
                StdDraw.setPenColor(Color.black);
                StdDraw.text(600, -822, "go say hello!");
                StdDraw.show();
            }
            else {
                StdDraw.enableDoubleBuffering();
                StdDraw.setPenColor(Color.pink);
                StdDraw.line(460, -822, 740, -822);
                StdDraw.setPenColor(Color.black);
                StdDraw.text(600, -822, "go say hello!");
                StdDraw.show();
            }
            if (x < 1000 && x > 900 && y < -790 && y > -850) {
                StdDraw.enableDoubleBuffering();
                StdDraw.setPenColor(Color.red);
                StdDraw.line(900, -822, 1000, -822);
                StdDraw.setPenColor(Color.black);
                StdDraw.text(950, -822, "ignore!");
                StdDraw.show();
            }
            else {
                StdDraw.enableDoubleBuffering();
                StdDraw.setPenColor(Color.pink);
                StdDraw.line(900, -822, 1000, -822);
                StdDraw.setPenColor(Color.black);
                StdDraw.text(950, -822, "ignore!");
                StdDraw.show();
            }

            if (StdDraw.isMousePressed()) {
                // seventh test case for coordinates
                StdOut.println(x + "," + y);
                if (x < 740 && x > 460 && y < -790 && y > -850) {
                    // test cases for health and cheese
                    update.incrementHP();
                    update.decrementCheese();
                    StdOut.println(update.health);
                    StdOut.println(update.cheese);
                    talk();
                }
                if (x < 1000 && x > 900 && y < -790 && y > -850) {
                    ignore();
                }
            }
            StdDraw.pause(100);
        }
    }

    // After the outside method conditional has been completed, talk
    // method is ran.
    public void talk() {
        StdDraw.clear();
        StdDraw.picture(-1, 170, "outside.png", 3838, 1680);
        show();
        StdDraw.setFont(font2);
        StdDraw.setPenColor(Color.black);
        StdDraw.text(-200, -795, "it looks like there’s something");
        StdDraw.text(-200, -860, " under the pile of leaves.");
        StdDraw.setPenRadius(0.09);
        StdDraw.setPenColor(Color.pink);
        StdDraw.line(400, -822, 780, -822);
        StdDraw.line(900, -822, 1600, -822);
        StdDraw.setPenColor(Color.black);
        StdDraw.text(600, -822, "jump in the pile");
        StdDraw.text(1250, -822, "rake up the leaves (get milk)");

        StdDraw.show();
        StdDraw.pause(100);
        while (true) {
            StdDraw.enableDoubleBuffering();
            StdDraw.pause(250);
            double x = StdDraw.mouseX();
            double y = StdDraw.mouseY();
            if (x < 780 && x > 400 && y < -790 && y > -850) {
                StdDraw.enableDoubleBuffering();
                StdDraw.setPenColor(Color.red);
                StdDraw.line(400, -822, 780, -822);
                StdDraw.setPenColor(Color.black);
                StdDraw.text(600, -822, "jump in the pile");
                StdDraw.show();
            }
            else {
                StdDraw.enableDoubleBuffering();
                StdDraw.setPenColor(Color.pink);
                StdDraw.line(400, -822, 780, -822);
                StdDraw.setPenColor(Color.black);
                StdDraw.text(600, -822, "jump in the pile");
                StdDraw.show();
            }
            if (x < 1600 && x > 900 && y < -790 && y > -850) {
                StdDraw.enableDoubleBuffering();
                StdDraw.setPenColor(Color.red);
                StdDraw.line(900, -822, 1600, -822);
                StdDraw.setPenColor(Color.black);
                StdDraw.text(1250, -822, "rake up the leaves (get milk)");
                StdDraw.show();
            }
            else {
                StdDraw.enableDoubleBuffering();
                StdDraw.setPenColor(Color.pink);
                StdDraw.line(900, -822, 1600, -822);
                StdDraw.setPenColor(Color.black);
                StdDraw.text(1250, -822, "rake up the leaves (get milk)");
                StdDraw.show();
            }

            if (StdDraw.isMousePressed()) {
                // 8th test case for coordinates
                StdOut.println(x + "," + y);
                if (x < 780 && x > 400 && y < -790 && y > -850) {
                    // test cases for health and cheese
                    update.incrementHP();
                    update.decrementCheese();
                    StdOut.println(update.health);
                    StdOut.println(update.cheese);
                    if (update.getHealth() > 5) {
                        update.health = 5;
                    }
                    jump();
                }
                if (x < 1600 && x > 900 && y < -790 && y > -850) {
                    // test cases for health and cheese
                    update.decrementHP();
                    update.decrementCheese();
                    StdOut.println(update.health);
                    StdOut.println(update.cheese);
                    count--;
                    rake();
                }
            }
            StdDraw.pause(100);
        }
    }

    // After the outside method conditional has been completed, ignore
    // method is ran.
    public void ignore() {
        StdDraw.clear();
        StdDraw.picture(-1, 170, "outside.png", 3838, 1680);
        for (int i = 0; i < 4; i++) {
            StdDraw.picture(-1760 + (150 * i), -765, "heart.png", 125, 125);
        }
        drawRat();
        border();
        hunger();
        StdDraw.setFont(font2);
        StdDraw.setPenColor(Color.black);
        StdDraw.text(-200, -795, "it looks like there’s something");
        StdDraw.text(-200, -860, " under the pile of leaves.");
        StdDraw.setPenRadius(0.09);
        StdDraw.setPenColor(Color.pink);
        StdDraw.line(400, -822, 780, -822);
        StdDraw.line(900, -822, 1600, -822);
        StdDraw.setPenColor(Color.black);
        StdDraw.text(600, -822, "jump in the pile");
        StdDraw.text(1250, -822, "rake up the leaves (get milk)");
        StdDraw.show();
        StdDraw.pause(100);
        while (true) {
            StdDraw.enableDoubleBuffering();
            StdDraw.pause(300);
            double x = StdDraw.mouseX();
            double y = StdDraw.mouseY();
            if (x < 780 && x > 400 && y < -790 && y > -850) {
                StdDraw.enableDoubleBuffering();
                StdDraw.setPenColor(Color.red);
                StdDraw.line(400, -822, 780, -822);
                StdDraw.setPenColor(Color.black);
                StdDraw.text(600, -822, "jump in the pile");
                StdDraw.show();
            }
            else {
                StdDraw.enableDoubleBuffering();
                StdDraw.setPenColor(Color.pink);
                StdDraw.line(400, -822, 780, -822);
                StdDraw.setPenColor(Color.black);
                StdDraw.text(600, -822, "jump in the pile");
                StdDraw.show();
            }
            if (x < 1600 && x > 900 && y < -790 && y > -850) {
                StdDraw.enableDoubleBuffering();
                StdDraw.setPenColor(Color.red);
                StdDraw.line(900, -822, 1600, -822);
                StdDraw.setPenColor(Color.black);
                StdDraw.text(1250, -822, "rake up the leaves (get milk)");
                StdDraw.show();
            }
            else {
                StdDraw.enableDoubleBuffering();
                StdDraw.setPenColor(Color.pink);
                StdDraw.line(900, -822, 1600, -822);
                StdDraw.setPenColor(Color.black);
                StdDraw.text(1250, -822, "rake up the leaves (get milk)");
                StdDraw.show();
            }

            if (StdDraw.isMousePressed()) {
                // 8th test cases for coordinates
                StdOut.println(x + "," + y);
                if (x < 780 && x > 400 && y < -790 && y > -850) {
                    // test cases for health and cheese
                    update.incrementHP();
                    update.decrementCheese();
                    StdOut.println(update.health);
                    StdOut.println(update.cheese);
                    if (update.getHealth() > 5) {
                        update.health = 5;
                    }
                    jump();
                }
                if (x < 1600 && x > 900 && y < -790 && y > -850) {
                    // test cases for health and cheese
                    update.decrementHP();
                    update.decrementCheese();
                    StdOut.println(update.health);
                    StdOut.println(update.cheese);
                    count--;
                    rake();
                }
            }
            StdDraw.pause(100);
        }
    }

    // After the ignore or talk method conditional has been completed, rake
    // method is ran.
    public void rake() {
        StdDraw.clear();
        StdDraw.picture(-1, 170, "outside.png", 3838, 1680);
        show();
        StdDraw.setFont(font2);
        StdDraw.setPenColor(Color.black);
        StdDraw.text(-200, -795, "did someone have a picnic here?");
        StdDraw.text(-200, -860, "it looks like they left some food!");
        StdDraw.setPenRadius(0.09);
        StdDraw.setPenColor(Color.pink);
        StdDraw.line(400, -822, 780, -822);
        StdDraw.line(900, -822, 1600, -822);
        StdDraw.setPenColor(Color.black);
        StdDraw.text(600, -822, "throws away basket");
        StdDraw.text(1250, -822, "eat the food & get butter/eggs");

        StdDraw.show();
        while (true) {
            StdDraw.enableDoubleBuffering();
            StdDraw.pause(300);
            double x = StdDraw.mouseX();
            double y = StdDraw.mouseY();
            if (x < 820 && x > 400 && y < -790 && y > -850) {
                StdDraw.enableDoubleBuffering();
                StdDraw.setPenColor(Color.red);
                StdDraw.line(400, -822, 820, -822);
                StdDraw.setPenColor(Color.black);
                StdDraw.text(600, -822, "throws away basket");
                StdDraw.show();
            }
            else {
                StdDraw.enableDoubleBuffering();
                StdDraw.setPenColor(Color.pink);
                StdDraw.line(400, -822, 820, -822);
                StdDraw.setPenColor(Color.black);
                StdDraw.text(600, -822, "throws away basket");
                StdDraw.show();
            }
            if (x < 1600 && x > 900 && y < -790 && y > -850) {
                StdDraw.enableDoubleBuffering();
                StdDraw.setPenColor(Color.red);
                StdDraw.line(900, -822, 1600, -822);
                StdDraw.setPenColor(Color.black);
                StdDraw.text(1250, -822, "eat the food & get butter/eggs");
                StdDraw.show();
            }
            else {
                StdDraw.enableDoubleBuffering();
                StdDraw.setPenColor(Color.pink);
                StdDraw.line(900, -822, 1600, -822);
                StdDraw.setPenColor(Color.black);
                StdDraw.text(1250, -822, "eat the food & get butter/eggs");
                StdDraw.show();
            }

            if (StdDraw.isMousePressed()) {
                // 9th test case for coordinates
                StdOut.println(x + "," + y);
                if (x < 820 && x > 400 && y < -790 && y > -850) {
                    beforeEnding();
                }
                if (x < 1600 && x > 900 && y < -790 && y > -850) {
                    count = count - 2;
                    beforeEnding();
                }
            }
            StdDraw.pause(100);
        }
    }

    // After the ignore or talk method conditional has been completed, jump
    // method is ran.
    public void jump() {
        StdDraw.clear();
        StdDraw.picture(-1, 170, "outside.png", 3838, 1680);
        show();
        StdDraw.setFont(font2);
        StdDraw.setPenColor(Color.black);
        StdDraw.text(-200, -795, "did someone have a picnic here?");
        StdDraw.text(-200, -860, "it looks like they left some food!");
        StdDraw.setPenRadius(0.09);
        StdDraw.setPenColor(Color.pink);
        StdDraw.line(400, -822, 820, -822);
        StdDraw.line(900, -822, 1600, -822);
        StdDraw.setPenColor(Color.black);
        StdDraw.text(600, -822, "throws away basket");
        StdDraw.text(1250, -822, "eat the food & get butter/eggs");

        StdDraw.show();
        while (true) {
            StdDraw.enableDoubleBuffering();
            StdDraw.pause(300);
            double x = StdDraw.mouseX();
            double y = StdDraw.mouseY();
            if (x < 820 && x > 400 && y < -790 && y > -850) {
                StdDraw.enableDoubleBuffering();
                StdDraw.setPenColor(Color.red);
                StdDraw.line(400, -822, 820, -822);
                StdDraw.setPenColor(Color.black);
                StdDraw.text(600, -822, "throws away basket");
                StdDraw.show();
            }
            else {
                StdDraw.enableDoubleBuffering();
                StdDraw.setPenColor(Color.pink);
                StdDraw.line(400, -822, 820, -822);
                StdDraw.setPenColor(Color.black);
                StdDraw.text(600, -822, "throws away basket");
                StdDraw.show();
            }
            if (x < 1600 && x > 900 && y < -790 && y > -850) {
                StdDraw.enableDoubleBuffering();
                StdDraw.setPenColor(Color.red);
                StdDraw.line(900, -822, 1600, -822);
                StdDraw.setPenColor(Color.black);
                StdDraw.text(1250, -822, "eat the food & get butter/eggs");
                StdDraw.show();
            }
            else {
                StdDraw.enableDoubleBuffering();
                StdDraw.setPenColor(Color.pink);
                StdDraw.line(900, -822, 1600, -822);
                StdDraw.setPenColor(Color.black);
                StdDraw.text(1250, -822, "eat the food & get butter/eggs");
                StdDraw.show();
            }

            if (StdDraw.isMousePressed()) {
                // 9th test case for coordinates
                StdOut.println(x + "," + y);
                if (x < 820 && x > 400 && y < -790 && y > -850) {
                    beforeEnding();
                }
                if (x < 1600 && x > 900 && y < -790 && y > -850) {
                    beforeEnding();
                }
            }
            StdDraw.pause(100);
        }
    }

    // After the jump or rake method conditional has been completed, before
    // ending method is ran.
    public void beforeEnding() {
        StdDraw.clear();
        StdDraw.picture(0, 0, "beforeEnding.jpg");
        StdDraw.setFont(font);
        StdDraw.setPenRadius(0.3);
        StdDraw.setPenColor(Color.black);
        StdDraw.line(-400, -642, 300, -642);
        StdDraw.setPenColor(Color.white);
        StdDraw.text(-50, -642, "Next!");
        StdDraw.show();
        while (true) {
            StdDraw.enableDoubleBuffering();
            // mouse location
            double x = StdDraw.mouseX();
            double y = StdDraw.mouseY();
            // mouse click
            if (x < 300 && x > -400 && y < -580 && y > -700) {
                StdDraw.setPenColor(Color.white);
                StdDraw.line(-400, -642, 300, -642);
                StdDraw.setPenColor(Color.black);
                StdDraw.text(-50, -642, "Next!");
                StdDraw.show();
            }
            else {
                StdDraw.setPenColor(Color.black);
                StdDraw.line(-400, -642, 300, -642);
                StdDraw.setPenColor(Color.white);
                StdDraw.text(-50, -642, "Next!");
                StdDraw.show();
            }
            if (StdDraw.isMousePressed()) {
                StdOut.println(x + " , " + y);
                if (x < 300 && x > -400 && y < -580 && y > -700) {
                    ending();
                }
            }
            StdDraw.pause(100);
        }
    }

    // After the before ending method conditional has been completed, ending
    // method is ran.
    public void ending() {
        StdDraw.clear();
        StdDraw.pause(200);
        // checks if count is 0 otherwise end
        if (count == 0) {
            // set to birthday cake
            StdDraw.clear();
            StdDraw.picture(0, 0, "gift2.jpg");
            StdDraw.show();
        }
        else {
            // set to you are the greatest gift
            StdDraw.clear();
            StdDraw.picture(0, 0, "gift1.jpg");
            StdDraw.show();
        }
        while (true) {

        }
    }
}
