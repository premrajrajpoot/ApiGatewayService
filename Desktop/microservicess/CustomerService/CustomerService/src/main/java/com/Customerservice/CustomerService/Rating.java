package com.Customerservice.CustomerService;

public class Rating {
	private String RatingId;
	private String userId;
	private String hotalId;
	private int rating;
	private String feedback;

private Hotal hotal;

public Rating() {
	super();
	// TODO Auto-generated constructor stub
}



public Rating(String RatingId, String userId, String hotalId, int rating, String feedback, Hotal hotal) {
	super();
	this.RatingId = RatingId;
	this.userId = userId;
	this.hotalId = hotalId;
	this.rating = rating;
	this.feedback = feedback;
	this.hotal = hotal;
}
public Hotal getHotal() {
	return hotal;
}
public void setHotal(Hotal hotal) {
	this.hotal = hotal;
}
public String getRatingId() {
	return RatingId;
}
public void setRatingId(String ratingId) {
	this.RatingId = ratingId;
}
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public String gethotalId() {
	return hotalId;
}
public void setHotelId(String hotalId) {
	this.hotalId = hotalId;
}
public int getRating() {
	return rating;
}
public void setRating(int rating) {
	this.rating = rating;
}
public String getFeedback() {
	return feedback;
}
public void setFeedback(String feedback) {
	this.feedback = feedback;
}
@Override
public String toString() {
	return "Rating [ratingId=" + RatingId + ", userId=" + userId + ", hotalId=" + hotalId + ", rating=" + rating
			+ ", feedback=" + feedback + "]";
}



}
