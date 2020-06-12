/*
 * Copyright 2020 The Embulk project
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

package org.embulk.spi;

import org.embulk.config.ConfigDiff;
import org.embulk.config.ConfigSource;
import org.embulk.spi.Buffer;

/**
 * The main class that Embulk's Guess Plugin has to implement.
 */
public interface GuessPlugin {
    /**
     * Performs the guess.
     *
     * @param config  the configuration that the Guess Plugin needs to guess from
     * @param sample  a sample data to guess
     * @return a new configuration guessed based on {@code config} and {@code sample}
     */
    ConfigDiff guess(ConfigSource config, Buffer sample);
}
