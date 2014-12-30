package org.yousuowei.ota.imp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import org.yousuowei.ota.ifc.ApkVersionIfc;
import org.yousuowei.ota.ifc.info.ApkVersionInfo;

// 加入标记则数据将不添加到数据库
@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:db-context.xml" })
public class ApkVersionServiceTest {

    @Autowired
    ApkVersionIfc apkVersionIfc;

    @Test
    public void test() {
	String apkName = "org.yousuowei.clearance";
	String url = "http://yousuowei.com";
	ApkVersionInfo info = new ApkVersionInfo();
	info.setName(apkName);
	info.setUrl(url);
	boolean addResult = apkVersionIfc.add(info);
	Assert.isTrue(addResult);
	info = apkVersionIfc.findAll().get(0);
	boolean delResult = apkVersionIfc.del(info.getId());
	apkVersionIfc.findAll();
	Assert.isTrue(delResult);
    }

}
