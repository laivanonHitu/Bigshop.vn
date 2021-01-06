package com.DienThoaiGiaRe.util;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class FileUploadUtil {

	public String uploadFile(HttpServletRequest request, HttpSession httpSession, CommonsMultipartFile fileImageUpload)
			throws IOException {
		String path = httpSession.getServletContext().getRealPath("/") + "assets/web/image/product/";
		String fileImg = fileImageUpload.getOriginalFilename();
		// print path location path file saved
		System.out.println(path + " " + fileImg);
		//=====================================
		try {
			byte barr[] = fileImageUpload.getBytes();
			BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(path + "/" + fileImg));
			bout.write(barr);
			bout.flush();
			bout.close();
			return fileImg;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
}