<%@page import="com.dao.CartDao"%>
<%@page import="com.bean.Cart"%>
<%@page import="com.dao.WishlistDao"%>
<%@page import="com.bean.Wishlist"%>
<%@page import="com.dao.ProductDao"%>
<%@page import="com.bean.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ include file="header.jsp"%>
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
					Cart <span>products</span>
				</h2>
			</div>
			<div class="row">
			<%
				List<Cart> list = CartDao.getCartByUser(u.getUid());
				for(Cart c : list)
				{
					Product p = ProductDao.getProductById(c.getPid());
			%>
			
			<div class="col-sm-6 col-md-4 col-lg-4">
					<div style="border:3px solid grey">
						<div class="option_container">
							<%-- <div class="options">
								<!-- <a href="" class="option1"> Men's Shirt </a> --> 
								<a href="product_details.jsp?pid=<%=p.getPid() %>"
									class="option2"> Details </a>
							</div> --%>
						</div>
						<br>
						<div >
						<p align="center">
							<img src="Product_Images/<%=p.getP_image() %>" width="200px" height="280px">
							</p>
							<hr>
						<b>Product Category : </b><%=p.getP_category() %>
						<hr>
						<span style="color:red"><b>Product Price : </b></span>Rs. <%=c.getC_price()%>
							<hr>
						</div>
						
						<div >
						<form name="qty" method="post" action="CartController">
							<input type="hidden" name="cid" value="<%=c.getCid()%>">
							<b>Quantity :</b> 					
							<input type="number" name="p_qty" min="1" max="10" value="<%=c.getC_qty()%>" onchange="this.form.submit();">							
							<b>Total Price : </b> <%=c.getTotal_price() %>
						<hr>
						</form>
						</div>
						
						
					</div>
				</div>
			
			<%		
				}
			%>
			
				
			</div>
		</div>
		<div class="btn-box">
			<a href=""> View All products </a>
		</div>
		</div>
	</section>
	<!-- end product section -->

	<!-- subscribe section -->
	<section class="subscribe_section">
		<div class="container-fuild">
			<div class="box">
				<div class="row">
					<div class="col-md-6 offset-md-3">
						<div class="subscribe_form ">
							<div class="heading_container heading_center">
								<h3>Subscribe To Get Discount Offers</h3>
							</div>
							<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit,
								sed do eiusmod tempor</p>
							<form action="">
								<input type="email" placeholder="Enter your email">
								<button>subscribe</button>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- end subscribe section -->
	<!-- client section -->
	<section class="client_section layout_padding">
		<div class="container">
			<div class="heading_container heading_center">
				<h2>Customer's Testimonial</h2>
			</div>
			<div id="carouselExample3Controls" class="carousel slide"
				data-ride="carousel">
				<div class="carousel-inner">
					<div class="carousel-item active">
						<div class="box col-lg-10 mx-auto">
							<div class="img_container">
								<div class="img-box">
									<div class="img_box-inner">
										<img src="images/client.jpg" alt="">
									</div>
								</div>
							</div>
							<div class="detail-box">
								<h5>Anna Trevor</h5>
								<h6>Customer</h6>
								<p>Dignissimos reprehenderit repellendus nobis error
									quibusdam? Atque animi sint unde quis reprehenderit, et,
									perspiciatis, debitis totam est deserunt eius officiis ipsum
									ducimus ad labore modi voluptatibus accusantium sapiente nam!
									Quaerat.</p>
							</div>
						</div>
					</div>
					<div class="carousel-item">
						<div class="box col-lg-10 mx-auto">
							<div class="img_container">
								<div class="img-box">
									<div class="img_box-inner">
										<img src="images/client.jpg" alt="">
									</div>
								</div>
							</div>
							<div class="detail-box">
								<h5>Anna Trevor</h5>
								<h6>Customer</h6>
								<p>Dignissimos reprehenderit repellendus nobis error
									quibusdam? Atque animi sint unde quis reprehenderit, et,
									perspiciatis, debitis totam est deserunt eius officiis ipsum
									ducimus ad labore modi voluptatibus accusantium sapiente nam!
									Quaerat.</p>
							</div>
						</div>
					</div>
					<div class="carousel-item">
						<div class="box col-lg-10 mx-auto">
							<div class="img_container">
								<div class="img-box">
									<div class="img_box-inner">
										<img src="images/client.jpg" alt="">
									</div>
								</div>
							</div>
							<div class="detail-box">
								<h5>Anna Trevor</h5>
								<h6>Customer</h6>
								<p>Dignissimos reprehenderit repellendus nobis error
									quibusdam? Atque animi sint unde quis reprehenderit, et,
									perspiciatis, debitis totam est deserunt eius officiis ipsum
									ducimus ad labore modi voluptatibus accusantium sapiente nam!
									Quaerat.</p>
							</div>
						</div>
					</div>
				</div>
				<div class="carousel_btn_box">
					<a class="carousel-control-prev" href="#carouselExample3Controls"
						role="button" data-slide="prev"> <i
						class="fa fa-long-arrow-left" aria-hidden="true"></i> <span
						class="sr-only">Previous</span>
					</a> <a class="carousel-control-next" href="#carouselExample3Controls"
						role="button" data-slide="next"> <i
						class="fa fa-long-arrow-right" aria-hidden="true"></i> <span
						class="sr-only">Next</span>
					</a>
				</div>
			</div>
		</div>
	</section>
	<!-- end client section -->
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
							<p>
								<strong>ADDRESS:</strong> 28 White tower, Street Name New York
								City, USA
							</p>
							<p>
								<strong>TELEPHONE:</strong> +91 987 654 3210
							</p>
							<p>
								<strong>EMAIL:</strong> yourmain@gmail.com
							</p>
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
												<input type="email" placeholder="Enter Your Mail"
													name="email" /> <input type="submit" value="Subscribe" />
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
		<p class="mx-auto">
			� 2021 All Rights Reserved By <a href="https://html.design/">Free
				Html Templates</a><br> Distributed By <a
				href="https://themewagon.com/" target="_blank">ThemeWagon</a>

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