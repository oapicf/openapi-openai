/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "CppRestOpenAPIClient/model/ModifyMessageRequest.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



ModifyMessageRequest::ModifyMessageRequest()
{
    m_MetadataIsSet = false;
}

ModifyMessageRequest::~ModifyMessageRequest()
{
}

void ModifyMessageRequest::validate()
{
    // TODO: implement validation
}

web::json::value ModifyMessageRequest::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_MetadataIsSet)
    {
        val[utility::conversions::to_string_t(U("metadata"))] = ModelBase::toJson(m_Metadata);
    }

    return val;
}

bool ModifyMessageRequest::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("metadata"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("metadata")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<Object> refVal_setMetadata;
            ok &= ModelBase::fromJson(fieldValue, refVal_setMetadata);
            setMetadata(refVal_setMetadata);
        }
    }
    return ok;
}

void ModifyMessageRequest::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_MetadataIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("metadata")), m_Metadata));
    }
}

bool ModifyMessageRequest::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("metadata"))))
    {
        std::shared_ptr<Object> refVal_setMetadata;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("metadata"))), refVal_setMetadata );
        setMetadata(refVal_setMetadata);
    }
    return ok;
}

std::shared_ptr<Object> ModifyMessageRequest::getMetadata() const
{
    return m_Metadata;
}

void ModifyMessageRequest::setMetadata(const std::shared_ptr<Object>& value)
{
    m_Metadata = value;
    m_MetadataIsSet = true;
}

bool ModifyMessageRequest::metadataIsSet() const
{
    return m_MetadataIsSet;
}

void ModifyMessageRequest::unsetMetadata()
{
    m_MetadataIsSet = false;
}
}
}
}
}

