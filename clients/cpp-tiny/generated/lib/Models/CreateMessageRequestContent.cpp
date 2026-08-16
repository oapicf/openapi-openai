

#include "CreateMessageRequest_content.h"

using namespace Tiny;

CreateMessageRequest_content::CreateMessageRequest_content()
{
}

CreateMessageRequest_content::CreateMessageRequest_content(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateMessageRequest_content::~CreateMessageRequest_content()
{

}

void
CreateMessageRequest_content::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
CreateMessageRequest_content::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



