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

package com.microsoft.windowsazure.management.websites;

import com.microsoft.windowsazure.core.OperationResponse;
import com.microsoft.windowsazure.exception.ServiceException;
import com.microsoft.windowsazure.management.websites.models.WebSiteCreateParameters;
import com.microsoft.windowsazure.management.websites.models.WebSiteCreateResponse;
import com.microsoft.windowsazure.management.websites.models.WebSiteDeleteRepositoryResponse;
import com.microsoft.windowsazure.management.websites.models.WebSiteGetConfigurationResponse;
import com.microsoft.windowsazure.management.websites.models.WebSiteGetHistoricalUsageMetricsParameters;
import com.microsoft.windowsazure.management.websites.models.WebSiteGetHistoricalUsageMetricsResponse;
import com.microsoft.windowsazure.management.websites.models.WebSiteGetParameters;
import com.microsoft.windowsazure.management.websites.models.WebSiteGetPublishProfileResponse;
import com.microsoft.windowsazure.management.websites.models.WebSiteGetRepositoryResponse;
import com.microsoft.windowsazure.management.websites.models.WebSiteGetResponse;
import com.microsoft.windowsazure.management.websites.models.WebSiteGetUsageMetricsResponse;
import com.microsoft.windowsazure.management.websites.models.WebSiteUpdateConfigurationParameters;
import com.microsoft.windowsazure.management.websites.models.WebSiteUpdateParameters;
import com.microsoft.windowsazure.management.websites.models.WebSiteUpdateResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.util.concurrent.Future;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import org.xml.sax.SAXException;

/**
* Operations for managing the web sites in a web space.
*/
public interface WebSiteOperations
{
    /**
    * You can create a web site by using a POST request that includes the name
    * of the web site and other information in the request body.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/dn166986.aspx for
    * more information)
    *
    * @param webSpaceName The name of the web space.
    * @param parameters Parameters supplied to the Create Web Site operation.
    * @return The Create Web Space operation response.
    */
    WebSiteCreateResponse create(String webSpaceName, WebSiteCreateParameters parameters) throws ParserConfigurationException, SAXException, TransformerConfigurationException, TransformerException, UnsupportedEncodingException, IOException, ServiceException, ParseException, URISyntaxException;
    
    /**
    * You can create a web site by using a POST request that includes the name
    * of the web site and other information in the request body.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/dn166986.aspx for
    * more information)
    *
    * @param webSpaceName The name of the web space.
    * @param parameters Parameters supplied to the Create Web Site operation.
    * @return The Create Web Space operation response.
    */
    Future<WebSiteCreateResponse> createAsync(String webSpaceName, WebSiteCreateParameters parameters);
    
    /**
    * A web site repository is essentially a GIT repository that you can use to
    * manage your web site content. By using GIT source control tools, you can
    * push or pull version controlled changes to your site. You can create a
    * repository for your web site by issuing an HTTP POST request, or
    * retrieve information about the repository by using HTTP GET.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/dn166967.aspx for
    * more information)
    *
    * @param webSpaceName The name of the web space.
    * @param webSiteName The name of the web site.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    OperationResponse createRepository(String webSpaceName, String webSiteName) throws IOException, ServiceException;
    
    /**
    * A web site repository is essentially a GIT repository that you can use to
    * manage your web site content. By using GIT source control tools, you can
    * push or pull version controlled changes to your site. You can create a
    * repository for your web site by issuing an HTTP POST request, or
    * retrieve information about the repository by using HTTP GET.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/dn166967.aspx for
    * more information)
    *
    * @param webSpaceName The name of the web space.
    * @param webSiteName The name of the web site.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<OperationResponse> createRepositoryAsync(String webSpaceName, String webSiteName);
    
    /**
    * You can delete a web site by issuing an HTTP DELETE request. If the web
    * site being deleted is the only site remaining in a server farm, you can
    * optionally delete the server farm as well by using the
    * deleteEmptyServerFarm parameter.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/dn236430.aspx for
    * more information)
    *
    * @param webSpaceName The name of the web space.
    * @param webSiteName The name of the web site.
    * @param deleteEmptyServerFarm If the site being deleted is the last web
    * site in a server farm, you can delete the server farm.
    * @param deleteMetrics Delete the metrics for the site that you are deleting
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    OperationResponse delete(String webSpaceName, String webSiteName, boolean deleteEmptyServerFarm, boolean deleteMetrics) throws IOException, ServiceException;
    
    /**
    * You can delete a web site by issuing an HTTP DELETE request. If the web
    * site being deleted is the only site remaining in a server farm, you can
    * optionally delete the server farm as well by using the
    * deleteEmptyServerFarm parameter.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/dn236430.aspx for
    * more information)
    *
    * @param webSpaceName The name of the web space.
    * @param webSiteName The name of the web site.
    * @param deleteEmptyServerFarm If the site being deleted is the last web
    * site in a server farm, you can delete the server farm.
    * @param deleteMetrics Delete the metrics for the site that you are deleting
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<OperationResponse> deleteAsync(String webSpaceName, String webSiteName, boolean deleteEmptyServerFarm, boolean deleteMetrics);
    
    /**
    * A web site repository is essentially a GIT repository that you can use to
    * manage your web site content. By using GIT source control tools, you can
    * push or pull version controlled changes to your site. You can create a
    * repository for your web site by issuing an HTTP POST request, or
    * retrieve information about the repository by using HTTP GET.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/dn166967.aspx for
    * more information)
    *
    * @param webSpaceName The name of the web space.
    * @param webSiteName The name of the web site.
    * @return The Delete Web Site Repository operation response.
    */
    WebSiteDeleteRepositoryResponse deleteRepository(String webSpaceName, String webSiteName) throws IOException, ServiceException, ParserConfigurationException, SAXException, URISyntaxException;
    
