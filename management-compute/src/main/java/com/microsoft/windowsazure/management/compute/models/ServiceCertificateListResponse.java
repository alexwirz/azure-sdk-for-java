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

package com.microsoft.windowsazure.management.compute.models;

import com.microsoft.windowsazure.core.OperationResponse;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;

/**
* The List Service Certificates operation response.
*/
public class ServiceCertificateListResponse extends OperationResponse implements Iterable<ServiceCertificateListResponse.Certificate>
{
    private ArrayList<ServiceCertificateListResponse.Certificate> certificates;
    
    /**
    * The service certificates that are valid for your subscription.
    */
    public ArrayList<ServiceCertificateListResponse.Certificate> getCertificates() { return this.certificates; }
    
    /**
    * The service certificates that are valid for your subscription.
    */
    public void setCertificates(ArrayList<ServiceCertificateListResponse.Certificate> certificates) { this.certificates = certificates; }
    
    /**
    * Initializes a new instance of the ServiceCertificateListResponse class.
    *
    */
    public ServiceCertificateListResponse()
    {
        this.certificates = new ArrayList<ServiceCertificateListResponse.Certificate>();
    }
    
    /**
    * Gets the sequence of Certificates.
    *
    */
    public Iterator<ServiceCertificateListResponse.Certificate> iterator()
    {
        return this.getCertificates().iterator();
    }
    
    /**
    * A service certificate that is valid for your subscription.
    */
    public static class Certificate
    {
        private URI certificateUri;
        
        /**
        * The Service Management API request URI used to perform Get Service
        * Certificate requests against the certificate store.
        */
        public URI getCertificateUri() { return this.certificateUri; }
        
        /**
        * The Service Management API request URI used to perform Get Service
        * Certificate requests against the certificate store.
        */
        public void setCertificateUri(URI certificateUri) { this.certificateUri = certificateUri; }
        
        private byte[] data;
        
        /**
        * The public part of the service certificate as a .cer file.
        */
        public byte[] getData() { return this.data; }
        
        /**
        * The public part of the service certificate as a .cer file.
        */
        public void setData(byte[] data) { this.data = data; }
        
        private String thumbprint;
        
        /**
        * The X509 certificate thumb print property of the service certificate.
        */
        public String getThumbprint() { return this.thumbprint; }
        
        /**
        * The X509 certificate thumb print property of the service certificate.
        */
        public void setThumbprint(String thumbprint) { this.thumbprint = thumbprint; }
        
        private String thumbprintAlgorithm;
        
        /**
        * The algorithm that was used to hash the service certificate.
        * Currently SHA-1 is the only supported algorithm.
        */
        public String getThumbprintAlgorithm() { return this.thumbprintAlgorithm; }
        
        /**
        * The algorithm that was used to hash the service certificate.
        * Currently SHA-1 is the only supported algorithm.
        */
        public void setThumbprintAlgorithm(String thumbprintAlgorithm) { this.thumbprintAlgorithm = thumbprintAlgorithm; }
        
        /**
        * Initializes a new instance of the Certificate class.
        *
        */
        public Certificate()
        {
        }
    }
}
