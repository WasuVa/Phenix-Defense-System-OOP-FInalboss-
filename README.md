# Defense System Simulator

This project is a simple defense system simulator built with Java Swing. It demonstrates the use of the Observer design pattern to coordinate actions between a main controller and various defense units.

## 🚀 Features

- **Main Controller:** A central GUI to send commands and monitor the status of defense units.
- **Defense Units:**
    - **Helicopter:** A helicopter unit with its own controls.
    - **Submarine:** A submarine unit with its own controls.
    - **Tank:** A tank unit with its own controls.
- **Observer Pattern:** The main controller and defense units communicate using the Observer pattern. The `MainController` acts as the subject, and the defense units (`Helicopter`, `Submarine`, `Tank`) are the observers.
- **Area Clearance:** The main controller can notify units if the area is clear.
- **Positioning:** Defense units can be positioned using a slider in the main controller.
- **Messaging:** A simple messaging system between the controller and the units.

## 🛠️ Built With

- **Java:** The core programming language.
- **Swing:** Used for the graphical user interface (GUI).
- **NetBeans:** The project is set up as a NetBeans project.
- **Ant:** The build system used by the NetBeans project.

## ⚙️ Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher.
- Apache Ant (usually bundled with NetBeans).

### Building the Project

This is a NetBeans project, so it's easiest to open it in the NetBeans IDE.

1.  **Clone the repository:**
    ```sh
    git clone <repository-url>
    ```
2.  **Open in NetBeans:**
    - Open NetBeans IDE.
    - Go to `File > Open Project`.
    - Navigate to the cloned project directory and click `Open Project`.
3.  **Build the project:**
    - Right-click on the project in the `Projects` pane.
    - Select `Clean and Build`.

Alternatively, you can build the project from the command line using Ant:

```sh
ant jar
```

This will create a `CourseWork12-OOP-Final.jar` file in the `dist` directory.

### Running the Application

- **From NetBeans:**
    - Right-click on the project.
    - Select `Run`.
- **From the command line:**
    ```sh
    java -jar dist/CourseWork12-OOP-Final.jar
    ```

This will launch the Main Controller window and the windows for each defense unit (Helicopter, Submarine, and Tank).

## 🏛️ Project Structure

The project follows a standard Java project structure:

-   `src/`: Contains the source code.
    -   `view/`: Contains all the Java Swing GUI classes.
        -   `MainController.java`: The main control panel.
        -   `Defence.java`: The main entry point of the application.
        -   `Helicopters.java`, `Submarine.java`, `Tank.java`: The defense unit classes.
        -   `DefenceObserver.java`, `DefenceObserverable.java`: Classes implementing the Observer pattern.
-   `build.xml`: The Ant build script.
-   `nbproject/`: NetBeans project configuration files.
-   `dist/`: Will contain the compiled `.jar` file after building.

## 📄 License

This project is unlicensed. You are free to use, modify, and distribute it as you see fit.
