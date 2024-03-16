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
 * CreateCompletionRequest_prompt.h
 *
 * The prompt(s) to generate completions for, encoded as a string, array of strings, array of tokens, or array of token arrays.  Note that &lt;|endoftext|&gt; is the document separator that the model sees during training, so if a prompt is not specified the model will generate as if from the beginning of a new document. 
 */

#ifndef CreateCompletionRequest_prompt_H_
#define CreateCompletionRequest_prompt_H_



#include <string>
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
/// The prompt(s) to generate completions for, encoded as a string, array of strings, array of tokens, or array of token arrays.  Note that &lt;|endoftext|&gt; is the document separator that the model sees during training, so if a prompt is not specified the model will generate as if from the beginning of a new document. 
/// </summary>
class  CreateCompletionRequest_prompt 
{
public:
    CreateCompletionRequest_prompt() = default;
    explicit CreateCompletionRequest_prompt(boost::property_tree::ptree const& pt);
    virtual ~CreateCompletionRequest_prompt() = default;

    CreateCompletionRequest_prompt(const CreateCompletionRequest_prompt& other) = default; // copy constructor
    CreateCompletionRequest_prompt(CreateCompletionRequest_prompt&& other) noexcept = default; // move constructor

    CreateCompletionRequest_prompt& operator=(const CreateCompletionRequest_prompt& other) = default; // copy assignment
    CreateCompletionRequest_prompt& operator=(CreateCompletionRequest_prompt&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// CreateCompletionRequest_prompt members

protected:
};

std::vector<CreateCompletionRequest_prompt> createCreateCompletionRequest_promptVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<CreateCompletionRequest_prompt>(const CreateCompletionRequest_prompt& val) {
    return val.toPropertyTree();
}

template<>
inline CreateCompletionRequest_prompt fromPt<CreateCompletionRequest_prompt>(const boost::property_tree::ptree& pt) {
    CreateCompletionRequest_prompt ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* CreateCompletionRequest_prompt_H_ */
