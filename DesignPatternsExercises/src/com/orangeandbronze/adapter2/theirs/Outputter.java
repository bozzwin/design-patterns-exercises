package com.orangeandbronze.adapter2.theirs;

import java.util.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;


public class Outputter {

	public void output(List<Student> students) {
		try {
			JAXBContext jc = JAXBContext.newInstance(Wrapper.class,
					Student.class);
			Marshaller marshaller = jc.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			QName qName = new QName("students");
			Wrapper wrapper1 = new Wrapper(students);
			JAXBElement<Wrapper> jaxbElement = new JAXBElement<Wrapper>(qName,
					Wrapper.class, wrapper1);
			marshaller.marshal(jaxbElement, System.out);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
