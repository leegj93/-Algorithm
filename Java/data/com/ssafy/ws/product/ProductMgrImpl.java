package com.ssafy.ws.product;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductMgrImpl implements IProductMgr {
	
	File outFile = null;
	Scanner scan = null;
	FileOutputStream fos = null;
	ObjectOutputStream oos = null;
	FileInputStream fis = null;
	DataInputStream dis = null;
	ObjectInputStream ois=null;
	private static ArrayList<Product> prr = new ArrayList<>();
	public ProductMgrImpl() {

		try {
			outFile = new File((new File(".").getCanonicalPath()) + "\\src\\com\\ssafy\\ws\\product\\product.dat");
			scan = new Scanner(System.in);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void saveProductsToFile() {
			try {
				fos = new FileOutputStream(outFile, false);
				oos = new ObjectOutputStream(fos);
				for(Product p : prr) {
					oos.writeObject(p);
				}
				oos.flush();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					oos.close();
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
	}
	public void importProductsFromFile() {
		try {
			fis = new FileInputStream(outFile);
			ois = new ObjectInputStream(fis);
			Product p = null;
			while((p=(Product)ois.readObject()) != null) {
				prr.add(p);
			}
		} catch(EOFException e) {
		}
		catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void insertTvInfo(Scanner sc) {
		System.out.println("isbn, title, price, stock, inch, Display 순으로 정보 입력");
		String isbn = sc.next();
		String title = sc.next();
		int price = sc.nextInt();
		int stock = sc.nextInt();
		int inch = sc.nextInt();
		String Display = sc.next();
		prr.add(new Tv(isbn, title, price, stock, inch, Display));
	}

	public void insertRFInfo(Scanner sc) {
		System.out.println("isbn, title, price, stock, Volume 순으로 정보 입력");
		String isbn = sc.next();
		String title = sc.next();
		int price = sc.nextInt();
		int stock = sc.nextInt();
		String volume = sc.next();
		prr.add(new Refrigerator(isbn, title, price, stock, volume));	
		}

	@Override
	public void add(Product p) {
		prr.add(p);
	}

	@Override
	public void findAll() {
		int i = 0;
		for (i = 0; i < prr.size(); i++) {
			prr.get(i).print();
		}
	}

	@Override
	public boolean findIsbn(String isbn) {
		int i = 0;
		System.out.println("======================");
		for (i = 0; i < prr.size(); i++) {
			if (prr.get(i).getIsbn().contains(isbn)) {
				prr.get(i).print();
				return true;
			}
		}
		if(!prr.contains(isbn)) {
			throw new CodeNotFoundException();
		}
		return false;
	}

	@Override
	public void findTitle(String title) {
		int i = 0;
		System.out.println("해당 제품명으로 검색..");
		System.out.println("======================");
		for (i = 0; i < prr.size(); i++) {
			if (prr.get(i).getTitle().contains(title)) {
				prr.get(i).print();

			}
		}
	}

	@Override
	public ArrayList<Product> findTv() {
		System.out.println("TV만 검색");
		for (Product p : prr) {
			if (p instanceof Tv) {
				p.print();
			}
		}
		return prr;
	}

	@Override
	public ArrayList<Product> findRF() {
		System.out.println("냉장고만 검색");
		for (Product p : prr) {
			if (p instanceof Refrigerator) {
				p.print();
			}
		}
		return prr;
	}

	@Override
	public ArrayList<Product> updatePr(String isbn, int price) {
		System.out.println("해당 제품 정보 갱신");
		int i = 0;
		for (i = 0; i < prr.size(); i++) {
			if (prr.get(i).getIsbn().contains(isbn)) {
				prr.get(i).setPrice(price);

			}
		}
		return prr;
	}

	@Override
	public ArrayList<Product> removePr(String isbn) {
		System.out.println("해당 제품 삭제");
		int i;

		for (i = 0; i < prr.size(); i++) {
			if (prr.get(i).getIsbn().equals(isbn)) {
				prr.remove(i);
				break;

			}
		}
		return prr;

	}

	@Override
	public int totalPrice() {
		System.out.println("재고 금액의 총합");
		int sum = 0;
		for (int i = 0; i < prr.size(); i++) {
//			System.out.println(prr.get(i).getPrice());
			sum += prr.get(i).getPrice() * prr.get(i).getStock();
		}
		System.out.println(sum);
		return sum;
	}

	@Override
	public void findRFvol() {
		System.out.println("400L이상 냉장고");
		ArrayList<Refrigerator> temp = new ArrayList<>();
		for (Product product : prr) {
			if (product instanceof Refrigerator) {
				temp.add((Refrigerator) product);
			}
		}
		int i = 0;
		for (i = 0; i < temp.size(); i++) {
			if (Integer.parseInt(temp.get(i).getVolume()) >= 400) {
				temp.get(i).print();

			}
		}
//		return prr;
	}

	@Override
	public void findTvInch() {
		System.out.println("50inch이상 TV");
		ArrayList<Tv> temp = new ArrayList<>();
		for (Product product : prr) {
			if (product instanceof Tv) {
				temp.add((Tv) product);
			}
		}
		int i = 0;
		for (i = 0; i < temp.size(); i++) {

			if ((temp.get(i).getInch()) >= 50) {
				temp.get(i).print();

			}
		}
//		return prr;8

	}

}