package org.zkoss.zktest.zats;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.zkoss.zats.mimic.ComponentAgent;
import org.zkoss.zats.mimic.DesktopAgent;
import org.zkoss.zats.mimic.Zats;
import org.zkoss.zul.Combobox;
import org.zkoss.zul.Label;

public class B01895PagingOnListbox2Test extends ZATSTestCase {
	@Test
	public void test() {
		DesktopAgent desktop = connect();
		 
		ComponentAgent tab4 = desktop.query("#tab4");
		ComponentAgent listbox = desktop.query("#listbox");
		
		assertEquals(null, listbox);
		tab4.select();
		listbox = desktop.query("#listbox");
		List<ComponentAgent> items = listbox.queryAll("listitem");
		assertTrue(items.size() > 0);
	}
}