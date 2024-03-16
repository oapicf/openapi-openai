/**
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * CreateEmbeddingResponse_usage.h
 *
 * 
 */

#ifndef CreateEmbeddingResponse_usage_H_
#define CreateEmbeddingResponse_usage_H_



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
class  CreateEmbeddingResponse_usage 
{
public:
    CreateEmbeddingResponse_usage() = default;
    explicit CreateEmbeddingResponse_usage(boost::property_tree::ptree const& pt);
    virtual ~CreateEmbeddingResponse_usage() = default;

    CreateEmbeddingResponse_usage(const CreateEmbeddingResponse_usage& other) = default; // copy constructor
    CreateEmbeddingResponse_usage(CreateEmbeddingResponse_usage&& other) noexcept = default; // move constructor

    CreateEmbeddingResponse_usage& operator=(const CreateEmbeddingResponse_usage& other) = default; // copy assignment
    CreateEmbeddingResponse_usage& operator=(CreateEmbeddingResponse_usage&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// CreateEmbeddingResponse_usage members

    /// <summary>
    /// 
    /// </summary>
    int32_t getPromptTokens() const;
    void setPromptTokens(int32_t value);

    /// <summary>
    /// 
    /// </summary>
    int32_t getTotalTokens() const;
    void setTotalTokens(int32_t value);

protected:
    int32_t m_Prompt_tokens = 0;
    int32_t m_Total_tokens = 0;
};

std::vector<CreateEmbeddingResponse_usage> createCreateEmbeddingResponse_usageVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<CreateEmbeddingResponse_usage>(const CreateEmbeddingResponse_usage& val) {
    return val.toPropertyTree();
}

template<>
inline CreateEmbeddingResponse_usage fromPt<CreateEmbeddingResponse_usage>(const boost::property_tree::ptree& pt) {
    CreateEmbeddingResponse_usage ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* CreateEmbeddingResponse_usage_H_ */
