package nl.bdr.vaadin.application.jquery;

import com.vaadin.Application;
import com.vaadin.ui.Button;
import com.vaadin.ui.Window;

public class JQueryApplication extends Application {
  private static final long serialVersionUID = 1L;

  @Override
  public void init() {
    final Window mainWindow = new Window("JQuery Application");
    final Button hideAndfadeIn = new Button("Hide and Fade In");
    hideAndfadeIn.addListener(Button.ClickEvent.class, this, "hideAndfadeIn");

    mainWindow.addComponent(hideAndfadeIn);

    setMainWindow(mainWindow);
  }
  
  public void hideAndfadeIn() {
    String script = "$('body').hide().fadeIn('slow')";
    getMainWindow().executeJavaScript(script);
  }
}