    /**
    * A web site repository is essentially a GIT repository that you can use to
    * manage your web site content. By using GIT source control tools, you can
    * push or pull version controlled changes to your site. You can create a
    * repository for your web site by issuing an HTTP POST request, or
    * retrieve information about the repository by using HTTP GET.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/dn166967.aspx for
    * more information)
    *
    * @param webSpaceName The name of the web space.
    * @param webSiteName The name of the web site.
    * @return The Delete Web Site Repository operation response.
    */
    Future<WebSiteDeleteRepositoryResponse> deleteRepositoryAsync(String webSpaceName, String webSiteName);
    
    /**
    * You can generate a new random password for publishing a site by issuing
    * an HTTP POST request.  Tip: If you want to verify that the publish
    * password has changed, call HTTP GET on /publishxml before calling
    * /newpassword. In the publish XML, note the hash value in the userPWD
    * attribute. After calling /newpassword, call /publishxml again. You can
    * then compare the new value of userPWD in the Publish XML with the one
    * you noted earlier.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/dn236428.aspx for
    * more information)
    *
    * @param webSpaceName The name of the web space.
    * @param webSiteName The name of the web site.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    OperationResponse generatePassword(String webSpaceName, String webSiteName) throws IOException, ServiceException;
    
    /**
    * You can generate a new random password for publishing a site by issuing
    * an HTTP POST request.  Tip: If you want to verify that the publish
    * password has changed, call HTTP GET on /publishxml before calling
    * /newpassword. In the publish XML, note the hash value in the userPWD
    * attribute. After calling /newpassword, call /publishxml again. You can
    * then compare the new value of userPWD in the Publish XML with the one
    * you noted earlier.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/dn236428.aspx for
    * more information)
    *
    * @param webSpaceName The name of the web space.
    * @param webSiteName The name of the web site.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<OperationResponse> generatePasswordAsync(String webSpaceName, String webSiteName);
    
    /**
    * You can retrieve details for a web site by issuing an HTTP GET request.
    * (see http://msdn.microsoft.com/en-us/library/windowsazure/dn167007.aspx
    * for more information)
    *
    * @param webSpaceName The name of the web space.
    * @param webSiteName The name of the web site.
    * @param parameters Additional parameters.
    * @return The Get Web Site Details operation response.
    */
    WebSiteGetResponse get(String webSpaceName, String webSiteName, WebSiteGetParameters parameters) throws IOException, ServiceException, ParserConfigurationException, SAXException, ParseException, URISyntaxException;
    
    /**
    * You can retrieve details for a web site by issuing an HTTP GET request.
    * (see http://msdn.microsoft.com/en-us/library/windowsazure/dn167007.aspx
    * for more information)
    *
    * @param webSpaceName The name of the web space.
    * @param webSiteName The name of the web site.
    * @param parameters Additional parameters.
    * @return The Get Web Site Details operation response.
    */
    Future<WebSiteGetResponse> getAsync(String webSpaceName, String webSiteName, WebSiteGetParameters parameters);
    
