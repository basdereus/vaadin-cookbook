package nl.bdr.vaadin.terminal.gwt.server;

import java.io.BufferedWriter;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import nl.bdr.vaadin.application.jquery.JQueryApplication;

import com.vaadin.Application;
import com.vaadin.terminal.gwt.server.ApplicationServlet;

public class JQueryApplicationServlet extends ApplicationServlet {
  private static final long serialVersionUID = 1L;

  @Override
  protected Application getNewApplication(HttpServletRequest request)
      throws ServletException {
    return new JQueryApplication();
  }

  @Override
  protected Class<? extends Application> getApplicationClass()
      throws ClassNotFoundException {
    return JQueryApplication.class;
  }

  @Override
  protected void writeAjaxPageHtmlHeader(BufferedWriter page, String title,
      String themeUri, HttpServletRequest request) throws IOException {
    super.writeAjaxPageHtmlHeader(page, title, themeUri, request);

    StringBuilder builder = new StringBuilder();
    builder.append("<script type=\"text/javascript\" ");
    builder.append("src=\"http://code.jquery.com/");
    builder.append("jquery-latest.min.js\">");
    builder.append("</script>");

    page.write(builder.toString());
  }
}
