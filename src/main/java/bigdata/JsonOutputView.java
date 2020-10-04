package bigdata;

import org.codehaus.jackson.map.annotate.JsonView;

public class JsonOutputView {


    @JsonView(JsonOutputView.class)
    private String reviewerID;


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

    public String getReviewerID() {
        return reviewerID;
    }

    public void setReviewerID(String reviewerID) {
        this.reviewerID = reviewerID;
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
	
}
