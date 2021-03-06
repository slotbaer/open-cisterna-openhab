/**
 * Copyright (c) 2014,2018 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.smarthome.binding.opencisterna.internal;

/**
 * The {@link OpenCisternaConfiguration} class contains fields mapping thing configuration parameters.
 *
 * @author Sven Trieflinger
 */
public class OpenCisternaConfiguration {

    /**
     * Refresh interval in seconds.
     */
    public Integer refresh;

    /**
     * The base URL of the sensor.
     */
    public String baseUrl;

    @Override
    public String toString() {
        return String.format("OpenCisternaConfiguration [refresh=%s, baseUrl=%s]", refresh, baseUrl);
    }

}