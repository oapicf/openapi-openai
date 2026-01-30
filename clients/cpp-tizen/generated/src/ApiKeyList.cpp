#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ApiKeyList.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ApiKeyList::ApiKeyList()
{
	//__init();
}

ApiKeyList::~ApiKeyList()
{
	//__cleanup();
}

void
ApiKeyList::__init()
{
	//object = std::string();
	//new std::list()std::list> data;
	//has_more = bool(false);
	//first_id = std::string();
	//last_id = std::string();
}

void
ApiKeyList::__cleanup()
{
	//if(object != NULL) {
	//
	//delete object;
	//object = NULL;
	//}
	//if(data != NULL) {
	//data.RemoveAll(true);
	//delete data;
	//data = NULL;
	//}
	//if(has_more != NULL) {
	//
	//delete has_more;
	//has_more = NULL;
	//}
	//if(first_id != NULL) {
	//
	//delete first_id;
	//first_id = NULL;
	//}
	//if(last_id != NULL) {
	//
	//delete last_id;
	//last_id = NULL;
	//}
	//
}

void
ApiKeyList::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *objectKey = "object";
	node = json_object_get_member(pJsonObject, objectKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&object, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *dataKey = "data";
	node = json_object_get_member(pJsonObject, dataKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AdminApiKey> new_list;
			AdminApiKey inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AdminApiKey")) {
					jsonToValue(&inst, temp_json, "AdminApiKey", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			data = new_list;
		}
		
	}
	const gchar *has_moreKey = "has_more";
	node = json_object_get_member(pJsonObject, has_moreKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&has_more, node, "bool", "");
		} else {
			
		}
	}
	const gchar *first_idKey = "first_id";
	node = json_object_get_member(pJsonObject, first_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&first_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *last_idKey = "last_id";
	node = json_object_get_member(pJsonObject, last_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&last_id, node, "std::string", "");
		} else {
			
		}
	}
}

ApiKeyList::ApiKeyList(char* json)
{
	this->fromJson(json);
}

char*
ApiKeyList::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getObject();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *objectKey = "object";
	json_object_set_member(pJsonObject, objectKey, node);
	if (isprimitive("AdminApiKey")) {
		list<AdminApiKey> new_list = static_cast<list <AdminApiKey> > (getData());
		node = converttoJson(&new_list, "AdminApiKey", "array");
	} else {
		node = json_node_alloc();
		list<AdminApiKey> new_list = static_cast<list <AdminApiKey> > (getData());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AdminApiKey>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AdminApiKey obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *dataKey = "data";
	json_object_set_member(pJsonObject, dataKey, node);
	if (isprimitive("bool")) {
		bool obj = getHasMore();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *has_moreKey = "has_more";
	json_object_set_member(pJsonObject, has_moreKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getFirstId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *first_idKey = "first_id";
	json_object_set_member(pJsonObject, first_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getLastId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *last_idKey = "last_id";
	json_object_set_member(pJsonObject, last_idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ApiKeyList::getObject()
{
	return object;
}

void
ApiKeyList::setObject(std::string  object)
{
	this->object = object;
}

std::list<AdminApiKey>
ApiKeyList::getData()
{
	return data;
}

void
ApiKeyList::setData(std::list <AdminApiKey> data)
{
	this->data = data;
}

bool
ApiKeyList::getHasMore()
{
	return has_more;
}

void
ApiKeyList::setHasMore(bool  has_more)
{
	this->has_more = has_more;
}

std::string
ApiKeyList::getFirstId()
{
	return first_id;
}

void
ApiKeyList::setFirstId(std::string  first_id)
{
	this->first_id = first_id;
}

std::string
ApiKeyList::getLastId()
{
	return last_id;
}

void
ApiKeyList::setLastId(std::string  last_id)
{
	this->last_id = last_id;
}


