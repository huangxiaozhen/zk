/* RemoveDesktopCommand.java

{{IS_NOTE
	Purpose:
		
	Description:
		
	History:
		Wed Mar 15 11:02:26     2006, Created by tomyeh@potix.com
}}IS_NOTE

Copyright (C) 2006 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
	This program is distributed under GPL Version 2.0 in the hope that
	it will be useful, but WITHOUT ANY WARRANTY.
}}IS_RIGHT
*/
package com.potix.zk.au.impl;

import com.potix.zk.ui.Desktop;
import com.potix.zk.ui.sys.WebAppCtrl;
import com.potix.zk.au.AuRequest;
import com.potix.zk.au.Command;

/**
 * A command to remove the specified desktop.
 * 
 * @author <a href="mailto:tomyeh@potix.com">tomyeh@potix.com</a>
 */
public class RemoveDesktopCommand extends Command {
	public RemoveDesktopCommand(String evtnm, int flags) {
		super(evtnm, flags);
	}
	protected void process(AuRequest request) {
		final Desktop dt = request.getDesktop();
		final WebAppCtrl wappc = (WebAppCtrl)dt.getWebApp();
		wappc.getDesktopCache(dt.getSession()).removeDesktop(dt);
	}
}
