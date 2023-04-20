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
        UIManager.put("SplitPane.background", new Color(0, 0, 0, 0));

        UIManager.put("Button.background", new Color(0x2A2A2A));
        UIManager.put("Button.foreground", new Color(0xFFFFFF));
        UIManager.put("Button.default.background", new Color(0x1E1E1E));
        UIManager.put("Button.innerFocusWidth", 0);
        UIManager.put("Button.arc", 5);
        UIManager.put("Button.borderColor", new Color(0x2A2A2A));
        UIManager.put("Button.hoverBorderColor", new Color(0x4C2A85));
        UIManager.put("Button.focusedBorderColor", new Color(0x4C2A85));
        UIManager.put("Button.selectedBackground", new Color(0, 0, 0, 0));

        UIManager.put("TabbedPane.underlineColor", new Color(0x4C2A85));
        UIManager.put("TabbedPane.focusColor", new Color(0x2A2A2A));

        UIManager.put("Component.focusedBorderColor", new Color(0x4C2A85));
        UIManager.put("Component.innerFocusWidth", 0);

        UIManager.put("Table.rowHeight", 25);
        UIManager.put("Table.cellMargins", new Insets(10, 10, 10, 10));
        UIManager.put("Table.selectionForeground", new Color(0xFFFFFF));
        UIManager.put("Table.selectionInactiveBackground", new Color(0, 0, 0, 0));
        UIManager.put("Table.focusCellBackground", new Color(0, 0, 0, 0));
        UIManager.put("Table.selectionBackground", new Color(255, 255, 255, 30));

        UIManager.put("ScrollBar.background", new Color(0, 0, 0, 0));
    }
}
