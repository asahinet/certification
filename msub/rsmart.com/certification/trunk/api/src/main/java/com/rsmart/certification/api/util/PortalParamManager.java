/**********************************************************************************
 * $URL: https://source.sakaiproject.org/svn/msub/rsmart.com/metaobj/trunk/metaobj-api/api/src/java/org/sakaiproject/metaobj/shared/mgt/PortalParamManager.java $
 * $Id: PortalParamManager.java 314667 2014-10-20 22:24:11Z bbiltimier@anisakai.com $
 ***********************************************************************************
 *
 * Copyright (c) 2004, 2005, 2006, 2008 The Sakai Foundation
 *
 * Licensed under the Educational Community License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.opensource.org/licenses/ECL-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 **********************************************************************************/

package com.rsmart.certification.api.util;

import javax.servlet.ServletRequest;
import java.util.Map;

public interface PortalParamManager {

   public Map getParams(ServletRequest request);

}
