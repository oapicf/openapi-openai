#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CompleteUploadRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CompleteUploadRequest::CompleteUploadRequest()
{
	//__init();
}

CompleteUploadRequest::~CompleteUploadRequest()
{
	//__cleanup();
}

void
CompleteUploadRequest::__init()
{
	//new std::list()std::list> part_ids;
	//md5 = std::string();
}

void
CompleteUploadRequest::__cleanup()
{
	//if(part_ids != NULL) {
	//part_ids.RemoveAll(true);
	//delete part_ids;
	//part_ids = NULL;
	//}
	//if(md5 != NULL) {
	//
	//delete md5;
	//md5 = NULL;
	//}
	//
}

void
CompleteUploadRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *part_idsKey = "part_ids";
	node = json_object_get_member(pJsonObject, part_idsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			part_ids = new_list;
		}
		
	}
	const gchar *md5Key = "md5";
	node = json_object_get_member(pJsonObject, md5Key);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&md5, node, "std::string", "");
		} else {
			
		}
	}
}

CompleteUploadRequest::CompleteUploadRequest(char* json)
{
	this->fromJson(json);
}

char*
CompleteUploadRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getPartIds());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getPartIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *part_idsKey = "part_ids";
	json_object_set_member(pJsonObject, part_idsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMd5();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *md5Key = "md5";
	json_object_set_member(pJsonObject, md5Key, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<std::string>
CompleteUploadRequest::getPartIds()
{
	return part_ids;
}

void
CompleteUploadRequest::setPartIds(std::list <std::string> part_ids)
{
	this->part_ids = part_ids;
}

std::string
CompleteUploadRequest::getMd5()
{
	return md5;
}

void
CompleteUploadRequest::setMd5(std::string  md5)
{
	this->md5 = md5;
}


