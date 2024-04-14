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

/*
 * CreateAssistantRequest.h
 *
 * 
 */

#ifndef CreateAssistantRequest_H_
#define CreateAssistantRequest_H_



#include "AssistantObject_tools_inner.h"
#include <string>
#include "CreateAssistantRequest_model.h"
#include <vector>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  CreateAssistantRequest 
{
public:
    CreateAssistantRequest() = default;
    explicit CreateAssistantRequest(boost::property_tree::ptree const& pt);
    virtual ~CreateAssistantRequest() = default;

    CreateAssistantRequest(const CreateAssistantRequest& other) = default; // copy constructor
    CreateAssistantRequest(CreateAssistantRequest&& other) noexcept = default; // move constructor

    CreateAssistantRequest& operator=(const CreateAssistantRequest& other) = default; // copy assignment
    CreateAssistantRequest& operator=(CreateAssistantRequest&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// CreateAssistantRequest members

    /// <summary>
    /// 
    /// </summary>
    CreateAssistantRequest_model getModel() const;
    void setModel(CreateAssistantRequest_model value);

    /// <summary>
    /// The name of the assistant. The maximum length is 256 characters. 
    /// </summary>
    std::string getName() const;
    void setName(std::string value);

    /// <summary>
    /// The description of the assistant. The maximum length is 512 characters. 
    /// </summary>
    std::string getDescription() const;
    void setDescription(std::string value);

    /// <summary>
    /// The system instructions that the assistant uses. The maximum length is 256,000 characters. 
    /// </summary>
    std::string getInstructions() const;
    void setInstructions(std::string value);

    /// <summary>
    /// A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;. 
    /// </summary>
    std::vector<AssistantObject_tools_inner> getTools() const;
    void setTools(std::vector<AssistantObject_tools_inner> value);

    /// <summary>
    /// A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. 
    /// </summary>
    std::vector<std::string> getFileIds() const;
    void setFileIds(std::vector<std::string> value);

    /// <summary>
    /// Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
    /// </summary>
    std::string getMetadata() const;
    void setMetadata(std::string value);

protected:
    CreateAssistantRequest_model m_Model;
    std::string m_Name = "";
    std::string m_Description = "";
    std::string m_Instructions = "";
    std::vector<AssistantObject_tools_inner> m_Tools;
    std::vector<std::string> m_File_ids;
    std::string m_Metadata = std::string{};
};

std::vector<CreateAssistantRequest> createCreateAssistantRequestVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<CreateAssistantRequest>(const CreateAssistantRequest& val) {
    return val.toPropertyTree();
}

template<>
inline CreateAssistantRequest fromPt<CreateAssistantRequest>(const boost::property_tree::ptree& pt) {
    CreateAssistantRequest ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* CreateAssistantRequest_H_ */
