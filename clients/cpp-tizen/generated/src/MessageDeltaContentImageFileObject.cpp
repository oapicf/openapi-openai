#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MessageDeltaContentImageFileObject.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MessageDeltaContentImageFileObject::MessageDeltaContentImageFileObject()
{
	//__init();
}

MessageDeltaContentImageFileObject::~MessageDeltaContentImageFileObject()
{
	//__cleanup();
}

void
MessageDeltaContentImageFileObject::__init()
{
	//index = int(0);
	//type = std::string();
	//image_file = new MessageDeltaContentImageFileObject_image_file();
}

void
MessageDeltaContentImageFileObject::__cleanup()
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
	//if(image_file != NULL) {
	//
	//delete image_file;
	//image_file = NULL;
	//}
	//
}

void
MessageDeltaContentImageFileObject::fromJson(char* jsonStr)
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
	const gchar *image_fileKey = "image_file";
	node = json_object_get_member(pJsonObject, image_fileKey);
	if (node !=NULL) {
	

		if (isprimitive("MessageDeltaContentImageFileObject_image_file")) {
			jsonToValue(&image_file, node, "MessageDeltaContentImageFileObject_image_file", "MessageDeltaContentImageFileObject_image_file");
		} else {
			
			MessageDeltaContentImageFileObject_image_file* obj = static_cast<MessageDeltaContentImageFileObject_image_file*> (&image_file);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

MessageDeltaContentImageFileObject::MessageDeltaContentImageFileObject(char* json)
{
	this->fromJson(json);
}

char*
MessageDeltaContentImageFileObject::toJson()
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
	if (isprimitive("MessageDeltaContentImageFileObject_image_file")) {
		MessageDeltaContentImageFileObject_image_file obj = getImageFile();
		node = converttoJson(&obj, "MessageDeltaContentImageFileObject_image_file", "");
	}
	else {
		
		MessageDeltaContentImageFileObject_image_file obj = static_cast<MessageDeltaContentImageFileObject_image_file> (getImageFile());
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

int
MessageDeltaContentImageFileObject::getIndex()
{
	return index;
}

void
MessageDeltaContentImageFileObject::setIndex(int  index)
{
	this->index = index;
}

std::string
MessageDeltaContentImageFileObject::getType()
{
	return type;
}

void
MessageDeltaContentImageFileObject::setType(std::string  type)
{
	this->type = type;
}

MessageDeltaContentImageFileObject_image_file
MessageDeltaContentImageFileObject::getImageFile()
{
	return image_file;
}

void
MessageDeltaContentImageFileObject::setImageFile(MessageDeltaContentImageFileObject_image_file  image_file)
{
	this->image_file = image_file;
}


