/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.f1x.v1;

public class FixAcceptorSettings extends FixSettings {
    private int maxNumberOfConnections = 10;
    private int socketTimeout;

    public int getMaxNumberOfConnections() {
        return maxNumberOfConnections;
    }

    public void setMaxNumberOfConnections(int maxNumberOfConnections) {
        this.maxNumberOfConnections = maxNumberOfConnections;
    }

    public int getSocketTimeout() {
        return socketTimeout;
    }

    public void setSocketTimeout(int socketTimeout) {
        this.socketTimeout = socketTimeout;
    }
}