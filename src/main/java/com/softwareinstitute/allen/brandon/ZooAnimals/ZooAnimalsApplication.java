package com.softwareinstitute.allen.brandon.ZooAnimals;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@SpringBootApplication
@RestController
public class ZooAnimalsApplication {

	static AnimalRepository animalList = new AnimalRepository();

	public static void main(String[] args) {
		animalList.add();
		SpringApplication.run(ZooAnimalsApplication.class, args);
	}

	@GetMapping("/allAnimals")
	public String allAnimals(){
		return animalList.toStringJSON(animalList.getAll());
	}

	@PutMapping("/add/{name}/{colour}/{age}/{alive}")
	@ResponseBody
	public void add(@PathVariable Map<String, String> pathVariables) {
		animalList.addAnimal(new Cat(Boolean.parseBoolean(pathVariables.get("alive")), Integer.parseInt(pathVariables.get("age")), pathVariables.get("name"), pathVariables.get("colour")));
	}

	@GetMapping("/test")
	public @ResponseBody String testHttpResponse() {
		return "New Test";
	}

	@GetMapping("/search/{name}")
	public @ResponseBody String getAnimalName(@PathVariable String name) {
		return animalList.toStringJSON(animalList.searchAnimalByName(name));
	}
}
