package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;

@Canonical
class CreateModerationResponseResultsInnerCategoryAppliedInputTypes {

    enum HateEnum {
    
        TEXT("text")
    
        private final String value
    
        HateEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* The applied input type(s) for the category 'hate'. */
    List<HateEnum> hate = new ArrayList<>()

    enum HateThreateningEnum {
    
        TEXT("text")
    
        private final String value
    
        HateThreateningEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* The applied input type(s) for the category 'hate/threatening'. */
    List<HateThreateningEnum> hateThreatening = new ArrayList<>()

    enum HarassmentEnum {
    
        TEXT("text")
    
        private final String value
    
        HarassmentEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* The applied input type(s) for the category 'harassment'. */
    List<HarassmentEnum> harassment = new ArrayList<>()

    enum HarassmentThreateningEnum {
    
        TEXT("text")
    
        private final String value
    
        HarassmentThreateningEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* The applied input type(s) for the category 'harassment/threatening'. */
    List<HarassmentThreateningEnum> harassmentThreatening = new ArrayList<>()

    enum IllicitEnum {
    
        TEXT("text")
    
        private final String value
    
        IllicitEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* The applied input type(s) for the category 'illicit'. */
    List<IllicitEnum> illicit = new ArrayList<>()

    enum IllicitViolentEnum {
    
        TEXT("text")
    
        private final String value
    
        IllicitViolentEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* The applied input type(s) for the category 'illicit/violent'. */
    List<IllicitViolentEnum> illicitViolent = new ArrayList<>()

    enum SelfHarmEnum {
    
        TEXT("text"),
        
        IMAGE("image")
    
        private final String value
    
        SelfHarmEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* The applied input type(s) for the category 'self-harm'. */
    List<SelfHarmEnum> selfHarm = new ArrayList<>()

    enum SelfHarmIntentEnum {
    
        TEXT("text"),
        
        IMAGE("image")
    
        private final String value
    
        SelfHarmIntentEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* The applied input type(s) for the category 'self-harm/intent'. */
    List<SelfHarmIntentEnum> selfHarmIntent = new ArrayList<>()

    enum SelfHarmInstructionsEnum {
    
        TEXT("text"),
        
        IMAGE("image")
    
        private final String value
    
        SelfHarmInstructionsEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* The applied input type(s) for the category 'self-harm/instructions'. */
    List<SelfHarmInstructionsEnum> selfHarmInstructions = new ArrayList<>()

    enum SexualEnum {
    
        TEXT("text"),
        
        IMAGE("image")
    
        private final String value
    
        SexualEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* The applied input type(s) for the category 'sexual'. */
    List<SexualEnum> sexual = new ArrayList<>()

    enum SexualMinorsEnum {
    
        TEXT("text")
    
        private final String value
    
        SexualMinorsEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* The applied input type(s) for the category 'sexual/minors'. */
    List<SexualMinorsEnum> sexualMinors = new ArrayList<>()

    enum ViolenceEnum {
    
        TEXT("text"),
        
        IMAGE("image")
    
        private final String value
    
        ViolenceEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* The applied input type(s) for the category 'violence'. */
    List<ViolenceEnum> violence = new ArrayList<>()

    enum ViolenceGraphicEnum {
    
        TEXT("text"),
        
        IMAGE("image")
    
        private final String value
    
        ViolenceGraphicEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* The applied input type(s) for the category 'violence/graphic'. */
    List<ViolenceGraphicEnum> violenceGraphic = new ArrayList<>()
}
