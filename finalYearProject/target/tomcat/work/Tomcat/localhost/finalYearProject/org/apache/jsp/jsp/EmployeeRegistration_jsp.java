/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-04-27 15:41:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class EmployeeRegistration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style1.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Registration</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/employee_registration\" method=\"POST\">\r\n");
      out.write("        <fieldset>\r\n");
      out.write("            <label>Name</label>\r\n");
      out.write("            <input type='text' name='name' placeholder='Name' required><span></span>\r\n");
      out.write("            <br>\r\n");
      out.write("            <label>Second name</label>\r\n");
      out.write("            <input type='text' name='secondName' placeholder='Second name' required><span></span>\r\n");
      out.write("            <br>\r\n");
      out.write("            <br>\r\n");
      out.write("            <label>Age</label>\r\n");
      out.write("            <input type='text' name='age' placeholder='Age' required><span></span>\r\n");
      out.write("            <br>\r\n");
      out.write("            <label>Sex</label>\r\n");
      out.write("            <input type='text' name='sex' placeholder='Sex' required><span></span>\r\n");
      out.write("            <br>\r\n");
      out.write("            <label>Country</label>\r\n");
      out.write("            <input type='text' name='country' placeholder='Country' required><span></span>\r\n");
      out.write("            <br>\r\n");
      out.write("            <label>City</label>\r\n");
      out.write("            <input type='text' name='city' placeholder='City' required><span></span>\r\n");
      out.write("            <br>\r\n");
      out.write("        </fieldset>\r\n");
      out.write("        <fieldset>\r\n");
      out.write("            <label>Phone</label>\r\n");
      out.write("            <input type='text' name='phone' placeholder='Phone' required><span></span>\r\n");
      out.write("            <br>\r\n");
      out.write("            <label>Email</label>\r\n");
      out.write("            <input type='email' name='email' placeholder='Email' required><span></span>\r\n");
      out.write("            <br>\r\n");
      out.write("            <label>Login</label>\r\n");
      out.write("            <input type='text' name='login' placeholder='Login' required><span></span>\r\n");
      out.write("            <br>\r\n");
      out.write("            <label>Password</label>\r\n");
      out.write("            <input type='password' name='pass1' placeholder='Password' required><span></span>\r\n");
      out.write("            <br>\r\n");
      out.write("            <label>Confirm</label>\r\n");
      out.write("            <input type='password' name='pass2' placeholder='Confirm' required><span></span>\r\n");
      out.write("            <br>\r\n");
      out.write("        </fieldset>\r\n");
      out.write("        <fieldset>\r\n");
      out.write("            <p>Enter the number from the picture</p>\r\n");
      out.write("            <img src=\"https://c22blog.files.wordpress.com/2010/10/input-black.gif\">\r\n");
      out.write("            <input type='text' name='capcha' placeholder='number' required><span></span>\r\n");
      out.write("        </fieldset>\r\n");
      out.write("        <div class=\"sum\">\r\n");
      out.write("            <input type=\"submit\" value=\"Sign Up\">\r\n");
      out.write("            <br><a href=\"#\">Autorization</a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
