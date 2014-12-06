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

    private String apkName = "org.yousuowei.clearance";
    private String url = "http://yousuowei.com";
    private Integer version = 1001;

    @Test
    public void testAdd() {
	boolean addResult = add();
	Assert.isTrue(addResult);
    }

    @Test
    public void testGetNewestVersion() {
	add();
	ApkVersionInfo info = apkVersionIfc.getNewestVersion(apkName, version);
	Assert.isNull(info);
	info = apkVersionIfc.getNewestVersion(apkName, version + 1);
	Assert.isNull(info);
	info = apkVersionIfc.getNewestVersion(apkName, version - 1);
	Assert.notNull(info);
    }

    private boolean add() {
	ApkVersionInfo info = new ApkVersionInfo();
	info.setName(apkName);
	info.setUrl(url);
	info.setVersion(version);
	return apkVersionIfc.add(info);
    }
}
