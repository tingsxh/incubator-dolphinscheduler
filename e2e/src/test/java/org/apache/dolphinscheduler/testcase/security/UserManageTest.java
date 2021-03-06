/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.dolphinscheduler.testcase.security;

import org.apache.dolphinscheduler.base.BaseTest;
import org.apache.dolphinscheduler.page.security.UserManagePage;
import org.testng.annotations.Test;

public class UserManageTest extends BaseTest {
    private UserManagePage userManagePage;

    @Test(groups={"functionTests","user"},dependsOnGroups = { "login" },description = "UserManageTest",priority=3)
    public void testUserManage() throws InterruptedException {
        userManagePage = new UserManagePage(driver);
        //assert user manage page
        System.out.println("start create user");
        assert userManagePage.createUser();
        System.out.println("end create user");
        System.out.println("===================================");

    }
}
