package org.home.GetPrsnSrvHiber;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/people", produces = MediaType.APPLICATION_JSON_VALUE)
public class PersonController {
	@Autowired
	PersonDao personDao;

	@GetMapping("/all")
	public List<Person> getAllPeople() {
		return personDao.getAll();
	}

	@GetMapping("/{personId:\\d+}")
	public Person getPerson(@PathVariable int personId) {
		return personDao.getPersonById(personId);
	}
}

