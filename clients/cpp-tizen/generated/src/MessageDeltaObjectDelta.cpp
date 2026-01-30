#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MessageDeltaObject_delta.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MessageDeltaObject_delta::MessageDeltaObject_delta()
{
	//__init();
}

MessageDeltaObject_delta::~MessageDeltaObject_delta()
{
	//__cleanup();
}

void
MessageDeltaObject_delta::__init()
{
	//role = std::string();
	//new std::list()std::list> content;
}

void
MessageDeltaObject_delta::__cleanup()
{
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
	//
}

void
MessageDeltaObject_delta::fromJson(char* jsonStr)
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
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<MessageDeltaObject_delta_content_inner> new_list;
			MessageDeltaObject_delta_content_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("MessageDeltaObject_delta_content_inner")) {
					jsonToValue(&inst, temp_json, "MessageDeltaObject_delta_content_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			content = new_list;
		}
		
	}
}

MessageDeltaObject_delta::MessageDeltaObject_delta(char* json)
{
	this->fromJson(json);
}

char*
MessageDeltaObject_delta::toJson()
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
	if (isprimitive("MessageDeltaObject_delta_content_inner")) {
		list<MessageDeltaObject_delta_content_inner> new_list = static_cast<list <MessageDeltaObject_delta_content_inner> > (getContent());
		node = converttoJson(&new_list, "MessageDeltaObject_delta_content_inner", "array");
	} else {
		node = json_node_alloc();
		list<MessageDeltaObject_delta_content_inner> new_list = static_cast<list <MessageDeltaObject_delta_content_inner> > (getContent());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<MessageDeltaObject_delta_content_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			MessageDeltaObject_delta_content_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *contentKey = "content";
	json_object_set_member(pJsonObject, contentKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
MessageDeltaObject_delta::getRole()
{
	return role;
}

void
MessageDeltaObject_delta::setRole(std::string  role)
{
	this->role = role;
}

std::list<MessageDeltaObject_delta_content_inner>
MessageDeltaObject_delta::getContent()
{
	return content;
}

void
MessageDeltaObject_delta::setContent(std::list <MessageDeltaObject_delta_content_inner> content)
{
	this->content = content;
}


