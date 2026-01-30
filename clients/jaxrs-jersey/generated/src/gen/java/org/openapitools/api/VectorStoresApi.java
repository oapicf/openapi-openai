package org.openapitools.api;

import org.openapitools.api.VectorStoresApiService;
import org.openapitools.api.factories.VectorStoresApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.CreateVectorStoreFileBatchRequest;
import org.openapitools.model.CreateVectorStoreFileRequest;
import org.openapitools.model.CreateVectorStoreRequest;
import org.openapitools.model.DeleteVectorStoreFileResponse;
import org.openapitools.model.DeleteVectorStoreResponse;
import org.openapitools.model.ListVectorStoreFilesResponse;
import org.openapitools.model.ListVectorStoresResponse;
import org.openapitools.model.UpdateVectorStoreRequest;
import org.openapitools.model.VectorStoreFileBatchObject;
import org.openapitools.model.VectorStoreFileObject;
import org.openapitools.model.VectorStoreObject;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/vector_stores")


@io.swagger.annotations.Api(description = "the vector_stores API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-01-29T14:09:10.882541726Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class VectorStoresApi  {
   private final VectorStoresApiService delegate;

   public VectorStoresApi(@Context ServletConfig servletContext) {
      VectorStoresApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("VectorStoresApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (VectorStoresApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = VectorStoresApiServiceFactory.getVectorStoresApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.POST
    @Path("/{vector_store_id}/file_batches/{batch_id}/cancel")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.", notes = "", response = VectorStoreFileBatchObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Vector stores", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = VectorStoreFileBatchObject.class)
    })
    public Response cancelVectorStoreFileBatch(@ApiParam(value = "The ID of the vector store that the file batch belongs to.", required = true) @PathParam("vector_store_id") @NotNull  String vectorStoreId,@ApiParam(value = "The ID of the file batch to cancel.", required = true) @PathParam("batch_id") @NotNull  String batchId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.cancelVectorStoreFileBatch(vectorStoreId, batchId, securityContext);
    }
    @javax.ws.rs.POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create a vector store.", notes = "", response = VectorStoreObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Vector stores", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = VectorStoreObject.class)
    })
    public Response createVectorStore(@ApiParam(value = "", required = true) @NotNull @Valid  CreateVectorStoreRequest createVectorStoreRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createVectorStore(createVectorStoreRequest, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{vector_store_id}/files")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).", notes = "", response = VectorStoreFileObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Vector stores", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = VectorStoreFileObject.class)
    })
    public Response createVectorStoreFile(@ApiParam(value = "The ID of the vector store for which to create a File. ", required = true) @PathParam("vector_store_id") @NotNull  String vectorStoreId,@ApiParam(value = "", required = true) @NotNull @Valid  CreateVectorStoreFileRequest createVectorStoreFileRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createVectorStoreFile(vectorStoreId, createVectorStoreFileRequest, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{vector_store_id}/file_batches")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create a vector store file batch.", notes = "", response = VectorStoreFileBatchObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Vector stores", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = VectorStoreFileBatchObject.class)
    })
    public Response createVectorStoreFileBatch(@ApiParam(value = "The ID of the vector store for which to create a File Batch. ", required = true) @PathParam("vector_store_id") @NotNull  String vectorStoreId,@ApiParam(value = "", required = true) @NotNull @Valid  CreateVectorStoreFileBatchRequest createVectorStoreFileBatchRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createVectorStoreFileBatch(vectorStoreId, createVectorStoreFileBatchRequest, securityContext);
    }
    @javax.ws.rs.DELETE
    @Path("/{vector_store_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete a vector store.", notes = "", response = DeleteVectorStoreResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Vector stores", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = DeleteVectorStoreResponse.class)
    })
    public Response deleteVectorStore(@ApiParam(value = "The ID of the vector store to delete.", required = true) @PathParam("vector_store_id") @NotNull  String vectorStoreId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteVectorStore(vectorStoreId, securityContext);
    }
    @javax.ws.rs.DELETE
    @Path("/{vector_store_id}/files/{file_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.", notes = "", response = DeleteVectorStoreFileResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Vector stores", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = DeleteVectorStoreFileResponse.class)
    })
    public Response deleteVectorStoreFile(@ApiParam(value = "The ID of the vector store that the file belongs to.", required = true) @PathParam("vector_store_id") @NotNull  String vectorStoreId,@ApiParam(value = "The ID of the file to delete.", required = true) @PathParam("file_id") @NotNull  String fileId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteVectorStoreFile(vectorStoreId, fileId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{vector_store_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieves a vector store.", notes = "", response = VectorStoreObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Vector stores", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = VectorStoreObject.class)
    })
    public Response getVectorStore(@ApiParam(value = "The ID of the vector store to retrieve.", required = true) @PathParam("vector_store_id") @NotNull  String vectorStoreId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getVectorStore(vectorStoreId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{vector_store_id}/files/{file_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieves a vector store file.", notes = "", response = VectorStoreFileObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Vector stores", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = VectorStoreFileObject.class)
    })
    public Response getVectorStoreFile(@ApiParam(value = "The ID of the vector store that the file belongs to.", required = true) @PathParam("vector_store_id") @NotNull  String vectorStoreId,@ApiParam(value = "The ID of the file being retrieved.", required = true) @PathParam("file_id") @NotNull  String fileId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getVectorStoreFile(vectorStoreId, fileId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{vector_store_id}/file_batches/{batch_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Retrieves a vector store file batch.", notes = "", response = VectorStoreFileBatchObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Vector stores", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = VectorStoreFileBatchObject.class)
    })
    public Response getVectorStoreFileBatch(@ApiParam(value = "The ID of the vector store that the file batch belongs to.", required = true) @PathParam("vector_store_id") @NotNull  String vectorStoreId,@ApiParam(value = "The ID of the file batch being retrieved.", required = true) @PathParam("batch_id") @NotNull  String batchId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getVectorStoreFileBatch(vectorStoreId, batchId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{vector_store_id}/file_batches/{batch_id}/files")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns a list of vector store files in a batch.", notes = "", response = ListVectorStoreFilesResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Vector stores", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ListVectorStoreFilesResponse.class)
    })
    public Response listFilesInVectorStoreBatch(@ApiParam(value = "The ID of the vector store that the files belong to.", required = true) @PathParam("vector_store_id") @NotNull  String vectorStoreId,@ApiParam(value = "The ID of the file batch that the files belong to.", required = true) @PathParam("batch_id") @NotNull  String batchId,@ApiParam(value = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", defaultValue = "20") @DefaultValue("20") @QueryParam("limit")  Integer limit,@ApiParam(value = "Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ", allowableValues="asc, desc", defaultValue = "desc") @DefaultValue("desc") @QueryParam("order")  String order,@ApiParam(value = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ") @QueryParam("after")  String after,@ApiParam(value = "A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ") @QueryParam("before")  String before,@ApiParam(value = "Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`.", allowableValues="in_progress, completed, failed, cancelled") @QueryParam("filter")  String filter,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listFilesInVectorStoreBatch(vectorStoreId, batchId, limit, order, after, before, filter, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{vector_store_id}/files")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns a list of vector store files.", notes = "", response = ListVectorStoreFilesResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Vector stores", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ListVectorStoreFilesResponse.class)
    })
    public Response listVectorStoreFiles(@ApiParam(value = "The ID of the vector store that the files belong to.", required = true) @PathParam("vector_store_id") @NotNull  String vectorStoreId,@ApiParam(value = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", defaultValue = "20") @DefaultValue("20") @QueryParam("limit")  Integer limit,@ApiParam(value = "Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ", allowableValues="asc, desc", defaultValue = "desc") @DefaultValue("desc") @QueryParam("order")  String order,@ApiParam(value = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ") @QueryParam("after")  String after,@ApiParam(value = "A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ") @QueryParam("before")  String before,@ApiParam(value = "Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`.", allowableValues="in_progress, completed, failed, cancelled") @QueryParam("filter")  String filter,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listVectorStoreFiles(vectorStoreId, limit, order, after, before, filter, securityContext);
    }
    @javax.ws.rs.GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns a list of vector stores.", notes = "", response = ListVectorStoresResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Vector stores", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = ListVectorStoresResponse.class)
    })
    public Response listVectorStores(@ApiParam(value = "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ", defaultValue = "20") @DefaultValue("20") @QueryParam("limit")  Integer limit,@ApiParam(value = "Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. ", allowableValues="asc, desc", defaultValue = "desc") @DefaultValue("desc") @QueryParam("order")  String order,@ApiParam(value = "A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. ") @QueryParam("after")  String after,@ApiParam(value = "A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. ") @QueryParam("before")  String before,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listVectorStores(limit, order, after, before, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/{vector_store_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Modifies a vector store.", notes = "", response = VectorStoreObject.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "ApiKeyAuth")
    }, tags={ "Vector stores", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = VectorStoreObject.class)
    })
    public Response modifyVectorStore(@ApiParam(value = "The ID of the vector store to modify.", required = true) @PathParam("vector_store_id") @NotNull  String vectorStoreId,@ApiParam(value = "", required = true) @NotNull @Valid  UpdateVectorStoreRequest updateVectorStoreRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.modifyVectorStore(vectorStoreId, updateVectorStoreRequest, securityContext);
    }
}
