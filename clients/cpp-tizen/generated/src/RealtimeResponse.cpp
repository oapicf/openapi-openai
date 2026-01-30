#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RealtimeResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RealtimeResponse::RealtimeResponse()
{
	//__init();
}

RealtimeResponse::~RealtimeResponse()
{
	//__cleanup();
}

void
RealtimeResponse::__init()
{
	//id = std::string();
	//object = std::string();
	//status = std::string();
	//status_details = new RealtimeResponse_status_details();
	//new std::list()std::list> output;
	//metadata = null;
	//usage = new RealtimeResponse_usage();
}

void
RealtimeResponse::__cleanup()
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
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(status_details != NULL) {
	//
	//delete status_details;
	//status_details = NULL;
	//}
	//if(output != NULL) {
	//output.RemoveAll(true);
	//delete output;
	//output = NULL;
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
RealtimeResponse::fromJson(char* jsonStr)
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
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&status, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *status_detailsKey = "status_details";
	node = json_object_get_member(pJsonObject, status_detailsKey);
	if (node !=NULL) {
	

		if (isprimitive("RealtimeResponse_status_details")) {
			jsonToValue(&status_details, node, "RealtimeResponse_status_details", "RealtimeResponse_status_details");
		} else {
			
			RealtimeResponse_status_details* obj = static_cast<RealtimeResponse_status_details*> (&status_details);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *outputKey = "output";
	node = json_object_get_member(pJsonObject, outputKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<RealtimeConversationItem> new_list;
			RealtimeConversationItem inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("RealtimeConversationItem")) {
					jsonToValue(&inst, temp_json, "RealtimeConversationItem", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			output = new_list;
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
	

		if (isprimitive("RealtimeResponse_usage")) {
			jsonToValue(&usage, node, "RealtimeResponse_usage", "RealtimeResponse_usage");
		} else {
			
			RealtimeResponse_usage* obj = static_cast<RealtimeResponse_usage*> (&usage);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

RealtimeResponse::RealtimeResponse(char* json)
{
	this->fromJson(json);
}

char*
RealtimeResponse::toJson()
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
		std::string obj = getStatus();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("RealtimeResponse_status_details")) {
		RealtimeResponse_status_details obj = getStatusDetails();
		node = converttoJson(&obj, "RealtimeResponse_status_details", "");
	}
	else {
		
		RealtimeResponse_status_details obj = static_cast<RealtimeResponse_status_details> (getStatusDetails());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *status_detailsKey = "status_details";
	json_object_set_member(pJsonObject, status_detailsKey, node);
	if (isprimitive("RealtimeConversationItem")) {
		list<RealtimeConversationItem> new_list = static_cast<list <RealtimeConversationItem> > (getOutput());
		node = converttoJson(&new_list, "RealtimeConversationItem", "array");
	} else {
		node = json_node_alloc();
		list<RealtimeConversationItem> new_list = static_cast<list <RealtimeConversationItem> > (getOutput());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<RealtimeConversationItem>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			RealtimeConversationItem obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *outputKey = "output";
	json_object_set_member(pJsonObject, outputKey, node);
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
	if (isprimitive("RealtimeResponse_usage")) {
		RealtimeResponse_usage obj = getUsage();
		node = converttoJson(&obj, "RealtimeResponse_usage", "");
	}
	else {
		
		RealtimeResponse_usage obj = static_cast<RealtimeResponse_usage> (getUsage());
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
RealtimeResponse::getId()
{
	return id;
}

void
RealtimeResponse::setId(std::string  id)
{
	this->id = id;
}

std::string
RealtimeResponse::getObject()
{
	return object;
}

void
RealtimeResponse::setObject(std::string  object)
{
	this->object = object;
}

std::string
RealtimeResponse::getStatus()
{
	return status;
}

void
RealtimeResponse::setStatus(std::string  status)
{
	this->status = status;
}

RealtimeResponse_status_details
RealtimeResponse::getStatusDetails()
{
	return status_details;
}

void
RealtimeResponse::setStatusDetails(RealtimeResponse_status_details  status_details)
{
	this->status_details = status_details;
}

std::list<RealtimeConversationItem>
RealtimeResponse::getOutput()
{
	return output;
}

void
RealtimeResponse::setOutput(std::list <RealtimeConversationItem> output)
{
	this->output = output;
}

std::string
RealtimeResponse::getMetadata()
{
	return metadata;
}

void
RealtimeResponse::setMetadata(std::string  metadata)
{
	this->metadata = metadata;
}

RealtimeResponse_usage
RealtimeResponse::getUsage()
{
	return usage;
}

void
RealtimeResponse::setUsage(RealtimeResponse_usage  usage)
{
	this->usage = usage;
}


