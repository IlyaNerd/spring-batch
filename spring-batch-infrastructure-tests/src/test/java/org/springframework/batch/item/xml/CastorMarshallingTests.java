/*
 * Copyright 2010-2014 the original author or authors.
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
package org.springframework.batch.item.xml;

import org.springframework.core.io.ClassPathResource;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.castor.CastorMarshaller;

public class CastorMarshallingTests extends AbstractStaxEventWriterItemWriterTests {

	@Override
	protected Marshaller getMarshaller() throws Exception {

		CastorMarshaller marshaller = new CastorMarshaller();
		// marshaller.setTargetClass(Trade.class);
		marshaller.setMappingLocation(new ClassPathResource("mapping-castor.xml", getClass()));
		// there is no way to call
		// org.exolab.castor.xml.Marshaller.setSupressXMLDeclaration();
		marshaller.afterPropertiesSet();
		return marshaller;
	}

}
