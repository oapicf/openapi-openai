

#include "MessageDeltaObject_delta.h"

using namespace Tiny;

MessageDeltaObject_delta::MessageDeltaObject_delta()
{
	role = std::string();
	content = std::list<MessageDeltaObject_delta_content_inner>();
}

MessageDeltaObject_delta::MessageDeltaObject_delta(std::string jsonString)
{
	this->fromJson(jsonString);
}

MessageDeltaObject_delta::~MessageDeltaObject_delta()
{

}

void
MessageDeltaObject_delta::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *roleKey = "role";

    if(object.has_key(roleKey))
    {
        bourne::json value = object[roleKey];



        jsonToValue(&role, value, "std::string");


    }

    const char *contentKey = "content";

    if(object.has_key(contentKey))
    {
        bourne::json value = object[contentKey];


        std::list<MessageDeltaObject_delta_content_inner> content_list;
        MessageDeltaObject_delta_content_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            content_list.push_back(element);
        }
        content = content_list;


    }


}

bourne::json
MessageDeltaObject_delta::toJson()
{
    bourne::json object = bourne::json::object();





    object["role"] = getRole();





    std::list<MessageDeltaObject_delta_content_inner> content_list = getContent();
    bourne::json content_arr = bourne::json::array();

    for(auto& var : content_list)
    {
        MessageDeltaObject_delta_content_inner obj = var;
        content_arr.append(obj.toJson());
    }
    object["content"] = content_arr;




    return object;

}

std::string
MessageDeltaObject_delta::getRole()
{
	return role;
}

void
MessageDeltaObject_delta::setRole(std::string  role)
{
	this->role = role;
}

std::list<MessageDeltaObject_delta_content_inner>
MessageDeltaObject_delta::getContent()
{
	return content;
}

void
MessageDeltaObject_delta::setContent(std::list <MessageDeltaObject_delta_content_inner> content)
{
	this->content = content;
}



