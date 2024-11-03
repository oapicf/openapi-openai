#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ListModelsResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ListModelsResponse::ListModelsResponse()
{
	//__init();
}

ListModelsResponse::~ListModelsResponse()
{
	//__cleanup();
}

void
ListModelsResponse::__init()
{
	//object = std::string();
	//new std::list()std::list> data;
}

void
ListModelsResponse::__cleanup()
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
ListModelsResponse::fromJson(char* jsonStr)
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
			list<Model> new_list;
			Model inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("Model")) {
					jsonToValue(&inst, temp_json, "Model", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			data = new_list;
		}
		
	}
}

ListModelsResponse::ListModelsResponse(char* json)
{
	this->fromJson(json);
}

char*
ListModelsResponse::toJson()
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
	if (isprimitive("Model")) {
		list<Model> new_list = static_cast<list <Model> > (getData());
		node = converttoJson(&new_list, "Model", "array");
	} else {
		node = json_node_alloc();
		list<Model> new_list = static_cast<list <Model> > (getData());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<Model>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			Model obj = *it;
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
ListModelsResponse::getObject()
{
	return object;
}

void
ListModelsResponse::setObject(std::string  object)
{
	this->object = object;
}

std::list<Model>
ListModelsResponse::getData()
{
	return data;
}

void
ListModelsResponse::setData(std::list <Model> data)
{
	this->data = data;
}


