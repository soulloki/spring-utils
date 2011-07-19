/*
 * Copyright 2007-2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package biz.deinum.springframework.aop.target;

import org.springframework.core.NestedRuntimeException;

/**
 * Exception to be thrown by the {@link ContextSwappableTargetSource} indicating that no
 * target could be found.
 * 
 * @author Marten Deinum
 * @version 1.0.0
 */
public class TargetLookupFailureException extends NestedRuntimeException {

    private static final long serialVersionUID = -1645374642832222666L;

    public TargetLookupFailureException(final String message) {
        super(message);
    }

    public TargetLookupFailureException(final String message, final Throwable cause) {
        super(message, cause);
    }

}
