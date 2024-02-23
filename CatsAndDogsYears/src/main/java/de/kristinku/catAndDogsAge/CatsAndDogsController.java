package de.kristinku.catAndDogsAge;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatsAndDogsController {
	
	private CatsAndDogsAgeService catsAndDogsAgeService;
	
	CatsAndDogsController(CatsAndDogsAgeService catsAndDogsAgeService) {
		this.catsAndDogsAgeService = catsAndDogsAgeService;
	}
	
	@PostMapping("/age")
	public int[] calculateCatAndDogYears(@RequestBody CalculateCatAndDogAgeRequest request) {
		return catsAndDogsAgeService.ownedCatAndDog(request.getCatYears(), request.getDogYears());
	}

}
