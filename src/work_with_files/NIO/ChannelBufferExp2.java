package work_with_files.NIO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferExp2 {
	public static void main(String[] args) {

		try (RandomAccessFile file = new RandomAccessFile("test5.txt", "r");
		     FileChannel channel = file.getChannel();) {

			ByteBuffer byteBuffer = ByteBuffer.allocate(5);
			channel.read(byteBuffer);
			byteBuffer.flip();
			System.out.println((char) byteBuffer.get()); // a
			System.out.println((char) byteBuffer.get()); // b
			System.out.println((char) byteBuffer.get()); // c
			byteBuffer.rewind();
			System.out.println((char) byteBuffer.get()); // a

			System.out.println("-----------");
			byteBuffer.compact();
			channel.read(byteBuffer);
			byteBuffer.flip();

			while (byteBuffer.hasRemaining()) {
				System.out.println((char) byteBuffer.get());
			}

			System.out.println("-----------");
			byteBuffer.clear();
			channel.read(byteBuffer);
			byteBuffer.flip();
			System.out.println((char) byteBuffer.get()); // g
			byteBuffer.mark();
			System.out.println((char) byteBuffer.get());
			System.out.println((char) byteBuffer.get());
			byteBuffer.reset();

			while (byteBuffer.hasRemaining()) {
				System.out.println((char) byteBuffer.get());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
