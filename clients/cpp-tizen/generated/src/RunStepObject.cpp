#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RunStepObject.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RunStepObject::RunStepObject()
{
	//__init();
}

RunStepObject::~RunStepObject()
{
	//__cleanup();
}

void
RunStepObject::__init()
{
	//id = std::string();
	//object = std::string();
	//created_at = int(0);
	//assistant_id = std::string();
	//thread_id = std::string();
	//run_id = std::string();
	//type = std::string();
	//status = std::string();
	//step_details = new RunStepObject_step_details();
	//last_error = new RunStepObject_last_error();
	//expired_at = int(0);
	//cancelled_at = int(0);
	//failed_at = int(0);
	//completed_at = int(0);
	//metadata = null;
	//usage = new RunStepCompletionUsage();
}

void
RunStepObject::__cleanup()
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
	//if(created_at != NULL) {
	//
	//delete created_at;
	//created_at = NULL;
	//}
	//if(assistant_id != NULL) {
	//
	//delete assistant_id;
	//assistant_id = NULL;
	//}
	//if(thread_id != NULL) {
	//
	//delete thread_id;
	//thread_id = NULL;
	//}
	//if(run_id != NULL) {
	//
	//delete run_id;
	//run_id = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(step_details != NULL) {
	//
	//delete step_details;
	//step_details = NULL;
	//}
	//if(last_error != NULL) {
	//
	//delete last_error;
	//last_error = NULL;
	//}
	//if(expired_at != NULL) {
	//
	//delete expired_at;
	//expired_at = NULL;
	//}
	//if(cancelled_at != NULL) {
	//
	//delete cancelled_at;
	//cancelled_at = NULL;
	//}
	//if(failed_at != NULL) {
	//
	//delete failed_at;
	//failed_at = NULL;
	//}
	//if(completed_at != NULL) {
	//
	//delete completed_at;
	//completed_at = NULL;
	//}
	//if(metadata != NULL) {
	//
	//delete metadata;
	//metadata = NULL;
	//}
	//if(usage != NULL) {
	//
	//delete usage;
	//usage = NULL;
	//}
	//
}

