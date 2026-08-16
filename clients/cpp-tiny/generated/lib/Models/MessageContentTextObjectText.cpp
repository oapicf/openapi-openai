

#include "MessageContentTextObject_text.h"

using namespace Tiny;

MessageContentTextObject_text::MessageContentTextObject_text()
{
	value = std::string();
	annotations = std::list<MessageContentTextObject_text_annotations_inner>();
}

MessageContentTextObject_text::MessageContentTextObject_text(std::string jsonString)
{
	this->fromJson(jsonString);
}

MessageContentTextObject_text::~MessageContentTextObject_text()
{

}

void
MessageContentTextObject_text::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *valueKey = "value";

    if(object.has_key(valueKey))
    {
        bourne::json value = object[valueKey];



        jsonToValue(&value, value, "std::string");


    }

    const char *annotationsKey = "annotations";

    if(object.has_key(annotationsKey))
    {
        bourne::json value = object[annotationsKey];


        std::list<MessageContentTextObject_text_annotations_inner> annotations_list;
        MessageContentTextObject_text_annotations_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            annotations_list.push_back(element);
        }
        annotations = annotations_list;


    }


}

bourne::json
MessageContentTextObject_text::toJson()
{
    bourne::json object = bourne::json::object();





    object["value"] = getValue();





    std::list<MessageContentTextObject_text_annotations_inner> annotations_list = getAnnotations();
    bourne::json annotations_arr = bourne::json::array();

    for(auto& var : annotations_list)
    {
        MessageContentTextObject_text_annotations_inner obj = var;
        annotations_arr.append(obj.toJson());
    }
    object["annotations"] = annotations_arr;




    return object;

}

std::string
MessageContentTextObject_text::getValue()
{
	return value;
}

void
MessageContentTextObject_text::setValue(std::string  value)
{
	this->value = value;
}

std::list<MessageContentTextObject_text_annotations_inner>
MessageContentTextObject_text::getAnnotations()
{
	return annotations;
}

void
MessageContentTextObject_text::setAnnotations(std::list <MessageContentTextObject_text_annotations_inner> annotations)
{
	this->annotations = annotations;
}



