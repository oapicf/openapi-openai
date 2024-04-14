#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ListFineTuningJobCheckpointsResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ListFineTuningJobCheckpointsResponse::ListFineTuningJobCheckpointsResponse()
{
	//__init();
}

ListFineTuningJobCheckpointsResponse::~ListFineTuningJobCheckpointsResponse()
{
	//__cleanup();
}

void
ListFineTuningJobCheckpointsResponse::__init()
{
	//new std::list()std::list> data;
	//object = std::string();
	//first_id = std::string();
	//last_id = std::string();
	//has_more = bool(false);
}

void
ListFineTuningJobCheckpointsResponse::__cleanup()
{
	//if(data != NULL) {
	//data.RemoveAll(true);
	//delete data;
	//data = NULL;
	//}
	//if(object != NULL) {
	//
	//delete object;
	//object = NULL;
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
	//if(has_more != NULL) {
	//
	//delete has_more;
	//has_more = NULL;
	//}
	//
}

void
ListFineTuningJobCheckpointsResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *dataKey = "data";
	node = json_object_get_member(pJsonObject, dataKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<FineTuningJobCheckpoint> new_list;
			FineTuningJobCheckpoint inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("FineTuningJobCheckpoint")) {
					jsonToValue(&inst, temp_json, "FineTuningJobCheckpoint", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			data = new_list;
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
	const gchar *has_moreKey = "has_more";
	node = json_object_get_member(pJsonObject, has_moreKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&has_more, node, "bool", "");
		} else {
			
		}
	}
}

ListFineTuningJobCheckpointsResponse::ListFineTuningJobCheckpointsResponse(char* json)
{
	this->fromJson(json);
}

char*
ListFineTuningJobCheckpointsResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("FineTuningJobCheckpoint")) {
		list<FineTuningJobCheckpoint> new_list = static_cast<list <FineTuningJobCheckpoint> > (getData());
		node = converttoJson(&new_list, "FineTuningJobCheckpoint", "array");
	} else {
		node = json_node_alloc();
		list<FineTuningJobCheckpoint> new_list = static_cast<list <FineTuningJobCheckpoint> > (getData());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<FineTuningJobCheckpoint>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			FineTuningJobCheckpoint obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *dataKey = "data";
	json_object_set_member(pJsonObject, dataKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getObject();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *objectKey = "object";
	json_object_set_member(pJsonObject, objectKey, node);
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
	if (isprimitive("bool")) {
		bool obj = getHasMore();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *has_moreKey = "has_more";
	json_object_set_member(pJsonObject, has_moreKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<FineTuningJobCheckpoint>
ListFineTuningJobCheckpointsResponse::getData()
{
	return data;
}

void
ListFineTuningJobCheckpointsResponse::setData(std::list <FineTuningJobCheckpoint> data)
{
	this->data = data;
}

std::string
ListFineTuningJobCheckpointsResponse::getObject()
{
	return object;
}

void
ListFineTuningJobCheckpointsResponse::setObject(std::string  object)
{
	this->object = object;
}

std::string
ListFineTuningJobCheckpointsResponse::getFirstId()
{
	return first_id;
}

void
ListFineTuningJobCheckpointsResponse::setFirstId(std::string  first_id)
{
	this->first_id = first_id;
}

std::string
ListFineTuningJobCheckpointsResponse::getLastId()
{
	return last_id;
}

void
ListFineTuningJobCheckpointsResponse::setLastId(std::string  last_id)
{
	this->last_id = last_id;
}

bool
ListFineTuningJobCheckpointsResponse::getHasMore()
{
	return has_more;
}

void
ListFineTuningJobCheckpointsResponse::setHasMore(bool  has_more)
{
	this->has_more = has_more;
}


