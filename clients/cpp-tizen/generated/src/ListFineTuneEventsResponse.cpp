#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ListFineTuneEventsResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ListFineTuneEventsResponse::ListFineTuneEventsResponse()
{
	//__init();
}

ListFineTuneEventsResponse::~ListFineTuneEventsResponse()
{
	//__cleanup();
}

void
ListFineTuneEventsResponse::__init()
{
	//object = std::string();
	//new std::list()std::list> data;
}

void
ListFineTuneEventsResponse::__cleanup()
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
	//
}

void
ListFineTuneEventsResponse::fromJson(char* jsonStr)
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
			list<FineTuneEvent> new_list;
			FineTuneEvent inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("FineTuneEvent")) {
					jsonToValue(&inst, temp_json, "FineTuneEvent", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			data = new_list;
		}
		
	}
}

ListFineTuneEventsResponse::ListFineTuneEventsResponse(char* json)
{
	this->fromJson(json);
}

char*
ListFineTuneEventsResponse::toJson()
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
	if (isprimitive("FineTuneEvent")) {
		list<FineTuneEvent> new_list = static_cast<list <FineTuneEvent> > (getData());
		node = converttoJson(&new_list, "FineTuneEvent", "array");
	} else {
		node = json_node_alloc();
		list<FineTuneEvent> new_list = static_cast<list <FineTuneEvent> > (getData());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<FineTuneEvent>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			FineTuneEvent obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *dataKey = "data";
	json_object_set_member(pJsonObject, dataKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ListFineTuneEventsResponse::getObject()
{
	return object;
}

void
ListFineTuneEventsResponse::setObject(std::string  object)
{
	this->object = object;
}

std::list<FineTuneEvent>
ListFineTuneEventsResponse::getData()
{
	return data;
}

void
ListFineTuneEventsResponse::setData(std::list <FineTuneEvent> data)
{
	this->data = data;
}


