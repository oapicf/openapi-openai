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
 * RunToolCallObject_function.h
 *
 * The function definition.
 */

#ifndef RunToolCallObject_function_H_
#define RunToolCallObject_function_H_



#include <string>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// The function definition.
/// </summary>
class  RunToolCallObject_function 
{
public:
    RunToolCallObject_function() = default;
    explicit RunToolCallObject_function(boost::property_tree::ptree const& pt);
    virtual ~RunToolCallObject_function() = default;

    RunToolCallObject_function(const RunToolCallObject_function& other) = default; // copy constructor
    RunToolCallObject_function(RunToolCallObject_function&& other) noexcept = default; // move constructor

    RunToolCallObject_function& operator=(const RunToolCallObject_function& other) = default; // copy assignment
    RunToolCallObject_function& operator=(RunToolCallObject_function&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// RunToolCallObject_function members

    /// <summary>
    /// The name of the function.
    /// </summary>
    std::string getName() const;
    void setName(std::string value);

    /// <summary>
    /// The arguments that the model expects you to pass to the function.
    /// </summary>
    std::string getArguments() const;
    void setArguments(std::string value);

protected:
    std::string m_Name = "";
    std::string m_Arguments = "";
};

std::vector<RunToolCallObject_function> createRunToolCallObject_functionVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<RunToolCallObject_function>(const RunToolCallObject_function& val) {
    return val.toPropertyTree();
}

template<>
inline RunToolCallObject_function fromPt<RunToolCallObject_function>(const boost::property_tree::ptree& pt) {
    RunToolCallObject_function ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* RunToolCallObject_function_H_ */
