/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.71
 * Generated at: 2021-09-29 12:32:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class chart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/mocom/resources/chart.css\">\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"http://d3js.org/d3.v3.min.js\" charset=\"utf-8\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	$('document').ready(function(){});\r\n");
      out.write("</script>\r\n");
      out.write("<style>\r\n");
      out.write("    svg{ \r\n");
      out.write("	    width:340px; \r\n");
      out.write("	    height:370px; \r\n");
      out.write("	    border : 1px solid black;\r\n");
      out.write("	    margin-left: 20px;\r\n");
      out.write("    }\r\n");
      out.write("    .bar{\r\n");
      out.write("        fill:blue;\r\n");
      out.write("    }\r\n");
      out.write("    .pie{\r\n");
      out.write("        fill: orange; stroke: black;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form action=\"loginchk\" method=\"post\">\r\n");
      out.write("<div>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.dto.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("님 환영 합니다.</div>\r\n");
      out.write("<div id=\"root\">\r\n");
      out.write("	<div class=\"qnadiv\">\r\n");
      out.write("		<a href=\"board/main\">QnA</a>\r\n");
      out.write("	</div>\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<div class=\"left_panel\" style=\"\">\r\n");
      out.write("			<div>\r\n");
      out.write("				<h1>회원가입한 나이 그래프</h1>\r\n");
      out.write("				<svg id=\"myGraph1\">\r\n");
      out.write("				</svg>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"leftbtndiv\">\r\n");
      out.write("				<button type=\"button\" id=\"barbtn\">update</button>\r\n");
      out.write("			</div>\r\n");
      out.write("<!-- 			<script src=\"/mocom/resources/d3/sample01.js\"></script>\\ -->\r\n");
      out.write("			<script src=\"/mocom/resources/d3/barjson.js\"></script>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"right_panel\">\r\n");
      out.write("			<div>\r\n");
      out.write("				<h1>데이터에 따른 그래프 표시</h1>\r\n");
      out.write("				<svg id=\"myGraph2\">\r\n");
      out.write("				</svg>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"rightbtndiv\">\r\n");
      out.write("				<button type=\"button\" id=\"piebtn\">update</button>\r\n");
      out.write("			</div>\r\n");
      out.write("<!-- 			<script src=\"/mocom/resources/d3/sample01.js\"></script>\\ -->\r\n");
      out.write("			<script src=\"/mocom/resources/d3/pie.js\"></script>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}