    /**
    * You can retrieve the config settings for a web site by issuing an HTTP
    * GET request, or update them by using HTTP PUT with a request body that
    * contains the settings to be updated.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/dn166985.aspx for
    * more information)
    *
    * @param webSpaceName The name of the web space.
    * @param webSiteName The name of the web site.
    * @return The Get Web Site Configuration operation response.
    */
    WebSiteGetConfigurationResponse getConfiguration(String webSpaceName, String webSiteName) throws IOException, ServiceException, ParserConfigurationException, SAXException, ParseException;
    
    /**
    * You can retrieve the config settings for a web site by issuing an HTTP
    * GET request, or update them by using HTTP PUT with a request body that
    * contains the settings to be updated.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/dn166985.aspx for
    * more information)
    *
    * @param webSpaceName The name of the web space.
    * @param webSiteName The name of the web site.
    * @return The Get Web Site Configuration operation response.
    */
    Future<WebSiteGetConfigurationResponse> getConfigurationAsync(String webSpaceName, String webSiteName);
    
    /**
    * You can retrieve historical usage metrics for a site by issuing an HTTP
    * GET request.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/dn166964.aspx for
    * more information)
    *
    * @param webSpaceName The name of the web space.
    * @param webSiteName The name of the web site.
    * @param parameters The Get Web Site Historical Usage Metrics parameters.
    * @return The Get Web Site Historical Usage Metrics operation response.
    */
    WebSiteGetHistoricalUsageMetricsResponse getHistoricalUsageMetrics(String webSpaceName, String webSiteName, WebSiteGetHistoricalUsageMetricsParameters parameters) throws IOException, ServiceException, ParserConfigurationException, SAXException, ParseException;
    
    /**
    * You can retrieve historical usage metrics for a site by issuing an HTTP
    * GET request.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/dn166964.aspx for
    * more information)
    *
    * @param webSpaceName The name of the web space.
    * @param webSiteName The name of the web site.
    * @param parameters The Get Web Site Historical Usage Metrics parameters.
    * @return The Get Web Site Historical Usage Metrics operation response.
    */
    Future<WebSiteGetHistoricalUsageMetricsResponse> getHistoricalUsageMetricsAsync(String webSpaceName, String webSiteName, WebSiteGetHistoricalUsageMetricsParameters parameters);
    
    /**
    * You can retrieve the publish settings information for a web site by
    * issuing an HTTP GET request.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/dn166996.aspx for
    * more information)
    *
    * @param webSpaceName The name of the web space.
    * @param webSiteName The name of the web site.
    * @return The Get Web Site Publish Profile operation response.
    */
    WebSiteGetPublishProfileResponse getPublishProfile(String webSpaceName, String webSiteName) throws IOException, ServiceException, ParserConfigurationException, SAXException, URISyntaxException;
    
    /**
    * You can retrieve the publish settings information for a web site by
    * issuing an HTTP GET request.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/dn166996.aspx for
    * more information)
    *
    * @param webSpaceName The name of the web space.
    * @param webSiteName The name of the web site.
    * @return The Get Web Site Publish Profile operation response.
    */
    Future<WebSiteGetPublishProfileResponse> getPublishProfileAsync(String webSpaceName, String webSiteName);
    
    /**
    * A web site repository is essentially a GIT repository that you can use to
    * manage your web site content. By using GIT source control tools, you can
    * push or pull version controlled changes to your site. You can create a
    * repository for your web site by issuing an HTTP POST request, or
    * retrieve information about the repository by using HTTP GET.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/dn166967.aspx for
    * more information)
    *
    * @param webSpaceName The name of the web space.
    * @param webSiteName The name of the web site.
    * @return The Get Web Site Repository operation response.
    */
    WebSiteGetRepositoryResponse getRepository(String webSpaceName, String webSiteName) throws IOException, ServiceException, ParserConfigurationException, SAXException, URISyntaxException;
    
    /**
    * A web site repository is essentially a GIT repository that you can use to
    * manage your web site content. By using GIT source control tools, you can
    * push or pull version controlled changes to your site. You can create a
    * repository for your web site by issuing an HTTP POST request, or
    * retrieve information about the repository by using HTTP GET.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/dn166967.aspx for
    * more information)
    *
    * @param webSpaceName The name of the web space.
    * @param webSiteName The name of the web site.
    * @return The Get Web Site Repository operation response.
    */
    Future<WebSiteGetRepositoryResponse> getRepositoryAsync(String webSpaceName, String webSiteName);
    
