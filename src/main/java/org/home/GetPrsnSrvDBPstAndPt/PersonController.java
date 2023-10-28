package org.home.GetPrsnSrvDBPstAndPt;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
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

	@PostMapping(consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(HttpStatus.CREATED)
	public void createPerson(@Valid @RequestBody PersonRequest request){
		personService.createPerson(request.getFirstName(),request.getLastName(),
				request.getAge());
	}

	@PutMapping(consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void updatePerson(@Valid @RequestBody PersonRequest request, @PathVariable int personId){
		personService.updatePerson(request.getFirstName(),request.getLastName(),
				request.getAge(), personId);
	}
}

