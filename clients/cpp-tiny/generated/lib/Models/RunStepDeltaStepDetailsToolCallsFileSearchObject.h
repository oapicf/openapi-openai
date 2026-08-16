
/*
 * RunStepDeltaStepDetailsToolCallsFileSearchObject.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_RunStepDeltaStepDetailsToolCallsFileSearchObject_H_
#define TINY_CPP_CLIENT_RunStepDeltaStepDetailsToolCallsFileSearchObject_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Object.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class RunStepDeltaStepDetailsToolCallsFileSearchObject{
public:

    /*! \brief Constructor.
	 */
    RunStepDeltaStepDetailsToolCallsFileSearchObject();
    RunStepDeltaStepDetailsToolCallsFileSearchObject(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RunStepDeltaStepDetailsToolCallsFileSearchObject();


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
	/*! \brief Get The type of tool call. This is always going to be `file_search` for this type of tool call.
	 */
	std::string getType();

	/*! \brief Set The type of tool call. This is always going to be `file_search` for this type of tool call.
	 */
	void setType(std::string  type);
	/*! \brief Get For now, this is always going to be an empty object.
	 */
	Object getFileSearch();

	/*! \brief Set For now, this is always going to be an empty object.
	 */
	void setFileSearch(Object  file_search);


    private:
    int index{};
    std::string id{};
    std::string type{};
    Object file_search;
};
}

#endif /* TINY_CPP_CLIENT_RunStepDeltaStepDetailsToolCallsFileSearchObject_H_ */
