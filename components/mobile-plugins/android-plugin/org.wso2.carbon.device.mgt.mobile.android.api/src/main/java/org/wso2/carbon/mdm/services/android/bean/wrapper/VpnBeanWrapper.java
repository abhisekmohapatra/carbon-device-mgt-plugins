/*
 * Copyright (c) 2015, WSO2 Inc. (http:www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.carbon.mdm.services.android.bean.wrapper;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.wso2.carbon.mdm.services.android.bean.Vpn;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * This class is used to wrap the Vpn bean with devices.
 */
@ApiModel(value = "VpnBeanWrapper",
		description = "Information related to VPN Configuration.")
public class VpnBeanWrapper {
	@ApiModelProperty(name = "operation",
			value = "List of device Ids to be need to execute UpgradeFirmware operation.", required = true)
	private Vpn operation;
	@ApiModelProperty(name = "deviceIDs",
			value = "List of device Ids to be need to execute VPN operation.", required = true)
	@Size(min = 2, max = 45)
	@Pattern(regexp = "^[A-Za-z0-9]*$")
	private List<String> deviceIDs;

	public Vpn getOperation() {
		return operation;
	}

	public void setOperation(Vpn operation) {
		this.operation = operation;
	}

	public List<String> getDeviceIDs() {
		return deviceIDs;
	}

	public void setDeviceIDs(List<String> deviceIDs) {
		this.deviceIDs = deviceIDs;
	}
}