void
RunStepObject::fromJson(char* jsonStr)
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
	const gchar *created_atKey = "created_at";
	node = json_object_get_member(pJsonObject, created_atKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&created_at, node, "int", "");
		} else {
			
		}
	}
	const gchar *assistant_idKey = "assistant_id";
	node = json_object_get_member(pJsonObject, assistant_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&assistant_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *thread_idKey = "thread_id";
	node = json_object_get_member(pJsonObject, thread_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&thread_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *run_idKey = "run_id";
	node = json_object_get_member(pJsonObject, run_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&run_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&type, node, "std::string", "");
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
	const gchar *step_detailsKey = "step_details";
	node = json_object_get_member(pJsonObject, step_detailsKey);
	if (node !=NULL) {
	

		if (isprimitive("RunStepObject_step_details")) {
			jsonToValue(&step_details, node, "RunStepObject_step_details", "RunStepObject_step_details");
		} else {
			
			RunStepObject_step_details* obj = static_cast<RunStepObject_step_details*> (&step_details);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *last_errorKey = "last_error";
	node = json_object_get_member(pJsonObject, last_errorKey);
	if (node !=NULL) {
	

		if (isprimitive("RunStepObject_last_error")) {
			jsonToValue(&last_error, node, "RunStepObject_last_error", "RunStepObject_last_error");
		} else {
			
			RunStepObject_last_error* obj = static_cast<RunStepObject_last_error*> (&last_error);
			obj->fromJson(json_to_string(node, false));
			
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
	const gchar *cancelled_atKey = "cancelled_at";
	node = json_object_get_member(pJsonObject, cancelled_atKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&cancelled_at, node, "int", "");
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
	const gchar *completed_atKey = "completed_at";
	node = json_object_get_member(pJsonObject, completed_atKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&completed_at, node, "int", "");
		} else {
			
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
	const gchar *usageKey = "usage";
	node = json_object_get_member(pJsonObject, usageKey);
	if (node !=NULL) {
	

		if (isprimitive("RunStepCompletionUsage")) {
			jsonToValue(&usage, node, "RunStepCompletionUsage", "RunStepCompletionUsage");
		} else {
			
			RunStepCompletionUsage* obj = static_cast<RunStepCompletionUsage*> (&usage);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

RunStepObject::RunStepObject(char* json)
{
	this->fromJson(json);
}

char*
RunStepObject::toJson()
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
	if (isprimitive("int")) {
		int obj = getCreatedAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *created_atKey = "created_at";
	json_object_set_member(pJsonObject, created_atKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAssistantId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *assistant_idKey = "assistant_id";
	json_object_set_member(pJsonObject, assistant_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getThreadId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *thread_idKey = "thread_id";
	json_object_set_member(pJsonObject, thread_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getRunId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *run_idKey = "run_id";
	json_object_set_member(pJsonObject, run_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getStatus();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("RunStepObject_step_details")) {
		RunStepObject_step_details obj = getStepDetails();
		node = converttoJson(&obj, "RunStepObject_step_details", "");
	}
	else {
		
		RunStepObject_step_details obj = static_cast<RunStepObject_step_details> (getStepDetails());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *step_detailsKey = "step_details";
	json_object_set_member(pJsonObject, step_detailsKey, node);
	if (isprimitive("RunStepObject_last_error")) {
		RunStepObject_last_error obj = getLastError();
		node = converttoJson(&obj, "RunStepObject_last_error", "");
	}
	else {
		
		RunStepObject_last_error obj = static_cast<RunStepObject_last_error> (getLastError());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *last_errorKey = "last_error";
	json_object_set_member(pJsonObject, last_errorKey, node);
	if (isprimitive("int")) {
		int obj = getExpiredAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *expired_atKey = "expired_at";
	json_object_set_member(pJsonObject, expired_atKey, node);
	if (isprimitive("int")) {
		int obj = getCancelledAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *cancelled_atKey = "cancelled_at";
	json_object_set_member(pJsonObject, cancelled_atKey, node);
	if (isprimitive("int")) {
		int obj = getFailedAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *failed_atKey = "failed_at";
	json_object_set_member(pJsonObject, failed_atKey, node);
	if (isprimitive("int")) {
		int obj = getCompletedAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *completed_atKey = "completed_at";
	json_object_set_member(pJsonObject, completed_atKey, node);
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
	if (isprimitive("RunStepCompletionUsage")) {
		RunStepCompletionUsage obj = getUsage();
		node = converttoJson(&obj, "RunStepCompletionUsage", "");
	}
	else {
		
		RunStepCompletionUsage obj = static_cast<RunStepCompletionUsage> (getUsage());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *usageKey = "usage";
	json_object_set_member(pJsonObject, usageKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
RunStepObject::getId()
{
	return id;
}

void
RunStepObject::setId(std::string  id)
{
	this->id = id;
}

std::string
RunStepObject::getObject()
{
	return object;
}

void
RunStepObject::setObject(std::string  object)
{
	this->object = object;
}

int
RunStepObject::getCreatedAt()
{
	return created_at;
}

void
RunStepObject::setCreatedAt(int  created_at)
{
	this->created_at = created_at;
}

std::string
RunStepObject::getAssistantId()
{
	return assistant_id;
}

void
RunStepObject::setAssistantId(std::string  assistant_id)
{
	this->assistant_id = assistant_id;
}

std::string
RunStepObject::getThreadId()
{
	return thread_id;
}

void
RunStepObject::setThreadId(std::string  thread_id)
{
	this->thread_id = thread_id;
}

std::string
RunStepObject::getRunId()
{
	return run_id;
}

void
RunStepObject::setRunId(std::string  run_id)
{
	this->run_id = run_id;
}

std::string
RunStepObject::getType()
{
	return type;
}

void
RunStepObject::setType(std::string  type)
{
	this->type = type;
}

std::string
RunStepObject::getStatus()
{
	return status;
}

void
RunStepObject::setStatus(std::string  status)
{
	this->status = status;
}

RunStepObject_step_details
RunStepObject::getStepDetails()
{
	return step_details;
}

void
RunStepObject::setStepDetails(RunStepObject_step_details  step_details)
{
	this->step_details = step_details;
}

RunStepObject_last_error
RunStepObject::getLastError()
{
	return last_error;
}

void
RunStepObject::setLastError(RunStepObject_last_error  last_error)
{
	this->last_error = last_error;
}

int
RunStepObject::getExpiredAt()
{
	return expired_at;
}

void
RunStepObject::setExpiredAt(int  expired_at)
{
	this->expired_at = expired_at;
}

int
RunStepObject::getCancelledAt()
{
	return cancelled_at;
}

void
RunStepObject::setCancelledAt(int  cancelled_at)
{
	this->cancelled_at = cancelled_at;
}

int
RunStepObject::getFailedAt()
{
	return failed_at;
}

void
RunStepObject::setFailedAt(int  failed_at)
{
	this->failed_at = failed_at;
}

int
RunStepObject::getCompletedAt()
{
	return completed_at;
}

void
RunStepObject::setCompletedAt(int  completed_at)
{
	this->completed_at = completed_at;
}

std::string
RunStepObject::getMetadata()
{
	return metadata;
}

void
RunStepObject::setMetadata(std::string  metadata)
{
	this->metadata = metadata;
}

RunStepCompletionUsage
RunStepObject::getUsage()
{
	return usage;
}

void
RunStepObject::setUsage(RunStepCompletionUsage  usage)
{
	this->usage = usage;
}


