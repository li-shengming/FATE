/*
 * Copyright 2019 The FATE Authors. All Rights Reserved.
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

package com.webank.ai.eggroll.core.error.exception;

public class ProcessorStateException extends RuntimeException {
    private final static long serialVersionUID = 1L;

    public ProcessorStateException(final String message) {
        super(message);
    }

    public ProcessorStateException(final String message, final Throwable throwable) {
        super(message, throwable);
    }

    public ProcessorStateException(final Throwable throwable) {
        super(throwable);
    }
}
