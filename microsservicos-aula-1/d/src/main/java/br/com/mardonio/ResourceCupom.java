package br.com.mardonio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping(value = "/cupom")
public class ResourceCupom {

	private static final Logger LOG = LoggerFactory.getLogger(ResourceCupom.class);

	private Integer valueCupom;

	@GetMapping("/{cupom}")
	public Integer listar(@PathVariable String cupom) {
		LOG.info(cupom);
		if (cupom.equals("abc")) {
			LOG.info("abc");
			this.valueCupom = 10;
		} else if (cupom.equals("CUPOM20")) {
			LOG.info("cupom20");
			this.valueCupom = 20;
		} else if (cupom.equals("CUPOM50")) {
			LOG.info("cupom50");
			this.valueCupom = 50;
		} else {
			LOG.info("cupom 0");
			this.valueCupom = 0;
		}

		return this.valueCupom;

	}
}