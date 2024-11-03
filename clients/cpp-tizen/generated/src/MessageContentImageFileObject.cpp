#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MessageContentImageFileObject.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MessageContentImageFileObject::MessageContentImageFileObject()
{
	//__init();
}

MessageContentImageFileObject::~MessageContentImageFileObject()
{
	//__cleanup();
}

void
MessageContentImageFileObject::__init()
{
	//type = std::string();
	//image_file = new MessageContentImageFileObject_image_file();
}

void
MessageContentImageFileObject::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(image_file != NULL) {
	//
	//delete image_file;
	//image_file = NULL;
	//}
	//
}

void
MessageContentImageFileObject::fromJson(char* jsonStr)
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
	const gchar *image_fileKey = "image_file";
	node = json_object_get_member(pJsonObject, image_fileKey);
	if (node !=NULL) {
	

		if (isprimitive("MessageContentImageFileObject_image_file")) {
			jsonToValue(&image_file, node, "MessageContentImageFileObject_image_file", "MessageContentImageFileObject_image_file");
		} else {
			
			MessageContentImageFileObject_image_file* obj = static_cast<MessageContentImageFileObject_image_file*> (&image_file);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

MessageContentImageFileObject::MessageContentImageFileObject(char* json)
{
	this->fromJson(json);
}

char*
MessageContentImageFileObject::toJson()
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
	if (isprimitive("MessageContentImageFileObject_image_file")) {
		MessageContentImageFileObject_image_file obj = getImageFile();
		node = converttoJson(&obj, "MessageContentImageFileObject_image_file", "");
	}
	else {
		
		MessageContentImageFileObject_image_file obj = static_cast<MessageContentImageFileObject_image_file> (getImageFile());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *image_fileKey = "image_file";
	json_object_set_member(pJsonObject, image_fileKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
MessageContentImageFileObject::getType()
{
	return type;
}

void
MessageContentImageFileObject::setType(std::string  type)
{
	this->type = type;
}

MessageContentImageFileObject_image_file
MessageContentImageFileObject::getImageFile()
{
	return image_file;
}

void
MessageContentImageFileObject::setImageFile(MessageContentImageFileObject_image_file  image_file)
{
	this->image_file = image_file;
}


