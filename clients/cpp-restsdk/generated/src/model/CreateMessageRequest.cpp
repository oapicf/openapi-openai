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



#include "CppRestOpenAPIClient/model/CreateMessageRequest.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



CreateMessageRequest::CreateMessageRequest()
{
    m_Role = utility::conversions::to_string_t("");
    m_RoleIsSet = false;
    m_Content = utility::conversions::to_string_t("");
    m_ContentIsSet = false;
    m_File_idsIsSet = false;
    m_MetadataIsSet = false;
}

CreateMessageRequest::~CreateMessageRequest()
{
}

void CreateMessageRequest::validate()
{
    // TODO: implement validation
}

web::json::value CreateMessageRequest::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_RoleIsSet)
    {
        val[utility::conversions::to_string_t(U("role"))] = ModelBase::toJson(m_Role);
    }
    if(m_ContentIsSet)
    {
        val[utility::conversions::to_string_t(U("content"))] = ModelBase::toJson(m_Content);
    }
    if(m_File_idsIsSet)
    {
        val[utility::conversions::to_string_t(U("file_ids"))] = ModelBase::toJson(m_File_ids);
    }
    if(m_MetadataIsSet)
    {
        val[utility::conversions::to_string_t(U("metadata"))] = ModelBase::toJson(m_Metadata);
    }

    return val;
}

bool CreateMessageRequest::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("role"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("role")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setRole;
            ok &= ModelBase::fromJson(fieldValue, refVal_setRole);
            setRole(refVal_setRole);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("content"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("content")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setContent;
            ok &= ModelBase::fromJson(fieldValue, refVal_setContent);
            setContent(refVal_setContent);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("file_ids"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("file_ids")));
        if(!fieldValue.is_null())
        {
            std::vector<utility::string_t> refVal_setFileIds;
            ok &= ModelBase::fromJson(fieldValue, refVal_setFileIds);
            setFileIds(refVal_setFileIds);
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

void CreateMessageRequest::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_RoleIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("role")), m_Role));
    }
    if(m_ContentIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("content")), m_Content));
    }
    if(m_File_idsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("file_ids")), m_File_ids));
    }
    if(m_MetadataIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("metadata")), m_Metadata));
    }
}

bool CreateMessageRequest::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("role"))))
    {
        utility::string_t refVal_setRole;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("role"))), refVal_setRole );
        setRole(refVal_setRole);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("content"))))
    {
        utility::string_t refVal_setContent;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("content"))), refVal_setContent );
        setContent(refVal_setContent);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("file_ids"))))
    {
        std::vector<utility::string_t> refVal_setFileIds;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("file_ids"))), refVal_setFileIds );
        setFileIds(refVal_setFileIds);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("metadata"))))
    {
        std::shared_ptr<Object> refVal_setMetadata;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("metadata"))), refVal_setMetadata );
        setMetadata(refVal_setMetadata);
    }
    return ok;
}

utility::string_t CreateMessageRequest::getRole() const
{
    return m_Role;
}

void CreateMessageRequest::setRole(const utility::string_t& value)
{
    m_Role = value;
    m_RoleIsSet = true;
}

bool CreateMessageRequest::roleIsSet() const
{
    return m_RoleIsSet;
}

void CreateMessageRequest::unsetRole()
{
    m_RoleIsSet = false;
}
utility::string_t CreateMessageRequest::getContent() const
{
    return m_Content;
}

void CreateMessageRequest::setContent(const utility::string_t& value)
{
    m_Content = value;
    m_ContentIsSet = true;
}

bool CreateMessageRequest::contentIsSet() const
{
    return m_ContentIsSet;
}

void CreateMessageRequest::unsetContent()
{
    m_ContentIsSet = false;
}
std::vector<utility::string_t>& CreateMessageRequest::getFileIds()
{
    return m_File_ids;
}

void CreateMessageRequest::setFileIds(const std::vector<utility::string_t>& value)
{
    m_File_ids = value;
    m_File_idsIsSet = true;
}

bool CreateMessageRequest::fileIdsIsSet() const
{
    return m_File_idsIsSet;
}

void CreateMessageRequest::unsetFile_ids()
{
    m_File_idsIsSet = false;
}
std::shared_ptr<Object> CreateMessageRequest::getMetadata() const
{
    return m_Metadata;
}

void CreateMessageRequest::setMetadata(const std::shared_ptr<Object>& value)
{
    m_Metadata = value;
    m_MetadataIsSet = true;
}

bool CreateMessageRequest::metadataIsSet() const
{
    return m_MetadataIsSet;
}

void CreateMessageRequest::unsetMetadata()
{
    m_MetadataIsSet = false;
}
}
}
}
}


