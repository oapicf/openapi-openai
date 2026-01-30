# AuditLogsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listAuditLogs**](AuditLogsApi.md#listAuditLogs) | **GET** /organization/audit_logs | List user actions and configuration changes within this organization.
[**listAuditLogsWithHttpInfo**](AuditLogsApi.md#listAuditLogsWithHttpInfo) | **GET** /organization/audit_logs | List user actions and configuration changes within this organization.



## listAuditLogs

> listAuditLogs(listAuditLogsRequest): ApiRequest[ListAuditLogsResponse]

List user actions and configuration changes within this organization.

### Example

```scala
// Import classes:
import 
import 
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    implicit val ApiKeyAuth: BearerToken = BearerToken("BEARER TOKEN")

    val apiInvoker = ApiInvoker()
    val apiInstance = AuditLogsApi("https://api.openai.com/v1")
    val effectiveAt: ListAuditLogsEffectiveAtParameter =  // ListAuditLogsEffectiveAtParameter | Return only events whose `effective_at` (Unix seconds) is in this range.

    val projectIds: Seq[String] =  // Seq[String] | Return only events for these projects.

    val eventTypes: Seq[AuditLogEventType] =  // Seq[AuditLogEventType] | Return only events with a `type` in one of these values. For example, `project.created`. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object).

    val actorIds: Seq[String] =  // Seq[String] | Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID.

    val actorEmails: Seq[String] =  // Seq[String] | Return only events performed by users with these emails.

    val resourceIds: Seq[String] =  // Seq[String] | Return only events performed on these targets. For example, a project ID updated.

    val limit: Int = 56 // Int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 

    val after: String = after_example // String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 

    val before: String = before_example // String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
    
    val request = apiInstance.listAuditLogs(effectiveAt, projectIds, eventTypes, actorIds, actorEmails, resourceIds, limit, after, before)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling AuditLogsApi#listAuditLogs")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling AuditLogsApi#listAuditLogs")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **effectiveAt** | [**ListAuditLogsEffectiveAtParameter**](.md)| Return only events whose &#x60;effective_at&#x60; (Unix seconds) is in this range. | [optional]
 **projectIds** | [**Seq[String]**](String.md)| Return only events for these projects. | [optional]
 **eventTypes** | [**Seq[AuditLogEventType]**](AuditLogEventType.md)| Return only events with a &#x60;type&#x60; in one of these values. For example, &#x60;project.created&#x60;. For all options, see the documentation for the [audit log object](/docs/api-reference/audit-logs/object). | [optional]
 **actorIds** | [**Seq[String]**](String.md)| Return only events performed by these actors. Can be a user ID, a service account ID, or an api key tracking ID. | [optional]
 **actorEmails** | [**Seq[String]**](String.md)| Return only events performed by users with these emails. | [optional]
 **resourceIds** | [**Seq[String]**](String.md)| Return only events performed on these targets. For example, a project ID updated. | [optional]
 **limit** | **Int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional]
 **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional]
 **before** | **String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional]

### Return type

ApiRequest[[**ListAuditLogsResponse**](ListAuditLogsResponse.md)]


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Audit logs listed successfully. |  -  |

