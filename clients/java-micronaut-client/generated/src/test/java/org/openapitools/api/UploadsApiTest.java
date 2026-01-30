package org.openapitools.api;

import org.openapitools.model.CompleteUploadRequest;
import org.openapitools.model.CreateUploadRequest;
import java.io.File;
import org.openapitools.model.Upload;
import org.openapitools.model.UploadPart;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

/**
 * API tests for UploadsApi
 */
@MicronautTest
public class UploadsApiTest {

    @Inject
    UploadsApi api;

    
    /**
     * Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). 
     */
    @Test
    @Disabled("Not Implemented")
    public void addUploadPartTest() {
        // given
        String uploadId = "upload_abc123";
        File data = null;

        // when
        UploadPart body = api.addUploadPart(uploadId, data).block();

        // then
        // TODO implement the addUploadPartTest()
    }

    
    /**
     * Cancels the Upload. No Parts may be added after an Upload is cancelled. 
     */
    @Test
    @Disabled("Not Implemented")
    public void cancelUploadTest() {
        // given
        String uploadId = "upload_abc123";

        // when
        Upload body = api.cancelUpload(uploadId).block();

        // then
        // TODO implement the cancelUploadTest()
    }

    
    /**
     * Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. 
     */
    @Test
    @Disabled("Not Implemented")
    public void completeUploadTest() {
        // given
        String uploadId = "upload_abc123";
        CompleteUploadRequest completeUploadRequest = new CompleteUploadRequest(Arrays.asList("example"));

        // when
        Upload body = api.completeUpload(uploadId, completeUploadRequest).block();

        // then
        // TODO implement the completeUploadTest()
    }

    
    /**
     * Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain &#x60;purpose&#x60;s, the correct &#x60;mime_type&#x60; must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). 
     */
    @Test
    @Disabled("Not Implemented")
    public void createUploadTest() {
        // given
        CreateUploadRequest createUploadRequest = new CreateUploadRequest("example", "example", 56, "example");

        // when
        Upload body = api.createUpload(createUploadRequest).block();

        // then
        // TODO implement the createUploadTest()
    }

    
}
