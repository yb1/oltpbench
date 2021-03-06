/******************************************************************************
 *  Copyright 2016 by OLTPBenchmark Project                                   *
 *                                                                            *
 *  Licensed under the Apache License, Version 2.0 (the "License");           *
 *  you may not use this file except in compliance with the License.          *
 *  You may obtain a copy of the License at                                   *
 *                                                                            *
 *    http://www.apache.org/licenses/LICENSE-2.0                              *
 *                                                                            *
 *  Unless required by applicable law or agreed to in writing, software       *
 *  distributed under the License is distributed on an "AS IS" BASIS,         *
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  *
 *  See the License for the specific language governing permissions and       *
 *  limitations under the License.                                            *
 ******************************************************************************/

package com.oltpbenchmark.benchmarks.noop;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.oltpbenchmark.api.Loader;

/**
 * This doesn't load any data!
 * @author pavlo
 * @author eric-haibin-lin
 */
public class NoOpLoader extends Loader {
    private static final Logger LOG = Logger.getLogger(NoOpLoader.class);

    public NoOpLoader(NoOpBenchmark benchmark, Connection c) {
        super(benchmark, c);
    }

    @Override
    public void load() throws SQLException {
        // Nothing to do
        if (LOG.isDebugEnabled())
            LOG.debug("No data is no loaded because there is no table!");
        
    }
}
