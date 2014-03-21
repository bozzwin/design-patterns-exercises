package com.orangeandbronze.strategy;

import java.io.File;
import java.util.List;

interface FileFormat {

	List<Student> unmarshal(File file) throws Exception;

}