#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MessageObject.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MessageObject::MessageObject()
{
	//__init();
}

MessageObject::~MessageObject()
{
	//__cleanup();
}

void
MessageObject::__init()
{
	//id = std::string();
	//object = std::string();
	//created_at = int(0);
	//thread_id = std::string();
	//status = std::string();
	//incomplete_details = new MessageObject_incomplete_details();
	//completed_at = int(0);
	//incomplete_at = int(0);
	//role = std::string();
	//new std::list()std::list> content;
	//assistant_id = std::string();
	//run_id = std::string();
	//new std::list()std::list> attachments;
	//metadata = null;
}

void
MessageObject::__cleanup()
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
	//if(thread_id != NULL) {
	//
	//delete thread_id;
	//thread_id = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(incomplete_details != NULL) {
	//
	//delete incomplete_details;
	//incomplete_details = NULL;
	//}
	//if(completed_at != NULL) {
	//
	//delete completed_at;
	//completed_at = NULL;
	//}
	//if(incomplete_at != NULL) {
	//
	//delete incomplete_at;
	//incomplete_at = NULL;
	//}
	//if(role != NULL) {
	//
	//delete role;
	//role = NULL;
	//}
	//if(content != NULL) {
	//content.RemoveAll(true);
	//delete content;
	//content = NULL;
	//}
	//if(assistant_id != NULL) {
	//
	//delete assistant_id;
	//assistant_id = NULL;
	//}
	//if(run_id != NULL) {
	//
	//delete run_id;
	//run_id = NULL;
	//}
	//if(attachments != NULL) {
	//attachments.RemoveAll(true);
	//delete attachments;
	//attachments = NULL;
	//}
	//if(metadata != NULL) {
	//
	//delete metadata;
	//metadata = NULL;
	//}
	//
}

