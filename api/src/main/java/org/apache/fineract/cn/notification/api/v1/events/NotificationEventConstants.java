/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.fineract.cn.notification.api.v1.events;

@SuppressWarnings("unused")
public interface NotificationEventConstants {
	
	String DESTINATION = "notification-v1";
	String SELECTOR_NAME = "action";
	String INITIALIZE = "initialize";
	
	String POST_SMS_CONFIGURATION = "post-sms-configuration";
	String POST_EMAIL_CONFIGURATION = "post-email-configuration";
	String POST_SOURCE_APPLICATION = "post-source-application";
	String UPDATE_SMS_CONFIGURATION = "update-sms-configuration";
	String UPDATE_EMAIL_CONFIGURATION = "update-email-configuration";
	String DELETE_SMS_CONFIGURATION = "delete-sms-configuration";
	String DELETE_EMAIL_CONFIGURATION = "delete-email-configuration";
	String DELETE_SOURCE_APPLICATION = "delete-source-application";
	
	String POST_SEND_EMAIL_NOTIFICATION = "post-send-email-notification";
	String POST_SEND_SMS_NOTIFICATION = "post-send-sms-notification";
	
	String POST_ENABLE_CUSTOMER_CREATED_EVENT = "post-enable-customer-created-event";
	String POST_ENABLE_CUSTOMER_UPDATED_EVENT = "post-enable-customer-updated-event";
	String POST_ENABLE_CUSTOMER_CLOSED_EVENT = "post-enable-customer-closed-event";
	String POST_ENABLE_CUSTOMER_LOCKED_EVENT = "post-enable-customer-locked-event";
	String POST_ENABLE_CUSTOMER_ACTIVATED_EVENT = "post-enable-customer-activated-event";
	String POST_ENABLE_CUSTOMER__EVENT = "post-enable-customer--event";
	
	String SELECTOR_INITIALIZE = SELECTOR_NAME + " = '" + INITIALIZE + "'";
	String SELECTOR_POST_SMS_CONFIGURATION = SELECTOR_NAME + " = '" + POST_SMS_CONFIGURATION + "'";
	String SELECTOR_POST_EMAIL_CONFIGURATION = SELECTOR_NAME + " = '" + POST_EMAIL_CONFIGURATION + "'";
	String SELECTOR_UPDATE_SMS_CONFIGURATION = SELECTOR_NAME + " = '" + UPDATE_SMS_CONFIGURATION + "'";
	String SELECTOR_UPDATE_EMAIL_CONFIGURATION = SELECTOR_NAME + " = '" + UPDATE_EMAIL_CONFIGURATION + "'";
	String SELECTOR_DELETE_SMS_CONFIGURATION = SELECTOR_NAME + " = '" + DELETE_SMS_CONFIGURATION + "'";
	String SELECTOR_DELETE_EMAIL_CONFIGURATION = SELECTOR_NAME + " = '" + DELETE_EMAIL_CONFIGURATION + "'";
	String SELECTOR_POST_SOURCE_APPLICATION = SELECTOR_NAME + " = '" + POST_SOURCE_APPLICATION + "'";
	String SELECTOR_DELETE_SOURCE_APPLICATION = SELECTOR_NAME + " = '" + DELETE_SOURCE_APPLICATION + "'";
	
	String SELECTOR_POST_SEND_EMAIL_NOTIFICATION = SELECTOR_NAME + " = '" + POST_SEND_EMAIL_NOTIFICATION + "'";
	String SELECTOR_POST_SEND_SMS_NOTIFICATION = SELECTOR_NAME + " = '" + POST_SEND_SMS_NOTIFICATION + "'";
}
