

#include "MessageContentTextObject_text_annotations_inner.h"

using namespace Tiny;

MessageContentTextObject_text_annotations_inner::MessageContentTextObject_text_annotations_inner()
{
	type = std::string();
	text = std::string();
	file_citation = MessageContentTextAnnotationsFileCitationObject_file_citation();
	start_index = int(0);
	end_index = int(0);
	file_path = MessageContentTextAnnotationsFilePathObject_file_path();
}

MessageContentTextObject_text_annotations_inner::MessageContentTextObject_text_annotations_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

MessageContentTextObject_text_annotations_inner::~MessageContentTextObject_text_annotations_inner()
{

}

void
MessageContentTextObject_text_annotations_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

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




        MessageContentTextAnnotationsFileCitationObject_file_citation* obj = &file_citation;
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




        MessageContentTextAnnotationsFilePathObject_file_path* obj = &file_path;
		obj->fromJson(value.dump());

    }


}

bourne::json
MessageContentTextObject_text_annotations_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["type"] = getType();






    object["text"] = getText();







	object["file_citation"] = getFileCitation().toJson();





    object["start_index"] = getStartIndex();






    object["end_index"] = getEndIndex();







	object["file_path"] = getFilePath().toJson();


    return object;

}

std::string
MessageContentTextObject_text_annotations_inner::getType()
{
	return type;
}

void
MessageContentTextObject_text_annotations_inner::setType(std::string  type)
{
	this->type = type;
}

std::string
MessageContentTextObject_text_annotations_inner::getText()
{
	return text;
}

void
MessageContentTextObject_text_annotations_inner::setText(std::string  text)
{
	this->text = text;
}

MessageContentTextAnnotationsFileCitationObject_file_citation
MessageContentTextObject_text_annotations_inner::getFileCitation()
{
	return file_citation;
}

void
MessageContentTextObject_text_annotations_inner::setFileCitation(MessageContentTextAnnotationsFileCitationObject_file_citation  file_citation)
{
	this->file_citation = file_citation;
}

int
MessageContentTextObject_text_annotations_inner::getStartIndex()
{
	return start_index;
}

void
MessageContentTextObject_text_annotations_inner::setStartIndex(int  start_index)
{
	this->start_index = start_index;
}

int
MessageContentTextObject_text_annotations_inner::getEndIndex()
{
	return end_index;
}

void
MessageContentTextObject_text_annotations_inner::setEndIndex(int  end_index)
{
	this->end_index = end_index;
}

MessageContentTextAnnotationsFilePathObject_file_path
MessageContentTextObject_text_annotations_inner::getFilePath()
{
	return file_path;
}

void
MessageContentTextObject_text_annotations_inner::setFilePath(MessageContentTextAnnotationsFilePathObject_file_path  file_path)
{
	this->file_path = file_path;
}



