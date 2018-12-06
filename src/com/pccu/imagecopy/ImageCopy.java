package com.pccu.imagecopy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			fis = new FileInputStream("src/image/Creed.jpg");
			fos = new FileOutputStream("src/image/ClonedCreed.jpg");
			int flag = 0;
			while ((flag = fis.read()) != -1) {
				fos.write(flag);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
