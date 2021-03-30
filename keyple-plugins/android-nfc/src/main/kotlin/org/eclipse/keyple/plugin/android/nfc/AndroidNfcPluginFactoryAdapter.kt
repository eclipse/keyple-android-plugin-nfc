/* **************************************************************************************
 * Copyright (c) 2021 Calypso Networks Association https://www.calypsonet-asso.org/
 *
 * See the NOTICE file(s) distributed with this work for additional information
 * regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License 2.0 which is available at http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 ************************************************************************************** */
package org.eclipse.keyple.plugin.android.nfc

import android.app.Activity
import org.eclipse.keyple.core.common.CommonsApiProperties
import org.eclipse.keyple.core.plugin.PluginApiProperties
import org.eclipse.keyple.core.plugin.spi.PluginFactorySpi
import org.eclipse.keyple.core.plugin.spi.PluginSpi

class AndroidNfcPluginFactoryAdapter(private val activity: Activity) : AndroidNfcPluginFactory, PluginFactorySpi {

    override fun getPluginApiVersion(): String {
        return PluginApiProperties.VERSION
    }

    override fun getCommonsApiVersion(): String {
        return CommonsApiProperties.VERSION
    }

    override fun getPluginName(): String {
        return AndroidNfcPlugin.PLUGIN_NAME
    }

    override fun getPlugin(): PluginSpi {
        return AndroidNfcPluginAdapter(activity)
    }
}