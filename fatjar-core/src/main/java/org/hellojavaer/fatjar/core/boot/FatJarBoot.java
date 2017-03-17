/*
 * Copyright 2017-2017 the original author or authors.
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
package org.hellojavaer.fatjar.core.boot;

import org.hellojavaer.fatjar.core.FatJarClassLoaderUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 *
 * @author <a href="mailto:hellojavaer@gmail.com">Kaiming Zou</a>,created on 17/03/2017.
 */
public class FatJarBoot {

    private static Logger logger = LoggerFactory.getLogger(FatJarBoot.class);

    static {
        logger.info("\n|=========================================|\n|========== Fat-Jar is booting ===========|\n|=========================================|\n");
        FatJarClassLoaderUtils.injectFatJarClassLoader();
        FatJarClassLoaderUtils.registerUrlProtocolHandler();
        logger.info("\n|=========================================|\n|========== Fat-Jar boot success =========|\n|=========================================|\n");
    }

    public static void run() {
        //
    }

}
