/**
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
package com.focusit.notification.notification;

import java.io.IOException;

import com.focusit.notification.model.ExecutorsState;
import com.focusit.notification.model.ItemState;
import com.focusit.notification.model.JobState;
import com.focusit.notification.model.QueueState;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public enum Format {
    JSON;

    private final Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
    public byte[] serialize(JobState jobState) throws IOException {
        return gson.toJson(jobState).getBytes( "UTF-8" );
    }

    public byte[] serialize(ItemState itemState) throws IOException {
        return gson.toJson(itemState).getBytes( "UTF-8" );
    }

    public byte[] serialize(QueueState queueState) throws IOException {
        return gson.toJson(queueState).getBytes( "UTF-8" );
    }

    public byte[] serialize(ExecutorsState executorsState) throws IOException {
        return gson.toJson(executorsState).getBytes( "UTF-8" );
    }
}
