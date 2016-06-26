/**
 *
 * Copyright © 2016 Florian Schmaus
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
package org.jivesoftware.smackx.iot.control.element;

import java.util.Collections;
import java.util.List;

import org.jivesoftware.smack.packet.IQ;

public class IoTSetRequest extends IQ {

    public static final String ELEMENT = "set";
    public static final String NAMESPACE = Constants.IOT_CONTROL_NAMESPACE;

    private final List<SetData> setData;

    protected IoTSetRequest(List<SetData> setData) {
        super(ELEMENT, NAMESPACE);
        this.setData = Collections.unmodifiableList(setData);
    }

    public List<SetData> getSetData() {
        return setData;
    }

    @Override
    protected IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder xml) {
        // TODO Auto-generated method stub
        return null;
    }

}