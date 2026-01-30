package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;

@Canonical
class CompleteUploadRequest {
    /* The ordered list of Part IDs.  */
    List<String> partIds = new ArrayList<>()
    /* The optional md5 checksum for the file contents to verify if the bytes uploaded matches what you expect.  */
    String md5
}
