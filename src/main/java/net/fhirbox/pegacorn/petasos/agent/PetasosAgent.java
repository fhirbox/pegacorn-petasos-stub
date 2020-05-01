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
package net.fhirbox.pegacorn.petasos.agent;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Collection;

import net.fhirbox.pegacorn.petasos.model.ComponentStatusEnum;
import net.fhirbox.pegacorn.petasos.model.FDN;
import net.fhirbox.pegacorn.petasos.model.PetasosParcel;
import net.fhirbox.pegacorn.petasos.model.PetasosParcelRegistration;
import net.fhirbox.pegacorn.petasos.model.PetasosWUPActionSuggestionEnum;
import net.fhirbox.pegacorn.petasos.model.PetasosWUPWatchdogState;
import net.fhirbox.pegacorn.petasos.model.UoW;
import net.fhirbox.pegacorn.petasos.model.UoWProcessingOutcomeEnum;

/**
 *
 * @author mhunter
 */
public class PetasosAgent implements PetasosAgentInterface{
	
	private FDN supportedFunctionFDN;
	private FDN agentFDN;
	
	
	@Override
	public void registerWorkUnitProcessor( FDN myProcessorFDN, FDN mySupportedFunctionFDN ) {
		// register with the local Petasos::Node		
	}

	
    @Override
    public PetasosParcel registerActivity(FDN theWUPFDN, FDN theComponentFunctionFDN, UoW theUoW, FDN precursorParcelFDN){
    	return(null);
    }

    @Override
    public PetasosWUPActionSuggestionEnum startActivity(FDN parcelFDN) {
    	// Because this is a stub - of course we continue!
    	return(PetasosWUPActionSuggestionEnum.WUP_ACTION_SUGGESTION_CONTINUE);    	
    }
    
    @Override    
    public PetasosWUPActionSuggestionEnum finishActivity(FDN parcelID, UoW theFinishedUoW, UoWProcessingOutcomeEnum theFinishedUoWOutcome) {
    	return(PetasosWUPActionSuggestionEnum.WUP_ACTION_SUGGESTION_CONTINUE);
    }
    
    @Override
    public UoWProcessingOutcomeEnum finaliseActivity(FDN parcelFDN, UoW theFinishedUoW) {
    	return(UoWProcessingOutcomeEnum.PEGACORN_UOW_OUTCOME_SUCCESS);
    }
    
    @Override
    public PetasosWUPActionSuggestionEnum updateOperationalStatus( FDN wupFDN, Long presentInstant, ComponentStatusEnum presentState ) {
    	return(PetasosWUPActionSuggestionEnum.WUP_ACTION_SUGGESTION_CONTINUE);
    }
    
    @Override
    public PetasosWUPActionSuggestionEnum updateActivityStatus( FDN parcelFDN, Long presentInstant, ComponentStatusEnum presentState ) {
    	return(PetasosWUPActionSuggestionEnum.WUP_ACTION_SUGGESTION_CONTINUE);
    }

	@Override
	public PetasosWUPActionSuggestionEnum getPeerActivityStatus(FDN parcelFDN) {
    	return(PetasosWUPActionSuggestionEnum.WUP_ACTION_SUGGESTION_CONTINUE);
	}

	@Override
	public Collection<PetasosParcel> getRelevantParcels(FDN myProcessorFDN, FDN myFunctionFDN) {
		// TODO Auto-generated method stub
		return null;
	}
}
