/*
 * SKCraft Launcher
 * Copyright (C) 2010-2014 Albert Pham <http://www.sk89q.com> and contributors
 * Please see LICENSE.txt for license information.
 */

package com.skcraft.launcher.skin;

import java.awt.*;
import javax.swing.*;

import com.formdev.flatlaf.FlatDarkLaf;

public class LauncherLookAndFeel extends FlatDarkLaf {
    public LauncherLookAndFeel() {
        FlatDarkLaf.setup();
        UIManager.put("Panel.background", new Color(0x1e1e1e));
        UIManager.put("SplitPane.background", new Color(0x1e1e1e));
        UIManager.put("Button.hoverBorderColor", new Color(0xFFFFFF));
        UIManager.put("Button.focusedBorderColor", new Color(0x4C2A85));
        UIManager.put("Table.rowHeight", 30);
        UIManager.put("Table.selectionForeground", new Color(0xFFFFFF));
        UIManager.put("Table.selectionInactiveBackground", new Color(0, 0, 0, 0));
        UIManager.put("Table.focusCellBackground", new Color(0, 0, 0, 0));
        UIManager.put("Table.selectionBackground", new Color(0, 0, 0, 0));
    }
}
