/*
 * Copyright (c) 2008-2018, Hazelcast, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hazelcast.map.impl.operation;

import com.hazelcast.core.EntryEventType;
import com.hazelcast.nio.serialization.Data;

public class WanEventHolder {
    private final Data key;
    private final Data value;
    private final EntryEventType eventType;

    public WanEventHolder(Data key, Data value, EntryEventType eventType) {
        this.key = key.toHeap();
        this.value = value.toHeap();
        this.eventType = eventType;
    }

    public Data getKey() {
        return key;
    }

    public Data getValue() {
        return value;
    }

    public EntryEventType getEventType() {
        return eventType;
    }
}
