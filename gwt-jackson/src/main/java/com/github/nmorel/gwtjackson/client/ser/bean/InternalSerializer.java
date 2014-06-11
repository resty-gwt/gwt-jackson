/*
 * Copyright 2014 Nicolas Morel
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

package com.github.nmorel.gwtjackson.client.ser.bean;

import java.util.Map;

import com.github.nmorel.gwtjackson.client.JsonSerializationContext;
import com.github.nmorel.gwtjackson.client.JsonSerializerParameters;
import com.github.nmorel.gwtjackson.client.stream.JsonWriter;

/**
 * Interface hiding the actual implementation doing the bean serialization.
 *
 * @author Nicolas Morel.
 */
interface InternalSerializer<T> {

    void serializeInternally( JsonWriter writer, T value, JsonSerializationContext ctx, JsonSerializerParameters params,
                              IdentitySerializationInfo<T> defaultIdentityInfo, TypeSerializationInfo<T> defaultTypeInfo, Map<String,
            BeanPropertySerializer<T, ?>> serializers );

}

