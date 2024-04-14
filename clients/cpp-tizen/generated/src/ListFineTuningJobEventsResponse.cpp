#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ListFineTuningJobEventsResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ListFineTuningJobEventsResponse::ListFineTuningJobEventsResponse()
{
	//__init();
}

ListFineTuningJobEventsResponse::~ListFineTuningJobEventsResponse()
{
	//__cleanup();
}

void
ListFineTuningJobEventsResponse::__init()
{
	//new std::list()std::list> data;
	//object = std::string();
}

void
ListFineTuningJobEventsResponse::__cleanup()
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
	//
}

void
ListFineTuningJobEventsResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *dataKey = "data";
	node = json_object_get_member(pJsonObject, dataKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<FineTuningJobEvent> new_list;
			FineTuningJobEvent inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("FineTuningJobEvent")) {
					jsonToValue(&inst, temp_json, "FineTuningJobEvent", "");
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
}

ListFineTuningJobEventsResponse::ListFineTuningJobEventsResponse(char* json)
{
	this->fromJson(json);
}

char*
ListFineTuningJobEventsResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("FineTuningJobEvent")) {
		list<FineTuningJobEvent> new_list = static_cast<list <FineTuningJobEvent> > (getData());
		node = converttoJson(&new_list, "FineTuningJobEvent", "array");
	} else {
		node = json_node_alloc();
		list<FineTuningJobEvent> new_list = static_cast<list <FineTuningJobEvent> > (getData());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<FineTuningJobEvent>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			FineTuningJobEvent obj = *it;
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<FineTuningJobEvent>
ListFineTuningJobEventsResponse::getData()
{
	return data;
}

void
ListFineTuningJobEventsResponse::setData(std::list <FineTuningJobEvent> data)
{
	this->data = data;
}

std::string
ListFineTuningJobEventsResponse::getObject()
{
	return object;
}

void
ListFineTuningJobEventsResponse::setObject(std::string  object)
{
	this->object = object;
}