void
MessageObject::fromJson(char* jsonStr)
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
	const gchar *thread_idKey = "thread_id";
	node = json_object_get_member(pJsonObject, thread_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&thread_id, node, "std::string", "");
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
	const gchar *incomplete_detailsKey = "incomplete_details";
	node = json_object_get_member(pJsonObject, incomplete_detailsKey);
	if (node !=NULL) {
	

		if (isprimitive("MessageObject_incomplete_details")) {
			jsonToValue(&incomplete_details, node, "MessageObject_incomplete_details", "MessageObject_incomplete_details");
		} else {
			
			MessageObject_incomplete_details* obj = static_cast<MessageObject_incomplete_details*> (&incomplete_details);
			obj->fromJson(json_to_string(node, false));
			
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
	const gchar *incomplete_atKey = "incomplete_at";
	node = json_object_get_member(pJsonObject, incomplete_atKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&incomplete_at, node, "int", "");
		} else {
			
		}
	}
	const gchar *roleKey = "role";
	node = json_object_get_member(pJsonObject, roleKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&role, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *contentKey = "content";
	node = json_object_get_member(pJsonObject, contentKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<MessageObject_content_inner> new_list;
			MessageObject_content_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("MessageObject_content_inner")) {
					jsonToValue(&inst, temp_json, "MessageObject_content_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			content = new_list;
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
	const gchar *run_idKey = "run_id";
	node = json_object_get_member(pJsonObject, run_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&run_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *attachmentsKey = "attachments";
	node = json_object_get_member(pJsonObject, attachmentsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<CreateMessageRequest_attachments_inner> new_list;
			CreateMessageRequest_attachments_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("CreateMessageRequest_attachments_inner")) {
					jsonToValue(&inst, temp_json, "CreateMessageRequest_attachments_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			attachments = new_list;
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

MessageObject::MessageObject(char* json)
{
	this->fromJson(json);
}

char*
MessageObject::toJson()
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
		std::string obj = getThreadId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *thread_idKey = "thread_id";
	json_object_set_member(pJsonObject, thread_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getStatus();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("MessageObject_incomplete_details")) {
		MessageObject_incomplete_details obj = getIncompleteDetails();
		node = converttoJson(&obj, "MessageObject_incomplete_details", "");
	}
	else {
		
		MessageObject_incomplete_details obj = static_cast<MessageObject_incomplete_details> (getIncompleteDetails());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *incomplete_detailsKey = "incomplete_details";
	json_object_set_member(pJsonObject, incomplete_detailsKey, node);
	if (isprimitive("int")) {
		int obj = getCompletedAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *completed_atKey = "completed_at";
	json_object_set_member(pJsonObject, completed_atKey, node);
	if (isprimitive("int")) {
		int obj = getIncompleteAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *incomplete_atKey = "incomplete_at";
	json_object_set_member(pJsonObject, incomplete_atKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getRole();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *roleKey = "role";
	json_object_set_member(pJsonObject, roleKey, node);
	if (isprimitive("MessageObject_content_inner")) {
		list<MessageObject_content_inner> new_list = static_cast<list <MessageObject_content_inner> > (getContent());
		node = converttoJson(&new_list, "MessageObject_content_inner", "array");
	} else {
		node = json_node_alloc();
		list<MessageObject_content_inner> new_list = static_cast<list <MessageObject_content_inner> > (getContent());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<MessageObject_content_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			MessageObject_content_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *contentKey = "content";
	json_object_set_member(pJsonObject, contentKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAssistantId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *assistant_idKey = "assistant_id";
	json_object_set_member(pJsonObject, assistant_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getRunId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *run_idKey = "run_id";
	json_object_set_member(pJsonObject, run_idKey, node);
	if (isprimitive("CreateMessageRequest_attachments_inner")) {
		list<CreateMessageRequest_attachments_inner> new_list = static_cast<list <CreateMessageRequest_attachments_inner> > (getAttachments());
		node = converttoJson(&new_list, "CreateMessageRequest_attachments_inner", "array");
	} else {
		node = json_node_alloc();
		list<CreateMessageRequest_attachments_inner> new_list = static_cast<list <CreateMessageRequest_attachments_inner> > (getAttachments());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<CreateMessageRequest_attachments_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			CreateMessageRequest_attachments_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *attachmentsKey = "attachments";
	json_object_set_member(pJsonObject, attachmentsKey, node);
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
MessageObject::getId()
{
	return id;
}

void
MessageObject::setId(std::string  id)
{
	this->id = id;
}

std::string
MessageObject::getObject()
{
	return object;
}

void
MessageObject::setObject(std::string  object)
{
	this->object = object;
}

int
MessageObject::getCreatedAt()
{
	return created_at;
}

void
MessageObject::setCreatedAt(int  created_at)
{
	this->created_at = created_at;
}

std::string
MessageObject::getThreadId()
{
	return thread_id;
}

void
MessageObject::setThreadId(std::string  thread_id)
{
	this->thread_id = thread_id;
}

std::string
MessageObject::getStatus()
{
	return status;
}

void
MessageObject::setStatus(std::string  status)
{
	this->status = status;
}

MessageObject_incomplete_details
MessageObject::getIncompleteDetails()
{
	return incomplete_details;
}

void
MessageObject::setIncompleteDetails(MessageObject_incomplete_details  incomplete_details)
{
	this->incomplete_details = incomplete_details;
}

int
MessageObject::getCompletedAt()
{
	return completed_at;
}

void
MessageObject::setCompletedAt(int  completed_at)
{
	this->completed_at = completed_at;
}

int
MessageObject::getIncompleteAt()
{
	return incomplete_at;
}

void
MessageObject::setIncompleteAt(int  incomplete_at)
{
	this->incomplete_at = incomplete_at;
}

std::string
MessageObject::getRole()
{
	return role;
}

void
MessageObject::setRole(std::string  role)
{
	this->role = role;
}

std::list<MessageObject_content_inner>
MessageObject::getContent()
{
	return content;
}

void
MessageObject::setContent(std::list <MessageObject_content_inner> content)
{
	this->content = content;
}

std::string
MessageObject::getAssistantId()
{
	return assistant_id;
}

void
MessageObject::setAssistantId(std::string  assistant_id)
{
	this->assistant_id = assistant_id;
}

std::string
MessageObject::getRunId()
{
	return run_id;
}

void
MessageObject::setRunId(std::string  run_id)
{
	this->run_id = run_id;
}

std::list<CreateMessageRequest_attachments_inner>
MessageObject::getAttachments()
{
	return attachments;
}

void
MessageObject::setAttachments(std::list <CreateMessageRequest_attachments_inner> attachments)
{
	this->attachments = attachments;
}

std::string
MessageObject::getMetadata()
{
	return metadata;
}

void
MessageObject::setMetadata(std::string  metadata)
{
	this->metadata = metadata;
}


