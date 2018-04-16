package sairam.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

import io.netty.handler.codec.http.HttpMethod;

@EnableDiscoveryClient
@RestController
@SpringBootApplication
public class ClientApplication {

	@Autowired
	private EurekaClient client;
	
	private RestTemplateBuilder rtb;
	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}
	
	@RequestMapping("/")
	public String callService()
	{
		RestTemplate rt = rtb.build(); 
		InstanceInfo Inst = client.getNextServerFromEureka("service", false);
		String baseUrl = Inst.getHomePageUrl();
		ResponseEntity<String> response = rt.exchange(baseUrl, HttpMethod.GET, null, String.class); 
		return response.getBody();
								
	}
}
