#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ListPaginatedFineTuningJobsResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ListPaginatedFineTuningJobsResponse::ListPaginatedFineTuningJobsResponse()
{
	//__init();
}

ListPaginatedFineTuningJobsResponse::~ListPaginatedFineTuningJobsResponse()
{
	//__cleanup();
}

void
ListPaginatedFineTuningJobsResponse::__init()
{
	//new std::list()std::list> data;
	//has_more = bool(false);
	//object = std::string();
}

void
ListPaginatedFineTuningJobsResponse::__cleanup()
{
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
	//if(object != NULL) {
	//
	//delete object;
	//object = NULL;
	//}
	//
}

void
ListPaginatedFineTuningJobsResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *dataKey = "data";
	node = json_object_get_member(pJsonObject, dataKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<FineTuningJob> new_list;
			FineTuningJob inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("FineTuningJob")) {
					jsonToValue(&inst, temp_json, "FineTuningJob", "");
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
	const gchar *objectKey = "object";
	node = json_object_get_member(pJsonObject, objectKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&object, node, "std::string", "");
		} else {
			
		}
	}
}

ListPaginatedFineTuningJobsResponse::ListPaginatedFineTuningJobsResponse(char* json)
{
	this->fromJson(json);
}

char*
ListPaginatedFineTuningJobsResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("FineTuningJob")) {
		list<FineTuningJob> new_list = static_cast<list <FineTuningJob> > (getData());
		node = converttoJson(&new_list, "FineTuningJob", "array");
	} else {
		node = json_node_alloc();
		list<FineTuningJob> new_list = static_cast<list <FineTuningJob> > (getData());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<FineTuningJob>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			FineTuningJob obj = *it;
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

std::list<FineTuningJob>
ListPaginatedFineTuningJobsResponse::getData()
{
	return data;
}

void
ListPaginatedFineTuningJobsResponse::setData(std::list <FineTuningJob> data)
{
	this->data = data;
}

bool
ListPaginatedFineTuningJobsResponse::getHasMore()
{
	return has_more;
}

void
ListPaginatedFineTuningJobsResponse::setHasMore(bool  has_more)
{
	this->has_more = has_more;
}

std::string
ListPaginatedFineTuningJobsResponse::getObject()
{
	return object;
}

void
ListPaginatedFineTuningJobsResponse::setObject(std::string  object)
{
	this->object = object;
}


