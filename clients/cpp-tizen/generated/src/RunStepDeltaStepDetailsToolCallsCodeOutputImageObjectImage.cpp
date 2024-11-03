#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image::RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image()
{
	//__init();
}

RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image::~RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image()
{
	//__cleanup();
}

void
RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image::__init()
{
	//file_id = std::string();
}

void
RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image::__cleanup()
{
	//if(file_id != NULL) {
	//
	//delete file_id;
	//file_id = NULL;
	//}
	//
}

void
RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *file_idKey = "file_id";
	node = json_object_get_member(pJsonObject, file_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&file_id, node, "std::string", "");
		} else {
			
		}
	}
}

RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image::RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image(char* json)
{
	this->fromJson(json);
}

char*
RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getFileId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *file_idKey = "file_id";
	json_object_set_member(pJsonObject, file_idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image::getFileId()
{
	return file_id;
}

void
RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image::setFileId(std::string  file_id)
{
	this->file_id = file_id;
}


