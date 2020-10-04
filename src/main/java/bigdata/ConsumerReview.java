package bigdata;

import java.util.ArrayList;

import org.codehaus.jackson.map.annotate.JsonView;

/**
 * 
 * This class is a simple JAVA POJO that represents a costumer review.
 * 
 * @author
 *
 */
/**
 * @author fakhri
 *
 */
public class ConsumerReview {

	@JsonView(JsonOutputView.class)
	private String reviewerID;

	private String asin;
	private String reviewerName;
	private ArrayList<Integer> helpful;
	
	@JsonView(JsonOutputView.class)
	private String reviewText;

	@JsonView(JsonOutputView.class)
	private Double overall;
	
	@JsonView(JsonOutputView.class)
	private String summary;
	
	@JsonView(JsonOutputView.class)
	private Long unixReviewTime;

	@JsonView(JsonOutputView.class)
	private String reviewTime;

	@JsonView(JsonOutputView.class)
	private String region;

	@JsonView(JsonOutputView.class)
	private String categoryname;
	
	public ConsumerReview() {
		this.helpful = new ArrayList<Integer>();
	}

	public String getReviewerID() {
		return reviewerID;
	}

	public void setReviewerID(String reviewerID) {
		this.reviewerID = reviewerID;
	}

	public String getAsin() {
		return asin;
	}

	public void setAsin(String asin) {
		this.asin = asin;
	}

	public String getReviewerName() {
		return reviewerName;
	}

	public void setReviewerName(String reviewerName) {
		this.reviewerName = reviewerName;
	}

	public ArrayList<Integer> getHelpful() {
		return helpful;
	}

	public void setHelpful(ArrayList<Integer> helpful) {
		this.helpful = helpful;
	}

	public String getReviewText() {
		return reviewText;
	}

	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
	}

	public Double getOverall() {
		return overall;
	}

	public void setOverall(Double overall) {
		this.overall = overall;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public Long getUnixReviewTime() {
		return unixReviewTime;
	}

	public void setUnixReviewTime(Long unixReviewTime) {
		this.unixReviewTime = unixReviewTime;
	}

	public String getReviewTime() {
		return reviewTime;
	}

	public void setReviewTime(String reviewTime) {
		this.reviewTime = reviewTime;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}
	
	public String getCategoryname() {
		return categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	
	@Override
	public String toString() {
		return "ConsumerReview [reviewerID=" + reviewerID + ", categoryname=" + categoryname +", asin=" + asin + ", reviewerName=" + reviewerName
				+ ", helpful=" + helpful + ", reviewText=" + reviewText + ", overall=" + overall + ", summary="
				+ summary + ", unixReviewTime=" + unixReviewTime + ", reviewTime=" + reviewTime + ", region=" + region
				+ "]";
	}

}
