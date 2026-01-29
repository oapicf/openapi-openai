package org.openapitools.api;

import org.openapitools.model.DeleteFileResponse;
import java.io.File;
import org.openapitools.model.ListFilesResponse;
import org.openapitools.model.OpenAIFile;
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
 * API tests for FilesApi
 */
@MicronautTest
public class FilesApiTest {

    @Inject
    FilesApi api;

    
    /**
     * Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports &#x60;.jsonl&#x60; files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
     */
    @Test
    @Disabled("Not Implemented")
    public void createFileTest() {
        // given
        File _file = null;
        String purpose = "example";

        // when
        OpenAIFile body = api.createFile(_file, purpose).block();

        // then
        // TODO implement the createFileTest()
    }

    
    /**
     * Delete a file.
     */
    @Test
    @Disabled("Not Implemented")
    public void deleteFileTest() {
        // given
        String fileId = "example";

        // when
        DeleteFileResponse body = api.deleteFile(fileId).block();

        // then
        // TODO implement the deleteFileTest()
    }

    
    /**
     * Returns the contents of the specified file.
     */
    @Test
    @Disabled("Not Implemented")
    public void downloadFileTest() {
        // given
        String fileId = "example";

        // when
        String body = api.downloadFile(fileId).block();

        // then
        // TODO implement the downloadFileTest()
    }

    
    /**
     * Returns a list of files that belong to the user&#39;s organization.
     */
    @Test
    @Disabled("Not Implemented")
    public void listFilesTest() {
        // given
        String purpose = "example";

        // when
        ListFilesResponse body = api.listFiles(purpose).block();

        // then
        // TODO implement the listFilesTest()
    }

    
    /**
     * Returns information about a specific file.
     */
    @Test
    @Disabled("Not Implemented")
    public void retrieveFileTest() {
        // given
        String fileId = "example";

        // when
        OpenAIFile body = api.retrieveFile(fileId).block();

        // then
        // TODO implement the retrieveFileTest()
    }

    
}
