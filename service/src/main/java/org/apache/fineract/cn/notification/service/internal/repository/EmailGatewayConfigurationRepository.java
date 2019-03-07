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
package org.apache.fineract.cn.notification.service.internal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmailGatewayConfigurationRepository extends JpaRepository<EmailGatewayConfigurationEntity, Long> {
	Optional<EmailGatewayConfigurationEntity> findByIdentifier(String identifier);
	
	@Query("SELECT CASE WHEN COUNT(c) > 0 THEN 'true' ELSE 'false' END FROM EmailGatewayConfigurationEntity c WHERE c.identifier = :identifier")
	Boolean existsByIdentifier(@Param("identifier") final String identifier);
	
	@Query("SELECT entity FROM EmailGatewayConfigurationEntity entity WHERE entity.state='ACTIVE'")
	Optional<EmailGatewayConfigurationEntity> active();
	
	void deleteEmailGatewayConfigurationEntityBy(String identifier);
}
