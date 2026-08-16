

#include "ChatCompletionRole.h"

using namespace Tiny;

ChatCompletionRole::ChatCompletionRole()
{
}

ChatCompletionRole::ChatCompletionRole(std::string jsonString)
{
	this->fromJson(jsonString);
}

ChatCompletionRole::~ChatCompletionRole()
{

}

void
ChatCompletionRole::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
ChatCompletionRole::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



