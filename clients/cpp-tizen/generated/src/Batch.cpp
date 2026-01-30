#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Batch.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Batch::Batch()
{
	//__init();
}

Batch::~Batch()
{
	//__cleanup();
}

void
Batch::__init()
{
	//id = std::string();
	//object = std::string();
	//endpoint = std::string();
	//errors = new Batch_errors();
	//input_file_id = std::string();
	//completion_window = std::string();
	//status = std::string();
	//output_file_id = std::string();
	//error_file_id = std::string();
	//created_at = int(0);
	//in_progress_at = int(0);
	//expires_at = int(0);
	//finalizing_at = int(0);
	//completed_at = int(0);
	//failed_at = int(0);
	//expired_at = int(0);
	//cancelling_at = int(0);
	//cancelled_at = int(0);
	//request_counts = new Batch_request_counts();
	//metadata = null;
}

void
Batch::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(object != NULL) {
	//
	//delete object;
	//object = NULL;
	//}
	//if(endpoint != NULL) {
	//
	//delete endpoint;
	//endpoint = NULL;
	//}
	//if(errors != NULL) {
	//
	//delete errors;
	//errors = NULL;
	//}
	//if(input_file_id != NULL) {
	//
	//delete input_file_id;
	//input_file_id = NULL;
	//}
	//if(completion_window != NULL) {
	//
	//delete completion_window;
	//completion_window = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(output_file_id != NULL) {
	//
	//delete output_file_id;
	//output_file_id = NULL;
	//}
	//if(error_file_id != NULL) {
	//
	//delete error_file_id;
	//error_file_id = NULL;
	//}
	//if(created_at != NULL) {
	//
	//delete created_at;
	//created_at = NULL;
	//}
	//if(in_progress_at != NULL) {
	//
	//delete in_progress_at;
	//in_progress_at = NULL;
	//}
	//if(expires_at != NULL) {
	//
	//delete expires_at;
	//expires_at = NULL;
	//}
	//if(finalizing_at != NULL) {
	//
	//delete finalizing_at;
	//finalizing_at = NULL;
	//}
	//if(completed_at != NULL) {
	//
	//delete completed_at;
	//completed_at = NULL;
	//}
	//if(failed_at != NULL) {
	//
	//delete failed_at;
	//failed_at = NULL;
	//}
	//if(expired_at != NULL) {
	//
	//delete expired_at;
	//expired_at = NULL;
	//}
	//if(cancelling_at != NULL) {
	//
	//delete cancelling_at;
	//cancelling_at = NULL;
	//}
	//if(cancelled_at != NULL) {
	//
	//delete cancelled_at;
	//cancelled_at = NULL;
	//}
	//if(request_counts != NULL) {
	//
	//delete request_counts;
	//request_counts = NULL;
	//}
	//if(metadata != NULL) {
	//
	//delete metadata;
	//metadata = NULL;
	//}
	//
}

