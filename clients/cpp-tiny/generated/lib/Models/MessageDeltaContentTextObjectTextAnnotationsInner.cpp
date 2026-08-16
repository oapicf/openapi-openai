

#include "MessageDeltaContentTextObject_text_annotations_inner.h"

using namespace Tiny;

MessageDeltaContentTextObject_text_annotations_inner::MessageDeltaContentTextObject_text_annotations_inner()
{
	index = int(0);
	type = std::string();
	text = std::string();
	file_citation = MessageDeltaContentTextAnnotationsFileCitationObject_file_citation();
	start_index = int(0);
	end_index = int(0);
	file_path = MessageDeltaContentTextAnnotationsFilePathObject_file_path();
}

MessageDeltaContentTextObject_text_annotations_inner::MessageDeltaContentTextObject_text_annotations_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

MessageDeltaContentTextObject_text_annotations_inner::~MessageDeltaContentTextObject_text_annotations_inner()
{

}

void
MessageDeltaContentTextObject_text_annotations_inner::fromJson(std::string jsonObj)
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

    const char *file_citationKey = "file_citation";

    if(object.has_key(file_citationKey))
    {
        bourne::json value = object[file_citationKey];




        MessageDeltaContentTextAnnotationsFileCitationObject_file_citation* obj = &file_citation;
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

    const char *file_pathKey = "file_path";

    if(object.has_key(file_pathKey))
    {
        bourne::json value = object[file_pathKey];




        MessageDeltaContentTextAnnotationsFilePathObject_file_path* obj = &file_path;
		obj->fromJson(value.dump());

    }


}

bourne::json
MessageDeltaContentTextObject_text_annotations_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["index"] = getIndex();






    object["type"] = getType();






    object["text"] = getText();







	object["file_citation"] = getFileCitation().toJson();





    object["start_index"] = getStartIndex();






    object["end_index"] = getEndIndex();







	object["file_path"] = getFilePath().toJson();


    return object;

}

int
MessageDeltaContentTextObject_text_annotations_inner::getIndex()
{
	return index;
}

void
MessageDeltaContentTextObject_text_annotations_inner::setIndex(int  index)
{
	this->index = index;
}

std::string
MessageDeltaContentTextObject_text_annotations_inner::getType()
{
	return type;
}

void
MessageDeltaContentTextObject_text_annotations_inner::setType(std::string  type)
{
	this->type = type;
}

std::string
MessageDeltaContentTextObject_text_annotations_inner::getText()
{
	return text;
}

void
MessageDeltaContentTextObject_text_annotations_inner::setText(std::string  text)
{
	this->text = text;
}

MessageDeltaContentTextAnnotationsFileCitationObject_file_citation
MessageDeltaContentTextObject_text_annotations_inner::getFileCitation()
{
	return file_citation;
}

void
MessageDeltaContentTextObject_text_annotations_inner::setFileCitation(MessageDeltaContentTextAnnotationsFileCitationObject_file_citation  file_citation)
{
	this->file_citation = file_citation;
}

int
MessageDeltaContentTextObject_text_annotations_inner::getStartIndex()
{
	return start_index;
}

void
MessageDeltaContentTextObject_text_annotations_inner::setStartIndex(int  start_index)
{
	this->start_index = start_index;
}

int
MessageDeltaContentTextObject_text_annotations_inner::getEndIndex()
{
	return end_index;
}

void
MessageDeltaContentTextObject_text_annotations_inner::setEndIndex(int  end_index)
{
	this->end_index = end_index;
}

MessageDeltaContentTextAnnotationsFilePathObject_file_path
MessageDeltaContentTextObject_text_annotations_inner::getFilePath()
{
	return file_path;
}

void
MessageDeltaContentTextObject_text_annotations_inner::setFilePath(MessageDeltaContentTextAnnotationsFilePathObject_file_path  file_path)
{
	this->file_path = file_path;
}



