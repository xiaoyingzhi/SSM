package ccc.hut.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ccc.hut.ssm.po.ItemsCustom;



/**
 * @ClassName:      JsonTest
 * @Description:    TODO
 * @author:         Khan
 * @date:           2018年5月20日		上午11:44:22
 */
@Controller
public class JsonTest {
	
	//请求json串(商品信息)，输出json(商品信息)
	//@RequestBody将请求的商品信息的json串转成itemsCustom对象
	//@ResponseBody将itemsCustom转成json输出
	@RequestMapping("/requestJson")
	public @ResponseBody ItemsCustom requestJson(@RequestBody ItemsCustom itemsCustom){
		
		//@ResponseBody将itemsCustom转成json输出
		return itemsCustom;
	}
	
	//请求key/value，输出json
	@RequestMapping("/responseJson")
	public @ResponseBody ItemsCustom responseJson(ItemsCustom itemsCustom){
		
		//@ResponseBody将itemsCustom转成json输出
		return itemsCustom;
	}
	//请求key/value，输出json
		@RequestMapping("/test")
		public @ResponseBody List<ItemsCustom> jsonTest(){
			List<ItemsCustom> list=new ArrayList<ItemsCustom>();
			ItemsCustom it=new ItemsCustom();
			it.setId(111);
			it.setName("汪恒");
			it.setDetail("他是贺宇成的什么呢");
			it.setPic("比吴彦祖还帅");
			it.setPrice(1000f);
			
			ItemsCustom it1=new ItemsCustom();
			it1.setId(111111);
			it1.setName("汪111");
			it1.setDetail("11他是贺宇成的哥哥");
			it1.setPic("比吴彦祖还帅");
			it1.setPrice(1000f);
			list.add(it);
			list.add(it1);
			//@ResponseBody将itemsCustom转成json输出
			return list;
		}	
	
}
