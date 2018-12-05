package Mythread;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class CopyFileTest {
	public static void main(String[] args) throws IOException {
		// 源目录
		// File src = new File("F:\\linux");
		Path dir = Paths.get("D:\\modules");
		// DirectoryStream<Path> stream = Files.newDirectoryStream(dir,
		// "*.txt");
		// for (Path entry : stream) {
		// System.out.println(entry.getFileName());
		// }
		// // 目的地
		// File dest = new File("c:\\");
		// copyFile(src, dest);
		Files.walkFileTree(dir, new FindJavaVisitor());
	}

	private static class FindJavaVisitor extends SimpleFileVisitor<Path> {
		public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
				throws IOException {
			if (file.toString().endsWith("_src.jar")) {
				System.out.println(file.getFileName() + "             "
						+ file.getParent());
				String old1 = file.getParent().toString(); //
				String new1 = old1.replace("modules",
						"home\\home65_0807_full\\home65_0807\\modules");
				File file2 = new File(new1);
				if (!file2.exists()) {
					file2.mkdirs();
				}

				String old2 = old1 + "\\" + file.getFileName();
				String new2 = new1 + "\\" + file.getFileName();

				Path source = Paths.get(old2);
				Path target = Paths.get(new2);
				Files.copy(source, target,
						java.nio.file.StandardCopyOption.REPLACE_EXISTING);

			}
			return FileVisitResult.CONTINUE;

		}
	}

	public static void copyFile(File src, File dest) throws IOException {
		// 在目的地创建文件夹 c:\\Test\\day09\\avi
		File newFile = new File(dest, src.getName());
		// 判断拼接成的路径是否存在
		if (!newFile.exists()) {
			newFile.mkdirs();
		}
		// 获取源目录中的所有的文件和文件夹
		File[] files = src.listFiles();
		for (File file : files) {
			if (file.isFile()) {
				// 开始复制文件
				FileInputStream fis = new FileInputStream(file);
				// c:\\Test\\day09\\ppt
				FileOutputStream fos = new FileOutputStream(new File(newFile,
						file.getName()));
				byte[] b = new byte[1024];
				int len;
				while ((len = fis.read(b)) != -1) {
					fos.write(b, 0, len);
				}

				fos.close();
				fis.close();

			} else if (file.isDirectory()) {
				copyFile(file, newFile);
			}
		}
	}
}
