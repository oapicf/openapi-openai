#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RunStepDetailsToolCallsCodeOutputImageObject.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RunStepDetailsToolCallsCodeOutputImageObject::RunStepDetailsToolCallsCodeOutputImageObject()
{
	//__init();
}

RunStepDetailsToolCallsCodeOutputImageObject::~RunStepDetailsToolCallsCodeOutputImageObject()
{
	//__cleanup();
}

void
RunStepDetailsToolCallsCodeOutputImageObject::__init()
{
	//type = std::string();
	//image = new RunStepDetailsToolCallsCodeOutputImageObject_image();
}

void
RunStepDetailsToolCallsCodeOutputImageObject::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(image != NULL) {
	//
	//delete image;
	//image = NULL;
	//}
	//
}

void
RunStepDetailsToolCallsCodeOutputImageObject::fromJson(char* jsonStr)
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

RunStepDetailsToolCallsCodeOutputImageObject::RunStepDetailsToolCallsCodeOutputImageObject(char* json)
{
	this->fromJson(json);
}

char*
RunStepDetailsToolCallsCodeOutputImageObject::toJson()
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
RunStepDetailsToolCallsCodeOutputImageObject::getType()
{
	return type;
}

void
RunStepDetailsToolCallsCodeOutputImageObject::setType(std::string  type)
{
	this->type = type;
}

RunStepDetailsToolCallsCodeOutputImageObject_image
RunStepDetailsToolCallsCodeOutputImageObject::getImage()
{
	return image;
}

void
RunStepDetailsToolCallsCodeOutputImageObject::setImage(RunStepDetailsToolCallsCodeOutputImageObject_image  image)
{
	this->image = image;
}


