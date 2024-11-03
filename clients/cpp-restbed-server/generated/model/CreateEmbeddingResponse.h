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

/*
 * CreateEmbeddingResponse.h
 *
 * 
 */

#ifndef CreateEmbeddingResponse_H_
#define CreateEmbeddingResponse_H_



#include "Embedding.h"
#include "CreateEmbeddingResponse_usage.h"
#include <string>
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
/// 
/// </summary>
class  CreateEmbeddingResponse 
{
public:
    CreateEmbeddingResponse() = default;
    explicit CreateEmbeddingResponse(boost::property_tree::ptree const& pt);
    virtual ~CreateEmbeddingResponse() = default;

    CreateEmbeddingResponse(const CreateEmbeddingResponse& other) = default; // copy constructor
    CreateEmbeddingResponse(CreateEmbeddingResponse&& other) noexcept = default; // move constructor

    CreateEmbeddingResponse& operator=(const CreateEmbeddingResponse& other) = default; // copy assignment
    CreateEmbeddingResponse& operator=(CreateEmbeddingResponse&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// CreateEmbeddingResponse members

    /// <summary>
    /// The list of embeddings generated by the model.
    /// </summary>
    std::vector<Embedding> getData() const;
    void setData(std::vector<Embedding> value);

    /// <summary>
    /// The name of the model used to generate the embedding.
    /// </summary>
    std::string getModel() const;
    void setModel(std::string value);

    /// <summary>
    /// The object type, which is always \&quot;list\&quot;.
    /// </summary>
    std::string getObject() const;
    void setObject(std::string value);

    /// <summary>
    /// 
    /// </summary>
    CreateEmbeddingResponse_usage getUsage() const;
    void setUsage(CreateEmbeddingResponse_usage value);

protected:
    std::vector<Embedding> m_Data;
    std::string m_Model = "";
    std::string m_object = "";
    CreateEmbeddingResponse_usage m_Usage;
};

std::vector<CreateEmbeddingResponse> createCreateEmbeddingResponseVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<CreateEmbeddingResponse>(const CreateEmbeddingResponse& val) {
    return val.toPropertyTree();
}

template<>
inline CreateEmbeddingResponse fromPt<CreateEmbeddingResponse>(const boost::property_tree::ptree& pt) {
    CreateEmbeddingResponse ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* CreateEmbeddingResponse_H_ */
