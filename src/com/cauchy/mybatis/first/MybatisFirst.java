package com.cauchy.mybatis.first;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import  org.junit.Test;

public class MybatisFirst {
	@Test
	public static void findUserById() throws IOException {
		// 配置文件
		String resource = "SqlMapConfig.xml";
		// 得到配置文件流
		InputStream inputStream = Resources.getResourceAsStream(resource);
	}
}
