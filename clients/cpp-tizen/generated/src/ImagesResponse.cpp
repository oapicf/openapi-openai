#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ImagesResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ImagesResponse::ImagesResponse()
{
	//__init();
}

ImagesResponse::~ImagesResponse()
{
	//__cleanup();
}

void
ImagesResponse::__init()
{
	//created = int(0);
	//new std::list()std::list> data;
}

void
ImagesResponse::__cleanup()
{
	//if(created != NULL) {
	//
	//delete created;
	//created = NULL;
	//}
	//if(data != NULL) {
	//data.RemoveAll(true);
	//delete data;
	//data = NULL;
	//}
	//
}

void
ImagesResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *createdKey = "created";
	node = json_object_get_member(pJsonObject, createdKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&created, node, "int", "");
		} else {
			
		}
	}
	const gchar *dataKey = "data";
	node = json_object_get_member(pJsonObject, dataKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ImagesResponse_data_inner> new_list;
			ImagesResponse_data_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ImagesResponse_data_inner")) {
					jsonToValue(&inst, temp_json, "ImagesResponse_data_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			data = new_list;
		}
		
	}
}

ImagesResponse::ImagesResponse(char* json)
{
	this->fromJson(json);
}

char*
ImagesResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getCreated();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *createdKey = "created";
	json_object_set_member(pJsonObject, createdKey, node);
	if (isprimitive("ImagesResponse_data_inner")) {
		list<ImagesResponse_data_inner> new_list = static_cast<list <ImagesResponse_data_inner> > (getData());
		node = converttoJson(&new_list, "ImagesResponse_data_inner", "array");
	} else {
		node = json_node_alloc();
		list<ImagesResponse_data_inner> new_list = static_cast<list <ImagesResponse_data_inner> > (getData());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ImagesResponse_data_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ImagesResponse_data_inner obj = *it;
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

int
ImagesResponse::getCreated()
{
	return created;
}

void
ImagesResponse::setCreated(int  created)
{
	this->created = created;
}

std::list<ImagesResponse_data_inner>
ImagesResponse::getData()
{
	return data;
}

void
ImagesResponse::setData(std::list <ImagesResponse_data_inner> data)
{
	this->data = data;
}


