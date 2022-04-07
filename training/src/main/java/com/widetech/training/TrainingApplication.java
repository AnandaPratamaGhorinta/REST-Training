package com.widetech.training;
import java.time.LocalDateTime;  

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.mysql.fabric.xmlrpc.base.Array;
import com.widetech.training.domain.Order;
import com.widetech.training.domain.OrderItem;
import com.widetech.training.repositories.OrderItemRepository;
import com.widetech.training.repositories.OrderRepository;
import com.widetech.training.repositories.RepositoryProduct;
import java.time.format.DateTimeFormatter;
import java.util.List;  
import java.util.ArrayList;
import java.util.Arrays;



@SpringBootApplication
public class TrainingApplication {

	public static void main(String[] args) {
		
		
		SpringApplication.run(TrainingApplication.class, args);
		
	}

}
