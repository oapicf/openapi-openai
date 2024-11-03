package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RunStepDeltaObjectDelta;

@Canonical
class RunStepDeltaObject {
    /* The identifier of the run step, which can be referenced in API endpoints. */
    String id

    enum ObjectEnum {
    
        THREAD_RUN_STEP_DELTA("thread.run.step.delta")
    
        private final String value
    
        ObjectEnum(String value) {
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

    /* The object type, which is always `thread.run.step.delta`. */
    ObjectEnum _object
    
    RunStepDeltaObjectDelta delta
}
