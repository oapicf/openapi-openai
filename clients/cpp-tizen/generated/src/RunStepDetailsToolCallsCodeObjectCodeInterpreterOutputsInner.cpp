#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner()
{
	//__init();
}

RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::~RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner()
{
	//__cleanup();
}

void
RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::__init()
{
	//type = std::string();
	//logs = std::string();
	//image = new RunStepDetailsToolCallsCodeOutputImageObject_image();
}

void
RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(logs != NULL) {
	//
	//delete logs;
	//logs = NULL;
	//}
	//if(image != NULL) {
	//
	//delete image;
	//image = NULL;
	//}
	//
}

void
RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *logsKey = "logs";
	node = json_object_get_member(pJsonObject, logsKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&logs, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *imageKey = "image";
	node = json_object_get_member(pJsonObject, imageKey);
	if (node !=NULL) {
	

		if (isprimitive("RunStepDetailsToolCallsCodeOutputImageObject_image")) {
			jsonToValue(&image, node, "RunStepDetailsToolCallsCodeOutputImageObject_image", "RunStepDetailsToolCallsCodeOutputImageObject_image");
		} else {
			
			RunStepDetailsToolCallsCodeOutputImageObject_image* obj = static_cast<RunStepDetailsToolCallsCodeOutputImageObject_image*> (&image);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner(char* json)
{
	this->fromJson(json);
}

char*
RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getLogs();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *logsKey = "logs";
	json_object_set_member(pJsonObject, logsKey, node);
	if (isprimitive("RunStepDetailsToolCallsCodeOutputImageObject_image")) {
		RunStepDetailsToolCallsCodeOutputImageObject_image obj = getImage();
		node = converttoJson(&obj, "RunStepDetailsToolCallsCodeOutputImageObject_image", "");
	}
	else {
		
		RunStepDetailsToolCallsCodeOutputImageObject_image obj = static_cast<RunStepDetailsToolCallsCodeOutputImageObject_image> (getImage());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *imageKey = "image";
	json_object_set_member(pJsonObject, imageKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::getType()
{
	return type;
}

void
RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::setType(std::string  type)
{
	this->type = type;
}

std::string
RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::getLogs()
{
	return logs;
}

void
RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::setLogs(std::string  logs)
{
	this->logs = logs;
}

RunStepDetailsToolCallsCodeOutputImageObject_image
RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::getImage()
{
	return image;
}

void
RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner::setImage(RunStepDetailsToolCallsCodeOutputImageObject_image  image)
{
	this->image = image;
}


