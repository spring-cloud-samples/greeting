/*
 * Copyright 2017-Present the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package messages;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessagesController {

	private Log log = LogFactory.getLog(MessagesController.class);

	@RequestMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "salutation", defaultValue = "Hello") String salutation, @RequestParam(value = "name", defaultValue = "Bob") String name) {
		log.info(String.format("Now saying \"%s\" to %s", salutation, name));
		return new Greeting(salutation, name);
	}

}
