package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.DeleteFileResponse;
import java.io.File;
import org.openapitools.model.ListFilesResponse;
import org.openapitools.model.OpenAIFile;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;


/**
 * OpenAI API
 *
 * <p>The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 */
public class FilesApiServiceImpl implements FilesApi {
    /**
     * Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports &#x60;.jsonl&#x60; files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
     *
     */
    public OpenAIFile createFile( Attachment _fileDetail, String purpose) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete a file.
     *
     */
    public DeleteFileResponse deleteFile(String fileId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Returns the contents of the specified file.
     *
     */
    public String downloadFile(String fileId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Returns a list of files that belong to the user&#39;s organization.
     *
     */
    public ListFilesResponse listFiles(String purpose) {
        // TODO: Implement...

        return null;
    }

    /**
     * Returns information about a specific file.
     *
     */
    public OpenAIFile retrieveFile(String fileId) {
        // TODO: Implement...

        return null;
    }

}
