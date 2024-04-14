#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RunStepDeltaStepDetailsToolCallsCodeOutputImageObject::RunStepDeltaStepDetailsToolCallsCodeOutputImageObject()
{
	//__init();
}

RunStepDeltaStepDetailsToolCallsCodeOutputImageObject::~RunStepDeltaStepDetailsToolCallsCodeOutputImageObject()
{
	//__cleanup();
}

void
RunStepDeltaStepDetailsToolCallsCodeOutputImageObject::__init()
{
	//index = int(0);
	//type = std::string();
	//image = new RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image();
}

void
RunStepDeltaStepDetailsToolCallsCodeOutputImageObject::__cleanup()
{
	//if(index != NULL) {
	//
	//delete index;
	//index = NULL;
	//}
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
RunStepDeltaStepDetailsToolCallsCodeOutputImageObject::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *indexKey = "index";
	node = json_object_get_member(pJsonObject, indexKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&index, node, "int", "");
		} else {
			
		}
	}
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
	

		if (isprimitive("RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image")) {
			jsonToValue(&image, node, "RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image", "RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image");
		} else {
			
			RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image* obj = static_cast<RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image*> (&image);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

RunStepDeltaStepDetailsToolCallsCodeOutputImageObject::RunStepDeltaStepDetailsToolCallsCodeOutputImageObject(char* json)
{
	this->fromJson(json);
}

char*
RunStepDeltaStepDetailsToolCallsCodeOutputImageObject::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getIndex();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *indexKey = "index";
	json_object_set_member(pJsonObject, indexKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image")) {
		RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image obj = getImage();
		node = converttoJson(&obj, "RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image", "");
	}
	else {
		
		RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image obj = static_cast<RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image> (getImage());
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

int
RunStepDeltaStepDetailsToolCallsCodeOutputImageObject::getIndex()
{
	return index;
}

void
RunStepDeltaStepDetailsToolCallsCodeOutputImageObject::setIndex(int  index)
{
	this->index = index;
}

std::string
RunStepDeltaStepDetailsToolCallsCodeOutputImageObject::getType()
{
	return type;
}

void
RunStepDeltaStepDetailsToolCallsCodeOutputImageObject::setType(std::string  type)
{
	this->type = type;
}

RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image
RunStepDeltaStepDetailsToolCallsCodeOutputImageObject::getImage()
{
	return image;
}

void
RunStepDeltaStepDetailsToolCallsCodeOutputImageObject::setImage(RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image  image)
{
	this->image = image;
}


