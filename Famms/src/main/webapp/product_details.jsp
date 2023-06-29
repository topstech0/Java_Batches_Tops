<%@page import="com.dao.CartDao"%>
<%@page import="com.dao.WishlistDao"%>
<%@page import="com.dao.ProductDao"%>
<%@page import="com.bean.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
   <head>
      
   </head>
   <body>

     
      
      
      
      <!-- product section -->
      <section class="product_section layout_padding">
         <div class="container">
            <div class="heading_container heading_center">
               <h2>
                  Our <span>products</span>
               </h2>
            </div>
             <div class="row">
            <%
            	int pid = Integer.parseInt(request.getParameter("pid"));
            	Product p = ProductDao.getProductById(pid);            	
            %>
           
               <div class="col-sm-8 col-md-5 col-lg-6">
                  <div class="box">
                     <div class="option_container">
                        <div class="options">
                        
                        
                           
                           
                           <%
                           
                           if(session.getAttribute("u")!=null)
                           {
                        	   boolean flag = WishlistDao.checkWishlist(u.getUid(), p.getPid());
                        	   boolean flag1 = CartDao.checkCart(u.getUid(), p.getPid());
                        	   if(flag ==false)
                        	   {
                        	%>
                        	
                        	<a href="add_to_wishlist.jsp?pid=<%=p.getPid()%>&uid=<%=u.getUid()%>" class="option2">
                          Add to Wishlist
                           </a>
                        	<%
                        		   
                        	   }
                        	   else
                        	   {
                        	%>
                        	<a href="remove_from_wishlist.jsp?pid=<%=p.getPid()%>&uid=<%=u.getUid()%>" class="option2">
                          Remove from Wishlist
                           </a>
                        	
                        	<%	   
                        	   }
                        	   
                        	   if(flag1==false)
                        	   {
                        	%>
                        	<a href="add_to_cart.jsp?pid=<%=p.getPid()%>&uid=<%=u.getUid()%>" class="option1">
                          Add to Cart
                           </a>
                        	<%   
                        	   }
                        	   else
                        	   {
                        	%>
                        	<a href="remove_from_cart.jsp?pid=<%=p.getPid()%>&uid=<%=u.getUid()%>" class="option1">
                          Remove from Cart
                           </a>
                        	
                        	<%
                        		   
                        	   }
                        			   
                       	   %>
                        
                         
                       		 <%
                        	   
                           }
                           else
                           {
                        	 %>
                        	  <a href="login.jsp" class="option1">
                          Login
                           </a>
                        	 
                        	 <%
                        	   
                           }
                           
                           %>
                           
                           
                            
                        </div>
                     </div>
                     <div class="img-box">
                        <img src="Product_Images/<%=p.getP_image() %>" >
                     </div>
                     <div class="detail-box">
                        <h5>
                           <b>Category : </b><%=p.getP_category() %>
                        </h5>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        
                        <h6>
                          <b> Price : </b>Rs. <%=p.getP_price() %>
                        </h6>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <h6>
                        	<b>Description : </b><%=p.getP_desc() %>
                        </h6>
                        
                     </div>
                  </div>
               </div>              
           
            
          
             </div>
            
            <div class="btn-box">
               <a href="seller_view_product.jsp">
               View All products
               </a>
            </div>
         </div>
      </section>
      <!-- end product section -->

    
      <!-- footer start -->
      <footer>
         <div class="container">
            <div class="row">
               <div class="col-md-4">
                   <div class="full">
                      <div class="logo_footer">
                        <a href="#"><img width="210" src="images/logo.png" alt="#" /></a>
                      </div>
                      <div class="information_f">
                        <p><strong>ADDRESS:</strong> 28 White tower, Street Name New York City, USA</p>
                        <p><strong>TELEPHONE:</strong> +91 987 654 3210</p>
                        <p><strong>EMAIL:</strong> yourmain@gmail.com</p>
                      </div>
                   </div>
               </div>
               <div class="col-md-8">
                  <div class="row">
                  <div class="col-md-7">
                     <div class="row">
                        <div class="col-md-6">
                     <div class="widget_menu">
                        <h3>Menu</h3>
                        <ul>
                           <li><a href="#">Home</a></li>
                           <li><a href="#">About</a></li>
                           <li><a href="#">Services</a></li>
                           <li><a href="#">Testimonial</a></li>
                           <li><a href="#">Blog</a></li>
                           <li><a href="#">Contact</a></li>
                        </ul>
                     </div>
                  </div>
                  <div class="col-md-6">
                     <div class="widget_menu">
                        <h3>Account</h3>
                        <ul>
                           <li><a href="#">Account</a></li>
                           <li><a href="#">Checkout</a></li>
                           <li><a href="#">Login</a></li>
                           <li><a href="#">Register</a></li>
                           <li><a href="#">Shopping</a></li>
                           <li><a href="#">Widget</a></li>
                        </ul>
                     </div>
                  </div>
                     </div>
                  </div>     
                  <div class="col-md-5">
                     <div class="widget_menu">
                        <h3>Newsletter</h3>
                        <div class="information_f">
                          <p>Subscribe by our newsletter and get update protidin.</p>
                        </div>
                        <div class="form_sub">
                           <form>
                              <fieldset>
                                 <div class="field">
                                    <input type="email" placeholder="Enter Your Mail" name="email" />
                                    <input type="submit" value="Subscribe" />
                                 </div>
                              </fieldset>
                           </form>
                        </div>
                     </div>
                  </div>
                  </div>
               </div>
            </div>
         </div>
      </footer>
      <!-- footer end -->
      <div class="cpy_">
         <p class="mx-auto">© 2021 All Rights Reserved By <a href="https://html.design/">Free Html Templates</a><br>
         
            Distributed By <a href="https://themewagon.com/" target="_blank">ThemeWagon</a>
         
         </p>
      </div>
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