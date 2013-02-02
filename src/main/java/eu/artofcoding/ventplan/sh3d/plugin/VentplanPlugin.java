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

import com.eteks.sweethome3d.plugin.Plugin;
import com.eteks.sweethome3d.plugin.PluginAction;

public class VentplanPlugin extends Plugin {

    @Override
    public PluginAction[] getActions() {
        return new PluginAction [] { new VentplanImportAction(getPluginClassLoader()), new VentplanExportAction(getPluginClassLoader()) };
    }

}
