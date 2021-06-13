package com.mahesh.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mahesh.models.Topic;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
				new Topic("1", "Topic Name1", "Topic Description1"),
				new Topic("2", "Topic Name2", "Topic Description2"),
				new Topic("3", "Topic Name3", "Topic Description3")
				
				
				);
	}

}
