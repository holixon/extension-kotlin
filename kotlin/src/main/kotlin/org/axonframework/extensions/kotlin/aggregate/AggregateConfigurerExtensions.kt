/*
 * Copyright (c) 2010-2020. Axon Framework
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.axonframework.extensions.kotlin.aggregate

import org.axonframework.common.jpa.EntityManagerProvider
import org.axonframework.config.AggregateConfigurer
import org.axonframework.config.AggregateConfigurer.jpaMappedConfiguration

/**
 * Creates default aggregate configurer with a usage of a reified type information.
 * @param [A] type of aggregate.
 */
inline fun <reified A: Any> defaultConfiguration(): AggregateConfigurer<A> = AggregateConfigurer.defaultConfiguration(A::class.java)

/**
 * Creates JPA-mapped aggregate configurer with a usage of a reified type information.
 * @param [A] type of aggregate.
 */
inline fun <reified A: Any> jpaMappedConfiguration(): AggregateConfigurer<A> = jpaMappedConfiguration(A::class.java)

/**
 * Creates JPA-mapped aggregate configurer with a usage of a reified type information.
 * @param entityManagerProvider entity manager provider.
 * @param [A] type of aggregate.
 */
inline fun <reified A: Any> jpaMappedConfiguration(entityManagerProvider: EntityManagerProvider): AggregateConfigurer<A> = jpaMappedConfiguration(A::class.java, entityManagerProvider)