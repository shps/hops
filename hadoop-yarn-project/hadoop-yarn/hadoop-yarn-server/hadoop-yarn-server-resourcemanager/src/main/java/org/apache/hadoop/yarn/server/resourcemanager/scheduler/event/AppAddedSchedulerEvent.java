/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hadoop.yarn.server.resourcemanager.scheduler.event;

import io.hops.ha.common.TransactionState;
import org.apache.hadoop.yarn.api.records.ApplicationId;

public class AppAddedSchedulerEvent extends SchedulerEvent {

  private final ApplicationId applicationId;
  private final String queue;
  private final String user;

  public AppAddedSchedulerEvent(ApplicationId applicationId, String queue,
      String user, TransactionState transactionState) {
    super(SchedulerEventType.APP_ADDED, transactionState);
    this.applicationId = applicationId;
    this.queue = queue;
    this.user = user;
  }

  public ApplicationId getApplicationId() {
    return applicationId;
  }

  public String getQueue() {
    return queue;
  }

  public String getUser() {
    return user;
  }

}
