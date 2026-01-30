package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;

@Canonical
class AuditLogApiKeyUpdatedChangesRequested {
    /* A list of scopes allowed for the API key, e.g. `[\"api.model.request\"]` */
    List<String> scopes = new ArrayList<>()
}
