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
 * CompletionUsage.h
 *
 * Usage statistics for the completion request.
 */

#ifndef CompletionUsage_H_
#define CompletionUsage_H_



#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Usage statistics for the completion request.
/// </summary>
class  CompletionUsage 
{
public:
    CompletionUsage() = default;
    explicit CompletionUsage(boost::property_tree::ptree const& pt);
    virtual ~CompletionUsage() = default;

    CompletionUsage(const CompletionUsage& other) = default; // copy constructor
    CompletionUsage(CompletionUsage&& other) noexcept = default; // move constructor

    CompletionUsage& operator=(const CompletionUsage& other) = default; // copy assignment
    CompletionUsage& operator=(CompletionUsage&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// CompletionUsage members

    /// <summary>
    /// Number of tokens in the generated completion.
    /// </summary>
    int32_t getCompletionTokens() const;
    void setCompletionTokens(int32_t value);

    /// <summary>
    /// Number of tokens in the prompt.
    /// </summary>
    int32_t getPromptTokens() const;
    void setPromptTokens(int32_t value);

    /// <summary>
    /// Total number of tokens used in the request (prompt + completion).
    /// </summary>
    int32_t getTotalTokens() const;
    void setTotalTokens(int32_t value);

protected:
    int32_t m_Completion_tokens = 0;
    int32_t m_Prompt_tokens = 0;
    int32_t m_Total_tokens = 0;
};

std::vector<CompletionUsage> createCompletionUsageVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<CompletionUsage>(const CompletionUsage& val) {
    return val.toPropertyTree();
}

template<>
inline CompletionUsage fromPt<CompletionUsage>(const boost::property_tree::ptree& pt) {
    CompletionUsage ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* CompletionUsage_H_ */
