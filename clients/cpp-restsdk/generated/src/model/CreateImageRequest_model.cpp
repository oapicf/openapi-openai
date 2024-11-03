/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.9.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "CppRestOpenAPIClient/model/CreateImageRequest_model.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



CreateImageRequest_model::CreateImageRequest_model()
{
}

CreateImageRequest_model::~CreateImageRequest_model()
{
}

void CreateImageRequest_model::validate()
{
    // TODO: implement validation
}

web::json::value CreateImageRequest_model::toJson() const
{

    web::json::value val = web::json::value::object();
    

    return val;
}

bool CreateImageRequest_model::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    return ok;
}

void CreateImageRequest_model::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
}

bool CreateImageRequest_model::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    return ok;
}

}
}
}
}


