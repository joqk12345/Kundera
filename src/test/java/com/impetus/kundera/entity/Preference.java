/*******************************************************************************
 * * Copyright 2011 Impetus Infotech.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 ******************************************************************************/
/*
 * Copyright 2011 Impetus Infotech.
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
package com.impetus.kundera.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity class for User Preferences
 * 
 * @author amresh.singh
 */

@Entity
@Table(name = "preference", schema = "Blog")
public class Preference
{

    @Id
    String preferenceId;

    @Column(name = "website_theme")
    String websiteTheme;

    @Column(name = "privacy_level")
    String privacyLevel; // 1, 2, 3

    public Preference()
    {

    }

    public Preference(String prefId, String theme, String privacyLevel)
    {
        this.preferenceId = prefId;
        this.websiteTheme = theme;
        this.privacyLevel = privacyLevel;
    }

    /**
     * @return the preferenceId
     */
    public String getPreferenceId()
    {
        return preferenceId;
    }

    /**
     * @param preferenceId
     *            the preferenceId to set
     */
    public void setPreferenceId(String preferenceId)
    {
        this.preferenceId = preferenceId;
    }

    /**
     * @return the websiteTheme
     */
    public String getWebsiteTheme()
    {
        return websiteTheme;
    }

    /**
     * @param websiteTheme
     *            the websiteTheme to set
     */
    public void setWebsiteTheme(String websiteTheme)
    {
        this.websiteTheme = websiteTheme;
    }

    /**
     * @return the privacyLevel
     */
    public String getPrivacyLevel()
    {
        return privacyLevel;
    }

    /**
     * @param privacyLevel
     *            the privacyLevel to set
     */
    public void setPrivacyLevel(String privacyLevel)
    {
        this.privacyLevel = privacyLevel;
    }
}
