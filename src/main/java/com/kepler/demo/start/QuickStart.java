package com.kepler.demo.start;

import com.kepler.annotation.Service;

@Service(version = "1.0.1", catalog = "test")
public interface QuickStart {

	public HelloWorld hi(String name);
}
