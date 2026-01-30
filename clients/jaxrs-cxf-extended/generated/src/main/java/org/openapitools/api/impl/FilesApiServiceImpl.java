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

import io.swagger.annotations.Api;

/**
 * OpenAI API
 *
 * <p>The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 */
public class FilesApiServiceImpl implements FilesApi {
    /**
     * Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports &#x60;.jsonl&#x60; files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports &#x60;.jsonl&#x60; files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
     *
     */
    @Override
    public OpenAIFile createFile( Attachment _fileDetail, String purpose) {
        // TODO: Implement...
        return null;
    }

    /**
     * Delete a file.
     *
     */
    @Override
    public DeleteFileResponse deleteFile(String fileId) {
        // TODO: Implement...
        return null;
    }

    /**
     * Returns the contents of the specified file.
     *
     */
    @Override
    public String downloadFile(String fileId) {
        // TODO: Implement...
        return null;
    }

    /**
     * Returns a list of files.
     *
     */
    @Override
    public ListFilesResponse listFiles(String purpose, Integer limit, String order, String after) {
        // TODO: Implement...
        return null;
    }

    /**
     * Returns information about a specific file.
     *
     */
    @Override
    public OpenAIFile retrieveFile(String fileId) {
        // TODO: Implement...
        return null;
    }

}
