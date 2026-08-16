
/*
 * RunStepDeltaStepDetailsToolCallsFunctionObject.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_RunStepDeltaStepDetailsToolCallsFunctionObject_H_
#define TINY_CPP_CLIENT_RunStepDeltaStepDetailsToolCallsFunctionObject_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "RunStepDeltaStepDetailsToolCallsFunctionObject_function.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class RunStepDeltaStepDetailsToolCallsFunctionObject{
public:

    /*! \brief Constructor.
	 */
    RunStepDeltaStepDetailsToolCallsFunctionObject();
    RunStepDeltaStepDetailsToolCallsFunctionObject(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RunStepDeltaStepDetailsToolCallsFunctionObject();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The index of the tool call in the tool calls array.
	 */
	int getIndex();

	/*! \brief Set The index of the tool call in the tool calls array.
	 */
	void setIndex(int  index);
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
	RunStepDeltaStepDetailsToolCallsFunctionObject_function getFunction();

	/*! \brief Set 
	 */
	void setFunction(RunStepDeltaStepDetailsToolCallsFunctionObject_function  function);


    private:
    int index{};
    std::string id{};
    std::string type{};
    RunStepDeltaStepDetailsToolCallsFunctionObject_function function;
};
}

#endif /* TINY_CPP_CLIENT_RunStepDeltaStepDetailsToolCallsFunctionObject_H_ */
