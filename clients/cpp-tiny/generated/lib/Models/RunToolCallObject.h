
/*
 * RunToolCallObject.h
 *
 * Tool call objects
 */

#ifndef TINY_CPP_CLIENT_RunToolCallObject_H_
#define TINY_CPP_CLIENT_RunToolCallObject_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "RunToolCallObject_function.h"

namespace Tiny {


/*! \brief Tool call objects
 *
 *  \ingroup Models
 *
 */

class RunToolCallObject{
public:

    /*! \brief Constructor.
	 */
    RunToolCallObject();
    RunToolCallObject(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RunToolCallObject();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The ID of the tool call. This ID must be referenced when you submit the tool outputs in using the [Submit tool outputs to run](/docs/api-reference/runs/submitToolOutputs) endpoint.
	 */
	std::string getId();

	/*! \brief Set The ID of the tool call. This ID must be referenced when you submit the tool outputs in using the [Submit tool outputs to run](/docs/api-reference/runs/submitToolOutputs) endpoint.
	 */
	void setId(std::string  id);
	/*! \brief Get The type of tool call the output is required for. For now, this is always `function`.
	 */
	std::string getType();

	/*! \brief Set The type of tool call the output is required for. For now, this is always `function`.
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	RunToolCallObject_function getFunction();

	/*! \brief Set 
	 */
	void setFunction(RunToolCallObject_function  function);


    private:
    std::string id{};
    std::string type{};
    RunToolCallObject_function function;
};
}

#endif /* TINY_CPP_CLIENT_RunToolCallObject_H_ */
