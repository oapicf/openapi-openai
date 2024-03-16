#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ListFineTunesResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ListFineTunesResponse::ListFineTunesResponse()
{
	//__init();
}

ListFineTunesResponse::~ListFineTunesResponse()
{
	//__cleanup();
}

void
ListFineTunesResponse::__init()
{
	//object = std::string();
	//new std::list()std::list> data;
}

void
ListFineTunesResponse::__cleanup()
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
ListFineTunesResponse::fromJson(char* jsonStr)
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
			list<FineTune> new_list;
			FineTune inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("FineTune")) {
					jsonToValue(&inst, temp_json, "FineTune", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			data = new_list;
		}
		
	}
}

ListFineTunesResponse::ListFineTunesResponse(char* json)
{
	this->fromJson(json);
}

char*
ListFineTunesResponse::toJson()
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
	if (isprimitive("FineTune")) {
		list<FineTune> new_list = static_cast<list <FineTune> > (getData());
		node = converttoJson(&new_list, "FineTune", "array");
	} else {
		node = json_node_alloc();
		list<FineTune> new_list = static_cast<list <FineTune> > (getData());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<FineTune>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			FineTune obj = *it;
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
ListFineTunesResponse::getObject()
{
	return object;
}

void
ListFineTunesResponse::setObject(std::string  object)
{
	this->object = object;
}

std::list<FineTune>
ListFineTunesResponse::getData()
{
	return data;
}

void
ListFineTunesResponse::setData(std::list <FineTune> data)
{
	this->data = data;
}


