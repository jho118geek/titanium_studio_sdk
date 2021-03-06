/**
 * Copyright 2011-2012 Appcelerator, Inc.
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
package com.appcelerator.titanium.desktop;

import com.appcelerator.titanium.core.SDKEntity;
import com.aptana.core.diagnostic.IDiagnosticLog;

public class DesktopDiagnosticLog implements IDiagnosticLog
{

	public String getLog()
	{
		StringBuilder buf = new StringBuilder();

		for (SDKEntity sdkEntity : TitaniumDesktopSDKLocator.getInstance().getAvailable())
		{
			buf.append(Messages.DesktopDiagnosticLog_sdk_version_label).append(sdkEntity.getVersion());
			buf.append("\n"); //$NON-NLS-1$

			buf.append(Messages.DesktopDiagnosticLog_sdk_location_label).append(sdkEntity.getPath().toOSString());
			buf.append("\n\n"); //$NON-NLS-1$
		}

		return buf.toString();
	}
}
