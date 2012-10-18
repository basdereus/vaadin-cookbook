package nl.example.vaadin;

import com.vaadin.Application;
import com.vaadin.ui.Label;
import com.vaadin.ui.Window;

public class HelloWorldApplication extends Application {
  private static final long serialVersionUID = 1L;

  @Override
  public void init() {
    final Window mainWindow = new Window("Hello World Application");

    final Label label = new Label("Hello World!");
    mainWindow.addComponent(label);

    setMainWindow(mainWindow);
  }
}
