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

import net.fhirbox.pegacorn.petasos.model.PetasosParcel;
import net.fhirbox.pegacorn.petasos.model.PetasosParcelBundle;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.MessageHeader;

/**
 *
 * @author Mark A. Hunter (ACT Health)
 */
public class DefaultPetasosParcelBundle implements PetasosParcelBundle
{

    Bundle theParcelBundle;
    MessageHeader theMsgHeader;
    PetasosParcel theParcel;
    boolean theBundlePOJOIsEstablished;
    String theBundleAsString;
    boolean theBundleStringIsEstablished;

    public DefaultPetasosParcelBundle(PetasosParcel parcel, MessageHeader msgHeader)
    {
        this.theParcel = parcel;
        this.theMsgHeader = msgHeader;
        this.theBundlePOJOIsEstablished = false;
        this.theBundleStringIsEstablished = false;
    }

    public DefaultPetasosParcelBundle(String parcelAsString)
    {
        this.theBundleAsString = parcelAsString;
        this.theBundlePOJOIsEstablished = false;
        this.theBundleStringIsEstablished = true;
    }
    
    public DefaultPetasosParcelBundle()
    {
        this.theBundleAsString = null;
        this.theMsgHeader = null;
        this.theParcel = null;
        this.theParcelBundle = null;
        this.theBundlePOJOIsEstablished = false;
        this.theBundleStringIsEstablished = false;        
    }

    private void createStringBundle()
    {
        // TODO : Implement code to convert between POJO and String
        this.theBundleStringIsEstablished = true;
    }

    private void createPOJOBundle()
    {
        // TODO : Implement code to convert between String and POJO
        this.theBundlePOJOIsEstablished = true;
    }

    @Override
    public void setBundleAsPOJO(Bundle thePOJO)
    {
        this.theParcelBundle = thePOJO;
    }

    @Override
    public Bundle getBundleAsPOJO()
    {
        return(this.theParcelBundle);
    }

    @Override
    public void setBundleMessageHeader(MessageHeader msgHeader)
    {
        this.theMsgHeader = msgHeader;
    }

    @Override
    public MessageHeader getBundleMessageHeader()
    {
        return(this.theMsgHeader);
    }

    @Override
    public void setPetasosParcel(PetasosParcel newParcel)
    {
        this.theParcel = newParcel;
    }

    @Override
    public PetasosParcel getPetasosParcel()
    {
        return(this.theParcel);
    }


}
