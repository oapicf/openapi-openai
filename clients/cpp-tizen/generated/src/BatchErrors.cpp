#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Batch_errors.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Batch_errors::Batch_errors()
{
	//__init();
}

Batch_errors::~Batch_errors()
{
	//__cleanup();
}

void
Batch_errors::__init()
{
	//object = std::string();
	//new std::list()std::list> data;
}

void
Batch_errors::__cleanup()
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
Batch_errors::fromJson(char* jsonStr)
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
			list<Batch_errors_data_inner> new_list;
			Batch_errors_data_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("Batch_errors_data_inner")) {
					jsonToValue(&inst, temp_json, "Batch_errors_data_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			data = new_list;
		}
		
	}
}

Batch_errors::Batch_errors(char* json)
{
	this->fromJson(json);
}

char*
Batch_errors::toJson()
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
	if (isprimitive("Batch_errors_data_inner")) {
		list<Batch_errors_data_inner> new_list = static_cast<list <Batch_errors_data_inner> > (getData());
		node = converttoJson(&new_list, "Batch_errors_data_inner", "array");
	} else {
		node = json_node_alloc();
		list<Batch_errors_data_inner> new_list = static_cast<list <Batch_errors_data_inner> > (getData());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<Batch_errors_data_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			Batch_errors_data_inner obj = *it;
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
Batch_errors::getObject()
{
	return object;
}

void
Batch_errors::setObject(std::string  object)
{
	this->object = object;
}

std::list<Batch_errors_data_inner>
Batch_errors::getData()
{
	return data;
}

void
Batch_errors::setData(std::list <Batch_errors_data_inner> data)
{
	this->data = data;
}


