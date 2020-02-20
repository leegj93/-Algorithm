package com.ssafy.ws.product;

public class DuplicateException extends Exception {
	public DuplicateException() {
		super("해당 상품이 이미 존재합니다");
	}

	public DuplicateException(String msg) {
		super(msg);
	}
}

class ProductNotFoundException extends Exception {
	public ProductNotFoundException() {
		super("해당 상품이 존재하지 않습니다.");
	}

	public ProductNotFoundException(String msg) {
		super(msg);
	}
}

class CodeNotFoundException extends Exception {
	public CodeNotFoundException() {
		super("해당 상품이 존재하지 않습니다");
	}

	public CodeNotFoundException(String msg) {
		super(msg);
	}

}
