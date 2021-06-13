package com.mahesh.models;

public class Topic {
	
	public String id;
	public String topic;
	public String description;
	
	public Topic() {
	
	}
	
	public Topic(String id, String topic, String description) {
		super();
		this.id = id;
		this.topic = topic;
		this.description = description;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
