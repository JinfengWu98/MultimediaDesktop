/*
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
package com.wms.studio.service.api;


import com.wms.studio.domain.transfer.PageDto;
import com.wms.studio.domain.transfer.page.PageSize;
import com.wms.studio.domain.transfer.user.LoginIpDto;
import com.wms.studio.domain.transfer.user.LoginIpInfoDto;

import java.util.Date;

/**
 * @author WMS
 *
 */
public interface LoginIpService {

	void addLoginIp(LoginIpDto loginIpdto);
	
	PageDto<LoginIpInfoDto> findBy(String userId, Date start, Date end, PageSize pageSize);
}
