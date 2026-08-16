

#include "MessageDeltaContentTextAnnotationsFilePathObject.h"

using namespace Tiny;

MessageDeltaContentTextAnnotationsFilePathObject::MessageDeltaContentTextAnnotationsFilePathObject()
{
	index = int(0);
	type = std::string();
	text = std::string();
	file_path = MessageDeltaContentTextAnnotationsFilePathObject_file_path();
	start_index = int(0);
	end_index = int(0);
}

MessageDeltaContentTextAnnotationsFilePathObject::MessageDeltaContentTextAnnotationsFilePathObject(std::string jsonString)
{
	this->fromJson(jsonString);
}

MessageDeltaContentTextAnnotationsFilePathObject::~MessageDeltaContentTextAnnotationsFilePathObject()
{

}

void
MessageDeltaContentTextAnnotationsFilePathObject::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *indexKey = "index";

    if(object.has_key(indexKey))
    {
        bourne::json value = object[indexKey];



        jsonToValue(&index, value, "int");


    }

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }

    const char *textKey = "text";

    if(object.has_key(textKey))
    {
        bourne::json value = object[textKey];



        jsonToValue(&text, value, "std::string");


    }

    const char *file_pathKey = "file_path";

    if(object.has_key(file_pathKey))
    {
        bourne::json value = object[file_pathKey];




        MessageDeltaContentTextAnnotationsFilePathObject_file_path* obj = &file_path;
		obj->fromJson(value.dump());

    }

    const char *start_indexKey = "start_index";

    if(object.has_key(start_indexKey))
    {
        bourne::json value = object[start_indexKey];



        jsonToValue(&start_index, value, "int");


    }

    const char *end_indexKey = "end_index";

    if(object.has_key(end_indexKey))
    {
        bourne::json value = object[end_indexKey];



        jsonToValue(&end_index, value, "int");


    }


}

bourne::json
MessageDeltaContentTextAnnotationsFilePathObject::toJson()
{
    bourne::json object = bourne::json::object();





    object["index"] = getIndex();






    object["type"] = getType();






    object["text"] = getText();







	object["file_path"] = getFilePath().toJson();





    object["start_index"] = getStartIndex();






    object["end_index"] = getEndIndex();



    return object;

}

int
MessageDeltaContentTextAnnotationsFilePathObject::getIndex()
{
	return index;
}

void
MessageDeltaContentTextAnnotationsFilePathObject::setIndex(int  index)
{
	this->index = index;
}

std::string
MessageDeltaContentTextAnnotationsFilePathObject::getType()
{
	return type;
}

void
MessageDeltaContentTextAnnotationsFilePathObject::setType(std::string  type)
{
	this->type = type;
}

std::string
MessageDeltaContentTextAnnotationsFilePathObject::getText()
{
	return text;
}

void
MessageDeltaContentTextAnnotationsFilePathObject::setText(std::string  text)
{
	this->text = text;
}

MessageDeltaContentTextAnnotationsFilePathObject_file_path
MessageDeltaContentTextAnnotationsFilePathObject::getFilePath()
{
	return file_path;
}

void
MessageDeltaContentTextAnnotationsFilePathObject::setFilePath(MessageDeltaContentTextAnnotationsFilePathObject_file_path  file_path)
{
	this->file_path = file_path;
}

int
MessageDeltaContentTextAnnotationsFilePathObject::getStartIndex()
{
	return start_index;
}

void
MessageDeltaContentTextAnnotationsFilePathObject::setStartIndex(int  start_index)
{
	this->start_index = start_index;
}

int
MessageDeltaContentTextAnnotationsFilePathObject::getEndIndex()
{
	return end_index;
}

void
MessageDeltaContentTextAnnotationsFilePathObject::setEndIndex(int  end_index)
{
	this->end_index = end_index;
}



