/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.sql.models;

/**
* Specifies the edition of the SQL database.
*/
public class DatabaseEditions
{
    /**
    * The Web Edition Database is best suited for small Web applications and
    * workgroup or departmental applications. This edition supports a database
    * with a maximum size of 1 or 5 GB of data.
    */
    public static final String Web = "Web";
    
    /**
    * The Business Edition Database is best suited for independent software
    * vendors (ISVs), line-of-business (LOB) applications, and enterprise
    * applications. This edition supports a database of up to 150 GB of data,
    * in 10GB increments up to 50GB, and then 50 GB increments.
    */
    public static final String Business = "Business";
}
