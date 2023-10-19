package org.home.GetPersonService;

import org.springframework.web.bind.annotation.*;

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
}

