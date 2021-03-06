/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.ehpc.transform.v20170714;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpc.model.v20170714.DescribeClusterResponse;
import com.aliyuncs.ehpc.model.v20170714.DescribeClusterResponse.ClusterInfo;
import com.aliyuncs.ehpc.model.v20170714.DescribeClusterResponse.ClusterInfo.ApplicationInfoItem;
import com.aliyuncs.ehpc.model.v20170714.DescribeClusterResponse.ClusterInfo.EcsInfo;
import com.aliyuncs.ehpc.model.v20170714.DescribeClusterResponse.ClusterInfo.EcsInfo.Compute;
import com.aliyuncs.ehpc.model.v20170714.DescribeClusterResponse.ClusterInfo.EcsInfo.Login;
import com.aliyuncs.ehpc.model.v20170714.DescribeClusterResponse.ClusterInfo.EcsInfo.Manager;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterResponseUnmarshaller {

	public static DescribeClusterResponse unmarshall(DescribeClusterResponse describeClusterResponse, UnmarshallerContext context) {
		
		describeClusterResponse.setRequestId(context.stringValue("DescribeClusterResponse.RequestId"));

		ClusterInfo clusterInfo = new ClusterInfo();
		clusterInfo.setId(context.stringValue("DescribeClusterResponse.ClusterInfo.Id"));
		clusterInfo.setRegionId(context.stringValue("DescribeClusterResponse.ClusterInfo.RegionId"));
		clusterInfo.setName(context.stringValue("DescribeClusterResponse.ClusterInfo.Name"));
		clusterInfo.setDescription(context.stringValue("DescribeClusterResponse.ClusterInfo.Description"));
		clusterInfo.setStatus(context.stringValue("DescribeClusterResponse.ClusterInfo.Status"));
		clusterInfo.setOsTag(context.stringValue("DescribeClusterResponse.ClusterInfo.OsTag"));
		clusterInfo.setAccountType(context.stringValue("DescribeClusterResponse.ClusterInfo.AccountType"));
		clusterInfo.setSchedulerType(context.stringValue("DescribeClusterResponse.ClusterInfo.SchedulerType"));
		clusterInfo.setCreateTime(context.stringValue("DescribeClusterResponse.ClusterInfo.CreateTime"));
		clusterInfo.setSecurityGroupId(context.stringValue("DescribeClusterResponse.ClusterInfo.SecurityGroupId"));
		clusterInfo.setVSwitchId(context.stringValue("DescribeClusterResponse.ClusterInfo.VSwitchId"));
		clusterInfo.setVolumeType(context.stringValue("DescribeClusterResponse.ClusterInfo.VolumeType"));
		clusterInfo.setVolumeId(context.stringValue("DescribeClusterResponse.ClusterInfo.VolumeId"));
		clusterInfo.setVolumeProtocol(context.stringValue("DescribeClusterResponse.ClusterInfo.VolumeProtocol"));
		clusterInfo.setVolumeMountpoint(context.stringValue("DescribeClusterResponse.ClusterInfo.VolumeMountpoint"));
		clusterInfo.setRemoteDirectory(context.stringValue("DescribeClusterResponse.ClusterInfo.RemoteDirectory"));
		clusterInfo.setHaEnable(context.booleanValue("DescribeClusterResponse.ClusterInfo.HaEnable"));
		clusterInfo.setEcsChargeType(context.stringValue("DescribeClusterResponse.ClusterInfo.EcsChargeType"));
		clusterInfo.setKeyPairName(context.stringValue("DescribeClusterResponse.ClusterInfo.KeyPairName"));
		clusterInfo.setSccClusterId(context.stringValue("DescribeClusterResponse.ClusterInfo.SccClusterId"));
		clusterInfo.setClientVersion(context.stringValue("DescribeClusterResponse.ClusterInfo.ClientVersion"));
		clusterInfo.setImageOwnerAlias(context.stringValue("DescribeClusterResponse.ClusterInfo.ImageOwnerAlias"));
		clusterInfo.setImageId(context.stringValue("DescribeClusterResponse.ClusterInfo.ImageId"));

		EcsInfo ecsInfo = new EcsInfo();

		Manager manager = new Manager();
		manager.setCount(context.integerValue("DescribeClusterResponse.ClusterInfo.EcsInfo.Manager.Count"));
		manager.setInstanceType(context.stringValue("DescribeClusterResponse.ClusterInfo.EcsInfo.Manager.InstanceType"));
		ecsInfo.setManager(manager);

		Compute compute = new Compute();
		compute.setCount(context.integerValue("DescribeClusterResponse.ClusterInfo.EcsInfo.Compute.Count"));
		compute.setInstanceType(context.stringValue("DescribeClusterResponse.ClusterInfo.EcsInfo.Compute.InstanceType"));
		ecsInfo.setCompute(compute);

		Login login = new Login();
		login.setCount(context.integerValue("DescribeClusterResponse.ClusterInfo.EcsInfo.Login.Count"));
		login.setInstanceType(context.stringValue("DescribeClusterResponse.ClusterInfo.EcsInfo.Login.InstanceType"));
		ecsInfo.setLogin(login);
		clusterInfo.setEcsInfo(ecsInfo);

		List<ApplicationInfoItem> applicationInfo = new ArrayList<ApplicationInfoItem>();
		for (int i = 0; i < context.lengthValue("DescribeClusterResponse.ClusterInfo.ApplicationInfo.Length"); i++) {
			ApplicationInfoItem applicationInfoItem = new ApplicationInfoItem();
			applicationInfoItem.setTag(context.stringValue("DescribeClusterResponse.ClusterInfo.ApplicationInfo["+ i +"].Tag"));
			applicationInfoItem.setName(context.stringValue("DescribeClusterResponse.ClusterInfo.ApplicationInfo["+ i +"].Name"));
			applicationInfoItem.setVersion(context.stringValue("DescribeClusterResponse.ClusterInfo.ApplicationInfo["+ i +"].Version"));

			applicationInfo.add(applicationInfoItem);
		}
		clusterInfo.setApplicationInfo(applicationInfo);
		describeClusterResponse.setClusterInfo(clusterInfo);
	 
	 	return describeClusterResponse;
	}
}