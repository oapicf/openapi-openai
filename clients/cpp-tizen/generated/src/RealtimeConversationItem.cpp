#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RealtimeConversationItem.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RealtimeConversationItem::RealtimeConversationItem()
{
	//__init();
}

RealtimeConversationItem::~RealtimeConversationItem()
{
	//__cleanup();
}

void
RealtimeConversationItem::__init()
{
	//id = std::string();
	//type = std::string();
	//object = std::string();
	//status = std::string();
	//role = std::string();
	//new std::list()std::list> content;
	//call_id = std::string();
	//name = std::string();
	//arguments = std::string();
	//output = std::string();
}

void
RealtimeConversationItem::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
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
	//if(call_id != NULL) {
	//
	//delete call_id;
	//call_id = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(arguments != NULL) {
	//
	//delete arguments;
	//arguments = NULL;
	//}
	//if(output != NULL) {
	//
	//delete output;
	//output = NULL;
	//}
	//
}

void
RealtimeConversationItem::fromJson(char* jsonStr)
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
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&type, node, "std::string", "");
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
			list<RealtimeConversationItem_content_inner> new_list;
			RealtimeConversationItem_content_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("RealtimeConversationItem_content_inner")) {
					jsonToValue(&inst, temp_json, "RealtimeConversationItem_content_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			content = new_list;
		}
		
	}
	const gchar *call_idKey = "call_id";
	node = json_object_get_member(pJsonObject, call_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&call_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *argumentsKey = "arguments";
	node = json_object_get_member(pJsonObject, argumentsKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&arguments, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *outputKey = "output";
	node = json_object_get_member(pJsonObject, outputKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&output, node, "std::string", "");
		} else {
			
		}
	}
}

RealtimeConversationItem::RealtimeConversationItem(char* json)
{
	this->fromJson(json);
}

char*
RealtimeConversationItem::toJson()
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
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
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
	if (isprimitive("std::string")) {
		std::string obj = getRole();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *roleKey = "role";
	json_object_set_member(pJsonObject, roleKey, node);
	if (isprimitive("RealtimeConversationItem_content_inner")) {
		list<RealtimeConversationItem_content_inner> new_list = static_cast<list <RealtimeConversationItem_content_inner> > (getContent());
		node = converttoJson(&new_list, "RealtimeConversationItem_content_inner", "array");
	} else {
		node = json_node_alloc();
		list<RealtimeConversationItem_content_inner> new_list = static_cast<list <RealtimeConversationItem_content_inner> > (getContent());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<RealtimeConversationItem_content_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			RealtimeConversationItem_content_inner obj = *it;
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
		std::string obj = getCallId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *call_idKey = "call_id";
	json_object_set_member(pJsonObject, call_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getArguments();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *argumentsKey = "arguments";
	json_object_set_member(pJsonObject, argumentsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getOutput();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *outputKey = "output";
	json_object_set_member(pJsonObject, outputKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
RealtimeConversationItem::getId()
{
	return id;
}

void
RealtimeConversationItem::setId(std::string  id)
{
	this->id = id;
}

std::string
RealtimeConversationItem::getType()
{
	return type;
}

void
RealtimeConversationItem::setType(std::string  type)
{
	this->type = type;
}

std::string
RealtimeConversationItem::getObject()
{
	return object;
}

void
RealtimeConversationItem::setObject(std::string  object)
{
	this->object = object;
}

std::string
RealtimeConversationItem::getStatus()
{
	return status;
}

void
RealtimeConversationItem::setStatus(std::string  status)
{
	this->status = status;
}

std::string
RealtimeConversationItem::getRole()
{
	return role;
}

void
RealtimeConversationItem::setRole(std::string  role)
{
	this->role = role;
}

std::list<RealtimeConversationItem_content_inner>
RealtimeConversationItem::getContent()
{
	return content;
}

void
RealtimeConversationItem::setContent(std::list <RealtimeConversationItem_content_inner> content)
{
	this->content = content;
}

std::string
RealtimeConversationItem::getCallId()
{
	return call_id;
}

void
RealtimeConversationItem::setCallId(std::string  call_id)
{
	this->call_id = call_id;
}

std::string
RealtimeConversationItem::getName()
{
	return name;
}

void
RealtimeConversationItem::setName(std::string  name)
{
	this->name = name;
}

std::string
RealtimeConversationItem::getArguments()
{
	return arguments;
}

void
RealtimeConversationItem::setArguments(std::string  arguments)
{
	this->arguments = arguments;
}

std::string
RealtimeConversationItem::getOutput()
{
	return output;
}

void
RealtimeConversationItem::setOutput(std::string  output)
{
	this->output = output;
}


