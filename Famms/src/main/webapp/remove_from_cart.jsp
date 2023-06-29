<%@page import="com.dao.CartDao"%>
<%@page import="com.bean.Cart"%>
<%@page import="com.dao.WishlistDao"%>
<%@page import="com.bean.Wishlist"%>
<%
int pid = Integer.parseInt(request.getParameter("pid"));
int uid = Integer.parseInt(request.getParameter("uid"));

Cart c = new Cart();
c.setPid(pid);
c.setUid(uid);
CartDao.removeFromCart(c);
response.sendRedirect("mycart.jsp");
%>