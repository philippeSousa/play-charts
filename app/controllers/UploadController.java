package controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.IOUtils;

import play.mvc.Controller;

public class UploadController extends Controller {

	public static void uploadReport(File file) {
		String fileName = file.getName();
		try {
			FileInputStream is = new FileInputStream(file);
			// IOUtils.copy(is, new FileOutputStream(Play.getFile(fileName)));
			IOUtils.copy(is, new FileOutputStream("./" + fileName));

			GraphController.createGraphs();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
