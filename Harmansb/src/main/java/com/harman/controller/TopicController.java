package com.harman.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.harman.model.Topic;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return allTopics();
				//"all the topics";
	}
	
	List<Topic> allTopics(){
		
		return Arrays.asList(
				new Topic("spring","spring framework","description about spring framework"),
				new Topic("java","java framework","description about java framework"),
				new Topic("javascript","javascript framework","description about javascript framework")

				);
	}

}
