/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.4
 * Generated at: 2018-01-30 03:30:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.staffInfor;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class share_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/D:/maven-general/jstl/jstl/1.2/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("jar:file:/D:/maven-general/jstl/jstl/1.2/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("file:/D:/maven-general/jstl/jstl/1.2/jstl-1.2.jar", Long.valueOf(1513763634542L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

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
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html style=\"font-size: 128.068px;\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=no,shrink-to-fit=no\">\r\n");
      out.write("<meta name=\"screen-orientation\" content=\"portrait\">\r\n");
      out.write("<meta name=\"x5-orientation\" content=\"portrait\">\r\n");
      out.write("<meta name=\"format-detection\" content=\"email=no\">\r\n");
      out.write("<meta name=\"format-detection\" content=\"telephone=no\">\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/others/ecard/css/compressed/share_index.css\">\r\n");
      out.write("<title>电子名片分享</title>\r\n");
      out.write("<style type=\"text/css\"></style>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/others/ecard/js/compressed/static_switch.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/jquery/jquery-3.1.1.min.js\" ></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    $(function () {             \r\n");
      out.write("            //绑定滚动条事件 \r\n");
      out.write("              //绑定滚动条事件 \r\n");
      out.write("            $(window).bind(\"scroll\", function () { \r\n");
      out.write("                var sTop = $(window).scrollTop(); \r\n");
      out.write("                var sTop = parseInt(sTop); \r\n");
      out.write("                if (sTop >= 130) { \r\n");
      out.write("                    if (!$(\"#anchor\").is(\":visible\")) { \r\n");
      out.write("                        try { \r\n");
      out.write("                            $(\"#anchor\").slideDown(); \r\n");
      out.write("                        } catch (e) { \r\n");
      out.write("                            $(\"#anchor\").show(); \r\n");
      out.write("                        }                       \r\n");
      out.write("                    } \r\n");
      out.write("                } \r\n");
      out.write("                else { \r\n");
      out.write("                    if ($(\"#anchor\").is(\":visible\")) { \r\n");
      out.write("                        try { \r\n");
      out.write("                            $(\"#anchor\").slideUp(); \r\n");
      out.write("                        } catch (e) { \r\n");
      out.write("                            $(\"#anchor\").hide(); \r\n");
      out.write("                        }                        \r\n");
      out.write("                    } \r\n");
      out.write("                }  \r\n");
      out.write("            });\r\n");
      out.write("        }); \r\n");
      out.write("    function upArrow(){\r\n");
      out.write("    \t$(\"[name='downItem']\").hide();\r\n");
      out.write(" \t  \t$(\"#downArrow\").show();\r\n");
      out.write(" \t  \t$(\"#upArrow\").hide();\r\n");
      out.write("    }\r\n");
      out.write(" \tfunction downArrow(){\r\n");
      out.write(" \t   \t$(\"[name='downItem']\").show();\r\n");
      out.write(" \t  \t$(\"#downArrow\").hide();\r\n");
      out.write(" \t  \t$(\"#upArrow\").show();\r\n");
      out.write("    }\r\n");
      out.write(" \tfunction showImage(){\r\n");
      out.write(" \t  \t$(\"#full_img_wrapper\").show();\r\n");
      out.write("    }\r\n");
      out.write(" \tfunction hiddeImg(){\r\n");
      out.write(" \t  \t$(\"#full_img_wrapper\").hide();\r\n");
      out.write("    }\r\n");
      out.write(" \t\r\n");
      out.write(" \tfunction saveCard(){\r\n");
      out.write(" \t\t$(\"#saveCard\").show();\r\n");
      out.write(" \t}\r\n");
      out.write(" \t\r\n");
      out.write(" \tfunction hiddeCard(){\r\n");
      out.write(" \t\t$(\"#saveCard\").hide();\r\n");
      out.write(" \t}\r\n");
      out.write("    \r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"overflow-y: auto;\">\r\n");
      out.write("\t<img class=\"hidden_ele\" src=\"\">\r\n");
      out.write("\t<div class=\"main\" id=\"main\">\r\n");
      out.write("\t\t<div class=\"mask hidden_ele\" id=\"mask\"></div>\r\n");
      out.write("\t\t<div class=\"rem\"></div>\r\n");
      out.write("\t\t<div class=\"fixed_loading_view\" style=\"display: none;\">\r\n");
      out.write("\t\t\t<div class=\"rotate\"></div>\r\n");
      out.write("\t\t\t<div class=\"logo_blue\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"sg_layout vm_share vm_detail\">\r\n");
      out.write("\t\t\t<!--头部信息 + 锚点-->\r\n");
      out.write("\t\t\t<div class=\"head_wrapper\">\r\n");
      out.write("\t\t\t\t<div class=\"head_banner\" style=\"background-image: url(https://static.intsig.net/ecard/images/ecard/banner01.jpg)\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"head_info\">\r\n");
      out.write("\t\t\t\t\t<div class=\"avatar_wrapper\">\r\n");
      out.write("\t\t\t\t\t\t<img class=\"avatar\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/vistor/avatarView/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staffInfor.accId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(".jpg\" onerror=\"this.src='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/others/ecard/images/ecard/downfile.jpg'\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"username hidelong\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staffInfor.realName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"contact\" style=\"padding-top: 40px; \"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"contact_wrapper show_all\" style=\"text-align: left;\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"contact_item telephone extend \" href=\"tel:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staffInfor.mobile }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"contact_icon icon-phone\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"contact_info\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"value\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staffInfor.mobile }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"label\" >手机</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"extend_icon icon-arrow_right\"></div>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<a name=\"downItem\" style=\"display: none;\" class=\"contact_item telephone extend  contact_sub\" href=\"tel:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staffInfor.telphone }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"contact_icon icon-telephone\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"contact_info\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"value\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staffInfor.telphone }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"label\">电话</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"extend_icon icon-arrow_right\"></div>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<a name=\"downItem\" style=\"display: none;\" class=\"contact_item telephone extend  contact_sub\" >\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"contact_icon icon-fax\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"contact_info\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"value\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staffInfor.fax }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"label\">传真</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"extend_icon icon-arrow_right\"></div>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"contact_item\" href=\"mailto:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staffInfor.email }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"contact_icon icon-message\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"contact_info\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"value\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staffInfor.email }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"label\">邮箱</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"contact_item\" >\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"contact_icon icon-location\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"contact_info\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"value\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staffInfor.address }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"label\">地址</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"contact_item company extend\" data-name=\"中建材信云智联科技有限公司\" data-id=\"b9c255d6-93fb-4d34-ada7-3a0c5ef81256\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"contact_icon icon-company\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"contact_info\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"value\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staffInfor.compName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"title\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staffInfor.title }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("<span class=\"pipes\"></span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staffInfor.department }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"label company\">公司</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<a name=\"downItem\" style=\"display: none;\" class=\"contact_item contact_sub\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staffInfor.website }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"contact_icon icon-website\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"contact_info\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"value\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staffInfor.website }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"label\">网址</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"upArrow\" class=\"fold_tool ib show_all\" style=\"display: none;\" onclick=\"upArrow()\">\r\n");
      out.write("\t\t\t\t\t\t<span >收起 ▲</span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"downArrow\" class=\"fold_tool ib show_all\" onclick=\"downArrow()\">\r\n");
      out.write("\t\t\t\t\t\t<span >展开全部▼</span><br>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"anchor\">\r\n");
      out.write("\t\t\t\t\t\t<div id=\"fixed_guide\" class=\"fixed_guide ib\" style=\"display: block;\">\r\n");
      out.write("\t\t\t\t\t\t<div id=\"card_image\" class=\"item card_image\" data-id=\"card_image\" onclick=\"showImage()\">名片图像</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"item contacts_info\" data-id=\"contacts_info\"><a class=\"scroll\" href=\"#\">名片信息</a></div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"item \" data-id=\"company_info\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: inline-block;\"><a class=\"scroll\" href=\"#company\">企业简介</a></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--企业背景 企业产品 企业知识产权 商业需求 工作经历 教育经历 个人专利 个人成就 企业公众号-->\r\n");
      out.write("\t\t\t<div sg-view=\"\" class=\"vm_extend\">\r\n");
      out.write("\t\t\t\t<div class=\"card_wrapper company_info\">\r\n");
      out.write("\t\t\t\t<div id=\"company\" style=\"padding-top: 40px;background-color: rgb(255, 255, 255); \"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"card_title\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"card_wrapper\">\r\n");
      out.write("\t\t\t\t\t\t<div sg-view=\"\" class=\"vm_companybg\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"company_img\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/others/ecard/images/ecard/downfile2.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"company_info\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"name hidelong\">中建材信云智联科技有限公司</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"info hidelong\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"extend_icon icon-number\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span>301~500人</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"extend_icon icon-coin\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span >10000 万人民币</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"extend_icon icon-time\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span>2017-08-02成立</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"tags\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"tag\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"corner_tl\"></span> <span class=\"corner_tr\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"corner_bl\"></span> <span class=\"corner_br\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${briefInfor.title }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"desc_wrap\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"desc\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${briefInfor.articleContent }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"btn_desc\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"unfold\" style=\"display: block;\"style=\"display: none;\"><span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"gray3\">……</span>全文</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"fold\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tstyle=\"display: inline;\">收起</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"card_wrapper card_image\">\r\n");
      out.write("\t\t\t\t<div class=\"card_title\"></div>\r\n");
      out.write("\t\t\t\t<div sg-view=\"\" class=\"vm_cardphoto\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"card_wrap\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"items\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"items_inner\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"corner_tl\"></span> <span class=\"corner_tr\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"corner_bl\"></span> <span class=\"corner_br\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"card_mask\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"img\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img class=\"img_inner\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/vistor/toUserCard/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staffInfor.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(".png\" style=\"width:100%; height:100%; margin-top: -2.13333px; margin-left: 0px; visibility: visible;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div onclick=\"hiddeImg()\" id=\"full_img_wrapper\" class=\"full_img_wrapper\" style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"imgs_mask \"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"width: 100%; transform: translateX(0%);\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"img_wrapper\" style=\"width: 100%;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"full_img\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/vistor/toUserCard/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staffInfor.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"width: 482px; height: 267.108px; margin-left: 0px; margin-top: 100px; visibility: visible;\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div onclick=\"hiddeCard()\" id=\"saveCard\" class=\"full_img_wrapper\" style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"img_wrapper\" style=\"width: 100%;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div style=\"text-align: center;color:#FFF;margin-top: 200px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span style=\"font-size:20px;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staffInfor.realName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("的名片</span><br/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img class=\"full_img\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/vistor/toUserAdress/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staffInfor.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(".png\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<br/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span style=\"font-size:10px\">长按识别二维码</span><br/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span style=\"font-size:10px\">保存到通讯录</span>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"btns_wrap not_wx ib\" style=\"background:#FFF\">\r\n");
      out.write("\t\t\t\t<div onclick=\"saveCard()\" class=\"btn_right\">保存到通讯录</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<span class=\"notification hidden_ele\"> <span class=\"notice_img\"></span>\r\n");
      out.write("\t\t<span class=\"notice_text\"></span>\r\n");
      out.write("\t</span>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /WEB-INF/view/staffInfor/share.jsp(16,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("ctx");
    // /WEB-INF/view/staffInfor/share.jsp(16,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/view/staffInfor/share.jsp(16,0) '${pageContext.request.contextPath}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }
}
