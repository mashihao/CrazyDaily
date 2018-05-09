/**
 * Copyright 2017 Sun Jian
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.crazysunj.data.util;

import java.io.IOException;

/**
 * author: sunjian
 * created on: 2018/5/8 下午5:51
 * description:https://github.com/crazysunj/CrazyDaily
 */
public class NetworkUtils {

    public static boolean isNetworkAvailable() {
        try {
            String ip = "www.baidu.com";
            Process process = Runtime.getRuntime().exec("/system/bin/ping -c 1 -w 100 " + ip);
            int status = process.waitFor();
            return status == 0;
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return false;
        }
    }
}
