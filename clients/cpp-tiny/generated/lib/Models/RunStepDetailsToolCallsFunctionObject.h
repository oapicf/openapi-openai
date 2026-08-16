
/*
 * RunStepDetailsToolCallsFunctionObject.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_RunStepDetailsToolCallsFunctionObject_H_
#define TINY_CPP_CLIENT_RunStepDetailsToolCallsFunctionObject_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "RunStepDetailsToolCallsFunctionObject_function.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class RunStepDetailsToolCallsFunctionObject{
public:

    /*! \brief Constructor.
	 */
    RunStepDetailsToolCallsFunctionObject();
    RunStepDetailsToolCallsFunctionObject(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RunStepDetailsToolCallsFunctionObject();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The ID of the tool call object.
	 */
	std::string getId();

	/*! \brief Set The ID of the tool call object.
	 */
	void setId(std::string  id);
	/*! \brief Get The type of tool call. This is always going to be `function` for this type of tool call.
	 */
	std::string getType();

	/*! \brief Set The type of tool call. This is always going to be `function` for this type of tool call.
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	RunStepDetailsToolCallsFunctionObject_function getFunction();

	/*! \brief Set 
	 */
	void setFunction(RunStepDetailsToolCallsFunctionObject_function  function);


    private:
    std::string id{};
    std::string type{};
    RunStepDetailsToolCallsFunctionObject_function function;
};
}

#endif /* TINY_CPP_CLIENT_RunStepDetailsToolCallsFunctionObject_H_ */
