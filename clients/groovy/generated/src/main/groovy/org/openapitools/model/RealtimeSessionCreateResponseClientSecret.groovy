package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class RealtimeSessionCreateResponseClientSecret {
    /* Ephemeral key usable in client environments to authenticate connections to the Realtime API. Use this in client-side environments rather than a standard API token, which should only be used server-side.  */
    String value
    /* Timestamp for when the token expires. Currently, all tokens expire after one minute.  */
    Integer expiresAt
}
