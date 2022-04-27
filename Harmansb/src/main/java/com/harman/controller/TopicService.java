package com.harman.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import com.harman.model.Topic;

//serve the customer with data
@Service
public class TopicService {
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("spring","spring framework","description about spring framework"),
			new Topic("java","java framework","description about java framework"),
			new Topic("javascript","javascript framework","description about javascript framework")

			));
	
	public List<Topic> getAllTopics() {
		return topics;
	}
	

	public Topic getTopic(String tid) {
		Predicate<Topic> filterTopic = (topic)->{ return topic.getId().equals(tid);};
	
		return	topics.stream()
		.filter(
				topic -> topic.getId().equals(tid))
		.findFirst()
		.get();
		
	}


	public void addTopic(Topic topic) {
		topics.add(topic);
	}


	public void updateTopic(Topic topicReceived, String idReceived) {
			for(int i = 0; i < topics.size(); i++) {
				Topic topik = topics.get(i);
				if(topik.getId().equals(idReceived)) {
					topics.set(i, topicReceived);
				}
			}
	}


	public void deleteTopic(String id) {
		topics.removeIf(topic -> topic.getId().equals(id));
	}

}
