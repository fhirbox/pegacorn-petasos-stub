/*
 * The MIT License
 *
 * Copyright 2020 Mark A. Hunter (ACT Health).
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package net.fhirbox.pegacorn.petasos.wup.interchange;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.jms.ConnectionFactory;
import net.fhirbox.pegacorn.petasos.model.FDN;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jms.JmsComponent;
/**
 *
 * @author Mark A. Hunter (ACT Health)
 */
public class DefaultCamelIntraComponentWUPInterchange extends RouteBuilder implements WUPInterchangeServiceInterface
{
    private HashMap<String, LinkedHashSet<String>> uowContentType2WUPMap;
    private HashMap<String, LinkedHashSet<String>> wupFunctionMap;
    private HashMap<String, String> uowContentTypeTopicSet;
    
    public DefaultCamelIntraComponentWUPInterchange(){
        super();
    }
    
    // Topic Functions (Private)
    
    private void createUoWContentTypeTopic(String topicName){
        // TODO: Create a topic if a WUP indicates it will push UoW onto it OR
        // a WUP registers that it will receive content from it.
    }
    
    private void createDefaultUoWContentTypeConsumer(String topicName){
        
    }
    
    private void deleteUoWcontentTypeTopic(String topicName){
        // TODO: Delete the topic if there are no WUPs forwarding messages to it AND
        // no WUPs expecting content from it.
    }
    
    @Override
    public void configure() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String registerEgressWUP(FDN wupFDN, FDN wupFunctionFDN, Set<FDN> uowContentTypeFDN) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String registerIngressWUP(FDN wupFDN, FDN wupFunctionFDN, Set<FDN> uowContentTypeFDN) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void notifySuccessfulParcelRegistration(FDN petasosParcelFDN, FDN uowFDN) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void notifyFailedParcelRegistration(FDN uowFDN) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
