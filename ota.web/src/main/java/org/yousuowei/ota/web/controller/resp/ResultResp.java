/**
 * Copyright © 2014 yousuowei. All rights reserved.
 * @Title: ApkVersionController.java
 * @Prject: ota.web
 * @Package: org.yousuowei.ota.web.controller
 * @Description: TODO
 * @author: jie
 * @date: 2014-9-14 下午4:33:21
 * @version: V1.0
 */

package org.yousuowei.ota.web.controller.resp;

/**
 * @ClassName: ApkVersionController
 * @Description: TODO
 * @author: jie
 * @date: 2014-9-14 下午4:33:21
 */

public class ResultResp {

    public static enum STATUS {
	SUCESS, FAILED
    }

    private String msg;
    private STATUS status;// 0：成功 其它失败

    private Object data;

    public String getMsg() {
	return msg;
    }

    public void setMsg(String msg) {
	this.msg = msg;
    }

    public int getStatus() {
	if (status == STATUS.SUCESS) {
	    return 0;
	} else {
	    return -1;
	}
    }

    public void setStatus(STATUS status) {
	this.status = status;
    }

    public Object getData() {
	return data;
    }

    public void setData(Object data) {
	this.data = data;
    }

}
