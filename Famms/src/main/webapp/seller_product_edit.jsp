<%@page import="com.dao.ProductDao"%>
<%@page import="com.bean.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="seller_header.jsp" %>
<!DOCTYPE html>
<html>
   <head>
     
   </head>
   <body class="sub_page">
      <div class="hero_area">
         
      </div>
      <!-- inner page section -->
      <section class="inner_page_head">
         <div class="container_fuild">
            <div class="row">
               <div class="col-md-12">
                  <div class="full">
                     <h3>Edit Products</h3>
                  </div>
               </div>
            </div>
         </div>
      </section>
      <!-- end inner page section -->
      <!-- why section -->
      <section class="why_section layout_padding">
         <div class="container">
     <h6>    
         <%
         	if(request.getAttribute("msg")!=null)
         	{
         		out.println(request.getAttribute("msg"));
         	}
         	
         %>
      </h6>
            <div class="row">
               <div class="col-lg-8 offset-lg-2">
                  <div class="full">
                  <%
                  int pid = Integer.parseInt(request.getParameter("pid"));
                  Product p = ProductDao.getProductById(pid);
                  	
                  %>
                  
                     <form action="ProductController" name="update_product" method="post">
                     <input type="hidden" name="uid" value="<%=u.getUid()%>">
                    <input type="hidden" name="pid" value="<%=p.getPid()%>">
                     
                     	<table>
                           <tr>
                           <td><b>Product Category : </b></td>
                           <td></td>
                           
                           <%
                           	if(p.getP_category().equals("children"))
                           	{
                           %>
                           <td>
                           		<input type="radio" name="p_category" value="children" checked="checked"/>Childrens
                           		</td>
                           		<td>
                           <input type="radio" name="p_category" value="women"/>Women's 
                           </td>
                           <td>
                           <input type="radio" name="p_category" value="men"/>Men's
                           </td>
                           
                           <%
                           		
                           	}
                           	else if(p.getP_category().equals("women"))
                           	{
                           %>
                           
                           <td>
                           		<input type="radio" name="p_category" value="children"/>Childrens
                           		</td>
                           		<td>
                           <input type="radio" name="p_category" value="women" checked="checked"/>Women's 
                           </td>
                           <td>
                           <input type="radio" name="p_category" value="men"/>Men's
                           </td>
                           
                           <%		
                           	}
                           	else if(p.getP_category().equals("men"))
                           	{
                           %>
                           <td>
                           		<input type="radio" name="p_category" value="children"/>Childrens
                           		</td>
                           		<td>
                           <input type="radio" name="p_category" value="women"/>Women's 
                           </td>
                           <td>
                           <input type="radio" name="p_category" value="men" checked="checked"/>Men's
                           </td>
                           
                           <%		
                           	}
                           	else
                           	{
                           %>
                           <td>
                           		<input type="radio" name="p_category" value="children"/>Childrens
                           		</td>
                           		<td>
                           <input type="radio" name="p_category" value="women"/>Women's 
                           </td>
                           <td>
                           <input type="radio" name="p_category" value="men"/>Men's
                           </td>
                           <%		
                           	}
                           	
                           
                           %>
                           
                           </tr>
                           
                           </table>
                           <br>
                        <fieldset>
                           <input type="text" placeholder="Enter Product Name" name="p_name" value="<%=p.getP_name() %>" />
                           <input type="text" placeholder="Enter Product Model" name="p_model" value="<%=p.getP_model() %>" />
                           <input type="text" placeholder="Enter Product Price" name="p_price" value="<%=p.getP_price() %>" />                           
                           <img  name="p_image" src="Product_Images/<%=p.getP_image() %>" width="200px" height="200px"/>                                                     
                           <textarea placeholder="Enter Product Description" name="p_desc"><%=p.getP_desc() %></textarea>
                           <input type="submit" value="Update Product" name="action"/>
                        </fieldset>
                     </form>
                  </div>
               </div>
            </div>
         </div>
      </section>
      <!-- end why section -->
      
      <!-- footer section -->
      <footer class="footer_section">
         <div class="container">
            <div class="row">
               <div class="col-md-4 footer-col">
                  <div class="footer_contact">
                     <h4>
                        Reach at..
                     </h4>
                     <div class="contact_link_box">
                        <a href="">
                        <i class="fa fa-map-marker" aria-hidden="true"></i>
                        <span>
                        Location
                        </span>
                        </a>
                        <a href="">
                        <i class="fa fa-phone" aria-hidden="true"></i>
                        <span>
                        Call +01 1234567890
                        </span>
                        </a>
                        <a href="">
                        <i class="fa fa-envelope" aria-hidden="true"></i>
                        <span>
                        demo@gmail.com
                        </span>
                        </a>
                     </div>
                  </div>
               </div>
               <div class="col-md-4 footer-col">
                  <div class="footer_detail">
                     <a href="index.html" class="footer-logo">
                     Famms
                     </a>
                     <p>
                        Necessary, making this the first true generator on the Internet. It uses a dictionary of over 200 Latin words, combined with
                     </p>
                     <div class="footer_social">
                        <a href="">
                        <i class="fa fa-facebook" aria-hidden="true"></i>
                        </a>
                        <a href="">
                        <i class="fa fa-twitter" aria-hidden="true"></i>
                        </a>
                        <a href="">
                        <i class="fa fa-linkedin" aria-hidden="true"></i>
                        </a>
                        <a href="">
                        <i class="fa fa-instagram" aria-hidden="true"></i>
                        </a>
                        <a href="">
                        <i class="fa fa-pinterest" aria-hidden="true"></i>
                        </a>
                     </div>
                  </div>
               </div>
               <div class="col-md-4 footer-col">
                  <div class="map_container">
                     <div class="map">
                        <div id="googleMap"></div>
                     </div>
                  </div>
               </div>
            </div>
            <div class="footer-info">
               <div class="col-lg-7 mx-auto px-0">
                  <p>
                     &copy; <span id="displayYear"></span> All Rights Reserved By
                     <a href="https://html.design/">Free Html Templates</a><br>
         
                     Distributed By <a href="https://themewagon.com/" target="_blank">ThemeWagon</a>
                  </p>
               </div>
            </div>
         </div>
      </footer>
      <!-- footer section -->
      <!-- jQery -->
      <script src="js/jquery-3.4.1.min.js"></script>
      <!-- popper js -->
      <script src="js/popper.min.js"></script>
      <!-- bootstrap js -->
      <script src="js/bootstrap.js"></script>
      <!-- custom js -->
      <script src="js/custom.js"></script>
   </body>
</html>