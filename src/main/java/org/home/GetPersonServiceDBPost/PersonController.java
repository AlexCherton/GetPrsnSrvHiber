package org.home.GetPersonServiceDBPost;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/people")
public class PersonController {
	PersonService personService;

	public PersonController(PersonService personService) {
		this.personService = personService;
	}

	@GetMapping("/{personId:\\d+}")
	public Person getPerson(@PathVariable int personId) {
		return personService.getPerson(personId);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void createPerson(@Valid @RequestBody PersonRequest request){
		personService.createPerson(request.getFirstName(),request.getLastName(),
				request.getAge());
	}
}

