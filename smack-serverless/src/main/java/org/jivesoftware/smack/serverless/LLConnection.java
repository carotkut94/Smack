/**
 *
 * Copyright 2015 Ishan Khanna.
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
package org.jivesoftware.smack.serverless;

import org.jivesoftware.smack.AbstractXMPPConnection;

public abstract class LLConnection extends AbstractXMPPConnection{

    private LLService service;
    
    
    /**
     * Initialize a new Link-Local Connection.  
     * @param service LLService associated with the connection
     * @param configuration specifications about the connection to be established
     */
    protected LLConnection(LLService service, LLConnectionConfiguration configuration) {
        super(configuration);
    }


    
}
