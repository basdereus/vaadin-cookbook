package nl.example.vaadin.components.label;

import com.vaadin.Application;
import com.vaadin.ui.Label;
import com.vaadin.ui.Window;

public class LabelContentXHTMLApplication extends Application {
  private static final long serialVersionUID = 1L;

  @Override
  public void init() {
    final Window mainWindow = new Window("WelcomeLabel");

    Label welcomeLabel = new Label("Welcom to " + 
        "<i style'color:red' title='Welcome Vaadin Cookbook'>Vaadin Cookbook</i>", 
        Label.CONTENT_XHTML);

    mainWindow.addComponent(welcomeLabel);
    setMainWindow(mainWindow);
  }
}
