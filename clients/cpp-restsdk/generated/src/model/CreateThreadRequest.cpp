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



#include "CppRestOpenAPIClient/model/CreateThreadRequest.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



CreateThreadRequest::CreateThreadRequest()
{
    m_MessagesIsSet = false;
    m_MetadataIsSet = false;
}

CreateThreadRequest::~CreateThreadRequest()
{
}

void CreateThreadRequest::validate()
{
    // TODO: implement validation
}

web::json::value CreateThreadRequest::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_MessagesIsSet)
    {
        val[utility::conversions::to_string_t(U("messages"))] = ModelBase::toJson(m_Messages);
    }
    if(m_MetadataIsSet)
    {
        val[utility::conversions::to_string_t(U("metadata"))] = ModelBase::toJson(m_Metadata);
    }

    return val;
}

bool CreateThreadRequest::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("messages"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("messages")));
        if(!fieldValue.is_null())
        {
            std::vector<std::shared_ptr<CreateMessageRequest>> refVal_setMessages;
            ok &= ModelBase::fromJson(fieldValue, refVal_setMessages);
            setMessages(refVal_setMessages);
        }
    }
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

void CreateThreadRequest::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_MessagesIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("messages")), m_Messages));
    }
    if(m_MetadataIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("metadata")), m_Metadata));
    }
}

bool CreateThreadRequest::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("messages"))))
    {
        std::vector<std::shared_ptr<CreateMessageRequest>> refVal_setMessages;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("messages"))), refVal_setMessages );
        setMessages(refVal_setMessages);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("metadata"))))
    {
        std::shared_ptr<Object> refVal_setMetadata;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("metadata"))), refVal_setMetadata );
        setMetadata(refVal_setMetadata);
    }
    return ok;
}

std::vector<std::shared_ptr<CreateMessageRequest>>& CreateThreadRequest::getMessages()
{
    return m_Messages;
}

void CreateThreadRequest::setMessages(const std::vector<std::shared_ptr<CreateMessageRequest>>& value)
{
    m_Messages = value;
    m_MessagesIsSet = true;
}

bool CreateThreadRequest::messagesIsSet() const
{
    return m_MessagesIsSet;
}

void CreateThreadRequest::unsetMessages()
{
    m_MessagesIsSet = false;
}
std::shared_ptr<Object> CreateThreadRequest::getMetadata() const
{
    return m_Metadata;
}

void CreateThreadRequest::setMetadata(const std::shared_ptr<Object>& value)
{
    m_Metadata = value;
    m_MetadataIsSet = true;
}

bool CreateThreadRequest::metadataIsSet() const
{
    return m_MetadataIsSet;
}

void CreateThreadRequest::unsetMetadata()
{
    m_MetadataIsSet = false;
}
}
}
}
}

