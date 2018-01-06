/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO KinesisAction
 */
class KinesisActionJsonMarshaller {

    public void marshall(KinesisAction kinesisAction, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (kinesisAction.getRoleArn() != null) {
            String roleArn = kinesisAction.getRoleArn();
            jsonWriter.name("roleArn");
            jsonWriter.value(roleArn);
        }
        if (kinesisAction.getStreamName() != null) {
            String streamName = kinesisAction.getStreamName();
            jsonWriter.name("streamName");
            jsonWriter.value(streamName);
        }
        if (kinesisAction.getPartitionKey() != null) {
            String partitionKey = kinesisAction.getPartitionKey();
            jsonWriter.name("partitionKey");
            jsonWriter.value(partitionKey);
        }
        jsonWriter.endObject();
    }

    private static KinesisActionJsonMarshaller instance;

    public static KinesisActionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new KinesisActionJsonMarshaller();
        return instance;
    }
}