    /**
    * You can retrieve a site's current usage metrics by issuing an HTTP GET
    * request. The metrics returned include CPU Time, Data In, Data Out, Local
    * bytes read, Local bytes written, Network bytes read, Network bytes
    * written, WP stop requests, Memory Usage, CPU Time - Minute Limit, and
    * File System Storage.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/dn166991.aspx for
    * more information)
    *
    * @param webSpaceName The name of the web space.
    * @param webSiteName The name of the web site.
    * @return The Get Web Site Usage Metrics operation response.
    */
    WebSiteGetUsageMetricsResponse getUsageMetrics(String webSpaceName, String webSiteName) throws IOException, ServiceException, ParserConfigurationException, SAXException, ParseException;
    
    /**
    * You can retrieve a site's current usage metrics by issuing an HTTP GET
    * request. The metrics returned include CPU Time, Data In, Data Out, Local
    * bytes read, Local bytes written, Network bytes read, Network bytes
    * written, WP stop requests, Memory Usage, CPU Time - Minute Limit, and
    * File System Storage.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/dn166991.aspx for
    * more information)
    *
    * @param webSpaceName The name of the web space.
    * @param webSiteName The name of the web site.
    * @return The Get Web Site Usage Metrics operation response.
    */
    Future<WebSiteGetUsageMetricsResponse> getUsageMetricsAsync(String webSpaceName, String webSiteName);
    
    /**
    * You can restart a web site by issuing an HTTP POST request.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/dn236425.aspx for
    * more information)
    *
    * @param webSpaceName The name of the web space.
    * @param webSiteName The name of the web site.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    OperationResponse restart(String webSpaceName, String webSiteName) throws IOException, ServiceException;
    
    /**
    * You can restart a web site by issuing an HTTP POST request.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/dn236425.aspx for
    * more information)
    *
    * @param webSpaceName The name of the web space.
    * @param webSiteName The name of the web site.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<OperationResponse> restartAsync(String webSpaceName, String webSiteName);
    
    /**
    * You can update the settings for a web site by using the HTTP PUT method
    * and by specifying the settings in the request body.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/dn167005.aspx for
    * more information)
    *
    * @param webSpaceName The name of the web space.
    * @param webSiteName The name of the web site.
    * @param parameters Parameters supplied to the Update Web Site operation.
    * @return The Update Web Site operation response.
    */
    WebSiteUpdateResponse update(String webSpaceName, String webSiteName, WebSiteUpdateParameters parameters) throws ParserConfigurationException, SAXException, TransformerConfigurationException, TransformerException, UnsupportedEncodingException, IOException, ServiceException, ParseException, URISyntaxException;
    
    /**
    * You can update the settings for a web site by using the HTTP PUT method
    * and by specifying the settings in the request body.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/dn167005.aspx for
    * more information)
    *
    * @param webSpaceName The name of the web space.
    * @param webSiteName The name of the web site.
    * @param parameters Parameters supplied to the Update Web Site operation.
    * @return The Update Web Site operation response.
    */
    Future<WebSiteUpdateResponse> updateAsync(String webSpaceName, String webSiteName, WebSiteUpdateParameters parameters);
    
    /**
    * You can retrieve the config settings for a web site by issuing an HTTP
    * GET request, or update them by using HTTP PUT with a request body that
    * contains the settings to be updated.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/dn166985.aspx for
    * more information)
    *
    * @param webSpaceName The name of the web space.
    * @param webSiteName The name of the web site.
    * @param parameters The Update Web Site Configuration parameters.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    OperationResponse updateConfiguration(String webSpaceName, String webSiteName, WebSiteUpdateConfigurationParameters parameters) throws ParserConfigurationException, SAXException, TransformerConfigurationException, TransformerException, UnsupportedEncodingException, IOException, ServiceException;
    
    /**
    * You can retrieve the config settings for a web site by issuing an HTTP
    * GET request, or update them by using HTTP PUT with a request body that
    * contains the settings to be updated.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/dn166985.aspx for
    * more information)
    *
    * @param webSpaceName The name of the web space.
    * @param webSiteName The name of the web site.
    * @param parameters The Update Web Site Configuration parameters.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<OperationResponse> updateConfigurationAsync(String webSpaceName, String webSiteName, WebSiteUpdateConfigurationParameters parameters);
}
