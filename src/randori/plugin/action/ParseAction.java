/***
 * Copyright 2013 Teoti Graphix, LLC.
 *
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
 *
 *
 * @author Michael Schmalle <mschmalle@teotigraphix.com>
 */
package randori.plugin.action;

import randori.plugin.components.RandoriProjectComponent;
import randori.plugin.util.ProjectUtils;

import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;

/**
 * @author: Frédéric THOMAS Date: 10/04/13 Time: 16:28
 */
public class ParseAction extends BaseRandoriMenuAction
{

    @Override
    public void actionPerformed(AnActionEvent event)
    {
        Project project = event.getData(PlatformDataKeys.PROJECT);
        RandoriProjectComponent component = ProjectUtils
                .getProjectComponent(project);

        component.parse(false);
    }
}
