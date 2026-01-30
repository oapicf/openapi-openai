#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateMessageRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateMessageRequest::CreateMessageRequest()
{
	//__init();
}

CreateMessageRequest::~CreateMessageRequest()
{
	//__cleanup();
}

void
CreateMessageRequest::__init()
{
	//role = std::string();
	//content = new CreateMessageRequest_content();
	//new std::list()std::list> attachments;
	//metadata = null;
}

void
CreateMessageRequest::__cleanup()
{
	//if(role != NULL) {
	//
	//delete role;
	//role = NULL;
	//}
	//if(content != NULL) {
	//
	//delete content;
	//content = NULL;
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
CreateMessageRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
	

		if (isprimitive("CreateMessageRequest_content")) {
			jsonToValue(&content, node, "CreateMessageRequest_content", "CreateMessageRequest_content");
		} else {
			
			CreateMessageRequest_content* obj = static_cast<CreateMessageRequest_content*> (&content);
			obj->fromJson(json_to_string(node, false));
			
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

CreateMessageRequest::CreateMessageRequest(char* json)
{
	this->fromJson(json);
}

char*
CreateMessageRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getRole();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *roleKey = "role";
	json_object_set_member(pJsonObject, roleKey, node);
	if (isprimitive("CreateMessageRequest_content")) {
		CreateMessageRequest_content obj = getContent();
		node = converttoJson(&obj, "CreateMessageRequest_content", "");
	}
	else {
		
		CreateMessageRequest_content obj = static_cast<CreateMessageRequest_content> (getContent());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *contentKey = "content";
	json_object_set_member(pJsonObject, contentKey, node);
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
CreateMessageRequest::getRole()
{
	return role;
}

void
CreateMessageRequest::setRole(std::string  role)
{
	this->role = role;
}

CreateMessageRequest_content
CreateMessageRequest::getContent()
{
	return content;
}

void
CreateMessageRequest::setContent(CreateMessageRequest_content  content)
{
	this->content = content;
}

std::list<CreateMessageRequest_attachments_inner>
CreateMessageRequest::getAttachments()
{
	return attachments;
}

void
CreateMessageRequest::setAttachments(std::list <CreateMessageRequest_attachments_inner> attachments)
{
	this->attachments = attachments;
}

std::string
CreateMessageRequest::getMetadata()
{
	return metadata;
}

void
CreateMessageRequest::setMetadata(std::string  metadata)
{
	this->metadata = metadata;
}


