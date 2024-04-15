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
 * CreateCompletionResponse.h
 *
 * Represents a completion response from the API. Note: both the streamed and non-streamed response objects share the same shape (unlike the chat endpoint). 
 */

#ifndef CreateCompletionResponse_H_
#define CreateCompletionResponse_H_



#include <string>
#include "CreateCompletionResponse_choices_inner.h"
#include "CompletionUsage.h"
#include <vector>
#include <memory>
#include <vector>
#include <array>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Represents a completion response from the API. Note: both the streamed and non-streamed response objects share the same shape (unlike the chat endpoint). 
/// </summary>
class  CreateCompletionResponse 
{
public:
    CreateCompletionResponse() = default;
    explicit CreateCompletionResponse(boost::property_tree::ptree const& pt);
    virtual ~CreateCompletionResponse() = default;

    CreateCompletionResponse(const CreateCompletionResponse& other) = default; // copy constructor
    CreateCompletionResponse(CreateCompletionResponse&& other) noexcept = default; // move constructor

    CreateCompletionResponse& operator=(const CreateCompletionResponse& other) = default; // copy assignment
    CreateCompletionResponse& operator=(CreateCompletionResponse&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// CreateCompletionResponse members

    /// <summary>
    /// A unique identifier for the completion.
    /// </summary>
    std::string getId() const;
    void setId(std::string value);

    /// <summary>
    /// The list of completion choices the model generated for the input prompt.
    /// </summary>
    std::vector<CreateCompletionResponse_choices_inner> getChoices() const;
    void setChoices(std::vector<CreateCompletionResponse_choices_inner> value);

    /// <summary>
    /// The Unix timestamp (in seconds) of when the completion was created.
    /// </summary>
    int32_t getCreated() const;
    void setCreated(int32_t value);

    /// <summary>
    /// The model used for completion.
    /// </summary>
    std::string getModel() const;
    void setModel(std::string value);

    /// <summary>
    /// This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism. 
    /// </summary>
    std::string getSystemFingerprint() const;
    void setSystemFingerprint(std::string value);

    /// <summary>
    /// The object type, which is always \&quot;text_completion\&quot;
    /// </summary>
    std::string getObject() const;
    void setObject(std::string value);

    /// <summary>
    /// 
    /// </summary>
    CompletionUsage getUsage() const;
    void setUsage(CompletionUsage value);

protected:
    std::string m_Id = "";
    std::vector<CreateCompletionResponse_choices_inner> m_Choices;
    int32_t m_Created = 0;
    std::string m_Model = "";
    std::string m_System_fingerprint = "";
    std::string m_object = "";
    CompletionUsage m_Usage;
};

std::vector<CreateCompletionResponse> createCreateCompletionResponseVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<CreateCompletionResponse>(const CreateCompletionResponse& val) {
    return val.toPropertyTree();
}

template<>
inline CreateCompletionResponse fromPt<CreateCompletionResponse>(const boost::property_tree::ptree& pt) {
    CreateCompletionResponse ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* CreateCompletionResponse_H_ */