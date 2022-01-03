package net.viv.school.utility;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import net.viv.school.utility.FileUploadUtility;

public class FileUploadUtility {

	private static final String ABS_PATH = "D:/spring/school/school/src/main/webapp/assets/images/";
	private static String REAL_PATH = null;
	private static final Logger logger = LoggerFactory.getLogger(FileUploadUtility.class);

	public static boolean uploadFile(HttpServletRequest request, MultipartFile file, String code) {
		// get the real server path
		REAL_PATH = request.getSession().getServletContext().getRealPath("/assets/images/");

		logger.info(REAL_PATH);
		// create the directories if it does not exist

		if (!new File(REAL_PATH).exists()) {
			new File(REAL_PATH).mkdirs();
		}

		if (!new File(ABS_PATH).exists()) {
			new File(ABS_PATH).mkdirs();
		}

		try {
			// transfer the file to both the location
			file.transferTo(new File(REAL_PATH + code + ".jpg"));
			file.transferTo(new File(ABS_PATH + code + ".jpg"));
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return true;
	}

}
