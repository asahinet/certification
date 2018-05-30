/**
 * Copyright (c) 2003-2018 The Apereo Foundation
 *
 * Licensed under the Educational Community License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *             http://opensource.org/licenses/ecl2
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.sakaiproject.certification.impl;

import org.sakaiproject.certification.impl.control.RedirectView;

import java.util.Locale;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.AbstractUrlBasedView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

public class SakaiInternalResourceViewResolver extends InternalResourceViewResolver
{
    private static final Log LOG = LogFactory.getLog(SakaiInternalResourceViewResolver.class);

    protected AbstractUrlBasedView buildView(String viewName) throws Exception
    {
        LOG.info("inside buildView");
        return super.buildView(viewName);
    }

    protected View createView(String viewName, Locale locale) throws Exception
    {
        LOG.info("inside createView");

        // Check for special "redirect:" prefix.
        if (viewName.startsWith(REDIRECT_URL_PREFIX))
        {
            String redirectUrl = viewName.substring(REDIRECT_URL_PREFIX.length());
            RedirectView redirectView = new RedirectView();
            redirectView.setUrl(redirectUrl);
            return redirectView;
        }

        return super.createView(viewName, locale);
    }
}
