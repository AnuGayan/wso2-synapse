/**
 *  Copyright (c) 2023, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.apache.synapse.transport.passthru;

/**
 * State of workers in pass-through transport.
 */
public enum WorkerState {
    /** Worker is marked for execution waiting for thread */
    CREATED,

    /** Worker is executing */
    RUNNING,

    /** Worker completed the job and is marked for termination */
    FINISHED;
}
