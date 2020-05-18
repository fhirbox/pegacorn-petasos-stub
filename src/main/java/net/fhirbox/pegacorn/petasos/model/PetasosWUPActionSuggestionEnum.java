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

/**
 *
 * @author ACT Health (Mark A. Hunter)
 */
public enum PetasosWUPActionSuggestionEnum {
    WUP_ACTION_SUGGESTION_PAUSE("pegacorn.petasos.agent.wup.action.pause"),
    WUP_ACTION_SUGGESTION_HALT("pegacorn.petasos.agent.wup.action.halt"),
    WUP_ACTION_SUGGESTION_CONTINUE("pegacorn.petasos.agent.wup.action.continue");
    
    private String wupActionSuggestion;
    
    private PetasosWUPActionSuggestionEnum(String newWUPAgentSuggestion ){
        this.wupActionSuggestion = newWUPAgentSuggestion;
    }
    
    public String getPetasosWUPActionSuggestion(){
        return(this.wupActionSuggestion);
    }    
}
