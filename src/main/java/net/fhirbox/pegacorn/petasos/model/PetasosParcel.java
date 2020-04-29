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
package net.fhirbox.pegacorn.petasos.model;

import java.util.Set;

/**
 *
 * @author mhunter
 */
public class PetasosParcel {
    private PetasosParcelRegistration parcelRegistration;
    private UoW actualUnitOfWork;
    private Set<FDN> successorParcelFDNs;
    private PetasosWUPWatchdogState taskProcessorState;
    private FDN precursorParcelFDN;
	/**
	 * @return the parcelRegistration
	 */
	public PetasosParcelRegistration getParcelRegistration() {
		return parcelRegistration;
	}
	/**
	 * @param parcelRegistration the parcelRegistration to set
	 */
	public void setParcelRegistration(PetasosParcelRegistration parcelRegistration) {
		this.parcelRegistration = parcelRegistration;
	}
	/**
	 * @return the actualUnitOfWork
	 */
	public UoW getActualUnitOfWork() {
		return actualUnitOfWork;
	}
	/**
	 * @param actualUnitOfWork the actualUnitOfWork to set
	 */
	public void setActualUnitOfWork(UoW actualUnitOfWork) {
		this.actualUnitOfWork = actualUnitOfWork;
	}
	/**
	 * @return the successorParcels
	 */
	public Set<FDN> getSuccessorParcels() {
		return successorParcels;
	}
	/**
	 * @param successorParcels the successorParcels to set
	 */
	public void setSuccessorParcels(Set<FDN> successorParcels) {
		this.successorParcels = successorParcels;
	}
	/**
	 * @return the taskProcessorState
	 */
	public PetasosWUPWatchdogState getTaskProcessorState() {
		return taskProcessorState;
	}
	/**
	 * @param taskProcessorState the taskProcessorState to set
	 */
	public void setTaskProcessorState(PetasosWUPWatchdogState taskProcessorState) {
		this.taskProcessorState = taskProcessorState;
	}
	/**
	 * @return the precursorParcel
	 */
	public FDN getPrecursorParcel() {
		return precursorParcel;
	}
	/**
	 * @param precursorParcel the precursorParcel to set
	 */
	public void setPrecursorParcel(FDN precursorParcel) {
		this.precursorParcel = precursorParcel;
	}
     
}
