#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UsageTimeBucket.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UsageTimeBucket::UsageTimeBucket()
{
	//__init();
}

UsageTimeBucket::~UsageTimeBucket()
{
	//__cleanup();
}

void
UsageTimeBucket::__init()
{
	//object = std::string();
	//start_time = int(0);
	//end_time = int(0);
	//new std::list()std::list> result;
}

void
UsageTimeBucket::__cleanup()
{
	//if(object != NULL) {
	//
	//delete object;
	//object = NULL;
	//}
	//if(start_time != NULL) {
	//
	//delete start_time;
	//start_time = NULL;
	//}
	//if(end_time != NULL) {
	//
	//delete end_time;
	//end_time = NULL;
	//}
	//if(result != NULL) {
	//result.RemoveAll(true);
	//delete result;
	//result = NULL;
	//}
	//
}

void
UsageTimeBucket::fromJson(char* jsonStr)
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
	const gchar *start_timeKey = "start_time";
	node = json_object_get_member(pJsonObject, start_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&start_time, node, "int", "");
		} else {
			
		}
	}
	const gchar *end_timeKey = "end_time";
	node = json_object_get_member(pJsonObject, end_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&end_time, node, "int", "");
		} else {
			
		}
	}
	const gchar *resultKey = "result";
	node = json_object_get_member(pJsonObject, resultKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<UsageTimeBucket_result_inner> new_list;
			UsageTimeBucket_result_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("UsageTimeBucket_result_inner")) {
					jsonToValue(&inst, temp_json, "UsageTimeBucket_result_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			result = new_list;
		}
		
	}
}

UsageTimeBucket::UsageTimeBucket(char* json)
{
	this->fromJson(json);
}

char*
UsageTimeBucket::toJson()
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
	if (isprimitive("int")) {
		int obj = getStartTime();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *start_timeKey = "start_time";
	json_object_set_member(pJsonObject, start_timeKey, node);
	if (isprimitive("int")) {
		int obj = getEndTime();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *end_timeKey = "end_time";
	json_object_set_member(pJsonObject, end_timeKey, node);
	if (isprimitive("UsageTimeBucket_result_inner")) {
		list<UsageTimeBucket_result_inner> new_list = static_cast<list <UsageTimeBucket_result_inner> > (getResult());
		node = converttoJson(&new_list, "UsageTimeBucket_result_inner", "array");
	} else {
		node = json_node_alloc();
		list<UsageTimeBucket_result_inner> new_list = static_cast<list <UsageTimeBucket_result_inner> > (getResult());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<UsageTimeBucket_result_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			UsageTimeBucket_result_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *resultKey = "result";
	json_object_set_member(pJsonObject, resultKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
UsageTimeBucket::getObject()
{
	return object;
}

void
UsageTimeBucket::setObject(std::string  object)
{
	this->object = object;
}

int
UsageTimeBucket::getStartTime()
{
	return start_time;
}

void
UsageTimeBucket::setStartTime(int  start_time)
{
	this->start_time = start_time;
}

int
UsageTimeBucket::getEndTime()
{
	return end_time;
}

void
UsageTimeBucket::setEndTime(int  end_time)
{
	this->end_time = end_time;
}

std::list<UsageTimeBucket_result_inner>
UsageTimeBucket::getResult()
{
	return result;
}

void
UsageTimeBucket::setResult(std::list <UsageTimeBucket_result_inner> result)
{
	this->result = result;
}


