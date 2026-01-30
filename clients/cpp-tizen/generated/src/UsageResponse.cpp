#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UsageResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UsageResponse::UsageResponse()
{
	//__init();
}

UsageResponse::~UsageResponse()
{
	//__cleanup();
}

void
UsageResponse::__init()
{
	//object = std::string();
	//new std::list()std::list> data;
	//has_more = bool(false);
	//next_page = std::string();
}

void
UsageResponse::__cleanup()
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
	//if(next_page != NULL) {
	//
	//delete next_page;
	//next_page = NULL;
	//}
	//
}

void
UsageResponse::fromJson(char* jsonStr)
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
			list<UsageTimeBucket> new_list;
			UsageTimeBucket inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("UsageTimeBucket")) {
					jsonToValue(&inst, temp_json, "UsageTimeBucket", "");
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
	const gchar *next_pageKey = "next_page";
	node = json_object_get_member(pJsonObject, next_pageKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&next_page, node, "std::string", "");
		} else {
			
		}
	}
}

UsageResponse::UsageResponse(char* json)
{
	this->fromJson(json);
}

char*
UsageResponse::toJson()
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
	if (isprimitive("UsageTimeBucket")) {
		list<UsageTimeBucket> new_list = static_cast<list <UsageTimeBucket> > (getData());
		node = converttoJson(&new_list, "UsageTimeBucket", "array");
	} else {
		node = json_node_alloc();
		list<UsageTimeBucket> new_list = static_cast<list <UsageTimeBucket> > (getData());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<UsageTimeBucket>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			UsageTimeBucket obj = *it;
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
		std::string obj = getNextPage();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *next_pageKey = "next_page";
	json_object_set_member(pJsonObject, next_pageKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
UsageResponse::getObject()
{
	return object;
}

void
UsageResponse::setObject(std::string  object)
{
	this->object = object;
}

std::list<UsageTimeBucket>
UsageResponse::getData()
{
	return data;
}

void
UsageResponse::setData(std::list <UsageTimeBucket> data)
{
	this->data = data;
}

bool
UsageResponse::getHasMore()
{
	return has_more;
}

void
UsageResponse::setHasMore(bool  has_more)
{
	this->has_more = has_more;
}

std::string
UsageResponse::getNextPage()
{
	return next_page;
}

void
UsageResponse::setNextPage(std::string  next_page)
{
	this->next_page = next_page;
}


