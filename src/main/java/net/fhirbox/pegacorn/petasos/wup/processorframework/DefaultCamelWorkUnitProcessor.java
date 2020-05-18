/* 
 * The MIT License
 *
 * Copyright 2020 ACT Health (Mark A. Hunter).
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
package net.fhirbox.pegacorn.petasos.wup.processorframework;

import java.util.Set;
import net.fhirbox.pegacorn.petasos.model.ComponentStatusEnum;
import net.fhirbox.pegacorn.petasos.model.FDN;
import net.fhirbox.pegacorn.petasos.model.PetasosParcel;

/**
 *
 * @author Mark A. Hunter (ACT Health)
 * @since 2020-05-01
 */
public class DefaultCamelWorkUnitProcessor implements WorkUnitProcessorInterface
{

    private FDN processorFDN;
    private PetasosParcel currentParcel;
    private FDN supportedFunctionFDN;
    private ComponentStatusEnum processorStatus;

    public DefaultCamelWorkUnitProcessor(FDN newProcessorFDN, FDN newSupportedFunction)
    {
        this.processorFDN = newProcessorFDN;
        this.currentParcel = null;
        this.supportedFunctionFDN = newSupportedFunction;
        this.processorStatus = ComponentStatusEnum.COMPONENT_STATUS_IDLE;
    }

    /**
     * @return the wupFDN
     */
    @Override
    public FDN getProcessorFDN()
    {
        return processorFDN;
    }

    /**
     * @param wupFDN the wupFDN to set
     */
    @Override
    public void setProcessorFDN(FDN wupFDN)
    {
        this.processorFDN = wupFDN;
    }

    /**
     * @return the activeParcel
     */
    @Override
    public PetasosParcel getCurrentParcel()
    {
        return currentParcel;
    }

    /**
     * @param activeParcel the activeParcel to set
     */
    @Override
    public void setCurrentParcel(PetasosParcel activeParcel)
    {
        this.currentParcel = activeParcel;
    }

    /**
     * @return the supportedFunctionFDN
     */
    @Override
    public FDN getSupportedFunctionFDN()
    {
        return supportedFunctionFDN;
    }

    /**
     * @param supportedFunctionFDN the supportedFunctionFDN to set
     */
    @Override
    public void setSupportedFunctionFDN(FDN supportedFunctionFDN)
    {
        this.supportedFunctionFDN = supportedFunctionFDN;
    }

    /**
     * @return the processorStatus
     */
    @Override
    public ComponentStatusEnum getProcessorStatus()
    {
        return processorStatus;
    }

    /**
     * @param processorStatus the processorStatus to set
     */
    @Override
    public void setProcessorStatus(ComponentStatusEnum processorStatus)
    {
        this.processorStatus = processorStatus;
    }

    @Override
    public void receivePredecessorParcel(PetasosParcel predeceessor)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void registerIngressPoint(String ingressPoint, Set<String> ingressObjectDescriptorSet)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void registerEgressPoint(String egressPoint, Set<String> egressObjectDescriptorSet)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setSupportIngressObjectDescriptorSet(Set<String> supportedIngressObjectDescriptors)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Set<String> getSupportIngressObjectDescriptorSet()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setSupportedEgressObjectDescriptorSet(Set<String> supportedEgressObjectDescriptors)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Set<String> setSupportedEgressObjectDescriptorSet()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