void
Batch::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *objectKey = "object";
	node = json_object_get_member(pJsonObject, objectKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&object, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *endpointKey = "endpoint";
	node = json_object_get_member(pJsonObject, endpointKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&endpoint, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *errorsKey = "errors";
	node = json_object_get_member(pJsonObject, errorsKey);
	if (node !=NULL) {
	

		if (isprimitive("Batch_errors")) {
			jsonToValue(&errors, node, "Batch_errors", "Batch_errors");
		} else {
			
			Batch_errors* obj = static_cast<Batch_errors*> (&errors);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *input_file_idKey = "input_file_id";
	node = json_object_get_member(pJsonObject, input_file_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&input_file_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *completion_windowKey = "completion_window";
	node = json_object_get_member(pJsonObject, completion_windowKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&completion_window, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&status, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *output_file_idKey = "output_file_id";
	node = json_object_get_member(pJsonObject, output_file_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&output_file_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *error_file_idKey = "error_file_id";
	node = json_object_get_member(pJsonObject, error_file_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&error_file_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *created_atKey = "created_at";
	node = json_object_get_member(pJsonObject, created_atKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&created_at, node, "int", "");
		} else {
			
		}
	}
	const gchar *in_progress_atKey = "in_progress_at";
	node = json_object_get_member(pJsonObject, in_progress_atKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&in_progress_at, node, "int", "");
		} else {
			
		}
	}
	const gchar *expires_atKey = "expires_at";
	node = json_object_get_member(pJsonObject, expires_atKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&expires_at, node, "int", "");
		} else {
			
		}
	}
	const gchar *finalizing_atKey = "finalizing_at";
	node = json_object_get_member(pJsonObject, finalizing_atKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&finalizing_at, node, "int", "");
		} else {
			
		}
	}
	const gchar *completed_atKey = "completed_at";
	node = json_object_get_member(pJsonObject, completed_atKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&completed_at, node, "int", "");
		} else {
			
		}
	}
	const gchar *failed_atKey = "failed_at";
	node = json_object_get_member(pJsonObject, failed_atKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&failed_at, node, "int", "");
		} else {
			
		}
	}
	const gchar *expired_atKey = "expired_at";
	node = json_object_get_member(pJsonObject, expired_atKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&expired_at, node, "int", "");
		} else {
			
		}
	}
	const gchar *cancelling_atKey = "cancelling_at";
	node = json_object_get_member(pJsonObject, cancelling_atKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&cancelling_at, node, "int", "");
		} else {
			
		}
	}
	const gchar *cancelled_atKey = "cancelled_at";
	node = json_object_get_member(pJsonObject, cancelled_atKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&cancelled_at, node, "int", "");
		} else {
			
		}
	}
	const gchar *request_countsKey = "request_counts";
	node = json_object_get_member(pJsonObject, request_countsKey);
	if (node !=NULL) {
	

		if (isprimitive("Batch_request_counts")) {
			jsonToValue(&request_counts, node, "Batch_request_counts", "Batch_request_counts");
		} else {
			
			Batch_request_counts* obj = static_cast<Batch_request_counts*> (&request_counts);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *metadataKey = "metadata";
	node = json_object_get_member(pJsonObject, metadataKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&metadata, node, "std::string", "");
		} else {
			
			std::string* obj = static_cast<std::string*> (&metadata);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

Batch::Batch(char* json)
{
	this->fromJson(json);
}

char*
Batch::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getObject();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *objectKey = "object";
	json_object_set_member(pJsonObject, objectKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getEndpoint();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *endpointKey = "endpoint";
	json_object_set_member(pJsonObject, endpointKey, node);
	if (isprimitive("Batch_errors")) {
		Batch_errors obj = getErrors();
		node = converttoJson(&obj, "Batch_errors", "");
	}
	else {
		
		Batch_errors obj = static_cast<Batch_errors> (getErrors());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *errorsKey = "errors";
	json_object_set_member(pJsonObject, errorsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getInputFileId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *input_file_idKey = "input_file_id";
	json_object_set_member(pJsonObject, input_file_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCompletionWindow();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *completion_windowKey = "completion_window";
	json_object_set_member(pJsonObject, completion_windowKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getStatus();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getOutputFileId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *output_file_idKey = "output_file_id";
	json_object_set_member(pJsonObject, output_file_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getErrorFileId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *error_file_idKey = "error_file_id";
	json_object_set_member(pJsonObject, error_file_idKey, node);
	if (isprimitive("int")) {
		int obj = getCreatedAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *created_atKey = "created_at";
	json_object_set_member(pJsonObject, created_atKey, node);
	if (isprimitive("int")) {
		int obj = getInProgressAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *in_progress_atKey = "in_progress_at";
	json_object_set_member(pJsonObject, in_progress_atKey, node);
	if (isprimitive("int")) {
		int obj = getExpiresAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *expires_atKey = "expires_at";
	json_object_set_member(pJsonObject, expires_atKey, node);
	if (isprimitive("int")) {
		int obj = getFinalizingAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *finalizing_atKey = "finalizing_at";
	json_object_set_member(pJsonObject, finalizing_atKey, node);
	if (isprimitive("int")) {
		int obj = getCompletedAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *completed_atKey = "completed_at";
	json_object_set_member(pJsonObject, completed_atKey, node);
	if (isprimitive("int")) {
		int obj = getFailedAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *failed_atKey = "failed_at";
	json_object_set_member(pJsonObject, failed_atKey, node);
	if (isprimitive("int")) {
		int obj = getExpiredAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *expired_atKey = "expired_at";
	json_object_set_member(pJsonObject, expired_atKey, node);
	if (isprimitive("int")) {
		int obj = getCancellingAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *cancelling_atKey = "cancelling_at";
	json_object_set_member(pJsonObject, cancelling_atKey, node);
	if (isprimitive("int")) {
		int obj = getCancelledAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *cancelled_atKey = "cancelled_at";
	json_object_set_member(pJsonObject, cancelled_atKey, node);
	if (isprimitive("Batch_request_counts")) {
		Batch_request_counts obj = getRequestCounts();
		node = converttoJson(&obj, "Batch_request_counts", "");
	}
	else {
		
		Batch_request_counts obj = static_cast<Batch_request_counts> (getRequestCounts());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *request_countsKey = "request_counts";
	json_object_set_member(pJsonObject, request_countsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMetadata();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
		std::string obj = static_cast<std::string> (getMetadata());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *metadataKey = "metadata";
	json_object_set_member(pJsonObject, metadataKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
Batch::getId()
{
	return id;
}

void
Batch::setId(std::string  id)
{
	this->id = id;
}

std::string
Batch::getObject()
{
	return object;
}

void
Batch::setObject(std::string  object)
{
	this->object = object;
}

std::string
Batch::getEndpoint()
{
	return endpoint;
}

void
Batch::setEndpoint(std::string  endpoint)
{
	this->endpoint = endpoint;
}

Batch_errors
Batch::getErrors()
{
	return errors;
}

void
Batch::setErrors(Batch_errors  errors)
{
	this->errors = errors;
}

std::string
Batch::getInputFileId()
{
	return input_file_id;
}

void
Batch::setInputFileId(std::string  input_file_id)
{
	this->input_file_id = input_file_id;
}

std::string
Batch::getCompletionWindow()
{
	return completion_window;
}

void
Batch::setCompletionWindow(std::string  completion_window)
{
	this->completion_window = completion_window;
}

std::string
Batch::getStatus()
{
	return status;
}

void
Batch::setStatus(std::string  status)
{
	this->status = status;
}

std::string
Batch::getOutputFileId()
{
	return output_file_id;
}

void
Batch::setOutputFileId(std::string  output_file_id)
{
	this->output_file_id = output_file_id;
}

std::string
Batch::getErrorFileId()
{
	return error_file_id;
}

void
Batch::setErrorFileId(std::string  error_file_id)
{
	this->error_file_id = error_file_id;
}

int
Batch::getCreatedAt()
{
	return created_at;
}

void
Batch::setCreatedAt(int  created_at)
{
	this->created_at = created_at;
}

int
Batch::getInProgressAt()
{
	return in_progress_at;
}

void
Batch::setInProgressAt(int  in_progress_at)
{
	this->in_progress_at = in_progress_at;
}

int
Batch::getExpiresAt()
{
	return expires_at;
}

void
Batch::setExpiresAt(int  expires_at)
{
	this->expires_at = expires_at;
}

int
Batch::getFinalizingAt()
{
	return finalizing_at;
}

void
Batch::setFinalizingAt(int  finalizing_at)
{
	this->finalizing_at = finalizing_at;
}

int
Batch::getCompletedAt()
{
	return completed_at;
}

void
Batch::setCompletedAt(int  completed_at)
{
	this->completed_at = completed_at;
}

int
Batch::getFailedAt()
{
	return failed_at;
}

void
Batch::setFailedAt(int  failed_at)
{
	this->failed_at = failed_at;
}

int
Batch::getExpiredAt()
{
	return expired_at;
}

void
Batch::setExpiredAt(int  expired_at)
{
	this->expired_at = expired_at;
}

int
Batch::getCancellingAt()
{
	return cancelling_at;
}

void
Batch::setCancellingAt(int  cancelling_at)
{
	this->cancelling_at = cancelling_at;
}

int
Batch::getCancelledAt()
{
	return cancelled_at;
}

void
Batch::setCancelledAt(int  cancelled_at)
{
	this->cancelled_at = cancelled_at;
}

Batch_request_counts
Batch::getRequestCounts()
{
	return request_counts;
}

void
Batch::setRequestCounts(Batch_request_counts  request_counts)
{
	this->request_counts = request_counts;
}

std::string
Batch::getMetadata()
{
	return metadata;
}

void
Batch::setMetadata(std::string  metadata)
{
	this->metadata = metadata;
}


