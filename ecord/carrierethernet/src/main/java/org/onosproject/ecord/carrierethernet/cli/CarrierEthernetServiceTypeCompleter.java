/*
 * Copyright 2015 Open Networking Laboratory
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onosproject.ecord.carrierethernet.cli;

import org.apache.karaf.shell.console.Completer;
import org.apache.karaf.shell.console.completer.StringsCompleter;
import org.onosproject.ecord.carrierethernet.app.CarrierEthernetVirtualConnection;

import java.util.List;
import java.util.SortedSet;

public class CarrierEthernetServiceTypeCompleter implements Completer {
    @Override
    public int complete(String buffer, int cursor, List<String> candidates) {

        StringsCompleter delegate = new StringsCompleter();

        SortedSet<String> strings = delegate.getStrings();

        for (CarrierEthernetVirtualConnection.Type type : CarrierEthernetVirtualConnection.Type.values()) {
            strings.add(type.toString());
        }

        return delegate.complete(buffer, cursor, candidates);
    }

}
