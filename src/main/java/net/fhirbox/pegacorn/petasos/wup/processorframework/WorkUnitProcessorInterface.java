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
package net.fhirbox.pegacorn.petasos.wup.processorframework;

import java.util.Set;
import net.fhirbox.pegacorn.petasos.model.ComponentStatusEnum;
import net.fhirbox.pegacorn.petasos.model.FDN;
import net.fhirbox.pegacorn.petasos.model.PetasosParcel;
import net.fhirbox.pegacorn.petasos.model.UoW;

/**
 *
 * @author Mark A. Hunter (ACT Health)
 */
public interface WorkUnitProcessorInterface
{
 	public FDN getProcessorFDN();
	public void setProcessorFDN(FDN wupFDN);

        public PetasosParcel getCurrentParcel();
	public void setCurrentParcel(PetasosParcel activeParcel);

        public FDN getSupportedFunctionFDN();
	public void setSupportedFunctionFDN(FDN supportedFunctionFDN);

        public ComponentStatusEnum getProcessorStatus();
	public void setProcessorStatus(ComponentStatusEnum processorStatus);
        
        public void receivePredecessorParcel(PetasosParcel predeceessor);

        public void registerIngressPoint( String ingressPoint, Set<String> ingressObjectDescriptorSet);
        public void registerEgressPoint( String egressPoint, Set<String> egressObjectDescriptorSet);
        
        public void setSupportIngressObjectDescriptorSet( Set<String> supportedIngressObjectDescriptors);
        public Set<String> getSupportIngressObjectDescriptorSet();

        public void setSupportedEgressObjectDescriptorSet( Set<String> supportedEgressObjectDescriptors);
        public Set<String> setSupportedEgressObjectDescriptorSet();
}