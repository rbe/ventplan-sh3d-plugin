/*
 * Ventplan
 * ventplan-sh3d-plugin, ventplan-sh3d-plugin
 * Copyright (C) 2011-2013 art of coding UG, http://www.art-of-coding.eu
 * Copyright (C) 2005-2010 Informationssysteme Ralf Bensmann, http://www.bensmann.com
 *
 * Alle Rechte vorbehalten. Nutzung unterliegt Lizenzbedingungen.
 * All rights reserved. Use is subject to license terms.
 *
 * rbe, 02.02.13 15:27
 */

package eu.artofcoding.ventplan.sh3d.plugin;

import com.eteks.sweethome3d.plugin.PluginAction;

import javax.swing.*;
import java.io.File;
import java.util.Locale;
import java.util.ResourceBundle;

public class VentplanExportAction extends PluginAction {

    private ResourceBundle resource;

    public VentplanExportAction(ClassLoader classLoader) {
        resource = ResourceBundle.getBundle(
                "com.ventplan.plugin.ApplicationPlugin",
                Locale.getDefault(), classLoader);
        putPropertyValue(Property.NAME, resource.getString("ventplan.export.action.name"));
        putPropertyValue(Property.MENU, resource.getString("ventplan.plugin.menu.name"));
        // Enables the action by default
        setEnabled(true);
    }

    @Override
    public void execute() {



        JFileChooser fileChooser = new JFileChooser();
        int option = fileChooser.showOpenDialog(null);
        if (option == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            performExport(selectedFile);
        } else if (option == JFileChooser.CANCEL_OPTION) {
            // do nothing...
        }
    }

    /**
     * Create SH3D file from given vpx-file.
     * @param file
     */
    private void performExport(File file) {

    }
}
