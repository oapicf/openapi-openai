package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.Invite;

@Canonical
class InviteListResponse {

    enum ObjectEnum {
    
        LIST("list")
    
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

    /* The object type, which is always `list` */
    ObjectEnum _object
    
    List<Invite> data = new ArrayList<>()
    /* The first `invite_id` in the retrieved `list` */
    String firstId
    /* The last `invite_id` in the retrieved `list` */
    String lastId
    /* The `has_more` property is used for pagination to indicate there are additional results. */
    Boolean hasMore
}
