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
package com.aliyuncs.cr.model.v20160607;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetRepoListByNamespaceRequest extends RoaAcsRequest<GetRepoListByNamespaceResponse> {
	
	public GetRepoListByNamespaceRequest() {
		super("cr", "2016-06-07", "GetRepoListByNamespace");
		setUriPattern("/repos/[RepoNamespace]");
		setMethod(MethodType.GET);
	}

	private String repoNamespace;

	private Integer page;

	private Integer pageSize;

	public String getRepoNamespace() {
		return this.repoNamespace;
	}

	public void setRepoNamespace(String repoNamespace) {
		this.repoNamespace = repoNamespace;
		putPathParameter("RepoNamespace", repoNamespace);
	}

	public Integer getPage() {
		return this.page;
	}

	public void setPage(Integer page) {
		this.page = page;
		putQueryParameter("Page", page);
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		putQueryParameter("PageSize", pageSize);
	}

	@Override
	public Class<GetRepoListByNamespaceResponse> getResponseClass() {
		return GetRepoListByNamespaceResponse.class;
	}

}
